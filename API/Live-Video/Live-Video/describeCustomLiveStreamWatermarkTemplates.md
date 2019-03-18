# describeCustomLiveStreamWatermarkTemplates


## 描述
查询水印模板列表

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/watermarkCustoms


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**pageNum**|Integer|False|页码；默认为1；取值范围[1, 100000]|
|**pageSize**|Integer|False|分页大小；默认为10；取值范围[10, 100]|
|**filters**|Filter[]|False|水印模板列表查询过滤条件:<br>  - name:   template 录制模板自定义名称<br>  - value:  如果参数为空，则查询全部<br>|

### Filter
|名称|类型|是否必需|描述|
|---|---|---|---|
|**name**|String|True|过滤条件的名称|
|**values**|String[]|True|过滤条件的值|

## 示例
    {
        "pageNum": 1,
        "pageSize": 10,
        "filters": [{
           "name":"template",
           "value":"test-live-video"}]
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
|**watermarkTemplates**|WatermarkTemplate[]|水印模板|
### WatermarkTemplate
|名称|类型|描述|
|---|---|---|
|**offSetX**|Integer|x轴偏移量|
|**offSetY**|Integer|y轴偏移量|
|**width**|Integer|宽|
|**height**|Integer|高|
|**url**|String|url|
|**template**|String|水印模板自定义名称|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
