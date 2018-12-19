# 配置触发器和事件格式

对于不同的触发器参数设定的配置文件的内容格式不同，本文列举了配置文件的格式样板，并说明了支持的属性。另外，由触发器触发的事件传递到函数接口的事件（event）对象的格式因触发器而异。

OSS触发器

[OSS 事件触发器详细说明](https://help.aliyun.com/document_detail/62922.html)

配置触发器

**触发器示例**：ossTrigger.yml

```
triggerConfig:
   events:
       s3:ObjectCreated:Put
       s3:ObjectCreated:Post
   filter:
      key:
          prefix: sourcefile/
          suffix: .gif
```

 

 

**触发器参数说明**：

`events` 为OSS端触发函数执行的事件，取值范围：

s3:ObjectCreated:*

s3:ObjectCreated:Put

s3:ObjectCreated:Post

s3:ObjectCreated:Copy

s3:ObjectCreated:CompleteMultipartUpload

s3:ObjectRemoved:*

s3:ObjectRemoved:Delete

OSS事件定义详见。 

 

filter 为OSS对象过滤参数，满足过滤条件的OSS对象才可以触发函数，包含如下属性：

​     key：过滤器支持过滤对象键（Key），包含如下属性：

​             prefix：匹配前缀

​             suffix：匹配后缀

 

事件格式

```
{
    "Records": [
       {
           "version": "0", 
           "id": "6a7e8feb-b491-4cf7-a9f1-bf3703467718",
            "time": "2006-01-02T15:04:05.999999999Z",
            "source": "oss",
            "base64OwnerPin": "NTk0MDM1MjYzMDE5",
            "resources": [
                "jrn:oss:cn-north-1:accountID:bucketname/objectname"
            ],
            "region": "cn-north-1",
            "detailType": "MessageReceived",
            "detail": { 
                "eventName":"event-type",  //事件类型
                "responseElements":{  
                    "x-amz-request-id":"OSS generated request ID"  //发起事件的请求ID
                },
                "s3":{  
                    "s3SchemaVersion":"1.0",  //通知内容版本号，目前为"1.0"
                    "configurationId":"ID found in the bucket notification configuration",  //事件通知配置中ConfigurationId
                    "bucket":{  
                        "name":"bucket-name",  //Bucket名称
                        "ownerIdentity":{  
                            "principalId":"userId-of-the-bucket-owner"  //Bucket owner用户ID
                        }
                     },
                    "object":{  
                        "key":"object-key",  //Object名称
                        "eTag":"object eTag",  //Object的etag，与GetObject请求返回的ETag头的内容相同
                        "size":"object size",  //Object的size
                        "type":"object type"  //Object的type 
                    }
                },
                "callBackVar": {  //回调通知配置中的自定义参数
                    "callBackVars": {                 
                        "var1":["value1","value3"],
                        "var2":["value2"]
                    }
                }
            }       
        }
    ]
}
```

 

 

API网关触发器

[API网关触发器详细说明](https://help.aliyun.com/document_detail/54788.html)

事件格式

输入格式

当以函数计算作为API网关的后端服务时，API网关会把请求参数通过一个固定的Mapping结构传给函数计算的请求参数 `event`，函数计算通过如下结构去获取和处理需要的参数。请求参数Mapping结构如下所示：

```
{
        "path":"api request path", //请求路径
        "httpMethod":"GET/POST/DELETE/PUT/PATCH",  //请求方法
        "headers":{   //请求头
            "header":"headerValue"
        },
        "pathParameters":{  //路径参数
            "pathParam":"pathValue"
        },
        "queryParameters":{   //查询参数
            "queryParam":"queryValue"
        },
        "body":"string of request payload",
        "requestContext":{
            "stage": "test",          //环境别名
            "apiId":"testsvc",
            "identity": {
                "accountId": "", //userid
                "apiKey": "", //ak
                "user": ""  //pin
                "authType": "" //身份认证的类型 免鉴权/jdcloud鉴权/hufu
            }
            "requestId":"c6af9ac6-7b61-11e6-9a41-93e8deadbeef",
            "sourceIp":"10.0.2.14"
        }
    }
```



**参数说明**：

 网关与function间的 body 内容不经过Base64编码。



事件示例：



输出格式

为方便API网关解析输出内容，函数计算会将输出内容通过规范化，以如下JSON格式返回给API网关服务：

```
{     
    "statusCode": httpStatusCode,     
    "headers": {"headerName":"headerValue",...},     
    "body": "..." 
 } 
```

**参数说明**：

如果返回结果不符合格式要求，API网关服务报错503 Service Unavailable。
