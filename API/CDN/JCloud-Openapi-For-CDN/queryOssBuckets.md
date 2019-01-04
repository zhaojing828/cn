# queryOssBuckets


## 描述
查询oss存储域名

## 请求方式
GET

## 请求地址
https://cdn.jdcloud-api.com/v1/ossBuckets


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
|**ossBuckets**|Object[]| |
|**total**|Integer| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
