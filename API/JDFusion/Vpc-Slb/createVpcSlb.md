# createVpcSlb


## 描述
根据云提供商创建负载均衡

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_slbs

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**authorization**|String|True| |获取方式请参考签名算法指导文档|
|**slb**|SlbInfo|True| |创建SLB|
|**x-jdcloud-date**|String|True| |获取方式请参考签名算法指导文档|
|**x-jdcloud-fusion-cloudid**|String|True| |云注册信息ID|
|**x-jdcloud-nonce**|String|True| |获取方式请参考签名算法指导文档|

### SlbInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**addressType**|String|False| |负载均衡实例的网络类型。|
|**azs**|String[]|False| |可用区域。|
|**cloudID**|String|False| |所属云ID|
|**createdTime**|String|False| |创建时间|
|**id**|String|False| |负载均衡实例ID。|
|**ipAddress**|String|False| |负载均衡实例的服务地址。|
|**name**|String|False| |负载均衡实例的名称。|
|**networkType**|String|False| |私网负载均衡实例的网络类型|
|**status**|String|False| |负载均衡实例状态|
|**subnetId**|String|False| |私网负载均衡实例的交换机ID。|
|**vpc**|String|False| |私网负载均衡实例的专有网络ID。|

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
|**201**|CREATED|
