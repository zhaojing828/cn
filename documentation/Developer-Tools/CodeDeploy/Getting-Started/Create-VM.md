## 创建云主机

在地域：华北-北京，创建云主机，具体信息如下：

- 创建方式：自定义创建
- 镜像：官方 CentOS CentOS 7.4 64位
- 规格：通用型 1c4g
- 存储：默认选项
- 网络：选择已有的私有网络及子网、选择默认安全组开放全部端口
- 带宽：需购买公网IP
- 基本信息：填写主机名、密码。这里填写主机名为：codedeploy-demo01



点击“立即购买”，即可按照已选规格，创建云主机。

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Start-1%EF%BC%88Ch%EF%BC%89.png)


接下来，在此云主机中安装部署用Agent，以root用户执行：

```
# 华北-北京
wget -c http://devops-hb.oss-internal.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
```

执行结果如下：

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting7.png)

接下来，安装JDK

```
yum -y install java-1.7.0-openjdk*
```

执行java -version可见：

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting11.png)
