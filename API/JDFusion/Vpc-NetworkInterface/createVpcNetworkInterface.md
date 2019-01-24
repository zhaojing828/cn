# createVpcNetworkInterface


## 描述
根据云提供商创建网卡

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_networkInterfaces

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**authorization**|String|True| |获取方式请参考签名算法指导文档|
|**netInterface**|CreateNetInterface|True| |创建网卡|
|**x-jdcloud-date**|String|True| |获取方式请参考签名算法指导文档|
|**x-jdcloud-fusion-cloudid**|String|True| |云注册信息ID|
|**x-jdcloud-nonce**|String|True| |获取方式请参考签名算法指导文档|

### CreateNetInterface
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**associatedPublicIp**|String|False| |弹性网卡关联的公网 IP|
|**az**|String|False| |可用区的 ID|
|**cloudID**|String|False| |所属云提供商ID|
|**createdTime**|String|False| |创建时间|
|**description**|String|False| |网卡描述信息|
|**id**|String|False| |网卡的Id|
|**instanceId**|String|False| |弹性网卡附加的实例 ID|
|**macAddress**|String|False| |弹性网卡的 MAC 地址|
|**name**|String|False| |网卡名称|
|**privateIpAddress**|String|False| |弹性网卡主私有 IP 地址|
|**securityGroupId**|String|True| |安全组|
|**subnetId**|String|True| |子网id|
|**type**|String|False| |网卡类型|
|**vpcId**|String|False| |VPC的Id|

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
