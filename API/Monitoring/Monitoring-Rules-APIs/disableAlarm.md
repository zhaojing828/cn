# disableAlarm


## 描述
禁用报警规则。报警规则禁用后，将停止探测实例的监控项数据。

## 请求方式
POST

## 请求地址
https://monitor.jdcloud-api.com/v1/regions/{regionId}/alarms/{alarmId}/disable

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**alarmId**|String|True| |规则 id|
|**regionId**|String|True| |region|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求的标识id|
|**result**|Object| |


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
