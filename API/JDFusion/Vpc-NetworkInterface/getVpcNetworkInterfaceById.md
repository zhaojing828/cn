# getVpcNetworkInterfaceById


## 描述
根据云提供商查询对应的网卡资源信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_networkInterfaces/{id}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|True| |网卡 ID|
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
|**netInterface**|NetInterfaceInfo| |
### NetInterfaceInfo
|名称|类型|描述|
|---|---|---|
|**associatedPublicIp**|String|弹性网卡关联的公网 IP|
|**az**|String|可用区的 ID|
|**cloudID**|String|所属云提供商ID|
|**createdTime**|String|创建时间|
|**description**|String|网卡描述信息|
|**id**|String|网卡的Id|
|**instanceId**|String|弹性网卡附加的实例 ID|
|**macAddress**|String|弹性网卡的 MAC 地址|
|**name**|String|网卡名称|
|**privateIpAddress**|String|弹性网卡主私有 IP 地址|
|**subnetId**|String|子网id|
|**type**|String|网卡类型|
|**vpcId**|String|VPC的Id|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
|**404**|not found|
