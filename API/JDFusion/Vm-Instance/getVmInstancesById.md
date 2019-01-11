# getVmInstancesById


## 描述
根据云提供商查询对应的VM资源信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vm_instances/{id}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|True| |资源实例ID|
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
|**vm**|VmInfoDetail| |
### VmInfoDetail
|名称|类型|描述|
|---|---|---|
|**az**|String|云主机所属的可用区|
|**cloudID**|String|所属云提供商ID|
|**createdTime**|String|创建时间|
|**dataDiskAttachments**|DataDiskAttachment[]|数据盘配置信息|
|**description**|String|云主机描述|
|**elasticIpAddress**|String|主网卡主IP绑定弹性IP的地址|
|**hostName**|String|云主机|
|**id**|String|资源ID，如果为空，则执行创建操作，否则执行修改操作|
|**imageType**|ImageType| |
|**instanceType**|InstanceType| |
|**keyNames**|String[]|密钥对名称,jd当前只支持传入一个|
|**metadata**|String|扩展信息|
|**name**|String|云主机名称|
|**primaryNetworkInterface**|NetAttachment| |
|**privateIpAddress**|String|私有ip地址|
|**region**|String|可用区,根据各云平台规范填写|
|**secondaryNetworkInterfaces**|NetAttachment[]|辅助网卡配置|
|**status**|String|云主机状态|
|**subnetId**|String|子网ID|
|**sysDiskInfo**|SysDiskInfo| |
|**tags**|Tag[]| |
### DataDiskAttachment
|名称|类型|描述|
|---|---|---|
|**autoDelete**|Boolean|是否随云主机一起删除,true：自动；false：非自动|
|**dataDisk**|DataDiskInfo| |
|**deviceName**|String|数据盘逻辑挂载点|
|**diskCategory**|String|磁盘分类,取值为本地盘(local)或者数据盘(cloud)|
### DataDiskInfo
|名称|类型|描述|
|---|---|---|
|**autoDelete**|String|磁盘是否随主机一起删除|
|**diskMediumType**|String|磁盘介质分类，目前为预留，可以为空|
|**diskName**|String|磁盘名称|
|**diskSize**|Integer|硬盘大小|
|**status**|String|磁盘状态|
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
### NetAttachment
|名称|类型|描述|
|---|---|---|
|**autoDelete**|Boolean|指明删除实例时是否删除网卡,默认true；（当前只能是true）|
|**deviceIndex**|Integer|设备Index|
|**networkInterface**|NetworkInterface| |
### NetworkInterface
|名称|类型|描述|
|---|---|---|
|**macAddress**|String|以太网地址|
|**networkInterfaceId**|String|弹性网卡ID|
|**primaryIp**|Ip| |
|**sanityCheck**|Integer|源和目标IP地址校验,取值为0或者1|
|**secondaryIps**|Ip[]|网卡辅IP|
|**securityGroups**|SecurityGroup[]|所属安全组列表|
|**subnetId**|String|子网ID|
|**vpcId**|String|虚拟网络ID|
### Ip
|名称|类型|描述|
|---|---|---|
|**elasticIpAddress**|String|弹性IP实例地址|
|**privateIpAddress**|String|私有IP的IPV4地址|
### SecurityGroup
|名称|类型|描述|
|---|---|---|
|**groupId**|String|安全组ID|
|**groupName**|String|安全组名称|
### SysDiskInfo
|名称|类型|描述|
|---|---|---|
|**autoDelete**|String|磁盘是否随主机一起删除|
|**diskMediumType**|String|磁盘介质分类，目前为预留，可以为空|
|**diskName**|String|磁盘名称|
|**diskSize**|Integer|硬盘大小|
|**status**|String|磁盘状态|
### Tag
|名称|类型|描述|
|---|---|---|
|**tagKey**|String|标签KEY值|
|**tagValue**|String|标签Value值|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
|**404**|无查询结果|
