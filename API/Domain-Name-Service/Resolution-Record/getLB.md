# getLB


## 描述
查看当前域名所有的有负载均衡的解析记录<br>
这些解析记录分页展示的列表


## 请求方式
GET

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/GetLB

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True| |域名ID，请使用getDomains接口获取。|
|**regionId**|String|True| |实例所属的地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**pageNumber**|Integer|True| |负载均衡记录分页展示的页数，默认为1|
|**pageSize**|Integer|True| |负载均衡记录分页展示时每页的记录数，默认为10|
|**type**|String|True| |解析记录的类型。有权重的类型有：A、AAAA、CNAME、JNAME|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|此次请求的ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**currentCount**|Integer|当前页负载均衡记录的个数|
|**dataList**|Getlb[]|解析记录的负载均衡列表|
|**totalCount**|Integer|所有负载均衡记录的个数|
|**totalPage**|Integer|所有负载均衡记录的页数|
### Getlb
|名称|类型|描述|
|---|---|---|
|**isBalance**|Boolean|负载均衡的解析记录的列表中解析记录是否是相同的权重<br><br>true: 按权重分配负载<br><br>false: 均等负载<br>|
|**items**|HostRRlb[]|负载均衡的解析记录的列表|
|**record**|String|主机记录|
|**type**|String|解析的类型|
|**viewName**|String|解析线路的名称|
|**viewValue**|Integer|解析线路的ID|
### HostRRlb
|名称|类型|描述|
|---|---|---|
|**hostValue**|String|解析记录的值|
|**id**|Integer|解析记录的ID|
|**rate**|Double|此条记录在总均衡中的比率的100倍|
|**weight**|Integer|解析记录的权重|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
