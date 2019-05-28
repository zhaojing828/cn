# describeDisk

## 描述

查询云硬盘详情

## HTTP请求

GET <https://disk.jcloudcs.com/v1/regions/{regionId}/disks/{diskId}>

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
    "result": {
        "disk": Disk
    },
    "requestId": string
}
```

- 详细解释

| Param | Type | Desc |
|---|---|---|
| Disk | [Disk](../model/Disk.md) | 云硬盘资源信息 |

- 错误码

| Code | Status | Message |
|---|---|---|
| 400 | INVALID_ARGUMENT | Malformed disk id 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid region 'xxx' |
| 404 | NOT_FOUND | Disk 'xxx' not found |
| 500 | INTERNAL | Internal server error |
| 500 | UNKNOWN | Unknown server error |
| 503 | SERVICE UNAVAILABLE | Service unavailable |
