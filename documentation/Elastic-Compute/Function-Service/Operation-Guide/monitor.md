# 函数监控

函数服务通过云监控实时采集函数指标，展示函数执行信息。

**函数监控**

目前，函数服务提供Function维度的函数监控，监控项见表1。

表1：函数监控项列表

| 指标名称            | 单位 | 说明                                                         |
| ------------------- | ---- | ------------------------------------------------------------ |
| 平均Duration        | ms   | 请求Duration是指Invoke该Function后，用户Function的执行代码从开始执行到结束的运行时间。   不同于计费系统会将请求Duration以100毫秒向上取整作为计量单位，这里是指请求真实的执行时间。平均Duration是在分钟粒度内对所有的请求Duration取均值。 |
| 最大内存使用        | MB   | 在聚合周期内Invoke该Function使用的最大内存                   |
| TotalInvocations    | 次   | Invoke该Function的总请求次数，包括所有调用InvokeFunction接口进行访问的请求和系统执行异步Invoke的请求。   同上表，异步的Invoke请求，不会在用户发起请求时计入总请求，而是在该异步请求实际被系统执行时才开始计数。 |
| BillableInvocations | 次   | 成功Invoke该Function的请求次数   这类请求等同于计量项中的Invocations，是可计费请求数。   函数自身的语法错误或自身执行错误也会计入该指标。 |
| Throttles           | 次   | Invoke该Function但被流控的请求次数                           |
| FunctionErrors      | 次   | Invoke该Function但发生函数执行错误，包括Hanled/Unhandled/   timeout等。 |

 

**函数报警**

您可以根据实际业务需求，通过云监控创建任意函数的自定义告警，详细步骤请参考云监控创建告警规则。
