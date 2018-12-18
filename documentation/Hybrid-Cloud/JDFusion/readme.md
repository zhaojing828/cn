# JDFusion CLI Project
# **产品概述**
JDFusion产品提供对公有云、私有云、混合云整合管理的产品。融合云将提供多种基础设施资源的整合，跨平台的融合编排，多租户访问等能力，助力企业在多种异构云平台间，数据迁移，快速部署业务系统，高效运维业务状态，整体提升业务系统的稳定性、灵活性。
JDFusion产品采用开放式的架构设计，提供丰富的API接口，并提供SDK/CLI等开发工具。企业现有IT系统可通过API等快速与融合云集成，实现企业特性化管理需求。
JDFusion产品具备以下特性：
 - 能够接入主流的公有云、私有云平台
 - 提供一站式的云资源管理控制台，用户从全局掌握企业IT基础架构
 - 支持可视化的编排面板，直观、灵活的对多个云厂商的资源进行一体化编排
 - 提供DTS服务，满足用户的重要数据可以在多云之间进行迁移，支持周期、实时等多种模式
 - 提供统一的资源/业务监控功能，并且支持多种资源监控接入模式
## **常用操作**
 - 云信息相关
   - 云信息列表
   - 注册云信息
   - 注销云信息
 - 虚拟机相关
   - 虚拟机列表
   - 虚拟机详细信息
   - 创建虚拟机
   - 启动虚拟机
 - 云硬盘相关
   - 云硬盘列表
   - 创建云硬盘
   - 删除云硬盘
   - 绑定云硬盘到虚拟机
 - 实例类型相关
   - 实例类型列表
 - 安全组相关
   - 安全组列表
   - 安全组详细信息
   - 创建安全组
 - 负载均衡相关
   - 负载均衡列表
   - 负载均衡详细信息
   - 创建负载均衡
## **计费**
暂无。
## **核心概念**
<table>
    <thead>
        <tr>
            <th style="width: 100px;">名称</th>
            <th>解释</th>
        </tr>
    </thead>
       <tr>
        <td>地域</td>
        <td>云厂商的机房分布在全球多个位置，这些位置称为地域。不同地域之间完全隔离，保证不同地域间最大程度的稳定性和容错性。         </td>
        </tr> 
        <tr>
        <td>可用区</td>
        <td>可用区是指在同一地域下，电力、网络等基础设施互相独立的物理区域。一个地域包含一个或多个可用区，同一地域下的多个可用区可以彼此连通。
        </td>
        </tr> 
        <tr>
        <td>私有网络（VPC）</td>
        <td>用户在云上自定义的逻辑隔离的网络空间，此私有网络空间由用户完全掌控，支持自定义网段划分、路由策略等。用户可以在VPC内创建和管理多种云产品，如云主机、负载均衡等，同时可配置网络内的资源连接Internet。
        </td>
        </tr> 
        <tr>
        <td>子网</td>
        <td>子网是所属私有网络（VPC） IP地址范围内的 IP地址块，子网在VPC下。创建VPC后，用户可以在VPC下添加子网。相同VPC下子网的IP地址块不可以重叠，不同VPC下子网的IP地址块可以重叠。
        </td>
        </tr> 
         <tr>
        <td>实例规格</td>
        <td>实例规格指实例的每个节点被分配的CPU核数、内存容量、网络配置等资源。
        </td>
        </tr> 
         <tr>
        <td>CPU核</td>
        <td>实例的每个节点可以使用的计算能力上限。1个CPU拥有不低于2.3GHz超线程（Intel Xeon系列Hyper-Threading）的计算能力。
        </td>
        </tr> 
          <tr>
        <td>内存</td>
        <td>实例的每个节点被分配的内存容量。
        </td>
        </tr> 
          <tr>
        <td>存储空间</td>
        <td>实例的每个节点被分配的磁盘容量。
        </td>
        </tr> 
</table>

