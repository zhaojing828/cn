# addCustomLiveStreamSnapshotTemplate


## 描述
添加直播截图模板

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/snapshotCustoms:template


## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**fillType**|Integer|True| |截图与设定的宽高不匹配时的处理规则|
|**format**|String|True| |图片格式|
|**height**|Integer|True| |范围|
|**saveBucket**|String|True| |保存bucket|
|**saveEndpoint**|String|True| |保存endPoint|
|**saveMode**|Integer|True| |存储模式|
|**snapshotInterval**|Integer|True| |截图周期|
|**template**|String|True| |录制模板自定义名称|
|**width**|Integer|True| |图片宽度|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**feedback**|Boolean|返回结果|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
