# SDK-Ruby

## 概述

本文档基于[AWS Ruby SDK](https://docs.aws.amazon.com/zh_cn/sdk-for-ruby/v3/developer-guide/welcome.html)编写。京东云对象存储支持AWS S3接口，具体兼容的接口可在[兼容接口](../Compatibility-API/Compatibility-API-Overview.md)查看。

## 环境准备

请使用Ruby 1.9及以上版本，如需安装或更新Ruby，请访问[Ruby](http://www.ruby-lang.org/en/)。

## SDK安装
安装AWS SDK for Ruby，请运行以下命令：
```
gem install aws-sdk-s3 -V
```

## 初始化

您可以初始化S3Client，用于管理存储空间和文件等OSS资源。使用Ruby SDK发起OSS请求，您需要使用您的AccessKey和SecretKey初始化一个S3Client，并根据需要修改Endpoint、Region等默认配置项。
```Ruby
require 'aws-sdk-s3'

endpoint = 'https://s3.<REGION>.jdcloud-oss.com'
region = '<REGION>'
cred = Aws::Credentials.new('<your-ak>','<your-sk>')

#初始化Client实例
s3Client = Aws::S3::Client.new(
  credentials: cred,
  endpoint: endpoint,
  region: region
)

#use s3Client to create bucket、put object....
```

## 使用示例

以下为创建存储空间的示例，更多说明请参考[Class: Aws::S3::Client](https://docs.aws.amazon.com/sdk-for-ruby/v3/api/Aws/S3/Client.html)

```Ruby
require 'aws-sdk-s3'

endpoint = 'https://s3.cn-north-1.jdcloud-oss.com'
region = 'cn-north-1'
cred = Aws::Credentials.new('<your-ak>','<your-sk>')

#初始化Client实例
s3Client = Aws::S3::Client.new(
  credentials: cred,
  endpoint: endpoint,
  region: region
)

#Create Bucket
bucket = 'bucket-ruby-test'
s3Client.create_bucket(bucket: bucket)
```
