# getVmInstanceTypes


## 描述
虚拟机规格列表

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vm_instanceTypes

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
|**instanceTypes**|InstanceTypeInfo[]| |
### InstanceTypeInfo
|名称|类型|描述|
|---|---|---|
|**cpu**|Integer|处理器核数，单位为C|
|**gpuAmount**|Integer|GPU 数量|
|**gpuSpec**|String|GPU 类型|
|**instanceType**|String|类型|
|**localStorageAmount**|Integer|本地存储的数量|
|**localStorageSize**|Integer|本地存储的单盘容量|
|**localStorageType**|String|本地存储的类型|
|**memory**|Integer|内存大小，单位为M|
|**nicLimit**|Integer|支持弹性网卡的数量|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
