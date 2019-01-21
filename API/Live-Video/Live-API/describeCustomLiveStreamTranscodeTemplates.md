# describeCustomLiveStreamTranscodeTemplates


## 描述
查询用户自定义转码模板列表

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/transcodeCustoms


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |转码模板查询过滤条件, 不传递分页参数时默认返回10条|
|**pageNum**|Integer|False|1|页码；默认为1；取值范围[1, 100000]|
|**pageSize**|Integer|False|10|分页大小；默认为10；取值范围[10, 100]|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |过滤条件的名称|
|**operator**|String|False| |过滤条件的操作符，默认eq|
|**values**|String[]|True| |过滤条件的值|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**pageNumber**|Integer|当前页码|
|**pageSize**|Integer|每页数量|
|**totalCount**|Number|查询总数|
|**transcodeTemplates**|TranscodeInfo[]|码率信息|
### TranscodeInfo
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
