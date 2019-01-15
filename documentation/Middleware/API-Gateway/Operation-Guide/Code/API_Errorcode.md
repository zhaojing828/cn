# 错误码

在使用API网关产品服务时，您可能遇到诸多错误码。下表内容供您参考：

通用错误码
|  错误码  |   HTTP状态码  |  错误信息  |  解决方案   |
|-|-|-|-|
| ARGUMENT_NOT_SUPPORT |  400 |  参数 argument 不支持  |      |
|  ARGUMENT_NOT_FOUND  |  400 |  参数 argument 是必填参数 |   |
|  ARGUMENT_WRONG_FORMAT  | 400 | 参数 argument  类型应该是 某format  |   |
|  OUT_OF_RANGE  | 400 | 参数 argument  取值不合法;参数 argument 取值应该介于 operand1 和 operand2 之间;参数  argument 取值应该 param的operand1 |   |
| ARGUMENT_MISMATCH  | 400 |  资源 resource 不存在参数 argument |   |
| INVALID_ARGUMENT   | 400 |  参数 argument 存在错误  |      |
| FAILED_PRECONDITION   | 400 |  资源 resource 在当前状态下不可进行当前操作  |      |
|    | 401 |  认证失败  |      |
|    | 403 |  没有对资源 resource 的 permission 权限  |      |
|    | 404 |  资源 resource 不存在  |      |
|    | 404 |  找不到 resource   |      |
|    | 409 |  当前无法对 resource 进行操作  |      |
|    | 409 |  resource 已存在  |      |
|    | 409 |  两种资源归属的父资源不一致  |      |
|    | 409 |  多个参数有大小依赖关系  |      |
|    | 429 |  配额不足，剩余配额： limit   |      |
|    | 429 |  请求过频繁  |      |
|    | 499 |  取消操作  |      |
|    | 500 |  未知错误  |      |
|    | 500 |  内部错误 |      |
|    | 501 |  目前不支持 method   |      |
|    | 502 |  源站不可用  |      |
|    | 503 |  服务不可用  |      |
|    | 504 |  超时  |      |

