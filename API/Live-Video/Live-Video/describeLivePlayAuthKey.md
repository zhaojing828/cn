# describeLivePlayAuthKey


## 描述
查询播放鉴权KEY

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/livePlayAuthKey


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**playDomain**|String|True|您的播放加速域名|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|名称|类型|描述|
|---|---|---|
|**playDomain**|String|播放域名|
|**authStatus**|String|播放鉴权状态|
|**authKey**|String|播放鉴权key|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
