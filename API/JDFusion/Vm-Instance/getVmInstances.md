# getVmInstances


## 描述
根据云提供商查询对应的虚拟机资源信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vm_instances

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
|**vms**|VmInfo[]| |
### VmInfo
|名称|类型|描述|
|---|---|---|
|**az**|String|云主机所属的可用区|
|**cloudID**|String|所属云提供商ID|
|**createdTime**|String|创建时间|
|**description**|String|云主机描述|
|**elasticIpAddress**|String|主网卡主IP绑定弹性IP的地址|
|**hostName**|String|云主机|
|**id**|String|资源ID，如果为空，则执行创建操作，否则执行修改操作|
|**imageType**|ImageType| |
|**instanceType**|InstanceType| |
|**keyNames**|String[]|密钥对名称,jd当前只支持传入一个|
|**name**|String|云主机名称|
|**privateIpAddress**|String|私有ip地址|
|**region**|String|可用区,根据各云平台规范填写|
|**status**|String|云主机状态|
|**subnetId**|String|子网ID|
|**tags**|Tag[]| |
### ImageType
|名称|类型|描述|
|---|---|---|
|**cloudID**|String|所属云提供商ID|
|**desc**|String|镜像描述|
|**id**|String|镜像ID|
|**imageSource**|String|镜像来源|
|**name**|String|镜像名称|
|**osType**|String|镜像的操作系统类型|
|**osVersion**|String|镜像的操作系统版本|
|**platform**|String|镜像的操作系统发行版|
|**region**|String|镜像所属区域|
### InstanceType
|名称|类型|描述|
|---|---|---|
|**cpu**|Integer|处理器核数，单位为C|
|**memory**|Integer|内存大小，单位为M|
|**name**|String|实例配置类型名称|
### Tag
|名称|类型|描述|
|---|---|---|
|**tagKey**|String|标签KEY值|
|**tagValue**|String|标签Value值|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
