# describeDisks

## 描述

查询云硬盘列表

## HTTP请求

GET <https://disk.jcloudcs.com/v1/regions/{regionId}/disks>

## 请求参数

### 路径参数

| Param | Type | Required | Desc |
|---|---|---|---|
| regionId | string | Yes | 地域ID |

### 查询参数

| Param | Type | Required | Desc |
|---|---|---|---|
| filters | [[Filter][1]] | No | 过滤条件列表 |
| tags | [[TagFilter][2]] | No | Tag筛选条件 |
| pageNumber | int | No | 页码；默认为1 |
| pageSize | int | No | 分页大小；默认为20；取值范围[10, 100] |

- 过滤条件表

多个过滤条件之间是逻辑与，每个条件内部的多个取值是逻辑或

| Param | Type | Required | Desc |
|---|---|---|---|
| diskId | [string] | No | 云硬盘ID，精确匹配，支持多个 |
| diskType | [string] | No | 云硬盘类型，精确匹配，支持多个, 取值为 ssd,premium-hdd,hdd.std1,ssd.gp1,ssd.io1 |
| instanceId | [string] | No | 云硬盘所挂载主机的ID，精确匹配，支持多个 |
| instanceType | [string] | No | 云硬盘所挂载主机的类型，精确匹配，支持多个 |
| az | [string] | No | 可用区，精确匹配，支持多个 |
| status | [string] | No | 云硬盘状态，精确匹配，支持多个 |
| name | [string] | No | 云硬盘名称，模糊匹配，支持单个 |
| multiAttach | [string] | No | 云硬盘是否多点挂载，精确匹配，支持单个 |
| encrypted | [string] | No | 是否加密，精确匹配，支持单个 |

> Disk Status: creating、available、in-use、extending、restoring、deleting、deleted、error_create、error_delete、error_restore、error_extend
 
> Instance Type: vm、nc

> multiAttach: true(isMultiAttachable)、false(notMultiAttachable)

> encrypted: true、false
## 成功的响应

```json
{
    "result": {
        "disks": [Disk],
        "totalCount": int
    },
    "requestId": string
}
```

- 详细解释

| Param | Type | Desc |
|---|---|---|
| Disks | [Disk](../model/Disk.md) | 云硬盘资源信息列表 |

- 错误码

| Code | Status | Message |
|---|---|---|
| 400 | INVALID_ARGUMENT | Malformed disk id 'xxx' |
| 400 | INVALID_ARGUMENT | Malformed disk name 'xxx' |
| 400 | INVALID_ARGUMENT | Malformed instance id 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid region 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid disk type 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid instance type 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid availability zone 'xxx' |
| 400 | INVALID_ARGUMENT | Invalid disk status 'xxx' |
| 500 | INTERNAL | Internal server error |
| 500 | UNKNOWN | Unknown server error |
| 503 | SERVICE UNAVAILABLE | Service unavailable |

[1]: http://git.jd.com/jcloud-product/open-api-doc/tree/master/model/Filter.md "Filter"
[2]: http://git.jd.com/iaas-sdn/open-api-vm/blob/gfy_0418_tag/model/TagFilter.md "TagFilter"
