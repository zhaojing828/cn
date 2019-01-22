直播API概述
=================================

        直播加速服务（Live-Video）基于京东云大规模云计算基础资源，为客户提供低延迟、高可用、易接入的视频直播一站式服务，
    帮助客户快速搭建自己的直播平台及应用。客户开通京东云直播加速服务后，可以使用京东云提供的直播Open API，更方便、更细
    维度的管理自己的直播业务。      
        当前直播Open API的版本号为：1.0.1
        
        
##术语表：

|接口名称|功能描述|
|---|---|
|**addCustomLiveStreamRecordTemplate**|添加直播录制模板|
|**addCustomLiveStreamSnapshotTemplate**|添加直播截图模板|
|**addCustomLiveStreamTranscodeTemplate**|添加自定义转码模板|
|**addCustomLiveStreamWatermarkTemplate**|添加直播水印模板|
|**addLiveDomain**|添加直播域名|
|**addLiveRecordTask**|添加录制打点任务|
|**addLiveStreamAppRecord**|添加APP录制配置|
|**addLiveStreamAppSnapshot**|添加APP直播截图配置|
|**addLiveStreamAppTranscode**|添加APP转码配置|
|**addLiveStreamAppWatermark**|添加APP水印配置|
|**addLiveStreamDomainRecord**|添加域名录制配置|
|**addLiveStreamDomainSnapshot**|添加域名直播截图配置|
|**addLiveStreamDomainTranscode**|添加域名转码配置|
|**addLiveStreamDomainWatermark**|添加域名水印配置|
|**deleteCustomLiveStreamRecordTemplate**|删除用户自定义录制模板|
|**deleteCustomLiveStreamSnapshotTemplate**|删除用户自定义直播截图模板|
|**deleteCustomLiveStreamTranscodeTemplate**|删除用户自定义转码模板|
|**deleteCustomLiveStreamWatermarkTemplate**|删除用户自定义水印模板|
|**deleteLiveApp**|删除APP|
|**deleteLiveDomain**|删除域名|
|**deleteLiveStreamAppRecord**|删除APP录制配置|
|**deleteLiveStreamAppSnapshot**|删除APP截图配置|
|**deleteLiveStreamAppTranscode**|删除APP转码配置|
|**deleteLiveStreamAppWatermark**|删除APP水印配置|
|**deleteLiveStreamDomainRecord**|删除域名录制配置|
|**deleteLiveStreamDomainSnapshot**|删除域名截图配置|
|**deleteLiveStreamDomainTranscode**|删除域名转码配置|
|**deleteLiveStreamDomainWatermark**|删除域名水印配置|
|**deleteLiveStreamNotifyConfig**|删除直播流状态通知|
|**deleteLiveStreamRecordNotifyConfig**|删除录制回调配置|
|**deleteLiveStreamSnapshotNotifyConfig**|删除截图回调配置|
|**describeCustomLiveStreamRecordConfig**|查询录制配置|
|**describeCustomLiveStreamRecordTemplates**|查询录制模板列表|
|**describeCustomLiveStreamSnapshotConfig**|查询直播截图配置|
|**describeCustomLiveStreamSnapshotTemplates**|查询直播截图模板列表|
|**describeCustomLiveStreamTranscodeTemplate**|查询用户自定义转码模板详情|
|**describeCustomLiveStreamTranscodeTemplates**|查询用户自定义转码模板列表|
|**describeCustomLiveStreamWatermarkConfig**|查询水印配置|
|**describeCustomLiveStreamWatermarkTemplates**|查询录制模板列表|
|**describeLiveDomainDetail**|查询指定域名相关信息|
|**describeLiveDomains**|查询域名列表|
|**describeLiveStreamNotifyConfig**|查询直播流状态通知|
|**describeLiveStreamOnlineList**|查看域名下所有的正在推的流的信息|
|**describeLiveStreamPublishList**|查看域名下推流记录|
|**describeLiveStreamRecordNotifyConfig**|查询录制回调配置|
|**describeLiveStreamSnapshotNotifyConfig**|查询截图回调配置|
|**describeLiveStreamTranscodeConfig**|查询转码模板配置|
|**forbidLiveStream**|禁止直播流推送|
|**resumeLiveStream**|恢复直播流推送|
|**setLiveStreamNotifyConfig**|设置直播流状态通知|
|**setLiveStreamRecordNotifyConfig**|设置录制回调通知|
|**setLiveStreamSnapshotNotifyConfig**|设置截图回调通知|
|**startLiveDomain**|启动域名|
|**stopLiveDomain**|停用域名|

