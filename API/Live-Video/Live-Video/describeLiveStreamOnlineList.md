# describeLiveStreamOnlineList


## 描述
查看域名下所有的正在推的流的信息

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/streams/{publishDomain}/onlineList

|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|推流域名|

## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**pageNum**|Integer|False|页码 取值范围[1, 100000]|
|**pageSize**|Integer|False|分页大小 取值范围[10, 100]|
|**appName**|String|False|应用名称（APP）|

## 示例
    {
        "pageNum": 1,
        "pageSize": 10,
        "appName": "live"
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
|**onlineStreamInfos**|OnlineStreamInfo[]|在线推流集合|
### OnlineStreamInfo
|名称|类型|描述|
|---|---|---|
|**publishDomain**|String|您的加速域名|
|**appName**|String|您的APP|
|**streamName**|String|您的流名|
|**publishTime**|String|您的推流时间|
|**publishUrl**|String|您的推流地址|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
