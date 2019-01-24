# 构建并部署到Kubernetes集群
本文档以构建一个 Golang软件项目并部署到京东云Kubernetes集群为例说明如何使用 流水线。

详细操作步骤如下：

1. 点击 创建 选择 快速创建。配置流水线名称，如pipeline-test，单击下一步。

2. 配置源代码
  阶段名默认为 源代码，添加源代码的原子操作。原子操作中选择codecommit，选择平台提供的golang-demo-for-k8s。
  示例代码地址：https://code.jdcloud.com/devops-demo/golang-demo

3. 配置构建。
  阶段名默认为 构建阶段，添加构建的原子操作。   
     1. 原子操作中选择 云编译，输入操作选择前面配置的源代码操作，如下图。    
        ![](/image/codepipeline/best-build.png)
 
     2. 在云编译项目中创建需要编译的项目。示例配置如下：   
        ![](/image/codepipeline/best-build-2.png) 
 
4. 配置部署。
  阶段名默认为 部署阶段，添加部署的原子操作。  
  
     1. 原子操作中选择 Kubernetes集群，输入操作选择前面配置的构建操作。需要用户提前创建好集群，在流水线中提供部署的deployment。
        示例如下：
        ![](/image/codepipeline/best-k8s.png)
        样例deployment：
	```
	apiVersion: apps/v1beta1
	kind: Deployment
	metadata:
	  name: golang-test-demo-deployment
	spec:
	  replicas: 3
	  template:
	    metadata:
	      labels:
		app: golang-test-demo
	    spec:
	      containers:
		- name: golang-test-demo
		  image: nginx:1.7.9
		  ports:
		    - containerPort: 8088
	      imagePullSecrets:
		- name: my-secret	
	```
       其中，image需要用构建操作的产出做替换，
       ![](/image/codepipeline/best-docker.png)  
     
     2. Kubernetes集群服务从容器镜像仓库拉去镜像需要授权，具体授权方式可参考    
      [集成容器镜像仓库]( https://docs.jdcloud.com/cn/jcs-for-kubernetes/deploy-container-registry)
      
     3. 在k8s集群页面，给这个deployment添加一个负载均衡服务。      
	```
	kind: Service
	apiVersion: v1
	metadata:
	  name: lb-show
	  namespace: default
	  labels:
	    k8s-app: kubernetes-test
	spec:
	  ports:
	    - protocol: TCP
	      port: 80
	      targetPort: 8088
	      nodePort: 30190
	  selector:
	    app: golang-test-demo
	  type: LoadBalancer
	  sessionAffinity: None
	  externalTrafficPolicy: Cluster 
	```

5. 保存并发布。
发布成功可以通过浏览器访问发布的应用。
