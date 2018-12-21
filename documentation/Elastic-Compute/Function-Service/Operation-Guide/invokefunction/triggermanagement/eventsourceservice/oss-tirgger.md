# OSS触发器

对象存储服务（OSS：Object Storage Service）是京东云自主研发的大规模分布式对象存储服务，面向企业和个人开发者提供高可用、低成本、强安全的云端存储服务。您可以实现对数据的统一管理，满足各类存储需求。

  

**OSS事件定义**

当OSS捕获到事件发生后，会以[event参数](../../../Operation-Guide/invokefunction/triggermanagement/configtigger-event.md)传递给事件处理函数，OSS当前的事件触发类型与[OSS回调通知](../../../../../../../documentation/Storage-and-CDN/Object-Storage-Service/Operation-Guide/Manage-Bucket/Callback-Notification-2.md )支持事件类型相同，详情见表1。

表1 OSS支持事件类型

| 事件名称                                  | 说明                                                         |
| ----------------------------------------- | ------------------------------------------------------------ |
| s3:ObjectCreated:*                       | 创建Object的行为，包含Put   Object，   Post Object，Copy Object，Complete Multipart Upload |
| s3:ObjectCreated:Put                     | 使用Put Object上传文件                                       |
| s3:ObjectCreated:Post                    | 使用Post Object上传文件                                      |
| s3:ObjectCreated:Copy                    | 使用Put Object-Copy复制文件                                  |
| s3:ObjectCreated:CompleteMultipartUpload | 完成分片上传                                                 |
| s3:ObjectRemoved:*                       | 删除Object的行为，包含Delete   Object                        |
| s3:ObjectRemoved:Delete                  | 删除文件                                                     |

 

OSS触发器触发器配置参数说明见表2。

表2 OSS触发器信息表

| 字段        | 说明                                                         |
| ----------- | ------------------------------------------------------------ |
| *触发器类型 | 在下拉列表中选择“OSS对象存储触发器“                          |
| *bucket列表 | 选择事件源的OSS存储桶。   从已创建同region下的OSS存储桶中选择，OSS存储桶创建请参考[创建存储桶](https://support.huaweicloud.com/usermanual-obs/zh-cn_topic_0045829050.html)。 |
| *触发事件   | 选择要使其触发函数的事件。支持的事件类型请参考表1            |
| 前缀        | 匹配前缀，您可以将通知配置为按对象名称的前缀和后缀进行过滤   |
| 后缀        | 匹配后缀，您可以将通知配置为按对象名称的前缀和后缀进行过滤   |

 

**OSS触发器使用说明：**

资源与事件是组成OSS触发器的两个要素：
 
 * 资源由bucket和前缀后缀组合组成。同一个Bucket，相同或包含的前缀、后缀或前缀后缀视为同一个资源。
 
 * 事件是触发事件，包括表1中的事件类型。
  
  目前，OSS网关触发器仅支持同地域function绑定，OSS触发器与函数的重复绑定不做限制。
  
  **场景一**：同一个OSS资源和同一个事件可以绑定同一个或多个函数，当重复绑定时，事件只会触发绑定的第一个函数。
  
  **场景二**：同一个OSS资源和不同事件可以绑定同一个或多个函数，当重复绑定时，若事件类型有包含，例如:配置两个触发器，同一个Bucket，事件类型分别为： s3:ObjectCreated:* 和s3:ObjectCreated:Put （s3:ObjectCreated:*包含s3:ObjectCreated:Put事件），当用户上传一个文件至Bucket，只会触发第一个被绑定函数。

 
注意：使用 OSS 触发器一定要避免 **循环触发**。一个典型的循环触发场景是 OSS 的某个 Bucket 上传文件触发函数执行，这个函数又生成了一个或多个文件，写回到 OSS 的 Bucket 里，这个写入动作又触发了函数执行，形成了链状循环。
