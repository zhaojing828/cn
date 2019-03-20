# addCustomLiveStreamSnapshotTemplate


## 描述
添加直播截图模板

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/snapshotCustoms:template


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**format**|String|True|截图格式:<br>  - 取值: jpg, png<br>  - 不区分大小写<br>|
|**width**|Integer|False|截图宽度:<br>  - 取值: [8,8192]<br>  - 等比: 如果只填写一个参数,则按参数比例等比缩放截图<br>  - 随源: 如果两个参数都不填写，则截取源流大小原图<br>|
|**height**|Integer|False|截图高度:<br>  - 取值: [8,8192]<br>  - 等比: 如果只填写一个参数,则按参数比例等比缩放截图<br>  - 随源: 如果两个参数都不填写，则截取源流大小原图<br>|
|**fillType**|Integer|True|截图与设定的宽高不匹配时的处理规则:<br>  - 1-拉伸<br>  - 2-留黑<br>  - 3-留白<br>  - 4-高斯模糊<br>  -默认值1,2,3,4是等比例的缩放，1是按照设定宽高拉伸<br>|
|**snapshotInterval**|Integer|True|截图周期:<br>  - MIN_INTEGER = 5<br>  - MAX_INTEGER = 3600;<br>  - 单位: 秒<br>|
|**saveMode**|Integer|True|存储模式:<br>  - 1-覆盖<br>  - 2-顺序编号存储<br>|
|**saveBucket**|String|True|存储桶|
|**saveEndpoint**|String|True|存储地址|
|**template**|String|True|截图模板自定义名称:<br>  - 取值要求：数字、大小写字母或短横线("-"),首尾不能有特殊字符("-")<br>  - <b>注意: 不能与已定义模板命名重复</b>|

## 示例
    {
        "format": "jpg",
        "width": 1080,
        "height": 720,
        "fillType":1,
        "snapshotInterval":50,
        "saveMode":1,
        "saveBucket":"vod-storage-398392",
        "saveEndpoint":"s3.cn-north-1.jcloudcs.com",
        "template":"test-live-video"
    }
    

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|requestId|


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
