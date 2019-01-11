# 使用须知


**登录操作**

![Alttext](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation32.png)

提供两种方式登录方式：

1）点击京东云账户，将跳转到京东云账户登录页面，用户可使用京东云账户直接登录

2）使用已有DevOps用户名，直接输入用户名密码登录（用户可由DevOps租户管理员进行创建，详见账户管理）

对于初次使用DevOps的京东云账户，请使用第一种方式进行登录。登录后，DevOps系统会引导创建租户。点击立即注册后，会进入到DevOps首页


**安装Agent**

在云主机中，需安装超级Agent，用于部署和管理使用。

根据云主机地域的不同，选取不同的安装命令，具体方法如下：

```
#华北-北京    
wget -c http://devops-hb.oss-internal.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.391.dc2f953.20180910190347.bin -O installer && sh installer /usr/local/jdcloud/ifrit && rm -f installer
#华东-上海：
wget -c http://devops-hd.oss-internal.cn-east-2.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.391.dc2f953.20180910190347.bin -O installer && sh installer /usr/local/jdcloud/ifrit && rm -f installer
#华东-宿迁：
wget -c http://devops-sq.oss-internal.cn-east-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.391.dc2f953.20180910190347.bin -O installer && sh installer /usr/local/jdcloud/ifrit && rm -f installer
#华南-广州：
wget -c http://devops.oss-internal.cn-south-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.391.dc2f953.20180910190347.bin -O installer && sh installer /usr/local/jdcloud/ifrit && rm -f installer
```

在第三方主机（物理机or虚机）中，请确保主机满足两个条件（联通公网+NTP正常）

安装Agent的方法如下：

```
wget -c http://devops-hb.oss.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.377.8918eae.20180418132906.bin -O installer && sh installer -- -t $tenant -r $region -v $vpc /export/servers/ifrit && rm -f installer
    -t tenant #devops中的租户名
    -v vpc    #由用户编写,将作为服务器的vpc名称
    -r region #由用户编写,将作为服务器的region名称
```

关于Agent的说明如下：

| 进程      |    说明 |  端口 |
| :--------: | :--------:|:--------:|
| ifrit-agent  | 管理进程 | 1234 |
| ifrit-supervise  | 管理进程 | |
| hawkeye-agent  | 用于监控 | 1235 |
| log-agent  | 用于日志采集 | |
| zero-agent  | 控制系统agent，用于部署、初始化、日志查询等 | |
