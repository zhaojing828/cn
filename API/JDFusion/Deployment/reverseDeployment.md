# reverseDeployment


## 描述
根据已有资源反向生成deployment

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/deployments:reverse

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**reverse**|ReverseDeploymentInfo|True| |根据已有资源反向生成deployment|
|**x-jdcloud-fusion-cloudid**|String|False| |云注册信息ID|

### ReverseDeploymentInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False| |描述|
|**name**|String|False| |模板名称|
|**readOnly**|Integer|False| |是否只读 0：否 1：是|
|**resources**|ReverseDeploymentResourcesInfo|False| | |
|**version**|String|False| |版本|
### ReverseDeploymentResourcesInfo
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**diskAttachmentIds**|Object|False| | |
|**diskIds**|Object|False| | |
|**eipAssociateIds**|Object|False| | |
|**eipIds**|Object|False| | |
|**httpListenerIds**|Object|False| | |
|**keypairIds**|Object|False| | |
|**netInterfaceAttachmentIds**|Object|False| | |
|**networkInterfaceIds**|Object|False| | |
|**securityGroupIds**|Object|False| | |
|**slbIds**|Object|False| | |
|**subnetIds**|Object|False| | |
|**vmIds**|Object|False| | |
|**vpcIds**|Object|False| | |
|**vserverGroupIds**|Object|False| | |

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
