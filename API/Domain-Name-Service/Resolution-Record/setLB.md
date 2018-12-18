# setLB


## 描述
设置域名解析记录的负载均衡

## 请求方式
POST

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/SetLB

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True| |域名ID，请使用getDomains接口获取。|
|**regionId**|String|True| |实例所属的地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**idWeights**|Setlb[]|True| |要设置解析记录的权重参数列表|
|**type**|String|True| |这几条解析记录的类型。可以设置权重的类型有：A、AAAA、CNAME、JNAME|

### Setlb
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|Integer|True| |解析记录的ID。在getLB接口中获取。|
|**weight**|Integer|True| |此条解析记录的权重。|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|此次请求的ID|


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
