# addCustomLiveStreamTranscodeTemplate


## 描述
添加自定义转码模板

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/transcodeCustoms:template


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**videoCodeRate**|Integer|True|转码输出的码率值:<br> - 取值范围:[200,3000]<br> - 单位: kpbs<br>|
|**videoFrameRate**|String|True|转码输出的帧率值:<br>  - 取值：15、25、30、60<br>|
|**width**|Integer|False|转码输出视频宽度:<br>  - 取值: [100,1920]<br>  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频<br>  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频<br>|
|**height**|Integer|False|转码输出视频宽度:<br>  - 取值: [100,1920]<br>  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频<br>  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频<br>|
|**template**|String|True|转码模板后缀:<br>  - 标准质量模板：<br>- ld(h.264/640*360/15f)<br>- sd(h.264/854*480/24f)<br>- hd(h.264/1280*720/25f)<br>- shd(h.264/1920*1080/30f)<br>  - 取值要求：数字、大小写字母或短横线("-"),<br>              首尾不能有特殊字符("-")<br>  - <b>注意: 不能与标准的转码模板和已定义命名重复</b><br>|
|**audioCodec**|String|True|转码输出音频编码格式:<br>  - 取值: aac、mp3<br>  - 不区分大小写<br>|
|**audioFormat**|String|True|转码输出音频格式:<br>  - 取值: aac_lc，aac_low，aac_he，aac_he_v2<br>  - 不区分大小写<br>|
|**audioSampleRate**|Integer|True|转码输出音频采样率:<br>  - 取值: [44100,48000]<br>|
|**audioChannel**|Integer|True|转码输出音频通道数:<br>  - 1  单声道<br>  - 2  双声道<br>|
|**audioCodeRate**|Integer|True|转码输出音频码率:<br>  - 取值: [16,128]<br>  - 单位: kbps<br>|



## 示例
    {
        "videoCodeRate": 300,
        "videoFrameRate": "15",
        "width": 1080,
        "height": 720,
        "template":"test-live-video",
        "audioCodec":"aac",
        "audioFormat":"aac_low",
        "audioSampleRate":44108,
        "audioChannel":2,
        "audioCodeRate":30
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
