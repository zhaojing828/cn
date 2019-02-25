# 使用s3browser管理OSS

## 简介

s3browsers是一种易于使用的Amazon S3免费客户端。它提供了一个简单的服务Web服务接口，可以使用绝大部分的对存储空间（bucket）、对象(object)进行操作管理的功能。

## 安装

1.下载安装包

下载地址：https://s3browser.com/download.aspx

2.安装

点开安装即可

## 使用s3browser接入OSS
###  增加用户

#### 步骤 1 在左侧的 account 下拉菜单中点击“add new account”
![](../../../../image/Object-Storage-Service/OSS-124.png)

#### 步骤 2 在弹出的对话框中，填写相应参数：

![](../../../../image/Object-Storage-Service/OSS-125.png)
*  Account Name：显示名称，一般填自己的用户名即可。
*  Account Type: S3 Compatible Storage
* REST Endpoint ,填写京东云[兼容S3的服务域名](https://docs.jdcloud.com/cn/object-storage-service/regions-and-endpoints)。
* Signature Version: 选择Version 4
* Access Key ID(京东云的AK)
* Secret Access Key(京东云的SK)
* 是否使用HTTPS:OSS支持http和https,为了您的数据更加安全建议默认勾选，使用https

## 使用s3browsers管理OSS
### 存储空间操作
#### 创建存储空间（bucket）

![](../../../../image/Object-Storage-Service/OSS-126.jpg)

1.点击【New bucket】创建存储空间

![](../../../../image/Object-Storage-Service/OSS-126.jpg)

2.创建弹框中输入bucket name

**说明**
* 存储空间名称全局唯一，如果该名称已经被其他用户占用，将不能创建成功，请您根据[OSS命名规范](https://docs.jdcloud.com/cn/object-storage-service/put-bucket-2)，输入恰当的能够标识自身业务的名称。
* 存储空间创建时默认ACL 为私有读写，您可以根据自己的需求，在创建后更改空间访问权限。参见【设置存储空间的Acl】与【设置Bucket policy】

#### 设置存储空间的Acl

Service point：填写京东云[兼容S3的服务域名](https://docs.jdcloud.com/cn/object-storage-service/regions-and-endpoints)。

Access key、Secret key：接入 OSS 服务的 AK、SK。

Use SSL：是否使用 SSL，建议勾选该选项。

Use native multipart upload（recommended）：是否使用分片上传

Signature version：选择4

步骤 3 单击“Test Connection”，测试是否能连接成功，或者直接单击“OK”进行连接。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-081.jpg)

连接成功之后，将看到账户（如 jcloud）下面对应的Bucket列表，如下图所示。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-082.jpg)
