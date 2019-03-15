# addLiveStreamDomainSnapshot


## 描述
添加域名直播截图配置

## 请求方式
POST

## 请求地址
https://live.jdcloud-api.com/v1/snapshotDomains:template


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**publishDomain**|String|True|您的推流加速域名|
|**template**|String|True|截图模板自定义名称:<br>  - 标准质量模板：sd、hd、hsd<br>  - 自定义模板: 枚举类型校验，忽略大小写，自动删除空格,<br>               取值要求：数字、大小写字母或短横线("-"),<br>               首尾不能有特殊字符("-")<br>  - <b>注意: 不能与标准的转码模板和已定义命名重复</b><br>|


## 示例
    {
        "publishDomain": "push.yourdomain.com",
        "template": "test-live-video"
    }
## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|ruquestId|


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
