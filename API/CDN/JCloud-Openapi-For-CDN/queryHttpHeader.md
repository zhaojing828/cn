# queryHttpHeader


## 描述
查询http header头

## 请求方式
GET

## 请求地址
https://cdn.jdcloud-api.com/v1/domain/{domain}/httpHeader

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|True| |用户域名|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**domain**|String| |
|**headers**|QueryHttpHeaderResp[]| |
### QueryHttpHeaderResp
|名称|类型|描述|
|---|---|---|
|**headerName**|String| |
|**headerOp**|String| |
|**headerType**|String| |
|**headerValue**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
