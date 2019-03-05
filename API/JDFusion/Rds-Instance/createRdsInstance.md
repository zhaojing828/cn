# createRdsInstance


## 描述
根据给定的信息，创建RDS实例

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instance**|CreateRDSInstance|True| |创建RDS实例|
|**x-jdcloud-fusion-cloudid**|String|True| |云注册信息ID|

### CreateRDSInstance
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**azs**|String[]|False| |可用区ID|
|**cloudID**|String|False| |所属云提供商ID|
|**engine**|String|True| |实例引擎类型|
|**engineVersion**|String|True| |数据库版本号|
|**id**|String|False| |RDS实例ID|
|**instanceClass**|String|True| |实例规格|
|**instanceType**|String|False| |实例类型|
|**name**|String|False| |RDS实例名称|
|**payType**|String|True| |计费信息,prepaid\postpaid|
|**status**|String|False| |实例状态|
|**storageGB**|Integer|True| |磁盘大小，单位GB|
|**subnetId**|String|True| |子网ID|
|**vpcId**|String|True| |VPC ID|

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
