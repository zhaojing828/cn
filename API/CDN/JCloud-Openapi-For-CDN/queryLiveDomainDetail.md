# queryLiveDomainDetail


## 描述
查询直播域名详情

## 请求方式
GET

## 请求地址
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|True| |用户域名|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**accesskeyKey**|String|url鉴权key|
|**accesskeyType**|Integer|url鉴权开关|
|**allowApps**|String[]|app列表|
|**allowNoReferHeader**|String|允许无refer|
|**allowNullReferHeader**|String|允许空refer|
|**archiveNo**|String|备案号|
|**audioType**|String|音频格式AAC|
|**authLifeTime**|Integer|authLifeTime|
|**backSourceType**|String|回源类型目前只能未rtmp|
|**blackIpsEnable**|String|是否开启ip黑名单|
|**certificate**|String|https证书|
|**cname**|String|cname|
|**createdTime**|String|创建时间|
|**defaultSourceHost**|String|默认回源host|
|**domainType**|String|域名类型|
|**externId**|String|外部关联id|
|**flvUrls**|String[]|flvUrls|
|**forwardAccessKeyType**|Integer|转推鉴权开关|
|**forwardCustomVhost**|String|forwardCustomVhost|
|**forwardPrivateKey**|String|转推鉴权key|
|**hdlCname**|String|hdlCname|
|**hdlDomain**|String|hdlDomain|
|**hlsCname**|String|hlsCname|
|**hlsDomain**|String|hlsDomain|
|**hlsUrls**|String[]|hlsUrls|
|**ignoreQueryString**|String|ignoreQueryString|
|**ips**|String[]|ip黑名单列表|
|**notifyCustomAuthKey**|String|推断流通知key|
|**notifyCustomUrl**|String|推断流通知Url|
|**originAccessKeyType**|Integer|回源鉴权开关|
|**originDomain**|String|回源域名|
|**originPrivateKey**|String|回源鉴权key|
|**playAuthLifeTime**|Integer|playAuthLifeTime|
|**playDomain**|String|播放域名|
|**protocolConverts**|ProtocolConvert[]|转协议|
|**publishDomain**|String|推流域名|
|**publishNormalTimeout**|String|推流中断超时时间(单位秒)|
|**pushWhiteIps**|Arrary|推流IP白名单|
|**referList**|String[]|referList|
|**referType**|String|referType|
|**rsaKey**|String|https私钥|
|**rtmpCname**|String|rtmpCname|
|**rtmpDomain**|String|rtmpDomain|
|**rtmpUrls**|String[]|rtmpUrls|
|**siteType**|String|站点类型推流push，拉流pull|
|**source**|BackSourceInfo|回源信息|
|**sourceType**|String|域名回源类型|
|**status**|String|域名状态|
|**type**|String|域名类型|
|**videoType**|String|视频格式 H.264|
### ProtocolConvert
|名称|类型|描述|
|---|---|---|
|**sourceProtocol**|String|源协议,目前只能为rtmp|
|**targetProtocol**|String|目标协议|
### BackSourceInfo
|名称|类型|描述|
|---|---|---|
|**domain**|DomainSourceInfo[]| |
|**ips**|IpSourceInfo[]| |
|**ossSource**|String| |
### DomainSourceInfo
|名称|类型|描述|
|---|---|---|
|**domain**|String| |
|**priority**|Integer| |
|**sourceHost**|String| |
### IpSourceInfo
|名称|类型|描述|
|---|---|---|
|**ip**|String| |
|**master**|Integer| |
|**ratio**|Double| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
