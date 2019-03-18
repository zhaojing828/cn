# addLiveStreamAppTranscode


## 描述
添加APP转码配置

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/transcodeApps:config


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|直播的推流域名|
|**template**|String|True|转码模版:<br>  - 标准质量模板：<br>- ld(h.264/640*360/15f)<br>- sd(h.264/854*480/24f)<br>- hd(h.264/1280*720/25f)<br>- shd(h.264/1920*1080/30f)<br>  - 取值要求：数字、大小写字母或短横线("-"),<br>              首尾不能有特殊字符("-")<br>  - <b>注意: 不能与标准的转码模板和已定义命名重复</b><br>|
|**appName**|String|True|直播流所属应用名称|


## 示例
    {
        "publishDomain": "push.yourdomain.com",
        "appName": "live",
        "template": "test-live-video"
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
