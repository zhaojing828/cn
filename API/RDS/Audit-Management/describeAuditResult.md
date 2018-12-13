# describeAuditResult


## 描述
仅支持查看MySQL实例的审计内容

## 请求方式
GET

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:describeAuditResult

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS 实例ID，唯一标识一个RDS实例|
|**regionId**|String|True| |地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**accountName**|String|False| |账号名|
|**dbName**|String|False| |数据库名|
|**endTime**|String|True| |查询截止时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到结束时间不能超过3天|
|**pageNumber**|Integer|False| |显示数据的页码，默认为1，取值范围：[-1,∞)|
|**pageSize**|Integer|False| |每页显示的数据条数，默认为10，取值范围：10、20、50|
|**startTime**|String|True| |查询开始时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间不能早于当前时间30天|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**auditResult**|AuditResult[]| |
|**totalCount**|Integer| |
### AuditResult
|名称|类型|描述|
|---|---|---|
|**accountName**|String|账号名|
|**dbName**|String|数据库名|
|**ip**|String|源IP|
|**operation**|String|操作类型|
|**sql**|String|sql语句|
|**startTime**|String|SQL开始执行时间|
|**threadId**|String|线程ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
