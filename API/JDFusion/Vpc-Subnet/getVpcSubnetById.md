# getVpcSubnetById


## 描述
根据云提供商查询对应的subnet资源信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_subnets/{id}

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
|**subnet**|SubnetDesInfo| |
### SubnetDesInfo
|名称|类型|描述|
|---|---|---|
|**az**|String|子网所属可用域Id|
|**cidrBlock**|String|子网网段|
|**cloudID**|String|所属云提供商ID|
|**createdTime**|String|创建时间|
|**description**|String|子网描述信息|
|**id**|String|Subnet的Id|
|**name**|String|子网名称|
|**vpcId**|String|子网所属VPC的Id|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
|**404**|not found|
