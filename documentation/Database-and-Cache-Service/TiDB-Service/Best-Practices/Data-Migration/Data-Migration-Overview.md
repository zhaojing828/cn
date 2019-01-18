# 数据迁移概述

## 概述
该文档详细介绍了如何将 MySQL 的数据迁移到 TiDB。

这里我们假定 MySQL 以及 TiDB 服务信息如下：

|Name|	Address|	Port|	User|	Password|
|-|-|-|-|-|
|MySQL|	127.0.0.1|	3306|	root|	*|
|TiDB|	127.0.0.1|	4000|	root|	*|

在这个数据迁移过程中，我们会用到下面四个工具:

- checker 检查 schema 能否被 TiDB 兼容
- mydumper 从 MySQL 导出数据
- loader 导入数据到 TiDB
- syncer 增量同步 MySQL 数据到 TiDB

## 两种迁移场景
- 第一种场景：只全量导入历史数据 （需要 checker + mydumper + loader）；
- 第二种场景：全量导入历史数据后，通过增量的方式同步新的数据 （需要 checker + mydumper + loader + syncer）。该场景需要提前开启 binlog 且格式必须为 ROW。

## MySQL 开启 binlog
** 注意： 只有上文提到的第二种场景才需要在 dump 数据之前先开启 binlog**

- MySQL 开启 binlog 功能，参考 Setting the Replication Master Configuration
- Binlog 格式必须使用 ROW format，这也是 MySQL 5.7 之后推荐的 binlog 格式，可以使用如下语句打开:
