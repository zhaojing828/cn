# 查看边缘计算结果

您可以在您自己的OSS空间内，查看图像检测的结果和摄像头抓取的图像。

## 注意事项

1. 图像检测模块已经正确部署在边缘节点上。

   ```
   docker ps
   ```

   在出现的列表里查看：object-detector 和 device-service-webcam两个服务的状态，部署成功为UP。

2. USB摄像头应正确连接至边缘节点上，并且处于开启状态。

3. 您的OSS服务确认正常开启。

## 操作步骤

1. 登录您的OSS控制台，进入您为边缘计算创建的Bucket里面。
2. 默认的存储路径为：
3. 您可以看到检测的图片信息和结果文件

## 相关参考 

- [创建边缘计算节点](../../Getting-Started/Create-Edgenode.md)
- [安装Edge系统](../../Getting-Started/Install-Edge-System.md)
- [部署边缘计算模块](../Edge-Module/Deploy-Edge-Module.md)
- [控制边缘节点子设备](../../Getting-Started/Best-Practices/Control-Device.md)
