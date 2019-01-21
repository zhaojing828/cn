# describeLiveDomains


## 描述
查询域名列表

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/domains


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageNum**|Integer|False| |页码；默认为1；取值范围[1, 100000]|
|**pageSize**|Integer|False| |分页大小；默认为10；取值范围[10, 100]|
|**publishDomain**|String|False| |域名|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**domainDetails**|DomainDetails[]|域名信息集合|
|**pageNumber**|Integer|当前页码|
|**pageSize**|Integer|每页数量|
|**totalCount**|Number|查询总数|
### DomainDetails
|名称|类型|描述|
|---|---|---|
|**playDomains**|PlayDomain[]|直播域名集合|
|**publishDomains**|PublishDomain[]|推流域名集合|
### PlayDomain
|名称|类型|描述|
|---|---|---|
|**createTime**|String|创建时间|
|**domainStatus**|String|直播域名状态|
|**playDomain**|String|播放域名|
|**playDomainCname**|String|播放域名(Cname)|
|**updateTime**|String|更新时间|
### PublishDomain
|名称|类型|描述|
|---|---|---|
|**createTime**|String|创建时间|
|**domainStatus**|String|直播域名状态|
|**publishDomain**|String|推流域名|
|**publishDomainCname**|String|推流域名(Cname)|
|**updateTime**|String|更新时间|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
