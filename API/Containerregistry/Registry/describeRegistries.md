# describeRegistries


## 描述
批量查询指定用户下所有 registry 详情。
暂不支持 filter.


## 请求方式
GET

## 请求地址
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/registries

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**registries**|Registry[]| |
### Registry
|名称|类型|描述|
|---|---|---|
|**createTime**|String|registry 的创建时间|
|**description**|String|注册表描述，<a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">参考公共参数规范</a>。|
|**name**|String|注册表名称，<a href="https://www.jdcloud.com/help/detail/3870/isCatalog/1">参考公共参数规范</a>。|
|**registryUri**|String|registry endporint url|
|**totalSpaceUsedMB**|Number|regsitry 使用的总存储空间 单位 (MB)|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
