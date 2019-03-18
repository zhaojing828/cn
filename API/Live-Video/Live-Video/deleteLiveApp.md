# deleteLiveApp


## 描述
删除APP

## 请求方式
DELETE

## 请求地址
https://live.jdcloud-api.com/v1/apps/{publishDomain}/appNames/{appName}

|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|直播推流域名|
|**appName**|String|True|应用名称|

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
