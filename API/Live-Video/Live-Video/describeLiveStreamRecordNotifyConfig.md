# describeLiveStreamRecordNotifyConfig


## 描述
查询录制回调配置

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/recordNotifys/{publishDomain}

|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|推流加速域名|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|名称|类型|描述|
|---|---|---|
|**publishDomain**|String|您的加速域名|
|**notifyUrl**|String|回调地址|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
