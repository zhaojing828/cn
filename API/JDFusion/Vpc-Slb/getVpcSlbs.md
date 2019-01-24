# getVpcSlbs


## 描述
根据云提供商查询对应的负载均衡资源信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_slbs

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**authorization**|String|True| |获取方式请参考签名算法指导文档|
|**x-jdcloud-date**|String|True| |获取方式请参考签名算法指导文档|
|**x-jdcloud-fusion-cloudid**|String|False| |云注册信息ID|
|**x-jdcloud-nonce**|String|True| |获取方式请参考签名算法指导文档|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**slbs**|SlbInfo[]| |
### SlbInfo
|名称|类型|描述|
|---|---|---|
|**addressType**|String|负载均衡实例的网络类型。|
|**azs**|String[]|可用区域。|
|**cloudID**|String|所属云ID|
|**createdTime**|String|创建时间|
|**id**|String|负载均衡实例ID。|
|**ipAddress**|String|负载均衡实例的服务地址。|
|**name**|String|负载均衡实例的名称。|
|**networkType**|String|私网负载均衡实例的网络类型|
|**status**|String|负载均衡实例状态|
|**subnetId**|String|私网负载均衡实例的交换机ID。|
|**vpc**|String|私网负载均衡实例的专有网络ID。|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
