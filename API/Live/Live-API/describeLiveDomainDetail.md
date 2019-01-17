# describeLiveDomainDetail


## 描述
查询指定域名相关信息

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/domains/{publishDomain}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**publishDomain**|String|True| |推流域名|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
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
