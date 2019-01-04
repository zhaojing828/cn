# describeCustomLiveStreamSnapshotTemplates


## 描述
查询直播截图模板列表

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/snapshotCustoms


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |域名列表查询过滤条件, 不传递分页参数时默认返回10条|
|**pageNum**|Integer|False|1|页码；默认为1|
|**pageSize**|Integer|False|10|分页大小；默认为10；取值范围[10, 100]|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |过滤条件的名称|
|**operator**|String|False| |过滤条件的操作符，默认eq|
|**values**|String[]|True| |过滤条件的值|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**pageNumber**|Integer|当前页码|
|**pageSize**|Integer|每页数量|
|**snapshotTemplates**|SnapshotTemplate[]|码率信息|
|**totalCount**|Number|查询总数|
### SnapshotTemplate
|名称|类型|描述|
|---|---|---|
|**fillType**|Integer|文件类型|
|**format**|String|截图格式|
|**height**|Integer|高|
|**saveBucket**|String|存储桶|
|**saveEndpoint**|String|存储endPoint|
|**saveMode**|Integer|保存模式|
|**snapshotInterval**|Integer|截图|
|**template**|String|录制模板自定义名称|
|**width**|Integer|宽|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
