# 触发器概述

Function Servcie是事件触发的Serverless服务，核心组件是function函数和事件源。事件源是事件的产生者，函数是事件的处理者，触发器定义了事件源触发函数的规则。在事件源中，当事件发生，若满足预先配置的触发器规则，事件源则调用触发器所对应的函数。

   函数可由京东云云服务触发、控制台触发或SDK触发。目前，函数服务支持的事件源类型参考触发器列表，触发器类型在陆续丰富中。

 

触发器配置:

`TriggerName`：触发器名称

`TiggerType`：触发器类型（例如：OSS、AIPW）

`resourceid`：触发器执行的资源描述符。OSS触发器的sourceid格式为：acs:oss:region:accountId:bucketName

`Triggerconfig`：触发器配置信息，各触发器配置信息根据触发器类型不同请参考对应触发器文档
