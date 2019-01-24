# 连接集群

 **安装kubectl客户端**

Kubernetes 命令行客户端 kubectl可以让您从客户端计算机连接到 Kubernetes 集群，实现应用部署。

## 1.kubectl版本 

kubectl版本可以集群版本一致，或者集群版本+1。集群版本为1.8.12时，推荐下载的Kubectl版本为1.8.12；

## 2.安装和设置 kubectl 客户端

打开[Kubernetes 版本页面](https://github.com/kubernetes/kubernetes/blob/master/CHANGELOG-1.8.md) ，找到client binaries（也就是kubectl），选择对应操作系统的客户端，然后复制链接地址。

示例，选择kubectl版本1.8.12，链接地址为https://dl.k8s.io/v1.8.12/kubernetes-client-linux-amd64.tar.gz ：

Centos 7.4 64位系统下，执行以下命令：

```
wget https://dl.k8s.io/v1.8.12/kubernetes-client-linux-amd64.tar.gz
tar -zxvf kubernetes-client-linux-amd64.tar.gz
cd kubernetes/client/bin
chmod +x ./kubectl
sudo mv ./kubectl /usr/local/bin/kubectl
```
具体其他系统安装，还请参考https://kubernetes.io/docs/tasks/tools/install-kubectl/

## 3.配置集群凭据

凭据在Kubernetes集群-集群服务-集群-详情页-kubectl客户端配置，将凭据复制到本机$HOME/.kube/config；配置完成后，您即可以使用 kubectl 从本地计算机访问 Kubernetes 集群。
