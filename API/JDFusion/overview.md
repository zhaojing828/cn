# JDFusion


## 简介
云主机、网卡、云硬盘、网络与相关、关系型数据库、对象存储等相关的接口


### 版本
v1


## API
|接口名称|请求方式|功能描述|
|---|---|---|
|**associateVpcEipById**|PUT|弹性公网IP绑定到虚拟机|
|**attachDiskToVmInstanceByDiskId**|PUT|云硬盘挂载至虚拟机|
|**attachVpcNetworkInterfaceById**|PUT|网卡挂载虚拟机|
|**createDisk**|POST|根据云提供商创建云硬盘|
|**createVmInstance**|POST|根据云提供商创建虚拟机|
|**createVmKeypair**|POST|根据云提供商创建密钥对|
|**createVpc**|POST|根据云提供商创建私有网络|
|**createVpcEip**|POST|根据云提供商分配公网IP|
|**createVpcLBHttpListener**|POST|创建HTTP监听器|
|**createVpcNetworkInterface**|POST|根据云提供商创建网卡|
|**createVpcSecurityGroup**|POST|根据云提供商创建安全组|
|**createVpcSlb**|POST|根据云提供商创建负载均衡|
|**createVpcSubnet**|POST|根据云提供商创建子网|
|**createVpcVServerGroup**|POST|创建虚拟服务器组，并添加后端服务器|
|**deleteVmInstanceById**|DELETE|通过虚拟机id删除虚拟机|
|**deleteVmKeypairByName**|DELETE|删除密钥对|
|**deleteVpcById**|DELETE|删除VPC|
|**deleteVpcEipById**|DELETE|释放公网IP|
|**deleteVpcNetworkInterfaceById**|DELETE|删除弹性网卡|
|**deleteVpcSecurityGroupById**|DELETE|删除安全组|
|**deleteVpcSlbById**|DELETE|删除SLB|
|**deleteVpcSubnetById**|DELETE|删除子网|
|**detachDiskToVmInstanceByDiskId**|PUT|从虚拟机卸载云硬盘|
|**detachVpcNetworkInterfaceById**|PUT|卸载网卡|
|**disassociateVpcEipById**|PUT|解绑公网IP|
|**getCloudInfoById**|GET|获取指定云信息|
|**getCloudInfos**|GET|获取当前用户的云注册信息|
|**getDiskById**|GET|根据云提供商查询对应的云硬盘资源信息|
|**getDisks**|GET|根据云提供商查询对应的云硬盘资源信息|
|**getTaskInfoById**|GET|读取指定ID的运行结果和运行状态|
|**getTaskInfoHistoryById**|GET|读取指定ID的运行结果和运行状态|
|**getVmImages**|GET|根据过滤条件，取得镜像资源的信息|
|**getVmInstanceTypes**|GET|虚拟机规格列表|
|**getVmInstances**|GET|根据云提供商查询对应的虚拟机资源信息|
|**getVmInstancesById**|GET|根据云提供商查询对应的VM资源信息|
|**getVmKeypairs**|GET|根据云提供商查询对应的密钥对资源信息|
|**getVmKeypairsByName**|GET|根据云提供商查询对应的密钥对资源信息|
|**getVpcById**|GET|根据云提供商查询对应的VPC资源信息|
|**getVpcEipById**|GET|根据云提供商查询对应的公网IP资源信息|
|**getVpcEips**|GET|根据云提供商查询对应的公网IP资源信息|
|**getVpcNetworkInterfaceById**|GET|根据云提供商查询对应的网卡资源信息|
|**getVpcNetworkInterfaces**|GET|根据云提供商查询对应的网卡资源信息|
|**getVpcSecurityGroupById**|GET|根据云提供商查询对应的安全组资源信息|
|**getVpcSecurityGroups**|GET|根据云提供商查询对应的安全组资源信息|
|**getVpcSlbById**|GET|根据云提供商查询对应的SLB资源信息|
|**getVpcSlbs**|GET|根据云提供商查询对应的负载均衡资源信息|
|**getVpcSubnetById**|GET|根据云提供商查询对应的subnet资源信息|
|**getVpcSubnets**|GET|根据云提供商查询对应的subnet资源信息|
|**getVpcVServerGroups**|GET|根据过滤条件，取得服务器组的信息|
|**getVpcs**|GET|查询私有网络资源列表|
|**rebootVmInstanceById**|PUT|只能重启状态为 运行中（Running）的实例。|
|**registCloudInfo**|POST|为指定用户关联云|
|**removeDiskById**|DELETE|删除云硬盘|
|**startVmInstanceById**|PUT|启动一台实例。实例状态必须为 已停止（Stopped），才可以调用该接口。|
|**stopVmInstanceById**|PUT|停止运行一台实例。只有状态为 运行中（Running）的实例才可以进行此操作。|
|**unregistCloudInfo**|DELETE|获取指定云信息|
