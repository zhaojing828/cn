# describeLiveStreamPublishList


## 描述
查看域名下推流记录

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/streams/{publishDomain}/publishList

|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|推流域名|

## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**pageNum**|Integer|False|页码；默认为1；取值范围[1, 100000]|
|**pageSize**|Integer|False|分页大小；默认为10；取值范围[10, 100]|
|**appName**|String|False|直播流所属应用名称|
|**streamName**|String|False|直播流名称|
|**startTime**|String|True|起始时间|
|**endTime**|String|False|结束时间|



## 示例
    {
        "pageNum": 1,
        "pageSize": 10,
        "appName": "live",
        "streamName":"test-stream",
        "startTime":"2019-02-21T08:00:00Z",
        "endTime":"	2019-02-22T08:00:00Z",
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
|**liveStreamPublishInfos**|LiveStreamPublishInfo[]|在线推流集合|
### LiveStreamPublishInfo
|名称|类型|描述|
|---|---|---|
|**publishDomain**|String|您的加速域名|
|**appName**|String|您的APP|
|**streamName**|String|您的流名|
|**publishUpTime**|String|开始推流时刻 UTC 时间|
|**publishDownTime**|String|开始推流时刻 UTC 时间|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