## **业务架构**
业务架构图如下：
JDFusion与用户的主要交互方式为控制台界面、CLI和API，其中：
 - 控制台：融合云提供的主要交付方式，为用户提供直观、简洁的操作体验。
 - CLI工具：基于Bash环境的命令行工具，使其可以基于脚本等形式对融合云进行访问。
 - API：标准的基于HTTP协议的RestfulAPI接口，其他系统可以通过API与融合云进行集成。用户通过控制台实现的功能，均可以通过API实现。
 - 调度平台：调度平台负责将用户提交的任务进行分发，将不同的任务交给不同的编排引擎进行处理。
 - 编排引擎：根据用户发起的不同类型的请求，生成对应的可执行计划，调度不同的适配器与对应的云厂商进行链接、访问。
 - 适配器：适配器用于承接编排引擎提供的执行计划，并将其转换成对应云厂商可识别的API调用或其他指令。不同的云厂商需要对应不同的适配器。
 - 插件：插件用于接入合作伙伴或其他第三方提供的服务，用于丰富和扩展现有融合云平台所提供的能力。
## **产品优势**
### **可视化管理**
JDFusion提供一站式的资源管理控制台，实现云资源池总览、业务系统总览、告警分析以及虚拟资源总体监控等多个层次的可视化，用户可从全局掌握企业IT基础架构，降低云资源的维护成本。
### **支持多云异构平台管理**
JDFusion为企业提供统一的多云资源管理平台，降低云厂商所提供的接口的差异化所带来的影响，从而使企业用户可以使用控制台和标准化的API访问、管理不同云厂家所提供的云服务。
### **开放式平台**
JDFusion提供了API/SDK以及terraform等多种开源的接入方案，允许合作伙伴在API接口之上，进行更为丰富的服务开发和整合。
### **构建丰富扩展**
JDfusion 提供丰富的云服务可供用户选择，帮助用户快速获得资源与服务，弹性伸缩，极大丰富了混合云的内涵，兼具私有云的自控性与公有云的灵活性。
## **产品功能**
### **一站式资源管理**
提供一站式的资源管理控制台，包括计算资源、存储资源、网络资源、PaaS资源。IT运维人员不必在不同的云服务商界面间切换，即可以从全局掌握企业IT基础架构，降低云资源的维护成本。
### **业务编排管理**
支持基于业务的编排，用户可以使用通过可视化的编排面板，直观、灵活的对多个云厂商的资源进行一体化编排，快速的实现单云、跨云业务的部署。只需创建一个描述自己所需的云资源的模板，资源编排将根据模板，在模板中定义所需的云计算资源、资源间的依赖关系、资源配置等。资源编排通过编排引擎自动完成所有资源的创建和配置，以达到自动化部署、运维的目的。
### **统一服务治理**
通过微服务架构构建，提供服务治理范围覆盖了服务的整个生命周期，从服务建模开始，到开发、测试、审批、发布、运行时管理，以及最后的下线，遵循“在线治理，实时生效”原则。
### **DTS服务**
提供多场景下数据迁移与灾备DTS服务，重要数据可以在多云之间进行实时迁移。DTS服务将支持周期、实时等多种模式，用户根据实际需要选择将数据进行备份，借助于实时DTS服务，使企业业务可以实现跨云灾备。
### **统一服务监控**
提供统一的资源/业务监控功能，并且支持多种资源监控接入模式。即可以适用融合云提供的独立方案进行跨云资源的统一监控，也可以通过云服务厂商API的接入，统一的对监控数据进行展示。
## **限制说明**
### **Terraform驱动**
目前接入云厂商平台，均需要使用对应厂商的Terraform驱动，该驱动应由云厂家提供。
## **应用场景**
### **多云资源管理**
大型企业通常有多个云厂商提供云服务，每个云服务的资源数量较多，管理极为复杂。JDFusion为企业提供统一的云资源管理平台，借助JDFusion可将多个云资源进行统一管理，降低云厂商所提供的接口的差异化所带来的影响，企业用户可以使用控制台和标准化的API访问、管理不同云厂家所提供的云服务。
### **跨云数据迁移**
JDFusion可以提高数据迁移的自动化程度，将数据迁移做到自动化对接，依赖于跨云的资源创建，使业务应用可以快速的在新的云上进行部署和验证。
### **跨云数据灾备**
JDFusion支持自建IDC、云上自建数据库、其他云环境的数据库备份，轻松对接云厂商上的存储服务，更加弹性的规划、部署自己的存储资源，帮助用户实现现有应用程序、基础架构和数据存储与JD Fusion之间的无缝集成，进而快速建立云端备份，数据传输支持SSL加密，保障数据安全。
### **跨云业务多活**
JDFusion充分考虑了高效、便捷、可靠和全面这四个最核心的企业诉求，从基础设施、PaaS、分布式应用等多个层面出发，将多活变成了一种服务，为企业业务保驾护航，实现跨云多活，跨云资源动态伸缩，业务不受云厂商影响。
# **入门指南**
## **概述**
JDFusion CLI程序的运行，需要相应的运行环境。
目前，我们提供了两种方式来安装JD Fusion CLI。第一种RPM包，第二种Dokcer容器。
## **环境部署**
### **安装准备**
要安装、运行JDFusion CLI需要准备一些必要信息
>* JDFusion平台的用户AK
>* JDFusion平台的用户SK
下面的信息为可个性化配置信息：
>* JDFusion平台的服务入口
>* JDFusion平台大区编号
若不知如何获取，请查看[JD Fusion平台用户认证](https://github.com/jdfusion/jdfusion.github.io)
#### **以RPM的方式安装运行**
使用本文档中提供的[fusion-cli.rpm](http://jd-fusion-pub-storage.oss.cn-north-1.jcloudcs.com/releases/cli/rpm/fusion-cli-0.1.2~RELEASE.x86_64.rpm)包，安装JD Fusion CLI。目前，仅提供64位版本。
下载RPM包到你的Linux系统中，在终端中运行命令：
```bash
rpm -i fusion-cli-*.x86_64.rpm
```
在当前用户的home目录下，创建一个".fusion-cloud"文件，在文件中，以property的方式配置AK，SK等信息。
示例如下：
```bash
cd ~
cat > .fusion-cloud << EOF
x.jdcloud.fusion.ak=$AK
x.jdcloud.fusion.sk=$SK
x.jdcloud.fusion.endpoint=http://api.test.fusion.jdcloud.com/zuul
x.jdcloud.fusion.region=cn-north-1a
EOF
```
将`$AK`、`$SK`替换为你自己在JD Fusion平台上AK、SK即可。
另外，JD Fusion CLI的运行需要JRE1.8及以上版本，并且需要设置JAVA_HOME。
在配置完成后即可以使用JD Fusion CLI了。
例如：
```bash
fusion list clouds --vendor jdcloud
```
#### **以Docker容器的方式安装运行**
使用本文档中提供的CLI运行环境Docker镜像[jdfusion/cli](https://hub.docker.com/r/jdfusion/cli/)。这需要你本地的电脑上安装了Docker程序，关于Docker相关的文档，请参考[Docker官方文档](https://www.docker.com/)
可以使用以下两种方式来启动Docker容器：
##### **命令行列举环境变量**
命令如下：
```bash
docker run -ti \
-e X_JDCLOUD_FUSION_AK=$AK \
-e X_JDCLOUD_FUSION_SK=$SK \
-e X_JDCLOUD_FUSION_ENDPOINT=http://api.test.fusion.jdcloud.com/zuul \
-e X_JDCLOUD_FUSION_REGION=cn-north-1a \
jdfusion/cli list clouds
```
将`$AK`、`$SK`替换为你自己在JD Fusion平台上AK、SK即可。以上命令基于Linux操作系统，如需在Windows系统上执行，可将每行结尾的"\"替换为"`"。
示例中，
`-e` 为设置程序运行所需要的环境变量
`jdfusion/cli`为官方提供的jdfusion/cli运行环境镜像
`list clouds`为实际运行的指令，用于展示用户注册的云信息列表
##### **命令行使用环境变量文件**
命令如下：
```bash
# docker run -ti --env-file env.list jdfusion/cli list clouds
```
env.list的文件内容格式为：
```properties
X_JDCLOUD_FUSION_AK=$AK
X_JDCLOUD_FUSION_SK=$SK
X_JDCLOUD_FUSION_ENDPOINT=http://api.test.fusion.jdcloud.com/zuul
X_JDCLOUD_FUSION_REGION=cn-north-1a
```
将`$AK`、`$SK`替换为你自己在JD Fusion平台上AK、SK即可。
示例中，
`--env-file` 为设置程序运行所需要的环境变量的文件
`jdfusion/cli`为官方提供的jdfusion/cli运行环境镜像
`list clouds`为实际运行的指令，用于展示用户注册的云信息列表
# **操作指南**
JD Fusion CLI程序提供了尽可能多的命令，以满足用户的使用需求。
## **云信息相关命令**
### **云信息列表**
用于展示用户注册的所有云信息列表
命令格式：
```bash
# list clouds [--vendor <云厂家>]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --vendor | 云厂家 |
示例：
```bash
list clouds --vendor jdcloud
```
### **云信息详情**
用于展示用户指定云的详细信息
命令格式：
```bash
# describe cloud <云实例id>
```
参数：
无
示例：
```bash
describe cloud cloud-123
```
### **注册云信息**
用于根据JSON格式的配置文件，将指定的云注册到JD Fusion平台
命令格式：
```bash
# register cloud [ -f <文件名> | -i <JSON格式的数据> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
JSON格式样例：
```json
{
  "cloud": {
    "name": "string",
    "vendor": "string",
    "info": {},
    "metadata": {}
  }
}
```
示例：
```bash
register cloud -i '{"cloud":{"name":"mycloud111","vendor":"jdcloud","info":{"access_key":"my_access_key","secret_key":"my_secret_key","region":"cn-north-1"},"metadata":{}}}'
```
-i 参数的内容为标准JSON格式，在Linux环境下可以使用''(单引号)括起来，而在Windows环境下则需要对JSON字符串中的""(双引号)进行转义，并且外层不加''（单引号）
### **注销云信息**
将用户指定的云信息从JD Fusion平台上注销
命令格式：
```bash
# unregister cloud <云实例ID>
```
参数：
无
示例：
```bash
unregister cloud cloud-123
```
## **虚拟机相关命令**
### **虚拟机列表**
用于展示用户指定云上的所有虚拟机信息列表
命令格式：
```bas
# list vms --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list vms --cloud cloud-123
```
### **虚拟机详细信息**
用于展示用户指定虚拟机的详细信息
命令格式：
```bash
# describe vm <虚拟机实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe vm vm-123
```
### **创建虚拟机**
用于根据JSON格式的配置文件，在指定的云上创建虚拟机
命令格式：
```bash
# create vm [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json
{
  "vms": {
    "az": "string",
    "name": "string",
    "hostName": "string",
    "description": "string",
    "subnetId": "string",
    "tags": [
      {
        "tagKey": "string",
        "tagValue": "string"
      }
    ],
    "privateIpAddress": "string",
    "imageId": "string",
    "instanceFlavorType": "string",
    "securityGroupId": "string",
    "internetMaxBandwidthIn": 0,
    "internetMaxBandwidthOut": 0,
    "password": "string",
    "passwordInherit": true,
    "userData": "string",
    "keyPairName": "string",
    "systemDisk": {
      "category": "string",
      "diskSize": 0,
      "description": "string"
    }
  }
}
```
示例：
```bash
create vm -f /data/json/vm.json --cloud cloud-123
```
### **删除指定的虚拟机**
用于删除用户指定的虚拟机
命令格式：
```bash
# del vm <虚拟机实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del vm vm-123 --cloud cloud-123
```
### **启动虚拟机**
启动用户指定的虚拟机
命令格式：
```bash
# start vm <虚拟机实例ID>
```
参数：
无
示例：
```bash
start vm vm-123
```
### **停止虚拟机**
停止用户指定的虚拟机
命令格式：
```bash
# stop vm <虚拟机实例ID>
```
参数：
无
示例：
```bash
stop vm vm-123
```
### **重启虚拟机**
重启用户指定的虚拟机
命令格式：
```bash
# reboot vm <虚拟机实例ID>
```
参数：
无
示例：
```bash
reboot vm vm-123
```
## **云硬盘相关命令**
### **云硬盘列表**
用于展示用户指定云上的所有云硬盘信息列表
命令格式：
```bash
# list disks --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list disks --cloud cloud-123
```
### **云硬盘详细信息**
用于展示用户指定云硬盘的详细信息
命令格式：
```bash
# describe disk <云硬盘实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe disk disk-123
```
### **创建云硬盘**
用于根据JSON格式的配置文件，在指定的云上创建云硬盘
命令格式：
```bash
# create disk [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json
{
  "disk": {
    "name": "string",
    "description": "string",
    "diskSizeGB": 0,
    "az": "string",
    "diskType": "string",
    "snapshotId": "string",
    "tags": [
      {
        "tagKey": "string",
        "tagValue": "string"
      }
    ]
  }
}
```
示例：
```bash
create disk -f /data/json/disk.json --cloud cloud-123
```
### **删除指定的云硬盘**
用于删除用户指定的云硬盘
命令格式：
```bash
# del disk <云硬盘实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del disk disk-123 --cloud cloud-123
```
### **绑定云硬盘到虚拟机**
用于将用户指定的云硬盘，绑定到用户指定的虚拟机上
命令格式：
```bash
# attach disk --from <云硬盘实例ID> --to <虚拟机ID> --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要绑定的云硬盘ID |
| --to | 必填，指定云硬盘要绑定到的虚拟机ID |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
示例：
```bash
attach disk --from disk-123 --to vm-123 --cloud cloud-123
```
### **将云硬盘从虚拟机上解绑**
用于将用户指定的云硬盘，从用户指定的虚拟机上解绑
命令格式：
```bash
# detach disk --from <云硬盘实例ID> --to <虚拟机ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要解绑的云硬盘ID |
| --to | 必填，指定的云硬盘要从哪台虚拟机上解绑 |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
detach disk --from disk-123 --to vm-123 --cloud cloud-123
```
## **公网IP相关命令** 
### **公网IP列表**
用于展示用户指定云上的所有公网IP信息列表
命令格式：
```bash
# list eips --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list eips --cloud cloud-123
```
### **公网IP详细信息**
用于展示用户指定公网IP的详细信息
命令格式：
```bash
# describe eip <弹性公网IP实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |

| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe eip eip-123
```
### **分配公网IP**
用于根据JSON格式的配置文件，在指定的云上分配公网IP
命令格式：
```bash
# create eip [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]

```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json
{
  "allocate": {
    "name": "string",
    "bandwidth": "string",
    "provider": "string"
  }
}
```
示例：
```bash
create eip -f /data/json/eip.json --cloud cloud-123
```
### **删除指定的公网IP**
用于删除用户指定的公网IP
命令格式：
```bash
# del eip <弹性公网IP实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del eip eip-123 --cloud cloud-123
```
### **绑定公网IP到虚拟机**
用于将用户指定的公网IP，绑定到用户指定的虚拟机上
命令格式：
```bash
# attach eip --from <公网IP实例ID> --to <虚拟机ID> --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要绑定的公网IP的ID |
| --to | 必填，指定公网IP的ID要绑定到的虚拟机ID |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
示例：
```bash
attach eip --from eip-123 --to vm-123 --cloud cloud-123
```
### **将公网IP从虚拟机上解绑**
用于将用户指定的公网IP，从用户指定的虚拟机上解绑
命令格式：
```bash
# detach eip --from <公网IP实例ID> --to <虚拟机ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要解绑的公网IP的ID |
| --to | 必填，指定的公网IP要从哪台虚拟机上解绑 |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
detach eip --from eip-123 --to vm-123 --cloud cloud-123
```
## **镜像相关命令**
### **镜像列表**
用于展示用户指定云上的所有镜像信息列表
命令格式：
```bash
# list images --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list images --cloud cloud-123
```
## **实例类型相关命令**
### **实例类型列表**
用于展示用户指定云上的所有实例类型信息列表
命令格式：
```bash
# list instancetypes --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list instancetypes --cloud cloud-123
```
## **密钥对相关命令**
### **密钥对列表**
用于展示用户指定云上的所有密钥对信息列表
命令格式：
```bash
# list kps --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list kps --cloud cloud-123
```
### **密钥对详细信息**
用于展示用户指定name的详细信息
命令格式：
```bash
# describe keypair <密钥对的name> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe keypair kp-name
```
### **创建密钥对**
用于根据JSON格式的配置文件，在指定的云上创建密钥对
命令格式：
```bash
# create keypair [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json
{
  "keypair": {
    "name": "string",
    "publicKey": "string"
  }
}
```
示例：
```bash
create keypair -f /data/json/keypair.json --cloud cloud-123
```
### **删除指定的密钥对**
用于删除用户指定的name
命令格式：
```bash
# del keypair <密钥对的name> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del keypair kp-name --cloud cloud-123
```
## **网卡相关命令**
### **网卡列表**
用于展示用户指定云上的所有网卡信息列表
命令格式：
```bash
# list nis --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list nis --cloud cloud-123
```
### **网卡详细信息**
用于展示用户指定网卡的详细信息
命令格式：
```bash
# describe ni <网卡实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe ni ni-123
```
### **创建网卡**
用于根据JSON格式的配置文件，在指定的云上创建网卡
命令格式：
```bash
# create ni [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json
{
  "netInterface": {
    "name": "string",
    "description": "string",
    "subnetId": "string",
    "zoneId": "string",
    "privateIpAddress": "string",
    "securityGroupId": "string"
  }
}
```
示例：
```bash
create ni -f /data/json/ni.json --cloud cloud-123
```
### **删除指定的网卡**
用于删除用户指定的网卡
命令格式：
```bash
# del ni <网卡实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del ni ni-123 --cloud cloud-123
```
### **绑定网卡到虚拟机**
用于将用户指定的网卡，绑定到用户指定的虚拟机上
命令格式：
```bash
# attach ni --from <网卡实例ID> --to <虚拟机ID> --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要绑定的网卡ID |
| --to | 必填，指定网卡要绑定到的虚拟机ID |

| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
示例：
```bash
attach ni --from ni-123 --to vm-123 --cloud cloud-123
```
### **将网卡从虚拟机上解绑**
用于将用户指定的网卡，从用户指定的虚拟机上解绑
命令格式：
```bash
# detach ni --from <网卡实例ID> --to <虚拟机ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要解绑的网卡ID |
| --to | 必填，指定的网卡要从哪台虚拟机上解绑 |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
detach ni --from ni-123 --to vm-123 --cloud cloud-123
```
## **安全组相关命令**
### **安全组列表**
用于展示用户指定云上的所有安全组信息列表
命令格式：
```bash
# list sgs --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list sgs --cloud cloud-123
```
### **安全组详细信息**
用于展示用户指定安全组的详细信息
命令格式：
```bash
# describe sg <安全组ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe sg sg-123
```
### **创建安全组**
用于根据JSON格式的配置文件，在指定的云上创建安全组
命令格式：
```bash
# create sgs [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json
{
  "securityGroup": {
    "name": "string",
    "description": "string",
    "vpcId": "string"
  }
}
```
示例：
```bash
create sgs -f /data/json/sgs.json --cloud cloud-123
```
### **删除指定的安全组**
用于删除用户指定的安全组
命令格式：
```bash
# del sg <安全组实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del sg sg-123 --cloud cloud-123
```
## **负载均衡相关命令**
### **负载均衡列表**
用于展示用户指定云上的所有负载均衡信息列表
命令格式：
```bash
# list slbs --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list slbs --cloud cloud-123
```
### **负载均衡详细信息**
用于展示用户指定负载均衡的详细信息
命令格式：
```bash
# describe slb <负载均衡实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe slb slb-123
```
### **创建负载均衡**
用于根据JSON格式的配置文件，在指定的云上创建负载均衡
命令格式：
```bash
# create slb [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json

{
  "slb": {
    "name": "string",
    "subnetId": "string",
    "loadBalancerSpec": "string"
  }
}
```
示例：
```bash
create slb -f /data/json/slb.json --cloud cloud-123
```
### **删除指定的负载均衡**
用于删除用户指定的负载均衡
命令格式：
```bash
# del slb <负载均衡实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del slb slb-123 --cloud cloud-123
```
## **子网相关命令**
### **子网列表**



用于展示用户指定云上的所有子网信息列表
命令格式：
```bash
# list subnets --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list subnets --cloud cloud-123
```
### **子网详细信息**
用于展示用户指定子网的详细信息
命令格式：
```bash
# describe subnet <子网实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe subnet subnet-123
```
### **创建子网**
用于根据JSON格式的配置文件，在指定的云上创建子网
命令格式：
```bash
# create subnet [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json
{
  "subnet": {
    "name": "string",
    "vpcId": "string",
    "cidrBlock": "string",
    "description": "string",
    "zoneId": "string"
  }
}
```
示例：
```bash
create subnet -f /data/json/subnet.json --cloud cloud-123
```
### **删除指定的子网**
用于删除用户指定的子网
命令格式：
```bash
# del subnet <子网实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del subnet subnet-123 --cloud cloud-123
```
## **专有网络相关命令**
### **专有网络列表**
用于展示用户指定云上的所有专有网络信息列表
命令格式：
```bash
# list vpcs --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list vpcs --cloud cloud-123
```
### **专有网络详细信息**
用于展示用户指定专有网络的详细信息
命令格式：
```bash
# describe vpc <专有网络实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe vpc vpc-123
```
### **创建专有网络**
用于根据JSON格式的配置文件，在指定的云上创建专有网络
命令格式：
```bash
# create vpc [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json
{
  "vpc": {
    "name": "string",
    "addressPrefix": "string",
    "description": "string",
    "cidrBlock": "string",
    "userCidr": "string"
  }
}
```
示例：
```bash
create vpc -f /data/json/vpc.json --cloud cloud-123
```
### **删除指定的专有网络**
用于删除用户指定的专有网络
命令格式：
```bash
# del vpc <专有网络实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del vpc vpc-123 --cloud cloud-123
```
## **服务器组相关命令**
### **服务器组列表**
用于展示用户指定云上的所有服务器组信息列表
命令格式：
```bash
# list vservergroups --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list vservergroups --cloud cloud-123
```
### **创建服务器组**
根据JSON格式的配置文件，创建虚拟服务器组，并添加后端服务器
命令格式：
```bash
# create vsg [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```
json
{
  "vserverGroup": {
    "loadBalancerId": "string",
    "vserverGroupName": "string",
    "backendServers": [
      {
        "serverId": "string",
        "port": 0,
        "weight": 0
      }
    ]
  }
}
```
示例：
```bash
create vsg -f /data/json/vsg.json --cloud cloud-123
```
## **HTTP监听相关命令**
### **创建HTTP监听**
根据JSON格式的配置文件，创建HTTP监听
命令格式：
```bash
# create listener [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json
{
  "httpListener": {
    "loadBalancerId": "string",
    "listenerPort": 0,
    "backendServerPort": 0,
    "vserverGroupId": "string",
    "bandwidth": 0,
    "healthCheckConnectPort": 0,
    "healthyThreshold": 0,
    "unhealthyThreshold": 0,
    "healthCheckTimeout": 0,
    "healthCheckInterval": 0,
    "healthCheckHttpCode": "string"
  }
}
```
示例：
```bash
create listener -f /data/json/listener.json --cloud cloud-123
```
## **其它命令**
### **追踪任务命令**
用于追踪任务的执行过程。如create命令，在不加--tail参数时，返回的只有一个任务ID。但这个任务，是否执行成功，执行的过程中发生了什么错误等，都不得而知。现在可以使用task命令，来追踪指定任务的执行过程。
命令格式：
```bash
# task <taskId>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --tail | 默认参数，是否追踪任务执行过程 |
示例：
```bash
task task-abc
```
