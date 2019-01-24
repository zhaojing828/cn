# getTransferTasks


## 描述
获取任务列表

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/oss_transferTasks

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|True| |云注册信息ID|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**tasks**|TransferTaskInfoWithID[]| |
### TransferTaskInfoWithID
|名称|类型|描述|
|---|---|---|
|**dstAddress**|TaskAddressInfo| |
|**id**|String|任务ID|
|**name**|String|任务名称|
|**srcAddress**|TaskAddressInfo| |
### TaskAddressInfo
|名称|类型|描述|
|---|---|---|
|**accessKey**|String|源地址的accesskey|
|**bucket**|String|源地址的Bucket|
|**endpoint**|String|源地址的Endpoint|
|**prefix**|String|源地址的Prefix，不能以/开头|
|**secretKey**|String|源地址的securitykey|
|**storageType**|String|任务类型:源地址中支持 s3file, aliyunfile，目标现在只支持s3file|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
