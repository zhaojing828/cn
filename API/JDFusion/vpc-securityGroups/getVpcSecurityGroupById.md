# getVpcSecurityGroupById


## 描述
根据云提供商查询对应的安全组资源信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_securityGroups/{id}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|True| |SecurityGroup ID|
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
|**securityGroup**|SecurityGroupDetail| |
### SecurityGroupDetail
|名称|类型|描述|
|---|---|---|
|**cloudID**|String|注册云信息ID|
|**createdTime**|String|创建时间|
|**description**|String|安全组描述信息|
|**id**|String|安全组 id|
|**name**|String|目标安全组名称|
|**permissions**|PermissionType[]|安全组权限规则集合|
|**vpcId**|String|VPC id|
### PermissionType
|名称|类型|描述|
|---|---|---|
|**cloudID**|String|云注册信息ID|
|**description**|String|描述信息|
|**destCidrIp**|String|目标IP地址段，用于出方向授权|
|**destGroupId**|String|目标安全组，用于出方向授权|
|**destGroupOwnerAccount**|String|目标安全组所属阿里云账户Id|
|**direction**|String|授权方向|
|**ipProtocol**|String|IP协议|
|**nicType**|String|网络类型|
|**policy**|String|授权策略|
|**portRange**|String|端口范围|
|**priority**|String|规则优先级|
|**sourceCidrIp**|String|源IP地址段，用于入方向授权|
|**sourceGroupId**|String|源安全组，用于入方向授权|
|**sourceGroupOwnerAccount**|String|源安全组所属阿里云账户Id|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
|**404**|not found|
