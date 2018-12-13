## HTTPDNS的原理

客户端直接访问HTTPDNS接口，获取域名的最优IP。

客户端获取到业务IP后，就向直接往此IP发送业务协议请求。

以Http请求为例，通过在header中指定host字段，向HTTPDNS的IP发送标准的Http请求即可。