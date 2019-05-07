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
|**signType**|String|False| |signType参数|
|**purpose**|String|False| |purpose参数|
|**signCardType**|String|False| |signCardType参数|
|**aptitudes**|String|False| |aptitudes参数|
|**title**|String|False| |title参数|
|**description**|String|False| |description参数|
|**isTuiding**|String|False| |isTuiding参数|
|**content**|QueryAddTemplateContent[]|False| |content参数|

### QueryAddTemplateContent
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**type**|String|False| |type参数|
|**txt**|String|False| |txt参数|
|**file**|String|False| |file参数|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId参数|

### Result
|名称|类型|描述|
|---|---|---|
|**data**|RespAddTemplateData[]| |
|**message**|String|message参数|
|**status**|String|status参数|
### RespAddTemplateData
|名称|类型|描述|
|---|---|---|
|**templateId**|String|templateId参数|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
