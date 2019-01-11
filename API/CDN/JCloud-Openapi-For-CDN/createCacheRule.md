# createCacheRule


## 描述
添加缓存规则

## 请求方式
POST

## 请求地址
https://cdn.jdcloud-api.com/v1/domain/{domain}/cacheRule

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|True| |用户域名|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cacheType**|Integer|False| |缓存方式：0、不缓存，1自定义|
|**contents**|String|False| |规则内容。其他类型只能以/或者.开头，如/a/b或.jpg|
|**ttl**|Long|False| |缓存时间,单位秒|
|**weight**|Integer|False| |此条配置的权重值, 取值范围为1-10,1最大|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**configId**|Long| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
