# describeCustomLiveStreamTranscode


## 描述
查询用户自定义转码模板详情

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/transcodeCustoms/{template}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**template**|String|True| |转码模版|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**audioChannel**|Integer|转码输出音频通道数|
|**audioCodeRate**|Integer|转码输出音频码率|
|**audioCodec**|String|转码输出音频编码格式|
|**audioFormat**|String|转码输出音频格式|
|**audioSampleRate**|Integer|转码输出音频采样率|
|**height**|Integer|转码输出视频宽度|
|**template**|String|转码模板自定义名称|
|**videoCodeRate**|Integer|转码输出的码率值|
|**videoFrameRate**|String|转码输出的帧率值|
|**width**|Integer|转码输出视频宽度|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
