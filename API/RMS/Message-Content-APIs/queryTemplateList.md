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
|**searchKey**|String|False| |searchKey参数|
|**pageNum**|String|False| |pageNum参数|
|**pageLimit**|String|False| |pageLimit参数|
|**status**|String|False| |status参数|
|**title**|String|False| |title参数|
|**startTime**|String|False| |startTime参数|
|**endTime**|String|False| |endTime参数|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId参数|

### Result
|名称|类型|描述|
|---|---|---|
|**data**|RespQueryTemplateListData[]| |
|**message**|String|message参数|
|**totalElements**|String|totalElements参数|
|**status**|String|status参数|
### RespQueryTemplateListData
|名称|类型|描述|
|---|---|---|
|**reason**|String|reason参数|
|**createTime**|String|createTime参数|
|**contentSize**|String|contentSize参数|
|**description**|String|description参数|
|**templateId**|String|templateId参数|
|**title**|String|title参数|
|**status**|String|status参数|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
