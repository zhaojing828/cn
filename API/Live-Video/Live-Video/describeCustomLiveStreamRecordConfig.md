# describeCustomLiveStreamRecordConfig


## 描述
查询录制配置

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/records:config


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**pageNum**|Integer|False|页码；默认为1；取值范围[1, 100000]|
|**pageSize**|Integer|False|分页大小；默认为10；取值范围[10, 100]|
|**filters**|Filter[]|False|录制配置查询过滤条件:<br>  - name:   publishDomain，必填(直播推流域名)<br>  - value:  参数<br>  - name:   appName，必填(应用名称)<br>  - value:  参数<br>  - name:   streamName，非必填(推流名称)<br>  - value:  参数<br>|

### Filter
|名称|类型|是否必需|描述|
|---|---|---|---|
|**name**|String|True|过滤条件的名称|
|**operator**|String|False|过滤条件的操作符，默认eq|
|**values**|String[]|True|过滤条件的值|



## 示例
    {
        "pageNum": 1,
        "pageSize": 10,
        "filters": [{
           "name":"publishDomain",
           "value":"push.yourdomain.com"},
          {
           "name":"appName",
           "value":"live"
           }]
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
|**recordConfigs**|LiveRecordConfig[]|码率信息|
### LiveRecordConfig
|名称|类型|描述|
|---|---|---|
|**publishDomain**|String|推流域名|
|**appName**|String|应用名称|
|**streamName**|String|直播流名称|
|**recordConfig**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
