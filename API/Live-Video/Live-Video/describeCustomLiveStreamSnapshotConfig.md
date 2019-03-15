# describeCustomLiveStreamSnapshotConfig


## 描述
查询直播截图配置

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/snapshotCustoms:config


## 请求参数


## 返回参数
|名称|类型|描述|
|---|---|---|

|**result**|Result|
|**requestId**|String|ruquestId|

### Result
|名称|类型|描述|
|---|---|---|
|**pageNumber**|Integer|当前页码|
|**pageSize**|Integer|每页数量|
|**totalCount**|Integer|查询总数|
|**snapshotConfigs**|SnapshotConfig[]|截图配置集合|
### SnapshotConfig
|名称|类型|描述|
|---|---|---|
|**publishDomain**|String|推流域名|
|**appName**|String|应用名称|
|**streamName**|String|流名称|

|**snapshotConfig**|String[]|


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
