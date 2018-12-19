# 直播推流

## **1.推流地址获取**

登录直播控制台，进入“域名管理”页面，选择要查看推流地址的一组域名，点击右侧的“管理”进入域名“基本信息”页面

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E6%8E%A8%E6%B5%81%E5%9C%B0%E5%9D%80-%E8%8E%B7%E5%8F%96%E6%8E%A8%E6%B5%81%E5%9C%B0%E5%9D%80.png)

在“推流信息”一栏可以查看和复制推流地址，推流地址是按一定规则拼接，其中应用名“APPName”和流名“StreamName”用户可以自定义，应用名（APPName）、流名（StreamName）目前仅支持英文、数字、“-”、"_",长度需要在1-50字符之间，客户需要根据自己定义按规则拼接出推流地址

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E6%8E%A8%E6%B5%81%E5%9C%B0%E5%9D%80-%E8%8E%B7%E5%8F%96%E6%8E%A8%E6%B5%81%E5%9C%B0%E5%9D%80-%E5%9F%BA%E6%9C%AC%E4%BF%A1%E6%81%AF%E9%A1%B5%E9%9D%A2.png)

## **2.推流地址说明**

推流地址由域名（Domain）、应用名（APPName）、流名（StreamName）三部分组成，其中域名为客户添加的推流域名，应用名和流名为变量，应用名（APPName）、流名（StreamName）目前仅支持英文、数字、“-”、"_",长度需要在1-50字符之间，客户可自定义，用于区分不同的应用和流，每个域名下可创建多个应用，每个应用下可创建多个直播流。

rtmp://推流域名/应用名/流名

**示例**

推流域名为aaa.bbb.com，客户想使用的应用名称为 app1，在 app1
下可自定义不同流名创建多路直播流，推流地址为：

rtmp://aaa.bbb.com/app1/1

rtmp://aaa.bbb.com/app1/2

rtmp://aaa.bbb.com/app1/3

也可创建多个以应用为主的直播流：

rtmp://aaa.bbb.com/app1/1

rtmp://aaa.bbb.com/app2/1

rtmp://aaa.bbb.com/app3/1

-   注意：如果开启了推流鉴权功能后，地址后会增加鉴权信息部分，如rtmp://aaa.bbb.com/app1/1?auth_key=1520565052-0-0-245681ddfefef6598560af1d2264ec3f

具体请参考直播鉴权部分内容。
