# OSS触发器示例

京东云OSS可将事件（例如：在bucket中删除对象）映射至function函数，将event参数传递至function处理函数来调用您的函数。

场景：应用程序可以通过为其Bucket关联函数，通过事件触发函数实现对用户上传文件直接进行处理，并可将结果存入OSS或其他服务，简化了应用开发和使用流程。

本示例介绍如何配置OSS触发器，使用OSS函数模板，实现上传本地文件至指定OSS Bucket中。

 
创建OSS Bucket

1．   创建触发器前，请您先开通OSS对象存储服务，并创建一个region为华北-北京的Bucket

2．   登陆OSS控制台，在“空间管理“页面选择“新建空间”，配置“空间名称”（Bucket）和“访问权限”为“私有读写”

3．   在新创建的Bucket中的Object中，选择“新建文件夹”，文件夹名称命名为filesource。

4．   在filesource文件夹中，上传一个名为test.txt的文件。

完成OSS Bucket创建及对象上传。

 

创建函数

 

 

 

测试函数

 

创建OSS触发器
