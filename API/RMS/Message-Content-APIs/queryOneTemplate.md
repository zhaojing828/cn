# queryOneTemplate


## 描述
查询一个富媒体短信内容接口

## 请求方式
POST

## 请求地址
https://rms.jdcloud-api.com/v1/regions/{regionId}/queryOneTemplate

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**templateId**|String|False| |templateId参数|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId参数|

### Result
|名称|类型|描述|
|---|---|---|
|**data**|RespQueryOneTemplateResourceList[]| |
|**description**|String|description参数|
|**mediaLength**|String|mediaLength参数|
|**type**|String|type参数|
|**title**|String|title参数|
|**isTuiding**|String|isTuiding参数|
|**message**|String|message参数|
|**status**|String|status参数|
### RespQueryOneTemplateResourceList
|名称|类型|描述|
|---|---|---|
|**size**|String|size参数|
|**name**|String|name参数|
|**type**|String|type参数|
|**url**|String|url参数|
|**content**|String|content参数|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
