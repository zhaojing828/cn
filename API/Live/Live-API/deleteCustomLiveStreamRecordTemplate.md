# deleteCustomLiveStreamRecordTemplate


## 描述
删除录制模板

## 请求方式
DELETE

## 请求地址
https://live.jdcloud-api.com/v1/recordCustoms/{template}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**template**|String|True| |录制模板自定义名称|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**template**|String|录制模板自定义名称|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
