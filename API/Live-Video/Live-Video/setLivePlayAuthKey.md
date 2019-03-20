# setLivePlayAuthKey


## 描述
设置播放鉴权KEY

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/livePlayAuthKey


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**playDomain**|String|True|您的播放加速域名|
|**authStatus**|String|False|播放鉴权状态|
|**authKey**|String|False|播放鉴权key|


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
