# describeInstance


## 描述
查询一台云主机的详细信息


## 请求方式
GET

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |云主机ID|
|**regionId**|String|True| |地域ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|名称|类型|描述|
|---|---|---|
|**instance**|Instance| |
### Instance
|名称|类型|描述|
|---|---|---|
|**status**|String|云主机状态，<a href="http://docs.jdcloud.com/virtual-machines/api/vm_status">参考云主机状态</a>|
|**vpcId**|String|主网卡所属VPC的ID|
|**description**|String|云主机描述|
|**ag**|Ag|高可用组，如果创建云主机使用了高可用组，此处可展示高可用组名称|
|**tags**|Tag[]|Tag信息|
|**instanceId**|String|云主机ID|
|**imageId**|String|镜像ID|
|**elasticIpAddress**|String|主网卡主IP绑定弹性IP的地址|
|**subnetId**|String|主网卡所属子网的ID|
|**az**|String|云主机所在可用区|
|**instanceType**|String|实例规格|
|**systemDisk**|InstanceDiskAttachment|系统盘配置|
|**faultDomain**|String|高可用组中的错误域|
|**elasticIpId**|String|主网卡主IP绑定弹性IP的ID|
|**keyNames**|String[]|密钥对名称|
|**primaryNetworkInterface**|InstanceNetworkInterfaceAttachment|主网卡配置|
|**charge**|Charge|计费信息|
|**launchTime**|String|创建时间|
|**secondaryNetworkInterfaces**|InstanceNetworkInterfaceAttachment[]|辅助网卡配置|
|**instanceName**|String|云主机名称|
|**privateIpAddress**|String|主网卡主IP地址|
|**dataDisks**|InstanceDiskAttachment[]|数据盘配置|
### InstanceDiskAttachment
|名称|类型|描述|
|---|---|---|
|**status**|String|数据盘挂载状态，取值范围：attaching,detaching,attached,detached,error_attach,error_detach|
|**deviceName**|String|数据盘逻辑挂载点，取值范围：vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi|
|**autoDelete**|Boolean|随云主机一起删除，删除主机时自动删除此磁盘，默认为true，本地盘(local)不能更改此值。<br>如果云主机中的数据盘(cloud)是包年包月计费方式，此参数不生效。<br>如果云主机中的数据盘(cloud)是共享型数据盘，此参数不生效。<br>|
|**cloudDisk**|Disk|云硬盘配置|
|**localDisk**|LocalDisk|本地磁盘配置|
|**diskCategory**|String|磁盘分类，取值为本地盘(local)或者数据盘(cloud)。<br>系统盘支持本地盘(local)或者云硬盘(cloud)。系统盘选择local类型，必须使用localDisk类型的镜像；同理系统盘选择cloud类型，必须使用cloudDisk类型的镜像。<br>数据盘仅支持云硬盘(cloud)。<br>|
### LocalDisk
|名称|类型|描述|
|---|---|---|
|**diskSizeGB**|Integer|磁盘大小|
|**diskType**|String|磁盘类型，取值范围{premium-hdd, ssd}|
### Disk
|名称|类型|描述|
|---|---|---|
|**status**|String|云硬盘状态，取值为 creating、available、in-use、extending、restoring、deleting、deleted、error_create、error_delete、error_restore、error_extend 之一|
|**name**|String|云硬盘名称|
|**tags**|Tag[]|Tag信息|
|**description**|String|云硬盘描述|
|**diskType**|String|磁盘类型，取值为 ssd 或 premium-hdd|
|**diskSizeGB**|Integer|磁盘大小，单位为 GiB|
|**charge**|Charge|云硬盘计费配置信息|
|**snapshotId**|String|创建该云硬盘的快照ID|
|**az**|String|云硬盘所属AZ|
|**createTime**|String|创建云硬盘时间|
|**diskId**|String|云硬盘ID|
|**attachments**|DiskAttachment[]|挂载信息|
### DiskAttachment
|名称|类型|描述|
|---|---|---|
|**status**|String|挂载状态，取值为 "attaching", "attached", "detaching", "detached"|
|**attachmentId**|String|挂载ID|
|**attachTime**|String|挂载时间|
|**instanceId**|String|挂载实例的ID|
|**instanceType**|String|挂载实例的类型，取值为 vm、nc|
|**diskId**|String|云硬盘ID|
### Charge
|名称|类型|描述|
|---|---|---|
|**chargeStatus**|String|费用支付状态，取值为：normal、overdue、arrear，normal表示正常，overdue表示已到期，arrear表示欠费|
|**chargeStartTime**|String|计费开始时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|过期时间，预付费资源的到期时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ，后付费资源此字段内容为空|
|**chargeRetireTime**|String|预期释放时间，资源的预期释放时间，预付费/后付费资源均有此值，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ|
|**chargeMode**|String|支付模式，取值为：prepaid_by_duration，postpaid_by_usage或postpaid_by_duration，prepaid_by_duration表示预付费，postpaid_by_usage表示按用量后付费，postpaid_by_duration表示按配置后付费，默认为postpaid_by_duration|
### Tag
|名称|类型|描述|
|---|---|---|
|**key**|String|Tag键|
|**value**|String|Tag值|
### InstanceNetworkInterfaceAttachment
|名称|类型|描述|
|---|---|---|
|**deviceIndex**|Integer|设备Index|
|**autoDelete**|Boolean|指明删除实例时是否删除网卡，默认true；当前只能是true|
|**networkInterface**|InstanceNetworkInterface|网卡接口规范|
### InstanceNetworkInterface
|名称|类型|描述|
|---|---|---|
|**macAddress**|String|以太网地址|
|**vpcId**|String|虚拟网络ID|
|**networkInterfaceId**|String|弹性网卡ID|
|**secondaryIps**|NetworkInterfacePrivateIp[]|网卡辅IP|
|**sanityCheck**|Integer|源和目标IP地址校验，取值为0或者1|
|**securityGroups**|SecurityGroupSimple[]| |
|**subnetId**|String|子网ID|
|**primaryIp**|NetworkInterfacePrivateIp|网卡主IP|
### NetworkInterfacePrivateIp
|名称|类型|描述|
|---|---|---|
|**privateIpAddress**|String|私有IP的IPV4地址|
|**elasticIpId**|String|弹性IP实例ID|
|**elasticIpAddress**|String|弹性IP实例地址|
### SecurityGroupSimple
|名称|类型|描述|
|---|---|---|
|**groupName**|String|安全组名称|
|**groupId**|String|安全组ID|
### Ag
|名称|类型|描述|
|---|---|---|
|**name**|String|高可用组名称|
|**id**|String|高可用组id|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
