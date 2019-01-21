# Put Bucket Lifecycle

## 描述

该操作可以为指定Bucket设置生命周期规则以及替换现有规则。对于Bucket下不常访问的文件，您可以配置生命周期管理的策略（指定资源、时间条件），当满足策略条件时会自动执行删除操作，从而使Bucket下的Object在其整个生命周期中变得经济和高效。

## 请求
### 语法
```
PUT /?lifecycle HTTP/1.1
Host: bucketname.s3.region.jcloudcs.com
Content-Length: length
Date: date
Authorization: authorization string
Content-MD5: MD5
 
Lifecycle configuration in the request body
```

### 请求参数

无请求参数

### 请求Header

无特殊请求Header

### 请求元素

名称|描述|必须
---|---|---
LifecycleConfiguration|全部Lifecycle Rule的Container，最多允许配置1000条Rule。<br>类型：Container<br>父标签：无<br>子标签：Rule|是
Rule|LifecycleConfiguration下的子标签，某一个lifecycle Rule的具体规则；最多1000条Rule。<br>类型：Container<br>父标签：LifecycleConfiguration|是
ID|每条Rule的唯一标识符，最大长度不允许超过64个字符。<br>类型：String<br>父标签：Rule|否
Status|控制Rule的可用状态，若为Disable，则忽略该条Rule；若为Enable，就会按照定义好的Rule去执行。<br>类型：String<br>父标签：Rule<br>有效值：Enabled，Disabled|是
Filter|定义生命周期管理策略所影响的Object的过滤条件，支持通过Prefix过滤，若定义了<Filter></Filter>，则视为对该Bucket下的全部Object生效。<br>类型：Container<br>父标签：Rule<br>子标签：Prefix|是
Prefix|通过指定Object的Prefix来定义哪些Object受生命周期管理策略的影响，若定义了<Prefix></Prefix>，则视为无前缀匹配的过滤条件。在一个Rule的Filter中仅允许一个Prefix存在。采用utf-8编码下不超过1022个字节。<br>类型：String<br>父标签：Filter|否
Days|指定符合过滤条件的Object，在上传到Bucket多少天之后做存储类型转换，若在Expiration标签下有Date存在，则不能再指定Days。<br>类型：Positive Integer（正整数）<br>父标签：Expiration|若没有指定Date，则必须
Date|指定符合过滤条件的Object，在上传到Bucket之后的某个日期做存储类型转换，若在Expiration标签下有Days存在，则不能再指定Date。日期格式必须符合 ISO 8601格式规范，午夜UTC。<br>类型：String<br>父标签：Expiration|若没有指定Days，则必须
Expiration|指定何时对Object执行过期删除操作。<br>类型：Container<br>子标签：Days、Date<br>父标签：Rule|是

## 响应
### 响应Header
无特殊响应Header
### 响应元素
无响应元素

## 示例
### 请求示例
```
PUT /?lifecycle HTTP/1.1
Host: bucketname.s3.region.jcloudcs.com
Content-Length: length
Date: date
Authorization: authorization string
Content-MD5: MD5

<LifecycleConfiguration>
  <Rule>
    <ID>id1</ID>
    <Filter>
       <Prefix>documents/</Prefix>
    </Filter>
    <Status>Enabled</Status>
    <Expiration>
      <Days>365</Days>
    </Expiration>
  </Rule>
</LifecycleConfiguration>
```
### 响应示例
```
HTTP/1.1 200 OK
x-amz-request-id: 9E26D08072A8EF9E
Date: Wed, 14 May 2014 02:11:22 GMT
Content-Length: 0
Server: JDCloudOSS
```
