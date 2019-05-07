# queryTemplateList


## 描述
查询富媒体短信内容列表接口

## 请求方式
POST

## 请求地址
https://rms.jdcloud-api.com/v1/regions/{regionId}/queryTemplateList

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**appId**|String|False| |应用Id|
|**searchKey**|String|False| ||
|**pageNum**|String|False| ||
|**pageLimit**|String|False| ||
|**status**|String|False| ||
|**title**|String|False| |短信标题|
|**startTime**|String|False| |开始时间|
|**endTime**|String|False| |结束时间|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String||

### Result
|名称|类型|描述|
|---|---|---|
|**data**|RespQueryTemplateListData[]| |
|**message**|String||
|**totalElements**|String||
|**status**|String||
### RespQueryTemplateListData
|名称|类型|描述|
|---|---|---|
|**reason**|String||
|**createTime**|String||
|**contentSize**|String||
|**description**|String||
|**templateId**|String||
|**title**|String||
|**status**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
