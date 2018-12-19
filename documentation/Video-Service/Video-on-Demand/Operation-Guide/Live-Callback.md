# 直播回调

视频直播服务支持直播回调功能，包含推流回调和录制回调，推流回调可以将用户推流和断流的实时状态返回给客户，尤其在主播使用开源推流工具（如OBS），客户可通过该功能了解主播状态，录制回调再录制文件生成时会通知客户，客户可实时获取录制文件。

使用该功能需要您添加一个接收回调的URL地址，并保证地址可用，该操作可在控制台中完成。

## 1.开启回调

登录直播控制台，进入“域名管理”页面，选择要查看播放地址的一组域名，点击右侧的“管理”进入“基本信息”页面

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E5%9F%9F%E5%90%8D%E7%AE%A1%E7%90%86-%E7%AE%A1%E7%90%86%E6%8C%89%E9%92%AE.jpg)

在页面下方的“直播信息”栏滑动滑钮打开推流或者录制回调

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E5%9B%9E%E8%B0%83%E5%BC%80%E5%90%AF.png)

点击推流或录制回调后的“编辑”按钮填写接收信息的回调地址，点击“确定”完成设置

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E5%9B%9E%E8%B0%83%E5%9C%B0%E5%9D%80%E7%BC%96%E8%BE%91.png)

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E9%85%8D%E7%BD%AE%E7%A1%AE%E5%AE%9A.png)

## 2.关闭回调

登录直播控制台，进入“域名管理”页面，选择要查看播放地址的一组域名，点击右侧的“管理”进入“基本信息”页面

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E5%9F%9F%E5%90%8D%E7%AE%A1%E7%90%86-%E7%AE%A1%E7%90%86%E6%8C%89%E9%92%AE.jpg)

在页面下方的“直播信息”栏滑动滑钮关闭推流或者录制回调

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E5%85%B3%E9%97%AD%E5%9B%9E%E8%B0%83.jpg)

## 3.回调说明

**描述**

回调接口是京东直播平台对事件的通知机制，目前支持开始推流、结束推流、开始录制、结束录制、录制分片开始、录制分片结束等事件；如客户需要回调功能则需要支持如下的回调格式。

**说明**

1.  原理：通过 HTTP 接口向用户服务器发送 POST
    请求，将相关信息状态实时反馈给用户，用户服务器通过 200
    响应返回接口返回结果。

2.  客户需要开启相应状态，并正确设置回调URL，并且URL能正常访问。

**格式说明**

domain: 客户推流域名

app: 客户自定义的应用名称

stream：客户自定义的流名

event：为事件名，包含以下几种定义

publish_started：推流开始

publish_done：推流结束

record_started：录制开始

record_done：录制结束

record_part_started：录制分片开始

record_part_done：录制分片结束

status：事件是否成功，success成功，fail失败

errorMsg：在status=fail的情况描述失败原因

url：录制分片存储的位置，存储路径如下bucket name/record/{Date}/{DomainName}/{AppName}/{StreamName}/StartTime}_{EndTime}.flv其中bucketname为客户选择的对象存储空间位置，Date为获取的当前日期，AppName客户自定义的应用名称，StreamName客户自定义额流名称，StartTime录制开始时间，EndTime录制结束时间

duration：录制分片的时长

startTime：分片的开始时间

stopTime：分片的结束时间

**返回示例**

{

 "domain": " push.test.com",

 "app": "appname",

 "stream": "streamname",

 "event": " RECORD_PART_DONE ",

 "status": "sucess",

 "url": "
bucketname/record/20180423/push.test.com/app/live/20180423174942_20180423180942.flv
",

"duration": "32",

"startTime": " 1524476982 ",

"stopTime": " 1524477014 ",

}
