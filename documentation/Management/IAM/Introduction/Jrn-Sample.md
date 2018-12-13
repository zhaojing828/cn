# 支持IAM的云产品JRN示例

 | 产品线名称   |                           JRN示例                            |
| :----------- | :---------------------------------------------------------- |
| DDoS         |        jrn:baseanti:region:accountid:ipResources/{ip}        |
| 应用安全网关 |      jrn:vpcwaf:region:accountid:instances/{instanceId}      |
| 负载均衡     | jrn:lb:region:accountid:loadBalancers/{loadBalancerId}<br>jrn:lb:region:accountid:loadBalancers/{loadBalancerId}/backends/{backendId}<br>jrn:lb:region:accountid:loadBalancers/{loadBalancerId}/listeners/{listenerId}<br>jrn:lb:region:accountid:loadBalancers/{loadBalancerId}/targetGroups/{targetGroupId}<br>jrn:lb:region:accountid:ruleMaps/{ruleMapId} |
| POD          | jrn:pod:region:accountid:pods/{podId}<br>jrn:pod:region:accountid:pods/{podId}/containers/{containerName}<br/>jrn:pod:region:accountid:secrets/{name} |
| 消息队列JCQ  | jrn:jcq:region:accountid:/topics/{topicName}<br/>jrn:jcq:region:accountid:/topics/{topicName}/subscriptions/{consumerGroupId} |
