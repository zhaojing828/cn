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
|**templateId**|String|False| |短信Id|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String||

### Result
|名称|类型|描述|
|---|---|---|
|**data**|RespQueryOneTemplateResourceList[]| |
|**description**|String|描述信息|
|**mediaLength**|String||
|**type**|String||
|**title**|String|短信标题|
|**isTuiding**|String||
|**message**|String||
|**status**|String||
### RespQueryOneTemplateResourceList
|名称|类型|描述|
|---|---|---|
|**size**|String||
|**name**|String||
|**type**|String||
|**url**|String||
|**content**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
