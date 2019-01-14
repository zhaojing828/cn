# listTrigger


## 描述
查询触发器列表

## 请求方式
GET

## 请求地址
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/versions/{versionName}:innerlisttriggers

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**functionName**|String|True| |函数名称|
|**regionId**|String|True| |Region ID|
|**versionName**|String|True| |版本名称|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|本次请求Id|
|**result**|Result|查询触发器列表返回值|

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Trigger[]| |
### Trigger
|名称|类型|描述|
|---|---|---|
|**createTime**|String|触发器创建时间|
|**eventSource**|String|触发器对应的事件源类型，目前有oss和apigateway|
|**eventSourceId**|String|触发器对应的事件源Id|
|**functionName**|String|触发器所属的函数名称|
|**triggerId**|String|触发器Id|
|**updateTime**|String|触发器最后修改时间|
|**versionName**|String|触发器所属的函数版本名称|

## 返回码
|返回码|描述|
|---|---|
|**200**|A successful response.|
