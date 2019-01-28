## 关于 DNS Flag Day 的说明

### 什么是 DNS Flag Day？

 [DNS Flag Day](https://dnsflagday.net/)是一项针对权威DNS的、共识性的全球更新，旨在确保所有主要DNS基础架构都遵循新的EDNS标准（DNS扩展机制）。
 从2019年2月1日起，对于不支持EDNS协议的权威DNS服务器，可能会被Google、Cloudflare、Cisco/OpenDNS、ISC/BIND等公共DNS、递归DNS标记为服务不可用，从而导致域名无法正常解析。
 
### 京东云对DNS Flag Day的支持情况

1. 目前京东云解析DNS服务实现完全符合DNS规范，支持EDNS扩展
2. 使用京东云解析DNS服务的域名，在全球任何地区均能正常解析，不受任何影响 
 
### 如何测试
托管在京东云解析DNS的域名，可以使用测试网站[https://dnsflagday.net/index-zh-CN.html] 验证是否符合EDNS标准规范。

以下为示例：

![img](../../../../image/dns-img/dns%20flag%20day.png)

从示例可以看出，域名已经通过所有EDNS标准项检测。
