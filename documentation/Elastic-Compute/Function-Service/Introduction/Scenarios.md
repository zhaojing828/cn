# 应用场景

在函数服务上构建应用程序时，核心组件是function函数和事件源。事件源是发布事件的京东云服务，function函数是处理事件的自定义代码。

**多媒体内容分析处理** – 通过向对象存储上传事件可以触发相关的分析处理函数，OSS对象存储是函数服务支持的京东云事件源之一，支持多类型事件并调用您的function函数。例如：用户使用您的应用程序上传多媒体文件，应用程序将这些文件存储到OSS存储桶中。您的应用程序可通过创建function函数自动处理（提取、转码、缩放等）用户的多媒体文件，然后将处理后的结果保存到指定的OSS存储桶中。
https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/API-Gateway/apigroup-1.png

**Serverless后端服务** –您可以在创建网站时使用function上托管后端逻辑。通过HTTP 调用 function函数，使用API 网关作为 HTTP 终端节点。通过 Web 客户端调用 API，API 网关将请求路由到function来调用函数。
