# listFunction


## 描述
查询函数列表

## 请求方式
GET

## 请求地址
https://function.jdcloud-api.com/v1/regions/{regionId}/functions

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |functionId -函数ID，精确匹配，支持多个<br>|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |过滤条件的名称|
|**operator**|String|False| |过滤条件的操作符，默认eq|
|**values**|String[]|True| |过滤条件的值|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|本次请求Id|
|**result**|Result|查询函数列表返回值|

### Result
|名称|类型|描述|
|---|---|---|
|**data**|FunctionSpec[]| |
### FunctionSpec
|名称|类型|描述|
|---|---|---|
|**createTime**|String|函数创建时间|
|**description**|String|函数描述|
|**downloadUrl**|String|代码包下载的url地址|
|**functionId**|String|函数Id|
|**name**|String|函数名称|
|**runtime**|String|函数运行环境，目前有python3|
|**updateTime**|String|函数最后更新时间|
|**version**|String|函数版本名称|

## 返回码
|返回码|描述|
|---|---|
|**200**|A successful response.|
