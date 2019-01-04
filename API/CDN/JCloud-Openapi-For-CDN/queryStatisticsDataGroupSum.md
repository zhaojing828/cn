# queryStatisticsDataGroupSum


## 描述
查询统计数据并进行汇总加和

## 请求方式
POST

## 请求地址
https://cdn.jdcloud-api.com/v1/statistics:groupSum


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**area**|String|False| | |
|**domain**|String|False| |需要查询的域名, 必须为用户pin下有权限的域名|
|**endTime**|String|False| |查询截止时间,UTC时间，格式为:yyyy-MM-dd'T'HH:mm:ss'Z'，示例:2018-10-21T10:00:00Z|
|**fields**|String|False| |需要查询的字段|
|**groupBy**|String|False| |分组依据|
|**isp**|String|False| | |
|**origin**|String|False| | |
|**period**|String|False| |时间粒度，可选值:[oneMin,fiveMin,followTime],followTime只会返回一个汇总后的数据|
|**startTime**|String|False| |查询起始时间,UTC时间，格式为:yyyy-MM-dd'T'HH:mm:ss'Z'，示例:2018-10-21T10:00:00Z|
|**subDomain**|String|False| |待查询的子域名|


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
|**startTime**|String| |
|**statistics**|StatisticsGroupSumDataItem[]| |
### StatisticsGroupSumDataItem
|名称|类型|描述|
|---|---|---|
|**data**|Object|查询结果,类型为HashMap<String, Object>|
|**endTime**|String|UTC时间，格式为:yyyy-MM-dd'T'HH:mm:ss'Z'，示例:2018-10-21T10:00:00Z|
|**startTime**|String|UTC时间，格式为:yyyy-MM-dd'T'HH:mm:ss'Z'，示例:2018-10-21T10:00:00Z|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
