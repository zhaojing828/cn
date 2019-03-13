
## 构建并部署到云部署

本文档以构建一个java项目并部署到京东云-云部署为例说明如何使用 流水线。

基本操作流程如下：

1）在京东云-代码托管中创建源代码

2）在京东云-云编译中，对示例源代码进行编译构建，生成应用包

3）在京东云-云部署中，创建部署应用及部署组


### Clone示例代码至代码托管

代码示例地址为：https://code.jdcloud.com/JDCloud-Codebuild/hello-java

请将此示例代码clone至代码托管中，代码托管的地址为：https://code.jdcloud.com/


### 在云编译中创建编译任务

在云编译中新建任务，具体信息如下：

-  应用名称：ci-demo
-  编译镜像：maven/maven3.6.0-jdk13
-  代码源：京东云-代码托管
-  代码库：请根据实际情况进行填写，例如JDCloud-Codebuild/hello-java
-  分支：dmaster
-  构建命令：使用源代码根目录下的build.yml
-  构建类型：应用包
-  存储空间：请选择已有的对象存储空间

至此，已将示例代码编译成功，并上传到对象存储空间中。

### 在云部署中创建应用及部署组

在“部署应用”页，指定与云主机、对象存储相同的地域后，点击“新建应用”，

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-1%EF%BC%88Ch%EF%BC%89.png)

跳转到“新建应用”页。

在“新建应用”页，首先填写应用信息。应用名称：codedeploy-app-demo03

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-2%EF%BC%88Ch%EF%BC%89.png)

点击"新建"按钮。

接下来，在应用中新建部署组，

有以下选项：

- 部署组名称：请填写部署组名称，group1
- 部署类型：请选择“蓝绿部署”
- 部署目标：点击“选择”按钮，在弹窗中选择云主机。支持三种选择过滤条件：高可用组、标签、IP。这里请选择在上一步中创建的云主机，即主机名为：codedeploy-demo031加入蓝组，主机名为：codedeploy-demo032加绿组
- 使用负载均衡：是
- 负载均衡实例：请选择华北-北京地域中已有的负载均衡实例，codedeploy-lb-demo03
- 负载均衡后端服务：请选择上一项中指定的负载均衡实例下的后端服务，codedeploy-backend-demo03
- 高级选项：保持默认选项，详见操作指南

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-3%EF%BC%88Ch%EF%BC%89.png)

填写部署组的基本信息后，请点击“新建”，将进行应用中部署组的新建。

创建成功后，将跳转到“应用详情”页。

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-4%EF%BC%88Ch%EF%BC%89.png)
