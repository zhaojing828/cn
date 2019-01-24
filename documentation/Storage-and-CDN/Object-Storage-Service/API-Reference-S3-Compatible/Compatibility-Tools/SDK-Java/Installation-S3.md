# 安装

## 前言

本文档基于[AWS Java SDK](http://docs.aws.amazon.com/zh_cn/sdk-for-java/v1/developer-guide/examples-s3.html) 编写.
京东云对象存储支持AWS S3接口，具体兼容的接口可在[兼容接口](../../../API-Reference-S3-Compatible/Compatibility-API/Compatibility-API-Overview.md)查看。

## 环境准备

请使用JDK 6及以上版本。

## 安装方式

### 在Maven项目中加入依赖项（推荐方式）
在Maven工程中使用S3 Java SDK，只需在pom.xml中加入相应依赖项即可。以`1.11.136`版本为例，在`<dependencies>`内加入如下内容：

```
<dependency>  
    <groupId>com.amazonaws</groupId>  
    <artifactId>aws-java-sdk</artifactId>  
    <version>1.11.136</version>  
</dependency>
```

### 在Eclipse项目中导入JAR包

以`1.11.136`版本为例，步骤如下：

下载[AWS Java SDK](https://sdk-for-java.amazonwebservices.com/latest/aws-java-sdk.zip)开发包。

1.解压该开发包。

2.将解压后文件夹中的文 aws-java-sdk-<versionId>.jar 以及lib文件夹下的所有文件拷贝到您的项目中。

3.在Eclipse中选择您的工程，右击选择 Properties > Java Build Path > Libraries > Add JARs。

选中您在第3步拷贝的所有JAR文件，导入到Libraries中。
