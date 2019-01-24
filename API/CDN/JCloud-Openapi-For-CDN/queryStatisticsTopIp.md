# queryStatisticsTopIp


## 描述
查询TOP IP

## 请求方式
POST

## 请求地址
https://cdn.jdcloud-api.com/v1/statistics:topIp


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|False| |需要查询的域名, 必须为用户pin下有权限的域名|
|**endTime**|String|False| |查询截止时间,UTC时间，格式为:yyyy-MM-dd'T'HH:mm:ss'Z'，示例:2018-10-21T10:00:00Z|
|**size**|Integer|False|20| |
|**startTime**|String|False| |查询起始时间,UTC时间，格式为:yyyy-MM-dd'T'HH:mm:ss'Z'，示例:2018-10-21T10:00:00Z|
|**subDomain**|String|False| |待查询的子域名|
|**topBy**|String|False| |排序依据|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**domain**|String| |
|**endTime**|String| |
|**ipData**|StatisticsTopIpData[]| |
|**startTime**|String| |
### StatisticsTopIpData
|名称|类型|描述|
|---|---|---|
|**count**|Integer| |
|**ips**|StatisticsTopIpItem[]| |
### StatisticsTopIpItem
|名称|类型|描述|
|---|---|---|
|**fullValue**|Object|查询结果,类型为HashMap<String, Object>|
|**ip**|String| |
|**rank**|Integer| |
|**value**|Integer| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
