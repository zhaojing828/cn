# describeLiveDomainDetail


## 描述
查询指定域名相关信息

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/domains/{publishDomain}

|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|推流域名|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|名称|类型|描述|
|---|---|---|
|**publishDomains**|PublishDomain[]|推流域名集合|
|**playDomains**|PlayDomain[]|直播域名集合|
### PlayDomain
|名称|类型|描述|
|---|---|---|
|**playDomain**|String|播放域名|
|**playDomainCname**|String|播放域名(Cname)|
|**domainStatus**|String|直播域名状态:<br>  - online表示启用<br>  - offline表示停用<br>  - configuring表示配置中<br>  - configure_failed表示配置失败<br>  - checking表示正在审核<br>  - check_failed表示审核失败<br>|
|**playType**|String|播放域名类型:<br>  - normal  普通播放域名<br>  - restart 回看域名<br>|
|**createTime**|String|创建时间|
|**updateTime**|String|更新时间|
### PublishDomain
|名称|类型|描述|
|---|---|---|
|**publishDomain**|String|推流域名|
|**publishDomainCname**|String|推流域名(Cname)|
|**domainStatus**|String|直播域名状态：<br>  - online表示启用<br>  - offline表示停用<br>  - configuring表示配置中<br>  - configure_failed表示配置失败<br>  - checking表示正在审核<br>  - check_failed表示审核失败<br>|
|**createTime**|String|创建时间|
|**updateTime**|String|更新时间|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
