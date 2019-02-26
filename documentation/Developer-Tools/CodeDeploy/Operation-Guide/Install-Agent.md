## Agent安装

目前仅支持Linux中安装Agent。

**安装**

在新建/编辑部署组，选择部署目标时，将自动获取到Agent状态。

手动安装，请登录到待安装/异常主机，根据云主机所属地域的不同，执行以下命令

```
# 华北-北京
wget -c http://devops-hb.oss-internal.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
# 华南-广州
wget -c http://devops.oss-internal.cn-south-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
# 华东-宿迁
wget -c http://devops-sq.oss-internal.cn-east-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
# 华东-上海
wget -c http://devops-hd.oss-internal.cn-east-2.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
```

以向华北-北京地域的云主机安装Agent为例，

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting16.png)


**获取Agent状态**

Agent状态为“正常”、“异常”两种。


**版本升级**

当Agent发布新版本时，将自动进行版本升级，且更新过程对用户透明，不会影响云部署的功能使用。
