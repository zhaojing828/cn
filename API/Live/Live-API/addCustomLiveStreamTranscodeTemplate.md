# addCustomLiveStreamTranscodeTemplate


## 描述
添加自定义转码模板

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/transcodeCustoms:template


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**audioChannel**|Integer|True| |转码输出音频通道数|
|**audioCodeRate**|Integer|True| |转码输出音频码率|
|**audioCodec**|String|True| |转码输出音频编码格式|
|**audioFormat**|String|True| |转码输出音频格式|
|**audioSampleRate**|Integer|True| |转码输出音频采样率|
|**height**|Integer|True| |转码输出视频宽度|
|**template**|String|True| |转码模板自定义名称|
|**videoCodeRate**|Integer|True| |转码输出的码率值|
|**videoFrameRate**|String|True| |转码输出的帧率值|
|**width**|Integer|True| |转码输出视频宽度|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|


## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
