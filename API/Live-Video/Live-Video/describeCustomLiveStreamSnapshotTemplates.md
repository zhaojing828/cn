# describeCustomLiveStreamSnapshotTemplates


## 描述
查询直播截图模板列表

## 请求方式
GET

## 请求地址
https://live.jdcloud-api.com/v1/snapshotCustoms


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**pageNum**|Integer|False|页码；默认为1；取值范围[1, 100000]|
|**pageSize**|Integer|False|分页大小；默认为10；取值范围[10, 100]|
|**filters**|Filter[]|False|截图模板查询过滤条件:<br>  - name:   template 录制模板自定义名称<br>  - value:  如果参数为空，则查询全部<br>|

### Filter
|名称|类型|是否必需|描述|
|---|---|---|---|
|**name**|String|True|过滤条件的名称|
|**operator**|String|False|过滤条件的操作符，默认eq|
|**values**|String[]|True|过滤条件的值|

## 示例
    {
        "pageNum": 1,
        "pageSize": 10,
        "filters": [{
           "name":"template",
           "value":"test-live-video"}]
    }

## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|名称|类型|描述|
|---|---|---|
|**pageNumber**|Integer|当前页码|
|**pageSize**|Integer|每页数量|
|**totalCount**|Integer|查询总数|
|**snapshotTemplates**|SnapshotTemplate[]|截图模板集合|
### SnapshotTemplate
|名称|类型|描述|
|---|---|---|
|**format**|String|截图格式:<br>  - 取值: jpg, png<br>  - 不区分大小写<br>|
|**width**|Integer|截图宽度:<br>  - 取值: [8,8192]<br>  - 等比: 如果只填写一个参数,则按参数比例等比缩放截图<br>  - 随源: 如果两个参数都不填写，则截取源流大小原图<br>|
|**height**|Integer|截图高度:<br>  - 取值: [8,8192]<br>  - 等比: 如果只填写一个参数,则按参数比例等比缩放截图<br>  - 随源: 如果两个参数都不填写，则截取源流大小原图<br>|
|**fillType**|Integer|截图与设定的宽高不匹配时的处理规则:<br>  - 1-拉伸<br>  - 2-留黑<br>  - 3-留白<br>  - 4-高斯模糊<br>  - 默认值1,2,3,4是等比例的缩放，1是按照设定宽高拉伸<br>|
|**snapshotInterval**|Integer|截图周期:<br>  - MIN_INTEGER = 5<br>  - MAX_INTEGER = 3600;<br>  - 单位: 秒<br>|
|**saveMode**|Integer|存储模式:<br>  - 1-覆盖<br>  - 2-顺序编号存储<br>|
|**saveBucket**|String|存储桶|
|**saveEndpoint**|String|存储地址|
|**template**|String|截图模板自定义名称|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
