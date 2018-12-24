# 使用Function函数构建API

为了帮助您开始使用基本工作流程来构建并测试API网关API，您可以使用京东云控制台API网关来创建并测试与 PetStore 网站进行 HTTP 集成的简单 API。API 定义预配置为Swagger 2.0文件。在将 API 定义加载到API网关中后，您可以使用API网关控制台来检查 API 的基本结构或直接部署并测试API。

示例 API支持使用以下方法来访问 HTTP 后端网站http://petstore-demo-endpoint.execute-api.com/petstore/pets 。

- GET /pets/{petId}：用于对指定为传入请求 URL 的路径变量的 petId 值标识的宠物进行读取访问。后端会返回在 PetStore 中找到的指定宠物。后端服务地址是 http://petstore-demo-endpoint.execute-api.com/petstore/pets/n ，其中n是一个用作所查询宠物的标识符的整数。

- POST /pets：用于对已与后端 /petstore/pets 资源集成的 API /pets 资源进行写入访问。收到正确请求后，后端会将指定的宠物添加到PetStore中并将结果返回给调用方。后端服务地址是 http://petstore-demo-endpoint.execute-api.com 。

## 在 API 网关控制台中根据示例创建一个 API 并进行测试

以下过程将指导您完成在API网关控制台中根据示例创建API并通过SDK进行测试的步骤。

### 创建API分组-创建API-发布：

#### 1.	登录API网关控制台，打开[API分组管理](https://apigateway-console.jdcloud.com/apiGroupList)。
