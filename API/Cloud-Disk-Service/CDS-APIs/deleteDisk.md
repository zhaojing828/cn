# deleteDisk

## 描述

删除单个云硬盘

1. 云硬盘状态必须为 available 或 error 状态
1. 只能支持主动删除按配置计费类型的云硬盘。包年包月过期的云硬盘也可以删除，其它的情况还请发工单系统

## HTTP请求

DELETE <https://disk.jcloudcs.com/v1/regions/{regionId}/disks/{diskId}>

## 请求参数

### 路径参数

| Param | Type | Required | Desc |
|---|---|---|---|
| regionId | string | Yes | 地域ID |
| diskId | string | Yes | 云硬盘ID |

### 查询参数

无

## 成功的响应

```json
{
    "requestId": string
}
```

- 错误码

| Code | Status | Message |
|---|---|---|
| 400 | INVALID_ARGUMENT | Malformed disk id 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid region 'xxx' |
| 400 | FAILED_PRECONDITION | Cannot delete disk in status 'xxx' |
| 400 | FAILED_PRECONDITION | Can't delete 'prepaid_by_duration' disk which isn't overdue |
| 404 | NOT_FOUND | Disk 'xxx' not found |
| 500 | INTERNAL | Internal server error |
| 500 | UNKNOWN | Unknown server error |
| 503 | SERVICE UNAVAILABLE | Service unavailable |
