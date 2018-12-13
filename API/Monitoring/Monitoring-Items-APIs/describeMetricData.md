# describeMetricData


## 描述
查看某资源多个监控项数据，metric介绍1：<a href="https://docs.jdcloud.com/cn/monitoring/metrics">Metrics</a>

## 请求方式
GET

## 请求地址
https://monitor.jdcloud-api.com/v1/regions/{regionId}/metrics/{metric}/metricData

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**metric**|String|True| |监控项英文标识(id)|
|**regionId**|String|True| |地域 Id|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**aggrType**|String|False| |指标聚合方式，每个指标都有默认的聚合方式， 可选值包括：sum,avg.max.min|
|**endTime**|String|False| |查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd'T'HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）|
|**groupBy**|Boolean|False| |是否对查询的tags分组|
|**resourceId**|String|True| |资源的uuid|
|**serviceCode**|String|True| |资源的类型，取值vm, lb, ip, database 等|
|**startTime**|String|False| |查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd'T'HH:mm:ssZ（默认为当前时间，早于30d时，将被重置为30d）|
|**tags**|TagFilter[]|False| |自定义标签|
|**timeInterval**|String|False| |时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项|

### TagFilter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**key**|String|False| |Tag键|
|**values**|String[]|False| |Tag值|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**metricDatas**|MetricData[]| |
### MetricData
|名称|类型|描述|
|---|---|---|
|**data**|DataPoint[]| |
|**metric**|Metric| |
|**tags**|Tag[]| |
### DataPoint
|名称|类型|描述|
|---|---|---|
|**timestamp**|Long| |
|**value**|Object| |
### Metric
|名称|类型|描述|
|---|---|---|
|**aggregator**|String| |
|**calculateUnit**|String| |
|**metric**|String| |
|**metricName**|String| |
|**period**|String| |
### Tag
|名称|类型|描述|
|---|---|---|
|**tagKey**|String| |
|**tagValue**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|api DescribeMetricData Response|
