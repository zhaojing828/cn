# 基于IAM Policy的权限控制
访问控制（Identity and Access Management， IAM）是京东云提供的一项用户身份管理与资源访问控制服务。IAM Policy是基于用户的授权策略。通过设置
IAM Policy，您可以集中管理您的用户（比如员工、系统或应用程序），以及控制用户可以访问您名下哪些资源的权限。比如能够限制您的用户只拥有对某一个
Bucket 的读权限。子账号是从属于主账号的，并且这些账号下不能拥有实际的任何资源，所有资源都属于主账号。
[详见IAM](https://docs.jdcloud.com/cn/iam/core-concepts)
**说明**
目前OSS仅支持IAM 中子用户访问，角色将后续支持，如果您有跨账号授权的需求请查看。[基于Bucket policy的访问控制](./Access-Control-Base-On-Bucket-Policy.md)，完成跨账号授权。

## 如何构建 IAM Policy

- IAM Policy 基本元素
- IAM Policy 示例

**说明：** 目前Bucket Policy与 IAM Policy 元素与元素用略有不同，请根据您的使用情况做好区分，不要混淆二者。
### IAM Policy 基本元素

IAM Policy语言包含以下基本意义的元素：
版本（Version）：Version 定义了 IAM Policy 的版本，当前支持的 "version" 元素值为 3。
* 委托人（principal）：描述策略授权的实体,用户授权访问策略中不需要指定，被授予IAM Policy的子账号即是策略授权的实体。该元素对于存储空间访问策略（Bucket Policy）有效，对用户授权访问策略（IAM Policy）则不应添加。
* 语句（statement）：描述一条或多条权限的详细信息。该元素包括效力、操作、资源等多个其他元素的权限或权限集合。一条策略有且仅有一个语句元素。
    - 效力（Effect）：描述声明产生的结果是“允许”（allow），**暂不支持显示拒绝（deny)，功能更新中，敬请期待**。该元素是必填项。
    - 操作（Action）：描述被允许或拒绝的操作。操作可以是 API或者功能集（一组特定的 API）。该元素是必填项，
         详见下文【OSS在IAM Policy中用法 -Action】。
    - 资源（Resource）：描述指代的是 OSS 上面的某个具体的资源或者某些资源。资源是用六段式描述。该元素是必填项，有关如何指定资源的信息，详见下文             【OSS在IAM Policy中用法-Resource】。
    Policy 需遵循 JSON 语法规范,详细说明请参阅[IAM Policy-策略语法](https://docs.jdcloud.com/cn/iam/elements)
### OSS在IAM Policy中用法
#### 1.Action

Bucket policy 中 Action 支持列表如下：

|操作关键字|操作项说明|对应API|操作级别 | 
|-|-|-|-|
|oss:PutObject|上传某个Object到该Bucket，支持普通上传和分块上传等|PUT Object, POST Object, PUT Object - COPY, Initiate Multipart Upload, Upload Part, Complete Multipart Upload|  Object 级别操作  |
|oss:GetObject|获取该Bucket内某个Object及其相关信息|GET Object, HEAD Object|	Object 级别操作  |
|oss:DeleteObject|删除该Bucket内Object|DELETE Object|Object 级别操作|
|oss:ListBucket|列出该Bucket内的Objcet|GET Bucket (List Objects), HEAD Bucket|Bucket 级别操作 |
|oss:DeleteBucket|删除该Bucket|DELETE Bucket|Bucket 级别操作 |
|oss:ListBucketMultipartUploads|删除该Bucket|DELETE Bucket|Bucket 级别操作 |
|oss:DeleteBucket|删除该Bucket|DELETE Bucket|Bucket 级别操作 |

示例：
例如，使用 s3:DeleteObject 权限，用户可对 OSS 执行删除存储空间操作。


    
    
    
### IAM Policy 示例
#### 1.完全授权的IAM Policy
完全授权的 IAM Policy表示允许子账号可以对OSS进行任何操作。您可以登录[访问控制控制台-用户管理](https://iam-console.jdcloud.com/subUser/list)直接授权系统策略（JDCloudOSSAdmin）。
```
{
  "Statement": [
    {
      "Action": [
        "oss:*"，
       
      ],
      "Effect": "Allow",
      "Resource": "*"
    }
  ],
  "Version": "3"
}
```
#### 2.完全授权的IAM Policy





    






