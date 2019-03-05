# setLiveDomainBackSource


## 描述
设置直播域名回源信息

## 请求方式
POST

## 请求地址
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/backSource

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|True| |用户域名|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**backSourceType**|String|False| | |
|**defaultSourceHost**|String|False| |默认回源host|
|**domainSource**|DomainSourceInfo[]|False| | |
|**ipSource**|IpSourceInfo[]|False| | |
|**sourceType**|String|False| |回源类型只能为[ips,domain]中的一种|

### DomainSourceInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|False| | |
|**priority**|Integer|False| | |
|**sourceHost**|String|False| | |
### IpSourceInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**ip**|String|False| | |
|**master**|Integer|False| | |
|**ratio**|Double|False| | |

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
