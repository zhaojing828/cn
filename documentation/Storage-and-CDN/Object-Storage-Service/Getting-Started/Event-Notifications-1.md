# 设置事件通知

OSS支持事件通知功能，您可以指定某些资源发生相关操作时及时进行回调通知。事件通知是异步进行的，不影响OSS操作。事件通知常见以下应用场景，例如：

有新数据从图片内容分享平台、音视频平台上传到OSS。

OSS上的相关内容发生了更新。

OSS上的重要文件被删除。

您可以为存储空间启用事件通知功能，以便每次发生这些事件时都向目标发送通知消息。本部分介绍如何使用 OSS 控制台启用事件通知。
有关将事件通知 REST API 的信息，请参阅[事件的通知-API](https://docs.jdcloud.com/cn/object-storage-service/callback-notification-2)。

# 事件通知支持的类型和目标

您在为存储空间配置事件通知时，必须指定要针对哪些事件类型进行通知以及希望通知发送到哪些目标。

## OSS可以为以下事件类型发送通知

事件类型|描述
---|---
s3:ObjectCreated:* |创建Object的行为，包含Put Object，Post Object，Copy Object，Complete Multipart Upload
s3:ObjectCreated:Put |使用Put Object上传文件
s3:ObjectCreated:Post |使用Post Object上传文件
s3:ObjectCreated:Copy |使用Put Object-Copy复制文件
s3:ObjectCreated:CompleteMultipartUpload |完成分片上传
s3:ObjectRemoved:* |删除Object的行为，包含Delete Object
s3:ObjectRemoved:Delete |删除文件

## 事件通知消息可以发送到的目标：

* HTTP(S):按照您配置的回调URL，当Bucket中事件通知触发时，OSS会向回调URL发送指定格式的通知内容，通知方式支持HTTP(S)。
* 函数服务（Function）:函数服务是一项事件驱动的Serverless计算服务。通过函数服务平台，用户无需配置和管理服务器等基础设施，即可弹性、可靠地运行业务代码，快速构建应用与服务，且只需为代码实际消耗的资源付费。**目前Function仅支持华北地域配置**

# 控制台设置设置事件通知
键入对象名称 Prefix 和/或 Suffix 以按前缀和/或后缀筛选事件通知。例如，您可以设置一个筛选器，以便仅在将文件添加到某个图像文件夹 (例如，带有名称前缀 images/ 的对象) 时收到通知。有关更多信息，https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-filtering

选择 保存。会向事件通知目标发送一条测试消息。



