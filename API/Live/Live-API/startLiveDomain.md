# startLiveDomain


## 描述
启动域名

## 请求方式
PUT

## 请求地址
https://live.jdcloud-api.com/v1/domains:start


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**publishDomain**|String|True| |要启动的域名|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**publishDomain**|String|要启动的域名|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
