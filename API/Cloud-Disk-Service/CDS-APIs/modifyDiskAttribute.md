# modifyDiskAttribute

## 描述

修改云盘属性

## HTTP请求

PATCH <https://vm.jcloudcs.com/v1/regions/{regionId}/disks/{diskId}

## 请求参数

### 路径参数

| Param | Type | Required | Desc |
|---|---|---|---|
| regionId | string | Yes | 地域ID |
| diskId | string | Yes | 磁盘ID |

### 请求Body

模型 [here](../model/ModifyDiskAttributeRequest.md)

## 成功的响应

```json
{
    "requestId": string
}
```

- 错误码

| Code | Status | Message |
|---|---|---|
| 400 | INVALID_ARGUMENT | Parameter name missing |
| 400 | INVALID_ARGUMENT | Parameter description missing |
| 400 | INVALID_ARGUMENT | Malformed disk id 'xxx' |
| 400 | INVALID_ARGUMENT | Malformed name 'xxx' |
| 400 | INVALID_ARGUMENT | Malformed description 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid region 'xxx' |
| 404 | NOT_FOUND | Disk 'xxx' not found |
| 500 | INTERNAL | Internal server error |
| 500 | UNKNOWN | Unknown server error |
| 503 | SERVICE UNAVAILABLE | Service unavailable |
