# describeLiveSnapshotData


## 描述
查询直播截图张数数据

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/liveSnapshotData


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|您的推流加速域名|
|**appName**|String|False|直播流所属应用名称|
|**streamName**|String|False|直播流名称|
|**startTime**|String|True|起始时间:<br>  - UTC 时间格式 e.g: 2019-03-12T00:00:00Z<br>|
|**endTime**|String|False|结束时间:<br>  - UTC 时间格式 e.g: 2019-03-12T00:00:00Z<br>|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|名称|类型|描述|
|---|---|---|
|**snapshotData**|SnapshotData[]| |
### SnapshotData
|名称|类型|描述|
|---|---|---|
|**publishDomain**|String|查询的推流域名|
|**appName**|String|查询的应用名称|
|**streamName**|String|查询的流名|
|**date**|String|日期:<br>  - yyyyMMdd 示例:20190308<br>|
|**total**|Integer|单日截图总张数:<br>  - 单位: 张<br>|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
