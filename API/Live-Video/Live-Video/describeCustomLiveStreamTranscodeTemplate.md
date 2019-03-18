# describeCustomLiveStreamTranscodeTemplate


## 描述
查询用户自定义转码模板详情

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/transcodeCustoms/{template}

|名称|类型|是否必需|描述|
|---|---|---|---|
|**template**|String|True|转码模板自定义名称: -标准质量模板：ld(h.264/640*360/15f)<br>sd(h.264/854*480/24f)<br>hd(h.264/1280*720/25f)<br>shd(h.264/1920*1080/30f) <br>-取值要求：数字、大小写字母或短横线("-"),首尾不能有特殊字符("-") <br>-<b>注意: 不能与标准的转码模板和已定义命名重复</b>|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|名称|类型|描述|
|---|---|---|
|**videoCodeRate**|Integer|转码输出的码率值:<br>  - 取值: [200,3000]<br>  - 单位: kpbs<br>|
|**videoFrameRate**|String|转码输出的帧率值:<br>  - 取值: 15/1、25/1、30/1、60/1<br>|
|**width**|Integer|转码输出视频宽度:<br>  - 取值: [100,1920]<br>  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频<br>  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频<br>|
|**height**|Integer|转码输出视频宽度:<br>  - 取值: [100,1920]<br>  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频<br>  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频<br>|
|**template**|String|转码模板自定义名称:<br>  - 标准质量模板：sd、hd、hsd<br>  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,<br>              取值要求：数字、大小写字母或短横线("-"),<br>              首尾不能有特殊字符("-")<br>  - <b>注意: 不能与标准的转码模板和已定义命名重复</b><br>|
|**audioCodec**|String|转码输出音频编码格式:<br>  - 取值: aac、mp3<br>  - 不区分大小写<br>|
|**audioFormat**|String|转码输出音频格式:<br>  - 取值: aac_lc，aac_low，aac_he，aac_he_v2<br>  - 不区分大小写<br>|
|**audioSampleRate**|Integer|转码输出音频采样率:<br>  - 取值: [44100,48000]<br>|
|**audioChannel**|Integer|转码输出音频通道数:<br>  - 1  单声道<br>  - 2  双声道<br>|
|**audioCodeRate**|Integer|转码输出音频码率:<br>  - 取值: [16,128]<br>  - 单位: kbps<br>|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
