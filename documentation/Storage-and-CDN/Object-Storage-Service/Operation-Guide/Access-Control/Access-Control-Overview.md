# 访问控制概述 

针对存放在 Bucket 中的 Object 的访问，京东云OSS 提供了多种权限控制方式，包括ACL、IAM Polilcy和Bucket Policy。

-   ACL：OSS 为权限控制提供访问控制列表（ACL）。ACL是基于Bucket的授权策略，可授予Bucket访问权限为：私有读写，公有读私有写，公有读写。
    您可以在创建Bucket时设置ACL，也可以在创建Bucket后的任意时间内修改ACL，操作详情请见[创建存储空间-指定空间访问权限](https://docs.jdcloud.com/cn/object-storage-service/create-bucket-1)。

-   IAM Policy:IAM（Identity and Access Management）是京东云提供的一项用户身份管理与资源访问控制服务。IAM Policy是基于用户的授权策略。通过设置IAM Policy，您可以集中管理您的用户（比如员工、系统或应用程序），以及控制用户可以访问您名下哪些资源的权限。比如能够限制您的用户只拥有对某一个 Bucket 的读权限。子账号是从属于主账号的，并且这些账号下不能拥有实际的任何资源，所有资源都属于主账号,计费主体也是主账号。

-   Bucket Policy：Bucket Policy是基于资源的授权策略。相比于IAM Policy，Bucket Policy操作简单，可对OSS 中资源包括Bucket与Object进行授权，但同时较用户维度（IAM policy）范围较小不能设置对同一账号其他京东云服务授权，例如云主机，Bucket Policy ，如果您是主账号或者被授予OSS设置Bucket policy 的权限即可在控制台直接进行图形化配置或者调用Bucket Policy相关接口完成授权。
是仅需对OSS资源授权主账号可直接可以进行访问授权。同时，Bucket Policy支持向其他账号授权、其他账号的IAM用户、匿名用户授予访问权限，并且可附加指定相关IP与referer限制的访问权限。
