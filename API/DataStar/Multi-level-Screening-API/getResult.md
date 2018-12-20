# getResult


## 描述
多级筛选结果查询接口

## 请求方式
GET

## 请求地址
https://datastar.cn-south-1.jdcloud-api.com/v1/v1/regions/{regionId}/profileMultiLevel/getResult

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**profileSelectRecordId**|String|True| |多级筛选任务ID|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID，每次请求都不一样|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|String|多级筛选任务的执行结果|
|**message**|String|描述信息|
|**status**|Boolean|true为成功，false为失败|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
