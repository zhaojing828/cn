# 直播录制

视频直播服务支持录制功能，可以把视频流录制成文件，存放到对象存储中，要使用此功能需要开通京东云的对象存储服务，并在华北区域（目前视频直播只支持华北）创建对应的Bucket空间，当直播结束后会自动生成文件，客户可以根据存储路径查看和下载视频文件。

直播录制模板按照应用名称（AppName）来区分，同一个应用名称（AppName）下的所有流都按照当前模板设置的参数来进行录制。

如设置模板时填写的AppName为test，那么test下面所有的流都会执行录制操作，同时会按照test模板设置的参数生成视频文件。

## 1.新建模板

登录直播控制台，进入“域名管理”页面，选择要查看播放地址的一组域名，点击右侧的“管理”进入域名配置页，点击“录制配置”切换到录制模板管理页面

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E7%9B%B4%E6%92%AD%E5%BD%95%E5%88%B6-%E9%A1%B5%E9%9D%A2%E5%88%87%E6%8D%A2.png)

在录制配置页面，点击“新建模板”，在弹出的窗口中填写对应的参数信息，点“确定”完成录制模板的添加。

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E7%9B%B4%E6%92%AD%E5%BD%95%E5%88%B6-%E6%96%B0%E5%BB%BA%E6%A8%A1%E6%9D%BF%E6%8C%89%E9%92%AE.png)

模板参数说明如下：

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E7%9B%B4%E6%92%AD%E5%BD%95%E5%88%B6-%E6%96%B0%E5%BB%BA%E6%A8%A1%E6%9D%BF.png)

**App
Name**：要进行直播录制的应用名称，目前仅支持英文，数字，“-”，"_","长度需要在1-50字符之间

**存储位置**：录制视频文件要存放的位置，如果为空请先点击“新建存储”在跳转的页面中创建Bucket空间

**周期长度**：视频文件录制的时长，范围在15-360分钟，如果超过6小时，系统会自动生成一个新的视频文件

**录制格式**：生成视频的文件格式，目前只支持flv

**存储路径**：录制文件详细的存放目录，系统会根据客户设置的Bucket自动生成对应的文件存储目录

record/{Date}/{DomainName}/{AppName}/{StreamName}/{StartTime}_{EndTime}.flv

-   {Date} 将录制文件按照日期进行文件夹分类，默认日期格式为“年-月-日”。

-   {DomainName} 客户配置的推流域名

-   {APPName}可自动获取您推流的AppName名称作为存储路径，若需更改，更改{APPName}
    即可，目前仅支持英文、数字、“-”、"_",长度需要在1-50字符之间

-   {StreamName} 可自动获取您推流的 StreamName
    名称作为存储路径，若需更改，更改{streamName}
    即可，目前仅支持英文、数字、“-”、"_",长度需要在1-50字符之间

-   {StartTime} 为录制开始时间，{EndTime} 为录制结束时间

## 2.删除模板

登录直播控制台，进入“录制配置”页面，在想要删除的录制模板右侧点击“删除”，在弹出的窗口中点“确认”完成删除操作。

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E7%9B%B4%E6%92%AD%E5%BD%95%E5%88%B6-%E6%A8%A1%E6%9D%BF%E5%88%A0%E9%99%A4.png)
