# addLiveRestartDomain


## 描述
添加回看域名

## 请求方式
PUT

## 请求地址
https://live.jdcloud-api.com/v1/domains:restart


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**playDomain**|String|True|已接入直播的播放域名(不支持泛域名)|
|**restartDomain**|String|True|需要添加的直播的回看域名(不支持泛域名)|


## 示例
    {
        "publishDomain": "push.yourdomain.com",
        "restartDomain": "restart.yourdomain.com"
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
