# createDeployment


## 描述
创建部署信息

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**deployment**|DeploymentInfo|True| |创建deployment|
|**x-jdcloud-fusion-cloudid**|String|False| |云注册信息ID|

### DeploymentInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**content**|DeploymentResourcesInfo|False| | |
|**info**|DeploymentBaseInfo|False| | |
### DeploymentResourcesInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**diskAttachment**|Object|False| | |
|**disks**|Object|False| | |
|**eipAssociate**|Object|False| | |
|**eips**|Object|False| | |
|**httpListeners**|Object|False| | |
|**keypairs**|Object|False| | |
|**netInterfaceAttachment**|Object|False| | |
|**networkInterfaces**|Object|False| | |
|**securityGroups**|Object|False| | |
|**slbs**|Object|False| | |
|**subnets**|Object|False| | |
|**variables**|Object|False| | |
|**vms**|Object|False| | |
|**vpcs**|Object|False| | |
|**vserverGroups**|Object|False| | |
### DeploymentBaseInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cloudId**|String|False| |云ID|
|**createdTime**|String|False| |创建时间|
|**description**|String|False| |描述|
|**id**|String|False| |ID|
|**name**|String|False| |名称|
|**readOnly**|Integer|False| |是否只读 0：否 1：是|
|**updatedTime**|String|False| |更新时间|
|**userId**|String|False| |用户ID|
|**version**|String|False| |版本|

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
|**201**|CREATED|
