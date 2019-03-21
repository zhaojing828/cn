# addLiveRecordTask


## 描述
添加录制打点任务<br>
您可以调用此接口精确提取已录制的文件中所需要的部分

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/records/{publishDomain}/appNames/{appName}/streamNames/{streamName}/task

|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|推流加速域名|
|**appName**|String|True|直播流所属应用名称|
|**streamName**|String|True|直播流名称|

## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**recordTimes**|List<RecordTime>|True|录制时间集合|
|**saveBucket**|String|True|存储桶|
|**saveEndpoint**|String|True|存储地址|
|**recordFileType**|String|True|录制文件类型:<br>  - 取值: ts,flv,mp4 (多种类型之前用;隔开)<br>  - 不区分大小写<br>|
|**saveObject**|String|False|录制文件存储路径:<br>  - 默认地址: record/{Date}/{ServerId}/{AppName}/{StreamName}/{StartTime}_{EndTime}.{format}<br>|
    
    
### RecordTime
|名称|类型|是否必需|描述|
|---|---|---|---|
|**startTime**|String|True|开始时间|
|**endTime**|String|True|结束时间|

## 示例
    {
        "recordTimes": ["2015-12-07T17:50:21Z","2015-12-07T18:54:21Z"],
        "saveBucket": "vod-storage-398392",
        "saveEndpoint": "s3.cn-north-1.jcloudcs.com",
        "recordFileType": "mp4",
        "saveObject": "record/{Date}/{ServerId}/{AppName}/{StreamName}/{StartTime}_{EndTime}.{format}"
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
