# getVpcById


## 描述
根据云提供商查询对应的VPC资源信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_vpcs/{id}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|True| |VPC ID|
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
|**vpc**|VpcInfoDetail| |
### VpcInfoDetail
|名称|类型|描述|
|---|---|---|
|**cidrBlock**|String|地址范围|
|**cloudID**|String|所属云提供商ID|
|**createdTime**|String|创建时间|
|**description**|String|VPC 描述|
|**id**|String|Vpc的Id|
|**name**|String|私有网络名称|
|**routeTableIds**|String[]|路由表ID集合|
|**subnets**|SubnetInfo[]|私有网络包含的子网列表|
### SubnetInfo
|名称|类型|描述|
|---|---|---|
|**availableIpCount**|Integer|子网可用ip数量|
|**cidrBlock**|String|子网网段|
|**cloudID**|String|所属云提供商ID|
|**description**|String|子网描述信息|
|**endIp**|String|子网的结束地址|
|**id**|String|Subnet的Id|
|**routeTableId**|String|子网关联的路由表Id|
|**startIp**|String|子网的起始地址|
|**subnetName**|String|子网名称|
|**vpcId**|String|子网所属VPC的Id|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
|**404**|not found|
