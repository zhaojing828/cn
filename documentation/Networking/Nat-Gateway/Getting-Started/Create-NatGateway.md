# 入门指南
创建一个测试环境包括一个VPC，两个Subnet，一台云主机和一台NAT网关，验证NAT网关的Internet连通性

## 创建VPC，Subnet和云主机
1. 创建一个测试VPC(test-vpc)，在测试VPC中创建两个测试子网(subnet1,subnet2)，详细步骤请参见VPC配置和子网配置

2. 在测试子网subnet1中创建一台测试没有公网IP的云主机(test-vm)，详细步骤参见创建实例

3. 创建两个路由表(rt1,rt2), rt1关联子网subnet1，rt2关联子网subnet2，详细步骤请参见路由表配置

## 创建NAT网关
1. 打开私有网络控制台 https://cns-console.jdcloud.com/host/vpc/list

2. 在左侧导航栏，点击**NAT 网关**

3. 在NAT网关页面，点击**创建**

4. 根据以下信息，配置NAT网关
| 配置 | 说明 |
| :- | :- |
| 地域与可用区 |	选择需要配置NAT网关的VPC所在的地域并选择可用区 |
| 规格 |	选择NAT网关的规格。NAT网关的规格会影响SNAT功能的最大连接数和每秒新建连接数，但不会影响数据吞吐量。
详情参见NAT网关规格 |
| 网络 |	选择需要配置NAT网关的VPC和子网 
注：不要将NAT网关和要使用NAT网关的虚机创建在同一子网 |
| NAT网关公网IP |	选择NAT网关公网带宽 |
| 基本信息 |	填写NAT网关名称和描述 |
