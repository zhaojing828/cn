# OSS触发器示例

京东云OSS可将事件（例如：在Bucket中删除对象）映射至Function函数，将event参数传递至Function处理函数来调用您的函数。

场景：应用程序可以通过为其Bucket关联函数，通过事件触发函数实现对用户上传文件直接进行处理，并可将结果存入OSS或其他服务，简化了应用开发和使用流程。

本示例介绍如何配置OSS触发器，实现上传本地文件（以.gif为后缀）至指定OSS Bucket中后执行删除。

 
## 创建OSS Bucket

1．   创建触发器前，请您先开通OSS对象存储服务，并创建一个region为华北-北京的Bucket。<br>
2．   登陆OSS控制台，在“空间管理“页面选择“新建空间”，配置“空间名称”（Bucket）为”function-test“，“访问权限”为“私有读写”。<br>
3．   在新创建的Bucket中的Object中，选择“新建文件夹”，文件夹名称命名为filesource。<br>
4．   完成创建。<br>

详细操作指南参见[创建存储空间](/documentation/Storage-and-CDN/Object-Storage-Service/Operation-Guide/Manage-Bucket/Create-Bucket-2.md)。



 

## 创建函数

 注意：函数和OSS Bucket需在同一region。
 
 登陆函数服务控制台，在华北-北京region，进入“概览”页面或”函数列表“页面，单击”创建函数“。

* 函数模板：自定义函数模板
* 函数名称：OSSfunction（您可以设置自己的函数名）
* 函数入口：根据提示填写，默认index.handler
* 函数代码：编写OSS函数代码
* 函数执行内存：128MB
* 超时时间：100秒
* 描述、环境变量及高级配置：无需填写
* 触发器：不配置触发器
单击”完成“，完成函数创建。


## 测试函数

在创建触发器之前，可以先通过控制台配置测试事件模拟函数执行。

OSS事件源会以 event 的形式作为输入参数传递给函数，您可以将 event 传给函数，测试编码是否正确。

1.创建测试事件
  
  进入”函数列表“页面，单击”OSSfunction“函数，进入函数详情页面，选择”配置测试事件”，
* 配置测试事件：创建新的测试事件
* 事件模板：OSS-event-template
* 事件名称：test
单击“保存”，完成测试事件创建。

2.测试函数

在“请选择测试事件”下拉列表中选择已保存的测试事件“test” ，单击“测试”。
3.执行成功后，可在控制台查看实时函数执行日志。
 

## 创建OSS触发器



1.在“OSSfunction”函数详情页面，选择”触发器”tab,单击“创建触发器”。

* 触发器类型：OSS触发器
* Bucket：选择已创建准备绑定Function的Bucket:"function-test"
* 事件类型：s3:ObjectCreated:Put
* 前缀：空
* 后缀：空

2.上传任意一个文件至"function-test"Bucket，Function被触发，执行。

以上，完成OSS触发器触发Function的简单示例。
