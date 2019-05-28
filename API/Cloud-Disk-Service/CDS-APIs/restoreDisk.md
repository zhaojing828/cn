# restoreDisk

## 描述

从已有快照恢复一块云硬盘

云硬盘状态必须为 available
快照状态必须为 available，且快照必须是从由待恢复的云硬盘创建的

## HTTP请求

POST <https://disk.jcloudcs.com/v1/regions/{regionId}/disks/{diskId}:restore>

## 请求参数

### 路径参数

| Param | Type | Required | Desc |
|---|---|---|---|
| regionId | string | Yes | 地域 ID |
| diskId | string | Yes | 云硬盘 ID |

### 请求Body

```json
{
    "snapshotId": string
}
```

- 详细描述

| Param | Type | Required | Desc |
|---|---|---|---|
| snapshotId | string | Yes | 用于恢复云盘的快照 ID |

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
| 400 | INVALID_ARGUMENT | Malformed snapshot id 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid region 'xxx' |
| 400 | FAILED_PRECONDITION | Invalid disk status 'xxx' |
| 400 | FAILED_PRECONDITION | Invalid snapshot status 'xxx' |
| 400 | FAILED_PRECONDITION | Snapshot was not created by this disk |
| 404 | NOT_FOUND | Disk 'xxx' not found |
| 404 | NOT_FOUND | Snapshot 'xxx' not found |
| 500 | INTERNAL | Internal server error |
| 500 | UNKNOWN | Unknown server error |
| 503 | SERVICE UNAVAILABLE | Service unavailable |
