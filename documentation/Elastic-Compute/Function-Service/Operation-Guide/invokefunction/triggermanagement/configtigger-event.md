# 配置触发器和事件格式

触发器在触发函数时会将事件传递给Function，事件在传递时以一个特定的数据结构以JSON 格式传递。对于不同的触发器参数设定的配置文件的内容格式不同，本文列举了配置文件的格式样板，并说明了支持的属性。另外，由不同触发器触发的事件，传递到函数接口的事件（event）对象的格式有所不同。

## OSS触发器

当以函数服务作为OSS的事件通知类型时，OSS会把请求参数通过一个固定的Mapping结构传给Function的请求参数 `event`。

### 事件格式


```
{
 "Records": [
 {
    "base64OwnerPin": "ZnVuY3Rpb24tYS10ZXN0",
    "detail": {
    "callBackVar": {
    "callBackVars": {}
   },
    "eventName": "s3:ObjectRemoved:Delete",   //事件类型
    "responseElements": {
    "x-amz-request-id": "B3165BF6148041A9"   //发起事件的请求ID
    },
    "s3": {
    "bucket": {
       "name": "automation-function-a-test-cn-func-2", //Bucket名称
       "ownerIdentity": {
               "principalId": "104064078905"  //Bucket owner用户ID
                }
            },
    "configurationId": "bgd32g0tpenuipc0thog",  //事件通知配置中ConfigurationId
    "object": {
            "eTag": "9b391b800374bebcd515158e67e07923", //Object的etag，与GetObject请求返回的ETag头的内容相同
            "key": "groupPhoto.tif",   //Object名称
            "size": 839376,     //Object的size
            "type": "image/tiff"  //Object的type 
             },
      "s3SchemaVersion": "1.0"
          }
        },
     "detailType": "json",
     "id": "9655e8b8-e9ab-4f25-a566-ab8c4cd1fb1e",
     "region": "cn-func-2",
     "resources": [
        "jrn:oss:cn-func-2:104064078905:automation-function-a-test-cn-func-2/groupPhoto.tif"
       ],
    "source": "oss",
    "time": "2018-12-20T10:57:48.518Z",
    "version": 0
      }
  ]
}

```



 

## API网关触发器


### 事件格式

#### 输入格式

当以函数服务作为API网关的后端服务时，API网关会把请求参数通过一个固定的Mapping结构传给Function的请求参数 `event`，Function通过如下结构去获取和处理需要的参数。

```
{
  "time": "2018-12-18T13:58:50Z",
  "detail": {
    "requestContext": {
      "identity": {
        "apiKey": "",   //ak
        "accountId": "",   //userid
        "authType": "none"  //身份认证的类型 公测默认鉴权/jdcloud鉴权
      },
      "stage": "test",
      "sourceIp": "  ",
      "requestId": "bgcfr6iumcb2k2g07b1gro22e926sdad",
      "apiId": "api-xhkj27dxn12p"
    },
    "path": "/zdz/request",  //请求路径
    "httpMethod": "GET",    //请求方法
    "queryParameters": {},     //查询参数
    "headers": {       //请求头
       "header":"headerValue"
    },
    "body": "{}",
    "pathParameters": {}
  },
  "region": "cn-north-1",
  "id": "c9a46dba-3efb-4f70-af21-74a311f6cbae",
  "resources": [
    "jrn:apigateway:cn-north-1::api/function"
  ],
  "detailType": "ApiGatewayReceived",
  "version": "0",
  "base64OwnerPin": ""
}
```
API网关触发器配置详清参见[API网关触发器](../triggermanagement/eventsourceservice/apig-tigger.md)。 

**参数说明**：网关与Function间的body内容不经过Base64编码。


#### 输出格式

Function将输出内容通过规范化，以如下JSON格式返回API网关：

```
{     
    "statusCode": httpStatusCode,     
    "headers": {"headerName":"headerValue",...},     
    "body": "..." 
 } 
```


