# addLiveRecordTask


## 描述
添加录制打点任务

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/records/{publishDomain}/appNames/{appName}/streamNames/{streamName}/task

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**appName**|String|True| |直播流所属应用名称|
|**publishDomain**|String|True| |推流加速域名|
|**streamName**|String|True| |直播流名称|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**recordFileType**|String|True| |录制文件类型|
|**recordTimes**|RecordTime[]|True| |您的推流加速域名|
|**saveBucket**|String|True| |存储桶|
|**saveEndpoint**|String|True| |存储地址|
|**saveObject**|String|False| |录制文件存储路径|

### RecordTime
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**endTime**|String|True| |结束时间|
|**startTime**|String|True| |开始时间|

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
