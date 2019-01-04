# 集成容器镜像仓库  

关于使用容器镜像仓库的方法，请参考[容器镜像仓库帮助文档](https://docs.jdcloud.com/cn/container-registry/create-image)。例：注册表为myregistry，镜像仓库为myrepo，镜像版本号为latest，地域选择华北-北京为cn-north-1。用户可根据具体情况修改。  
1.   
**第一步：一次性保存secret，有时效性**
```
kubectl create secret docker-registry my-secret --docker-server=myregistry-cn-north-1.jcr.service.jdcloud.com --docker-username=jdcloud --docker-password=C********u --docker-email=l****@jd.com
```
**第二步：自动定期获取临时令牌，长期有效：**  
创建jcr-credential-rbac.yaml文件，内容如下：
```
apiVersion: rbac.authorization.k8s.io/v1beta1
kind: ClusterRoleBinding
metadata:
  name: jcr-credential-rbac
subjects:
  - kind: ServiceAccount
    # Reference to upper's `metadata.name`
    name: default
    # Reference to upper's `metadata.namespace`
    namespace: default
roleRef:
  kind: ClusterRole
  name: cluster-admin
  apiGroup: rbac.authorization.k8s.io
```
创建jcr-credential-cron.yaml文件，设定每一个小时获取临时令牌，请使用时添加JDCLOUD_ACCESS_KEY和JDCLOUD_SECRET_KEY内容，yaml内容如下：
```
apiVersion: batch/v1beta1
kind: CronJob
metadata:
  name: jdcloud-jcr-credential-cron
spec:
  schedule: "* */1 * * *"
  successfulJobsHistoryLimit: 2
  failedJobsHistoryLimit: 2  
  jobTemplate:
    spec:
      backoffLimit: 4
      template:
        spec:
          serviceAccountName: default
          terminationGracePeriodSeconds: 0
          restartPolicy: Never
          hostNetwork: true
          containers:
          - name: jcr-token-refresher
            imagePullPolicy: Always
            image: jdcloudcli/jdcloud-cli:latest
            command:
            - "/bin/sh"
            - "-c"
            - |
              REGISTRY_NAME=myregistry
              JCR_REGION=cn-north-1
              DOCKER_REGISTRY_SERVER=https://${REGISTRY_NAME}-${JCR_REGION}.jcr.service.jdcloud.com
              DOCKER_USER=jdcloud
              JDCLOUD_ACCESS_KEY=****************************
              JDCLOUD_SECRET_KEY=****************************
              jdc configure add --profile ${DOCKER_USER} --access-key ${JDCLOUD_ACCESS_KEY} --secret-key ${JDCLOUD_SECRET_KEY}
              PRECHECK=`jdc cr get-authorization-token --region-id ${JCR_REGION} --registry-name ${REGISTRY_NAME} |jq .result.authorizationToken`
              if [ 'null' = "$PRECHECK" ]; then
                  echo "jdc cr call failed no valid content" 
                  exit 0 
              else
                  echo "jdc cr call return authentication string"
              fi;
              DOCKER_PASSWORD=`echo ${PRECHECK} | base64 -d |cut  -d  ':' -f2`
              kubectl delete secret my-secret || true
              echo "0:"$PRECHECK
              echo "1:"$DOCKER_REGISTRY_SERVER
              echo "2:"$DOCKER_USER
              echo "3:"$DOCKER_PASSWORD
              kubectl create secret docker-registry my-secret \
              --docker-server=$DOCKER_REGISTRY_SERVER \
              --docker-username=$DOCKER_USER \
              --docker-password=$DOCKER_PASSWORD \
              --docker-email=**@jd.com
              kubectl patch serviceaccount default  -p '{"imagePullSecrets":[{"name":"my-secret"}]}'
```
```
kubectl apply  -f  jcr-credential-rbac.yaml
kubectl apply  -f  jcr-credential-cron.yaml
```
2.   创建yaml文件，文件名称为registrysecret
```
apiVersion: v1
 kind: ReplicationController
 metadata:
    name: webapp
 spec:
    replicas: 1
    selector:
      name: container-private-repo
    template:
      metadata:
        labels:
           name: container-private-repo
      spec:
        containers:
          - name:  mycontainer
            image: myregistry-cn-north-1.jcr.service.jdcloud.com/myrepo:latest
            imagePullPolicy: Always
        imagePullSecrets:
          - name: my-secret
```
3.   创建：  
 `kubectl create -f registrysecret`  
4.   查看详情：  
 `kubectl describe rc webapp`  
