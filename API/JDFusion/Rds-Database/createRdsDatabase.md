# createRdsDatabase


## 描述
根据给定的信息，创建指定RDS实例的数据库

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}/databases

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instId**|String|True| |RDS实例ID|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**database**|CreateRDSDB|True| |创建RDS实例的数据库信息|
|**x-jdcloud-fusion-cloudid**|String|True| |云注册信息ID|

### CreateRDSDB
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**characterSetName**|String|True| |字符集|
|**name**|String|True| |数据库名|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|名称|类型|描述|
|---|---|---|
|**body**|String|请求体|
|**cloudId**|String|cloud ID|
|**createdTime**|String|创建时间|
|**provider**|String|cloud provider|
|**result**|String|执行结果|
|**status**|String|状态|
|**updateTime**|String|更新时间|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## 返回码
|返回码|描述|
|---|---|
|**202**|ACCEPTED|
|**404**|RDS instance not found|
