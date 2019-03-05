# createVmInstance


## 描述
根据云提供商创建虚拟机

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vm_instances

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**authorization**|String|True| |获取方式请参考签名算法指导文档|
|**vm**|CreateVm|True| |创建VM|
|**x-jdcloud-date**|String|True| |获取方式请参考签名算法指导文档|
|**x-jdcloud-fusion-cloudid**|String|True| |云注册信息ID|
|**x-jdcloud-nonce**|String|True| |获取方式请参考签名算法指导文档|

### CreateVm
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**az**|String|False| |云主机所属的可用区|
|**cloudID**|String|False| |所属云提供商ID|
|**createdTime**|String|False| |创建时间|
|**description**|String|False| |云主机描述|
|**elasticIpAddress**|String|False| |主网卡主IP绑定弹性IP的地址|
|**hostName**|String|False| |云主机|
|**id**|String|False| |资源ID，如果为空，则执行创建操作，否则执行修改操作|
|**imageId**|String|True| |镜像文件ID，启动实例时选择的镜像资源|
|**imageType**|ImageType|False| | |
|**instanceFlavorType**|String|True| |规格类型|
|**instanceType**|InstanceType|False| | |
|**internetMaxBandwidthIn**|Integer|False| |否  公网入带宽最大值，单位为Mbit/s|
|**internetMaxBandwidthOut**|Integer|False| |否  公网出带宽最大值，单位为Mbit/s|
|**keyNames**|String[]|False| |密钥对名称,jd当前只支持传入一个|
|**keyPairName**|String|False| |否  密钥对名称|
|**name**|String|True| |云主机名称|
|**password**|String|False| |否  实例的密码|
|**passwordInherit**|Boolean|False| |否  是否使用镜像预设的密码|
|**privateIpAddress**|String|False| |私有ip地址|
|**region**|String|False| |可用区,根据各云平台规范填写|
|**securityGroupId**|String|False| |指定新创建实例所属于的安全组代码，同一个安全组内的实例之间可以互相访问|
|**status**|String|False| |云主机状态|
|**subnetId**|String|True| |子网ID|
|**systemDisk**|SystemDisk|False| | |
|**tags**|Tag[]|False| | |
|**userData**|String|False| |否  实例自定义数据，需要以Base64方式编码，原始数据最多为16KB|
### ImageType
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cloudID**|String|False| |所属云提供商ID|
|**desc**|String|False| |镜像描述|
|**id**|String|False| |镜像ID|
|**imageSource**|String|False| |镜像来源|
|**name**|String|False| |镜像名称|
|**osType**|String|False| |镜像的操作系统类型|
|**osVersion**|String|False| |镜像的操作系统版本|
|**platform**|String|False| |镜像的操作系统发行版|
|**region**|String|False| |镜像所属区域|
### InstanceType
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cpu**|Integer|False| |处理器核数，单位为C|
|**memory**|Integer|False| |内存大小，单位为M|
|**name**|String|False| |实例配置类型名称|
### SystemDisk
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**category**|String|False| |否  系统盘的磁盘种类|
|**description**|String|False| |系统盘描述|
|**diskSize**|Integer|False| |系统盘大小|
### Tag
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**tagKey**|String|False| |标签KEY值|
|**tagValue**|String|False| |标签Value值|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|名称|类型|描述|
|---|---|---|
|**body**|String|请求体|
|**cloudId**|String|cloud ID|
|**createdTime**|String|创建时间|
|**provider**|String|cloud provider|
|**result**|String|执行结果|
|**status**|String|状态|
|**updateTime**|String|更新时间|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## 返回码
|返回码|描述|
|---|---|
|**201**|CREATED|
