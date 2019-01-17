# getRdsByInstId


## 描述
根据云提供商查询对应的RDS实例信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instId**|String|True| |RDS实例ID|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |云注册信息ID|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**instance**|RdsInstanceDetailInfo| |
### RdsInstanceDetailInfo
|名称|类型|描述|
|---|---|---|
|**azs**|String[]|可用区ID|
|**cloudID**|String|所属云提供商ID|
|**connectionMode**|String|实例的访问模式|
|**connectionString**|String|连接地址|
|**engine**|String|实例引擎类型|
|**engineVersion**|String|实例引擎版本|
|**id**|String|RDS实例ID|
|**instanceCPU**|Integer|CPU核数|
|**instanceClassType**|String|实例规格|
|**instanceType**|String|实例类型|
|**memoryMB**|Double|内存大小，单位MB|
|**name**|String|RDS实例名称|
|**payType**|String|付费方式，Postpaid：后付费; Prepaid：预付费|
|**port**|String|端口|
|**status**|String|实例状态|
|**storageGB**|Integer|磁盘，单位GB|
|**subnetId**|String|subnet ID|
|**vpcId**|String|VPC ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
|**404**|RDS instance not found|
