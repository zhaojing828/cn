# 核心概念
以下是NAT网关帮助文档中使用到的概念及其解释，请参考。

| 名词/概念 | 解释 |
| :- | :- |
| SNAT | SNAT(Source Network Address Translation) 源地址转换，通过NAT网关访问Internet时，将源IP转换成NAT网关的公网IP的过程被称为SNAT |
| DNAT | DNAT(Destination Network Address Translation)目的地址转换， NAT网关上建立了一个公网IP和端口与私网IP和端口的静态映射关系，从Internet访问NAT网关的这个静态IP和端口时，目的IP和端口被转换成内网IP和端口，从而访问到内网的服务，这个过程为DNAT |
