# previewCertificate


## 描述
预览证书

## 请求方式
POST

## 请求地址
https://cdn.jdcloud-api.com/v1/domain/{domain}/certificate

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|True| |用户域名|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**content**|String|False| | |


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**endDate**|String| |
|**issuer**|String| |
|**sigAlgName**|String| |
|**sigHashAlgName**|String| |
|**startDate**|String| |
|**user**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
