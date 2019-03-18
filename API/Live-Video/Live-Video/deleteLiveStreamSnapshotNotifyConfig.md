# deleteLiveStreamSnapshotNotifyConfig


## 描述
删除截图回调配置

## 请求方式
DELETE

## 请求地址
https://live.jdcloud-api.com/v1/snapshotNotifys/{publishDomain}:config

|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|推流加速域名|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|requestId|


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
