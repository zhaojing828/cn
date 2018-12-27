# Live API


## 简介
视频直播相关接口


### 版本
v1


## API
|接口名称|请求方式|功能描述|
|---|---|---|
|**addCustomLiveStreamRecordTemplate**|POST|添加录制模板|
|**addCustomLiveStreamSnapshotTemplate**|POST|添加直播截图模板|
|**addCustomLiveStreamTranscode**|POST|添加自定义转码模板|
|**addCustomLiveStreamWatermarkTemplate**|POST|添加直播水印模板|
|**addLiveApp**|POST|添加 app 模板|
|**addLiveDomain**|POST|添加直播域名|
|**addLiveDomain**|GET|查询直播域名网络带宽监控数据|
|**addLiveRecord**|GET|查询直播域名录制时长数据|
|**addLiveStreamAppRecord**|POST|添加app录制配置|
|**addLiveStreamAppSnapshot**|POST|添加app直播截图配置|
|**addLiveStreamAppTranscode**|POST|添加app转码配置|
|**addLiveStreamAppWatermark**|POST|添加app水印配置|
|**addLiveStreamDomainRecord**|POST|添加域名录制配置|
|**addLiveStreamDomainSnapshot**|POST|添加域名直播截图配置|
|**addLiveStreamDomainTranscode**|POST|添加域名转码配置|
|**addLiveStreamDomainWatermark**|POST|添加域名水印配置|
|**addLiveStreamRecordNotifyConfig**|POST|添加录制回调配置|
|**addLiveStreamSnapshotNotifyConfig**|POST|添加截图回调配置|
|**deleteCustomLiveStreamRecordTemplate**|DELETE|删除录制模板|
|**deleteCustomLiveStreamSnapshotTemplate**|DELETE|删除直播截图模板|
|**deleteCustomLiveStreamTranscode**|DELETE|删除自定义转码模板|
|**deleteCustomLiveStreamWatermarkTemplate**|DELETE|删除直播水印模板|
|**deleteLiveApp**|DELETE|删除app|
|**deleteLiveDomain**|DELETE|删除域名|
|**deleteLiveStreamAppRecord**|DELETE|删除app录制配置|
|**deleteLiveStreamAppSnapshot**|DELETE|删除app直播截图配置|
|**deleteLiveStreamAppTranscode**|DELETE|删除app转码配置|
|**deleteLiveStreamAppWatermark**|DELETE|删除app水印配置|
|**deleteLiveStreamDomainRecord**|DELETE|删除域名录制配置|
|**deleteLiveStreamDomainSnapshot**|DELETE|删除域名直播截图配置|
|**deleteLiveStreamDomainTranscode**|DELETE|删除域名转码配置|
|**deleteLiveStreamDomainWatermark**|DELETE|删除域名水印配置|
|**deleteLiveStreamNotifyUrlConfig**|DELETE|删除NotifyURL|
|**deleteLiveStreamRecordNotifyConfig**|DELETE|删除录制回调配置|
|**deleteLiveStreamSnapshotNotifyConfig**|DELETE|删除截图回调配置|
|**describeCustomLiveStreamRecordConfig**|GET|查询录制配置|
|**describeCustomLiveStreamRecordTemplates**|GET|查询录制模板列表|
|**describeCustomLiveStreamSnapshotConfig**|GET|查询直播截图配置|
|**describeCustomLiveStreamSnapshotTemplates**|GET|查询直播截图模板列表|
|**describeCustomLiveStreamTranscode**|GET|查询转码模板详情|
|**describeCustomLiveStreamTranscodes**|GET|查询转码模板列表|
|**describeCustomLiveStreamWatermarkConfig**|GET|查询水印配置|
|**describeCustomLiveStreamWatermarkTemplates**|GET|查询录制模板列表|
|**describeLiveApp**|GET|查询域名下的app列表|
|**describeLiveDomain**|GET|查询域名列表|
|**describeLiveDomainDetail**|GET|查询指定域名相关信息|
|**describeLiveStreamNotifyUrlConfig**|GET|查询NotifyURL|
|**describeLiveStreamRecordNotifyConfig**|GET|查询录制回调配置|
|**describeLiveStreamSnapshotNotifyConfig**|GET|查询截图信息回调配置|
|**describeLiveStreamTranscodeConfig**|GET|查询转码模板配置|
|**forbidLiveStream**|PUT|禁止直播流推送|
|**resumeLiveStream**|PUT|恢复直播流推送|
|**setLiveStreamNotifyUrlConfig**|POST|设置NotifyURL|
|**startLiveApp**|PUT|启用APP|
|**startLiveDomain**|PUT|启动域名|
|**stopLiveApp**|PUT|停用APP|
|**stopLiveDomain**|PUT|停止域名|
