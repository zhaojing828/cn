
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
-  分支：master
-  构建命令：使用源代码根目录下的build.yml
-  构建类型：应用包
-  存储空间：请选择已有的对象存储空间


### 在云部署中创建应用及部署组

使用云部署前，请先确保已经有云主机及负载均衡实例及监听器。详情可参见 蓝绿部署。

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

至此，已准备好流水线中需要对接的各个原子操作，开始创建流水线。

### 新建流水线

详细操作步骤如下：

1. 点击 创建 选择 快速创建。配置流水线名称，如pipeline-demo，单击下一步。

2. 配置源代码

  阶段名默认为 源代码，添加源代码子操作。原子操作中选择京东云-代码托管，选择示例代码JDCloud-Codebuild/hello-java。
  
     ![](/image/codepipeline/best-source2.PNG)

3. 配置构建。

  阶段名默认为 构建阶段，添加构建操作。   
  
     ![](/image/codepipeline/best-build2.png)

-  操作名称：构建操作
-  操作类型：构建
-  操作提供方：云编译
-  代码源：构建任务的源代码，选择上一步中创建的源代码操作。
-  任务：选择云编译中创建的编译任务，如ci-demo
-  手工确认：如选择手工确认，该操作会在用户点击确认后继续执行。
     
   
 
4. 配置部署。
 
 阶段名默认为 部署阶段，添加部署操作。 
 
      ![](/image/codepipeline/best-deploy2.png)
      
-  操作名称：部署操作
-  操作类型：部署
-  操作提供方：云部署
-  部署来源：部署任务。目前仅支持构建类型为应用包的云编译任务。
-  部署应用：选择云部署中创建的部署任务，如cd-demo
-  部署组：选择云部署中创建的部署组
-  部署命令：提供部署命令
-  手工确认：如选择手工确认，该操作会在用户点击确认后继续执行。
 
 
保存并发布。 发布成功可以通过浏览器访问发布的应用。

