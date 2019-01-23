# extendDisk


## 描述
-   扩容云硬盘到指定大小，云硬盘状态必须为 available。
-   当云硬盘正在创建快照时，不允许扩容。


## 请求方式
POST

## 请求地址
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks/{diskId}:extend

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|
|**diskId**|String|True| |云硬盘ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**diskSizeGB**|Integer|True| |扩容后的云硬盘大小，单位为GiB|


## 返回参数
无


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
