# forbidLiveStream


## 描述
禁止直播流推送

## 请求方式
PUT

## 请求地址
https://live.jdcloud-api.com/v1/streams:forbid


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**appName**|String|True|应用名称|
|**publishDomain**|String|True|您的加速域名|
|**streamName**|String|True|流名称|

## 示例
    {
       
        "playDomain":"play.yourdomain.com",
        "streamName": "test-stream",
        "appName": "live"
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
