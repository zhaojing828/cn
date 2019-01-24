# rollbackDeploymentsVersion


## 描述
应用部署回滚

## 请求方式
PUT

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments/{id}/versions/{version_id}:rollback

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|True| |deployment ID|
|**regionId**|String|True| |地域ID|
|**version_id**|String|True| |application ID|

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
|**deployment**|DeploymentInfo| |
### DeploymentInfo
|名称|类型|描述|
|---|---|---|
|**content**|DeploymentResourcesInfo| |
|**info**|DeploymentBaseInfo| |
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
### DeploymentBaseInfo
|名称|类型|描述|
|---|---|---|
|**cloudId**|String|云ID|
|**createdTime**|String|创建时间|
|**description**|String|描述|
|**id**|String|ID|
|**name**|String|名称|
|**readOnly**|Integer|是否只读 0：否 1：是|
|**updatedTime**|String|更新时间|
|**userId**|String|用户ID|
|**version**|String|版本|

## 返回码
|返回码|描述|
|---|---|
|**202**|ACCEPTED|
|**404**|not found|
