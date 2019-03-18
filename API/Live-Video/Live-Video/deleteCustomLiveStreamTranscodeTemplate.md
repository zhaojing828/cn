# deleteCustomLiveStreamTranscodeTemplate


## 描述
删除用户自定义转码模板

## 请求方式
DELETE

## 请求地址
https://live.jdcloud-api.com/v1/transcodeCustoms/{template}

|名称|类型|是否必需|描述|
|---|---|---|---|
|**template**|String|True|转码模板自定义名称: - 标准质量模板：ld(h.264/640*360/15f)<br>sd(h.264/854*480/24f)<br>hd(h.264/1280*720/25f)<br>shd(h.264/1920*1080/30f)- 取值要求：数字、大小写字母或短横线("-"),首尾不能有特殊字符("-") - <b>注意: 不能与标准的转码模板和已定义命名重复</b>|
  
## 请求参数
无


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
