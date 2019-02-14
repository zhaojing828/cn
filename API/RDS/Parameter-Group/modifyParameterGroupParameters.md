# modifyParameterGroupParameters


## 描述
修改参数组的参数<br>- 仅支持MySQL

## 请求方式
PUT

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/parameterGroups/{parameterGroupId}/parameters

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**parameterGroupId**|String|True| |Parameter Group ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**parameters**|Parameter[]|True| |修改的参数|

### Parameter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|False| |参数名称,目前支持以下参数:max_worker_threads,max_degree_of_parallelism,max_server_memory_(MB)|
|**value**|String|False| |参数修改值|

## 返回参数
无


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
