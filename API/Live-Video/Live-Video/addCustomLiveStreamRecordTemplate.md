# addCustomLiveStreamRecordTemplate


## 描述
添加直播录制模板

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/recordCustoms:template


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**recordPeriod**|Integer|True|自动录制周期:<br>  - 取值:[15,360]<br>  - 单位: 分钟<br>|
|**saveBucket**|String|True|存储桶<br>|
|**saveEndpoint**|String|True|存储地址<br>|
|**recordFileType**|String|True|录制文件格式:<br>  - 取值: ts,flv,mp4 (多种类型之前用;隔开)<br>  - 不区分大小写<br>|
|**template**|String|True|录制模板自定义名称:<br> - 取值要求：数字、大小写字母或短横线("-"),首尾不能有特殊字符("-")<br> - <b>注意: 不能与已定义模板命名重复</b><br>|

## 示例
    {
        "recordPeriod": 50,
        "saveBucket": "vod-storage-398392",
        "saveEndpoint":"s3.cn-north-1.jcloudcs.com",
        "recordFileType":"mp4",
        "template":"test-live-video"
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
