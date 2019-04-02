# 产品概述


物联网协议适配服务 (IoT Hub Protocol Adaptor Service) 通过内置的非标设备通信协议转换适配模块，帮助用户快速、低成本的将既有设备连接上云。服务内置了JTT-808（交通部车辆监控平台相关）协议支持。

物联网协议适配服务 具备以下特性：

* 设备通信：
	* 作为Hub服务设备通信的代理，支持物联网设备的双向通信，将设备上行的遥测数据发送给Hub服务，同时接收Hub服务下发的设备控制指令数据。
* IoT协议转换：
	* 协议转换模块支持用户编程实现自定义协议转换。内置了JTT-808（交通部车辆监控平台相关）协议支持。


## 常用操作

- 快速上手
	- [创建实例](../Getting-Started/Create-Instance.md)
	- [设置白名单](../Getting-Started/Set-Whitelist.md)
	- [连接实例](../Getting-Started/Connect-Instance.md)
- 数据迁移
	- [将数据导入到云](../Getting-Started/Import-Data.md)
	- [从云导出数据](../Getting-Started/Export-Data.md)
- 扩容升级
	- [变更实例规格](../Operation-Guide/Instance-Management/Modify-Instance-Spec.md)
- 备份与恢复
	- [设置自动备份策略](../Operation-Guide/Backup/Modify-Backup-Policy.md)
	- [手动创建备份](../Operation-Guide/Backup/Create-Backup.md)
	- [数据恢复](../Operation-Guide/Backup/Restore-Instance.md)
- 运维管理
	- [查看监控信息](../Operation-Guide/Monitoring/Monitoring.md)
	- [设置报警规则](../Operation-Guide/Monitoring/Alarm-Rules.md)

## 计费
云数据库 MongoDB 支持 包年包月 和 按配置 计费两种计费类型。详细说明请参见“[计费规则](../Pricing/Billing-Rules.md)”。
