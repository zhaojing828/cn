# OSS触发器

对象存储服务（OSS：Object Storage Service）是京东云自主研发的大规模分布式对象存储服务，面向企业和个人开发者提供高可用、低成本、强安全的云端存储服务。您可以实现对数据的统一管理，满足各类存储需求。

  

**OSS事件定义**

当OSS系统捕获到相关事件后，会将事件信息编码为JSON字符串，传递给事件处理函数OSS当前的事件触发类型与[OSS回调通知](../../../../../../../documentation/Storage-and-CDN/Object-Storage-Service/Operation-Guide/Manage-Bucket/Callback-Notification-2.md )支持事件类型相同，见表1。

表1 OSS支持事件类型

| 事件名称                                  | 说明                                                         |
| ----------------------------------------- | ------------------------------------------------------------ |
| OSS:ObjectCreated:*                       | 创建Object的行为，包含Put   Object，   Post Object，Copy Object，Complete Multipart Upload |
| OSS:ObjectCreated:Put                     | 使用Put Object上传文件                                       |
| OSS:ObjectCreated:Post                    | 使用Post Object上传文件                                      |
| OSS:ObjectCreated:Copy                    | 使用Put Object-Copy复制文件                                  |
| OSS:ObjectCreated:CompleteMultipartUpload | 完成分片上传                                                 |
| OSS:ObjectRemoved:*                       | 删除Object的行为，包含Delete   Object                        |
| OSS:ObjectRemoved:Delete                  | 删除文件                                                     |

 

OSS触发器触发器配置参数说明见表2。

表2 OSS触发器信息表

| 字段        | 说明                                                         |
| ----------- | ------------------------------------------------------------ |
| *触发器类型 | 在下拉列表中选择“OSS对象存储触发器“                          |
| *触发器名称 | 输入触发器名称   1.       只能包含字母、数字、下划线和中划线   2.       以字母、数字开头   3.       长度不超过64个字符 |
| *bucket列表 | 选择事件源的OSS存储桶。   从已创建同region下的OSS存储桶中选择，OSS存储桶创建请参考[创建存储桶](https://support.huaweicloud.com/usermanual-obs/zh-cn_topic_0045829050.html)。 |
| *触发事件   | 选择要使其触发函数的事件。支持的事件类型请参考表1            |
| 前缀        | 匹配前缀，您可以将通知配置为按对象名称的前缀和后缀进行过滤   |
| 后缀        | 匹配后缀，您可以将通知配置为按对象名称的前缀和后缀进行过滤   |

 

OSS触发器绑定限制如下：

* 同一个bucket的不同事件和前缀后缀组合，限制同一组规则只能绑定一个function。

* 当使用前缀、后缀过滤规则时，同一个bucket不能使用相同的前缀、后缀或前缀和后缀的组合为统一事件类型定义筛选规则，例如，当您给函数 A 配置了 bucket test 事件类型为 “Put ”和后缀过滤为 “.jpg” 的事件触发，那么该 bucket test下就不能再创建 “Put” 和后缀过滤为 “.jpg”的事件触发。

* 目前，OSS网关触发器仅支持同地域function绑定。

 

注意：使用 OSS 触发器一定要避免 **循环触发**。一个典型的循环触发场景是 OSS 的某个 Bucket 上传文件触发函数执行，这个函数又生成了一个或多个文件，写回到 OSS 的 Bucket 里，这个写入动作又触发了函数执行，形成了链状循环。
