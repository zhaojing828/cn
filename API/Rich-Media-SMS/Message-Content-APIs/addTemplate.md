# addTemplate


## 描述
增加富媒体短信内容接口

## 请求方式
POST

## 请求地址
https://rms.jdcloud-api.com/v1/regions/{regionId}/addTemplate

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**appId**|String|False| |应用Id|
|**signType**|String|False| ||
|**purpose**|String|False| ||
|**signCardType**|String|False| ||
|**aptitudes**|String|False| ||
|**title**|String|False| |短信标题|
|**description**|String|False| |描述信息|
|**isTuiding**|String|False| ||
|**content**|QueryAddTemplateContent[]|False| ||

### QueryAddTemplateContent
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**type**|String|False| ||
|**txt**|String|False| |文字描述信息|
|**file**|String|False| |图片、视频、音频对象|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String||

### Result
|名称|类型|描述|
|---|---|---|
|**data**|RespAddTemplateData[]| |
|**message**|String||
|**status**|String||
### RespAddTemplateData
|名称|类型|描述|
|---|---|---|
|**templateId**|String|短信Id|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
