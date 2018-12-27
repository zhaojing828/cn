# addLiveStreamDomainWatermark


## 描述
添加域名水印配置

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/watermarkDomains:config


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**publishDomain**|String|True| |您的推流加速域名|
|**template**|String|True| |录制模版|


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
