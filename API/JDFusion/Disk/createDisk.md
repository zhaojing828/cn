# createDisk


## 描述
根据云提供商创建云硬盘

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/disk_disks

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**authorization**|String|True| |获取方式请参考签名算法指导文档|
|**disk**|CreateDataDisk|True| |创建云硬盘|
|**x-jdcloud-date**|String|True| |获取方式请参考签名算法指导文档|
|**x-jdcloud-fusion-cloudid**|String|True| |云注册信息ID|
|**x-jdcloud-nonce**|String|True| |获取方式请参考签名算法指导文档|

### CreateDataDisk
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**attachments**|ArrayDiskAttachment[]|False| |挂载信息|
|**az**|String|True| |云硬盘所属AZ|
|**cloudID**|String|False| |云注册信息ID|
|**createdTime**|String|False| |创建时间|
|**description**|String|False| |云硬盘描述|
|**diskSizeGB**|Integer|True| |磁盘大小,单位为 GiB|
|**diskType**|String|False| |磁盘类型,取值为 ssd 或 premium-hdd|
|**id**|String|False| |云硬盘ID|
|**name**|String|False| |云硬盘名称|
|**snapshotId**|String|False| |创建该云硬盘的快照ID|
|**status**|String|False| |云硬盘状态|
|**tags**|Tag[]|False| | |
### ArrayDiskAttachment
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|False| |挂载实例的ID|
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
