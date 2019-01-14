# setLiveStreamSnapshotNotifyConfig


## 描述
设置截图回调通知

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/snapshotNotifys:config


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**notifyUrl**|String|True| |设置直播流信息推送到的 URL 地址|
|**publishDomain**|String|True| |您的推流加速域名|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|


## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
