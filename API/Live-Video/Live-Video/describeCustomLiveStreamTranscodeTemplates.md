# describeCustomLiveStreamTranscodeTemplates


## 描述
查询用户自定义转码模板列表

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/transcodeCustoms


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**pageNum**|Integer|False|页码；默认为1；取值范围[1, 100000]|
|**pageSize**|Integer|False|分页大小；默认为10；取值范围[10, 100]|
|**filters**|Filter[]|False|转码模板查询过滤条件:<br>  - name:   template 录制模板自定义名称<br>  - value:  如果参数为空，则查询全部<br>|

### Filter
|名称|类型|是否必需|描述|
|---|---|---|---|
|**name**|String|True|过滤条件的名称|
|**values**|String[]|True|过滤条件的值|

## 示例
    {
        "pageNum": 1,
        "pageSize": 10,
        "filters": [{
           "name":"template",
           "value":"test-live-video"}]
    }

## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|名称|类型|描述|
|---|---|---|
|**pageNumber**|Integer|当前页码|
|**pageSize**|Integer|每页数量|
|**totalCount**|Integer|查询总数|
|**transcodeTemplates**|TranscodeInfo[]|码率信息|
### TranscodeInfo
|名称|类型|描述|
|---|---|---|
|**videoCodeRate**|Integer|转码输出的码率值:<br>  - 取值: [200,3000]<br>  - 单位: kpbs<br>|
|**videoFrameRate**|String|转码输出的帧率值:<br>  - 取值: 15/1、25/1、30/1、60/1<br>|
|**width**|Integer|转码输出视频宽度:<br>  - 取值: [100,1920]<br>  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频<br>  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频<br>|
|**height**|Integer|转码输出视频宽度:<br>  - 取值: [100,1920]<br>  - 等比: 如果只填写一个参数,则按参数比例调节输出转码视频<br>  - 随源: 如果两个参数都不填写，则按照源比例输出转码视频<br>|
|**template**|String|转码模板自定义名称|
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
