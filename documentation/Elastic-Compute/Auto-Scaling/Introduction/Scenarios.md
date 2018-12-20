## **应用场景**

用户明确何时需要扩缩容，则可提前设置Auto Scaling定时任务。到相应时间时，系统将自动添加或减少实例，无需人工等待。

避免需求预测的准确性、突增的业务变化为系统带来的风险，则可提前设置Auto Scaling监控策略。系统将根据设定好的业务监控指标自动判定是否需要云主机平行扩展。如果监控指标达到阈值，则实时自动增加或减少云主机实例，并自动完成负载均衡配置。既节约了成本，也无需客户时刻为手动扩容作准备。

电商：618大促，或者某个节日做促销，可提前根据定时任务按负载自动弹性伸缩。

视频直播：无法预估业务负载情况，需要根据CPU利用率、带宽利用率等，自动弹性伸缩。

游戏：每天11-13点和19点~24点，在玩家活跃时间段，需要定时扩容。

大数据计算：业务在每天凌晨0点，对当天的业务进行计算、统计、收集，对于这种有明显时效性的业务，可弹性伸缩。