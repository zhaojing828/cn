# describeLiveStreamPublishList


## 描述
查看域名下推流记录

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/streams/{publishDomain}/publishList

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**publishDomain**|String|True| |推流域名|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**appName**|String|False| |直播流所属应用名称|
|**endTime**|String|False| |结束时间|
|**pageNum**|Integer|False| |页码；默认为1；取值范围[1, 100000]|
|**pageSize**|Integer|False| |分页大小；默认为10；取值范围[10, 100]|
|**startTime**|String|True| |起始时间|
|**streamName**|String|False| |直播流名称|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**liveStreamPublishInfos**|LiveStreamPublishInfo[]|在线推流集合|
|**pageNumber**|Integer|当前页码|
|**pageSize**|Integer|每页数量|
|**totalCount**|Number|查询总数|
### LiveStreamPublishInfo
|名称|类型|描述|
|---|---|---|
|**appName**|String|您的APP|
|**publishDomain**|String|您的加速域名|
|**publishDownTime**|String|开始推流时刻 UTC 时间|
|**publishUpTime**|String|开始推流时刻 UTC 时间|
|**streamName**|String|您的流名|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
