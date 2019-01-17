# getDeploymentVersions


## 描述
查询应用记录

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments/{id}/versions

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|True| |Deployment ID|
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
|**versions**|DeploymentApplyInfo[]| |
### DeploymentApplyInfo
|名称|类型|描述|
|---|---|---|
|**applyTime**|String|应用时间|
|**comment**|String|备注信息|
|**content**|DeploymentResourcesInfo| |
|**id**|String|ID|
|**version**|String|版本|
### DeploymentResourcesInfo
|名称|类型|描述|
|---|---|---|
|**diskAttachment**|Object| |
|**disks**|Object| |
|**eipAssociate**|Object| |
|**eips**|Object| |
|**httpListeners**|Object| |
|**keypairs**|Object| |
|**netInterfaceAttachment**|Object| |
|**networkInterfaces**|Object| |
|**securityGroups**|Object| |
|**slbs**|Object| |
|**subnets**|Object| |
|**variables**|Object| |
|**vms**|Object| |
|**vpcs**|Object| |
|**vserverGroups**|Object| |

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
|**404**|not found|
