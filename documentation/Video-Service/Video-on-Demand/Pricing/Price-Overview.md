# 价格总览

## A.视频存储  
### 计费项  
视频点播占用存储总量  
### 计费价格  
<table>
<tr>
    <td>收费项<br/>
    <td>价格（元/GB/天）</td>
</tr>
<tr>
    <td> 存储容量<br/>
    <td>0.03</td>
</tr>
<tr>
</table>

### 计费说明
•	付费方式：后付费。  
•	计费规则：根据实际使用量收费，取每天存储空间容量峰值为当天的计费值。  
•	计费周期：按天计费，每天0:00到24:00，每日中午 12 时至下午 18 时，对前一日产生费用进行结算，输出账单并进行扣费。  
•	计费公式：累计的存储容量（GB） * 对应存储的单价。  
### 计费实例
例如您在 6 月18 日使用视频点播服务，文件峰值存储容量为 100G，则 6 月 19 日您需要支付的视频点播存储费用如下：
累计的存储容量（100GB） * 对应存储的阶梯单价（0.003）=0.3元

## B.视频转码
### 计费项
点播转码处理时长
### 计费价格
<table>
<tr>
    <td>编码方式<br/>
    <td>分辨率</td>
    <td>单价（元/分钟）<= 30fps 输出</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>4K（ 3840 x 2160 ）及以下</td>
    <td>0.2</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>2K（ 2560 x 1440 ）及以下</td>
    <td>0.1</td>
</tr>
<tr>
    <td> H.264<br/>
    <td>全高清 FHD ( 1920 x 1080 ）及以下</td>
    <td>0.05</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>高清 HD ( 1280 x 720 ）及以下</td>
    <td>0.03</td>	
</tr>
<tr>
    <td> H.264<br/>
    <td>标清 SD ( 640 x 360 ) 及以下</td>
    <td>0.01</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>4K（ 3840 x 2160 ）及以下</td>
    <td>1.2</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>2K（ 2560 x 1440 ）及以下</td>
    <td>0.6</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>全高清 FHD ( 1920 x 1080 ）及以下</td>
    <td>0.3</td>	
</tr>
<tr>
    <td> H.265<br/>
    <td>高清 HD ( 1280 x 720 ）及以下</td>
    <td>0.15</td>
</tr>
<tr>	
    <td> H.265<br/>
    <td>标清 SD ( 640 x 360 ) 及以下</td>
    <td>0.1</td>
</tr>
<tr>
    <td> 转封装<br/>
    <td>mp4/flv/ts
提供错误检测
</td>
    <td>free</td>
</tr>
<tr>
    <td> 转音频<br/>
    <td>AAC/MP3
ComfortGain  
响度优化
</td>
    <td>free</td>
</tr>
<tr>
</table>

### 计费说明
•	付费方式：后付费  
•	计费规则：根据转码请求的编码方式、分辨率和转码输出文件时长收费，以每天为计费周期。  
•	计费周期：按天计费，每天0:00到24:00，计费生效时间戳为转码任务完成时间，如当天23:00提交转码，于次日0:05转码结束，则计入次日计费周期，每日中午 12 时至下午 18 时，对前一日产生费用进行结算，输出账单并进行扣费。  
•	输出时长：对于每个转码输出文件，按分钟计费，文件时长精确到小数点后两位，第二位根据第三位四舍五入，未满1秒的时长按0.02分钟计算。  
•	输出规格判定：按输出视频分辨率的长边和短边属于输出规格划定的范围进行判定，方式如下：  
以输出  HD (1280 x 720)及以下 规格为例，输出视频的分辨率长边不大于1280且短边不大于720则属于该输出规格。
如输出视频的长边大于1280或输出视频的短边大于720，该输出视频属于更高输出规格。  
•	计费公式：
视频转码输出文件时长（分钟）x 不同编码方式分辨率视频的转码单价（元/分钟）
### 计费实例
例如您在 6月 18 日使用视频点播转码服务，H.264 编码方式转出 2560 x 1440分辨率视频时长 100分钟，则 6月 19 日您需要支付的转码费用如下：  
视频转码输出文件时长（100分钟）x 不同编码方式分辨率视频的转码单价（0.1元/分钟）=10元
## c.视频加速
### 计费项
流量计费：视频点播内容分发观看加速产生的流量。
### 计费价格
流量费用采用无阶梯费用，客户直接获得优惠价格：
<table>
<tr>
    <td>收费项<br/>
    <td>单价（元/GB/天）</td>
</tr>
<tr>
    <td> 视频播放加速费用<br/>
    <td>0.15</td>
</tr>
<tr>
</table>

### 计费说明
•	付费方式：后付费  
•	计费规则：根据视频播放时，使用内容分发网络（CDN）加速产生的下行流量进行计费，以每天为计费周期。  
•	计费周期：按天计费，每天0:00到24:00，每天中午12时至下午18时，对前一日产生费用进行结算，输出账单并进行扣费。  
•	计费公式：视频播放下行流量（GB） x 日流量阶梯单价（元/GB）
### 计费实例
例如您在 6月 18日使用点播加速服务，使用的下行流量为 100GB，则6月19日您需要支付的视频点播流量费用如下：  
视频播放下行流量   （100GB） x 日流量阶梯单价（0.15元/GB）=15元