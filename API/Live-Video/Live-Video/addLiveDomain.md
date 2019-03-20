# addLiveDomain


## 描述
添加直播域名

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/domains


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|直播的推流域名（不支持泛域名）|
|**playDomain**|String|True|直播的播放域名（不支持泛域名）|


## 示例
    {
        "publishDomain": "push.yourdomain.com",
        "playDomain": "play.yourdomain.com"
    }
    
## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|requestId|


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
