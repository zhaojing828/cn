# 入门指南
## 概述
JDFusion CLI程序的运行，需要相应的运行环境。
目前，我们提供了两种方式来安装JDFusion CLI。第一种RPM包，第二种Dokcer容器。
## 环境部署
### 安装准备
要安装、运行JDFusion CLI需要准备一些必要信息
* JDFusion平台的用户AK
* JDFusion平台的用户SK
下面的信息为可个性化配置信息：
* JDFusion平台的服务入口
* JDFusion平台大区编号
若不知如何获取，请查看[JDFusion平台用户认证](https://github.com/jdfusion/jdfusion.github.io)
#### 以RPM的方式安装运行
使用本文档中提供的[fusion-cli.rpm](http://jd-fusion-pub-storage.oss.cn-north-1.jcloudcs.com/releases/cli/rpm/fusion-cli-0.1.2~RELEASE.x86_64.rpm)包，安装JDFusion CLI。目前，仅提供64位版本。
下载RPM包到你的Linux系统中，在终端中运行命令：
```bash
rpm -i fusion-cli-*.x86_64.rpm
```
在当前用户的home目录下，创建一个".fusion-cloud"文件，在文件中，以property的方式配置AK，SK等信息。
示例如下：
```bash
cd ~
cat > .fusion-cloud << EOF
x.jdcloud.fusion.ak=$AK
x.jdcloud.fusion.sk=$SK
EOF
```
将`$AK`、`$SK`替换为你自己在JDFusion平台上AK、SK即可。
另外，JDFusion CLI的运行需要JRE1.8及以上版本，并且需要设置JAVA_HOME。
在配置完成后即可以使用JDFusion CLI了。
例如：
```bash
fusion list clouds --vendor jdcloud
```
#### 以Docker容器的方式安装运行
使用本文档中提供的CLI运行环境Docker镜像[jdfusion/cli](https://hub.docker.com/r/jdfusion/cli/)。这需要你本地的电脑上安装了Docker程序，关于Docker相关的文档，请参考[Docker官方文档](https://www.docker.com/)
可以使用以下两种方式来启动Docker容器：
##### 命令行列举环境变量
命令如下：
```bash
docker run -ti \
-e X_JDCLOUD_FUSION_AK=$AK \
-e X_JDCLOUD_FUSION_SK=$SK \
jdfusion/cli list clouds
```
将`$AK`、`$SK`替换为你自己在JDFusion平台上AK、SK即可。以上命令基于Linux操作系统，如需在Windows系统上执行，可将每行结尾的"\"替换为"`"。
示例中，
`-e` 为设置程序运行所需要的环境变量
`jdfusion/cli`为官方提供的jdfusion/cli运行环境镜像
`list clouds`为实际运行的指令，用于展示用户注册的云信息列表
##### 命令行使用环境变量文件
命令如下：
```bash
# docker run -ti --env-file env.list jdfusion/cli list clouds
```
env.list的文件内容格式为：
```properties
X_JDCLOUD_FUSION_AK=$AK
X_JDCLOUD_FUSION_SK=$SK
```
将`$AK`、`$SK`替换为你自己在JDFusion平台上AK、SK即可。
示例中，
`--env-file` 为设置程序运行所需要的环境变量的文件
`jdfusion/cli`为官方提供的jdfusion/cli运行环境镜像
`list clouds`为实际运行的指令，用于展示用户注册的云信息列表
