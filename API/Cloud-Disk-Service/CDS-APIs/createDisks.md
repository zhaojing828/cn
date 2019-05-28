# createDisks

## 描述

按照指定配置创建一块或多块云硬盘

- 云硬盘类型可以选择ssd、premium-hdd或者hdd.std1、ssd.gp1、ssd.io1
- 磁盘大小
    - ssd：范围[20,1000]GiB，步长为10GiB, iops为固定值
    - premium-hdd：范围[20,3000]GiB，步长为10GiB, iops为固定值
    - hdd.std1: 容量型hdd，范围[20,16000]GiB，步长为10GiB, iops为计算得出，与购买磁盘的容量成正比
    - ssd.gp1: 通用型ssd，范围[20,16000]GiB，步长为10GiB, iops为计算得出，与购买磁盘的容量成正比。
    - ssd.io1: 性能型ssd，范围[20,16000]GiB，步长为10GiB, iops可以通过购买容量计算得出，或者为用户指定。
- 其他
    - 创建完成后，云硬盘状态为 available
    - 可选参数快照 ID用于从快照创建新盘
    - 批量创建时，云硬盘的命名为 硬盘名称-数字，例如 myDisk-1，myDisk-2
    - maxCount为最大努力，不保证一定能达到maxCount

## HTTP请求

POST <https://disk.jcloudcs.com/v1/regions/{regionId}/disks>

## 请求参数

### 路径参数

| Param | Type | Required | Desc |
|---|---|---|---|
| regionId | string | Yes | 地域ID |

### 请求Body

模型 [here](../model/CreateDiskRequest.md)

## 成功的响应

```json
{
    "result": {
        "diskIds": [string]
    },
    "requestId": string
}
```

- 详细解释

| Param | Type | Desc |
|---|---|---|
| diskIds | [string] | 云硬盘 ID 列表 |


- 错误码

| Code | Status | Message |
|---|---|---|
| 400 | INVALID_ARGUMENT | Parameter disk spec missing |
| 400 | INVALID_ARGUMENT | Parameter az missing |
| 400 | INVALID_ARGUMENT | Parameter max count missing |
| 400 | INVALID_ARGUMENT | Parameter disk name missing |
| 400 | INVALID_ARGUMENT | Parameter disk type missing |
| 400 | INVALID_ARGUMENT | Parameter disk size missing |
| 400 | INVALID_ARGUMENT | Malformed disk name 'xxx' |
| 400 | INVALID_ARGUMENT | Malformed disk description 'xxx' |
| 400 | INVALID_ARGUMENT | Malformed client token 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid region 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid availability zone 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid disk type 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid disk size 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid charge type 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid charge duration 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid iops number for ssd.io1 |
| 400 | OUT_OF_RANGE | Max count out of range |
| 401 | UNAUTHENTICATED | Unauthenticated user pin 'xxx' |
| 404 | NOT_FOUND | Snapshot id 'xxx' not found |
| 429 | QUOTA_EXCEEDED | Disk quota limit exceeded |
| 500 | INTERNAL | Internal server error |
| 500 | UNKNOWN | Unknown server error |
| 500 | INSUFFICIENT_CAPACITY | There is not enough capacity to fulfill your request. You can wait for additional capacity to become available |
| 503 | SERVICE UNAVAILABLE | Service unavailable |
