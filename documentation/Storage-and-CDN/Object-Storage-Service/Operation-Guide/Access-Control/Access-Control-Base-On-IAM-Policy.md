# 基于IAM Policy的权限控制
访问控制（Identity and Access Management， IAM）是京东云提供的一项用户身份管理与资源访问控制服务。IAM Policy是基于用户的授权策略。通过设置
IAM Policy，您可以集中管理您的用户（比如员工、系统或应用程序），以及控制用户可以访问您名下哪些资源的权限。比如能够限制您的用户只拥有对某一个
Bucket 的读权限。子账号是从属于主账号的，并且这些账号下不能拥有实际的任何资源，所有资源都属于主账号。(详见IAM)[https://docs.jdcloud.com/cn/iam/core-concepts]
**说明**
目前OSS仅支持IAM 中子用户访问，角色将后续支持，如果您有跨账号授权的需求请参看[基于Bucket policy的访问控制]（），完成跨账号授权。


