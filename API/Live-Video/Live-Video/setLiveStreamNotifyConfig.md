# setLiveStreamNotifyConfig


## 描述
设置推流回调配置

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/streamNotifys


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|您的加速域名|
|**notifyUrl**|String|True|设置直播流信息推送到的 URL 地址:<br>  - 必须以 http:// 开头<br>  - 正则校验格式<br>|

## 示例
    {
        "publishDomain":"push.yourdomain.com",
        "notifyUrl": "http://amf.jdcloud.com"
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
