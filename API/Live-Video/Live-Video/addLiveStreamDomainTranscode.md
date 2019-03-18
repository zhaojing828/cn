# addLiveStreamDomainTranscode


## 描述
添加域名转码配置

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/transcodeDomains:config


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|直播的推流域名|
|**template**|String|True|转码模版:<br>  - 标准质量模板：ld(h.264/640*360/15f)、sd(h.264/854*480/24f)、hd(h.264/1280*720/25f)、shd(h.264/1920*1080/30f)<br>  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,<br>              取值要求：数字、大小写字母或短横线("-"),<br>              首尾不能有特殊字符("-")<br>  - 注意: 不能与标准的转码模板和已定义命名重复<br>|


## 示例
    {
        "publishDomain": "push.yourdomain.com",
        "template": "test-live-video
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
