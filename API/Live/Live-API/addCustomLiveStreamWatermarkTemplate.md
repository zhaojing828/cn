# addCustomLiveStreamWatermarkTemplate


## 描述
添加直播水印模板

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/watermarkCustoms:template


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**height**|Integer|True| |高|
|**offsetX**|Integer|True| |x轴偏移量 单位：像素|
|**offsetY**|Integer|True| |y轴偏移量 单位：像素|
|**template**|String|True| |录制模板自定义名称|
|**url**|String|True| |高|
|**width**|Integer|True| |宽|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**feedback**|Boolean|返回结果|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
