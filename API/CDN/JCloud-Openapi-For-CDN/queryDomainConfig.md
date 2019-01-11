# queryDomainConfig


## 描述
查询域名配置信息

## 请求方式
GET

## 请求地址
https://cdn.jdcloud-api.com/v1/domain/{domain}/config

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
|**cacheRules**|CacheRule[]| |
|**groupName**|String|group|
|**httpType**|String|httpType参数[on,off]|
|**httpsCertificate**|String|https证书|
|**httpsJumpType**|String|跳转类型[default,http,https]|
|**httpsRsaKey**|String|rsa秘钥|
|**ignoreQueryString**|String|忽略参数[on,off]|
|**isShareOpen**|String| |
|**jcdnTimeAnti**|String| |
|**range**|String|range参数[on,off]|
|**shareCache**|String| |
|**shareId**|Long| |
|**shareName**|String| |
|**videoDraft**|String|是否支持视频拖拽[on,off]|
### CacheRule
|名称|类型|描述|
|---|---|---|
|**cacheType**|String| |
|**contents**|String| |
|**createTime**|String| |
|**ttl**|Long| |
|**updateTime**|String| |
|**weight**|Integer| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
