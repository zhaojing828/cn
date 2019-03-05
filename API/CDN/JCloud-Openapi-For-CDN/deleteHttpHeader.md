# deleteHttpHeader


## 描述
删除httpHeader

## 请求方式
DELETE

## 请求地址
https://cdn.jdcloud-api.com/v1/domain/{domain}/httpHeader

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|True| |用户域名|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**headerName**|String|False| |header名|
|**headerType**|String|False| |header类型[resp,req]|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Object| |


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
