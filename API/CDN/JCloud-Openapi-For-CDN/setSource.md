# setSource


## 描述
设置源站信息

## 请求方式
POST

## 请求地址
https://cdn.jdcloud-api.com/v1/domain/{domain}/source

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|True| |用户域名|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**backSourceType**|String|False| |回源方式,只能是[https,http]中的一种,默认http|
|**defaultSourceHost**|String|False| | |
|**domainSource**|DomainSourceInfo[]|False| | |
|**ipSource**|IpSourceInfo[]|False| | |
|**ossSource**|String|False| | |
|**sourceType**|String|False| |回源类型只能是[ips,domain,oss]中的一种|

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
