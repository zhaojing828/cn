# 直播截图

视频直播服务支持直播截图，可以对视频流按照设置的间隔时间进行图片截取，存放到对象存储中，图片格式为jpg，要使用此功能需要开通京东云的对象存储服务，并在华北区域（目前视频直播只支持华北）创建对应的Bucket空间，当直播开始后，截图动作会自动开始，图片生成后，客户可以根据存储路径查看和下载图片文件文件。

直播截图模板按照应用名称（AppName）来区分，同一个应用名称（AppName）下的所有流都按照当前模板设置的参数来进行图片截取。

如设置模板时填写的AppName为test，那么test下面所有的流都会执行截图操作，同时会按照test模板设置的参数生成图片文件。

## 1.新建模板

登录直播控制台，进入“域名管理”页面，选择要查看播放地址的一组域名，点击右侧的“管理”进入域名配置页，点击“截图配置”切换到截图模板管理页面

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E6%88%AA%E5%9B%BE-%E9%A1%B5%E9%9D%A2%E5%88%87%E6%8D%A2.png)

在截图配置页面，点击“新建模板”，在弹出的窗口中填写对应的参数信息，点“确定”完成截图模板的添加。

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E6%88%AA%E5%9B%BE-%E6%96%B0%E7%89%88%E6%A8%A1%E6%9D%BF%E6%8C%89%E9%92%AE.png)

模板参数说明如下：

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E6%96%B0%E5%BB%BA%E6%88%AA%E5%9B%BE%E6%A8%A1%E6%9D%BF%E6%9B%B4%E6%96%B0.png)

**App
Name**：要进行直播截图的应用名称，目前仅支持英文，数字，“-”，"_",长度需要在1-50字符之间

**存储位置**：截图文件要存放的位置，如果为空请先点击“新建存储”在跳转的页面中创建Bucket空间

**截图频率**：直播截图的时间间隔，单位为秒

**截图模式**：包含覆盖和不覆盖两种方式，覆盖方式下新生成的图片会覆盖老的图片，不覆盖方式下回按照序号（{
Sequence}）保留所有截图文件

**存储路径**：截图文件详细的存放目录，系统会根据客户设置的Bucket自动生成对应的文件存储目录

覆盖：snapshot/{Date}/{DomainName}/{AppName}/{StreamName}.jpg

不覆盖：snapshot/{Date}/{DomainName}/{AppName}/{StreamName}/{Sequence}.jpg

-   {Date} 将录制文件按照日期进行文件夹分类，默认日期格式为“年-月-日”。

-   {DomainName} 客户配置的推流域名

-   {APPName}可自动获取您推流的AppName名称作为存储路径，若需更改，更改{APPName}
    即可，目前仅支持英文、数字、“-”、"_",长度需要在1-50字符之间

-   {StreamName} 可自动获取您推流的 StreamName
    名称作为存储路径，若需更改，更改{streamName}
    即可，目前仅支持英文、数字、“-”、"_",长度需要在1-50字符之间

-   { Sequence} 为序列号，按照N+1的顺序递增

## 2.删除模板

登录直播控制台，进入“截图配置”页面，在想要删除的录制模板右侧点击“删除”，在弹出的窗口中点“确认”完成删除操作。

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E6%88%AA%E5%9B%BE-%E6%A8%A1%E6%9D%BF%E5%88%A0%E9%99%A4.png)
