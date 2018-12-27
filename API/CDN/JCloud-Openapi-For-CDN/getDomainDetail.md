# getDomainDetail


## 描述
查询加速域名详情

## 请求方式
GET

## 请求地址
https://cdn.jdcloud-api.com/v1/domain/{domain}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domain**|String|True| |用户域名|

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
|**allStatus**|String| |
|**allowNoReferHeader**|String| |
|**allowNullReferHeader**|String| |
|**archiveNo**|String| |
|**auditStatus**|String| |
|**avgFileSize**|Long| |
|**backSourceType**|String| |
|**certificate**|String| |
|**cname**|String| |
|**created**|String| |
|**dailyBandWidth**|Integer| |
|**defaultSourceHost**|String|默认的回源host|
|**domain**|String| |
|**forbiddenType**|String| |
|**httpType**|String| |
|**jumpType**|String| |
|**maxFileSize**|Long| |
|**minFileSize**|Long| |
|**modified**|String| |
|**referList**|String[]| |
|**referType**|String| |
|**rsaKey**|String| |
|**source**|BackSourceInfo| |
|**sourceType**|String| |
|**status**|String| |
|**sumFileSize**|Long| |
|**type**|String| |
### BackSourceInfo
|名称|类型|描述|
|---|---|---|
|**domain**|DomainSourceInfo[]| |
|**ips**|IpSourceInfo[]| |
|**ossSource**|String| |
### DomainSourceInfo
|名称|类型|描述|
|---|---|---|
|**domain**|String| |
|**priority**|Integer| |
|**sourceHost**|String| |
### IpSourceInfo
|名称|类型|描述|
|---|---|---|
|**ip**|String| |
|**master**|Integer| |
|**ratio**|Double| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
