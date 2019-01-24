# modifyParameters


## 描述
修改SQL Server数实例的配置参数。 部分参数修改后，需要重启才能生效，具体可以参考微软的相关文档<br>- 仅支持SQL Server

## 请求方式
PUT

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/parameters

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**parameters**|Parameter[]|True| |修改的实例参数|

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
