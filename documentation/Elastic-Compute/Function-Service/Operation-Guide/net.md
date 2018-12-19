# 网络配置

Function默认部署于公共网络中，无法访问VPC中的资源。

 
**配置function函数访问VPC资源**

通常，您在京东云VPC内部创建资源，以便这些资源不能通过公共 Internet 访问。默认情况下，无法从function函数访问 VPC 中的资源。

若您的function函数想要访问VPC 中的资源，如数据库、Redis等产品或服务，您必须提供私有网络和子网的配置信息。function使用此信息设置弹性网卡 [(ENI)](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ElasticNetworkInterfaces.html)，让您的函数可以通过ENI安全访问 VPC 中的其他资源。
