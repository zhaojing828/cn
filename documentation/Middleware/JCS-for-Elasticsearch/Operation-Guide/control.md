## 访问控制
### 访问控制简介
访问控制服务的核心功能主要是用户身份管理与资源访问控制。用户可以通过使用IAM创建、管理子用户，并控制这些子用户访问京东云资源的操作权限。使用访问控制，主账号可以向他人授权管理账户中的资源，而不必共享账户密码或访问秘钥，按需为用户分配所需的最小权限，从而降低企业信息安全风险。
* 管理子用户并控制其访问权限 – 您可以在 IAM 中创建子用户，为其单独分配所需的控制台访问密码或者访问秘钥，供子用户访问京东云资源和服务。</br>
*	管理 IAM角色及其权限 – 您可以在 IAM 中创建角色并管理权限，以便控制扮演该角色的子用户或服务可以执行哪些操作。</br>
更多关于 IAM 的介绍可前往[IAM访问控制]( https://docs.jdcloud.com/cn/iam/product-overview)查看。</br>
### ES访问控制策略
云搜索Elasticsearch的访问控制功能是通过[访问控制 IAM]( https://docs.jdcloud.com/cn/iam/product-overview)（Identity and Access Management， IAM）来实现的，用户需要前往[访问控制菜单]( https://iam-console.jdcloud.com/summary)设置子账户和用户角色的权限。</br></br>
现在系统已经预置2种策略，用户可以按需授权给子账户。此外，用户也可以根据访问控制的[操作指南]( https://docs.jdcloud.com/cn/iam/policy-management)，自定义策略授权给子账号，目前云搜索Elasticsearch已经支持操作级别的访问控制管理。</br>
系统预置策略如下：</br>

系统策略名称 | 权限描述 | 类型 | 资源范围 | 备注 
:---: | :--- | :--- | :--- | :---
JDCloudElasticSearchAdmin  | 云搜索Elasticsearch读权限 | 系统类型 | 主账号下云搜索Elasticsearch的所有资源 | 可以让用户拥有创建和管理 es所有集群实例的权限，包括访问Kibana的权限 |
JDCloudElasticSearchRead  | 云搜索Elasticsearch管理员权限 | 系统类型 | 主账号下云搜索Elasticsearch的所有资源 | 可以让用户拥有查看 ES 集群实例的权限，包括访问kibana的权限，但是不具有创建、删除等操作的权限。 |
