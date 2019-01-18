# 错误码

在使用API网关产品服务时，您可能遇到诸多错误码。下表内容供您参考：


####   表1.调用SDK时的错误码
|  错误码  |   HTTP状态码  |  错误信息  |  解决方案   |
|-|-|-|-|
| APIGW_LACK_PARAMS |  401 |  某个参数不存在  |      |
| APIGW_KEY_NOT_EXITST |  401 |  错误的密钥  |      |
| APIGW_KEY_DISABLED |  401 |  无效的密钥  |      |
| APIGW_SIGN_RESULT_NOT_SAME |  401 |  签名不一致  |      |
| APIGW_ILLEGAL_HEADER |  401 |  请求含有非法头信息  |      |
| APIGW_NONCE_CONFLICT |  403 |  重复访问  |      |
| APIGW_USER_BLACK_LIST |  403 |  黑名单用户  |      |
| APIGW_ROLE_NOT_ALLOWED |  403 |  不支持角色用户  |      |
| APIGW_ROLE_NOT_EXITST |  403 |  角色用户不存在  |      |
| APIGW_FORMAT_ERROR |  403 |  参数x-jdcloud-pin格式错误  |      |
| APIGW_USER_NOT_EXITST |  403 |  用户不存在  |      |
| USER_NOT_ACTIVATED |  403 |  用户未激活  |      |
| APIGW_OPERATION_NOT_ALLOWED |  403 |  不允许的操作  |      |
| APIGW_MFA_FAIL |  403 |  没有操作权限  |      |
| APIGW_API_NOT_ALLOWED |  403 |  此接口不允许调用  |      |
| APIGW_CHILD_ACCOUNT_NOT_ALLOWED |  403 |  您无权在资源（%s）上执行（%s）  |      |
| APIGW_SERVICE_DISABLED |  403 |  服务被禁用  |      |
| APIGW_SERVICE_NOT_FOUND |  404 |  服务未注册  |      |
| HTTP_BAD_GATEWAY |  502 |  内部错误  |      |
| HTTP_INTERNAL_SERVER_ERROR |  500 |  重复访问  |      |


####   表2.通用错误码

|  错误码  |   HTTP状态码  |  错误信息  |  解决方案   |
|-|-|-|-|
| ARGUMENT_NOT_SUPPORT |  400 |  参数 argument 不支持  |      |
|  ARGUMENT_NOT_FOUND  |  400 |  参数 argument 是必填参数 |   |
|  ARGUMENT_WRONG_FORMAT  | 400 | 参数 argument  类型应该是 某format  |   |
|  OUT_OF_RANGE  | 400 | 参数 argument  取值不合法;参数 argument 取值应该介于 operand1 和 operand2 之间;参数  argument 取值应该 param的operand1 |   |
| ARGUMENT_MISMATCH  | 400 |  资源 resource 不存在参数 argument |   |
| INVALID_ARGUMENT   | 400 |  参数 argument 存在错误  |      |
| FAILED_PRECONDITION   | 400 |  资源 resource 在当前状态下不可进行当前操作  |      |
| UNAUTHENTICATED   | 401 |  认证失败  |      |
| HTTP_FORBIDDEN   | 403 |  没有对资源 resource 的 permission 权限  |      |
| RESOURCE_NOT_EXIST   | 404 |  资源 resource 不存在  |      |
| NOT_FOUND   | 404 |  找不到 resource   |      |
| ABORTED   | 409 |  当前无法对 resource 进行操作  |      |
| ALREADY_EXISTS   | 409 |  resource 已存在  |      |
| CONFLICT   | 409 |  两种资源归属的父资源不一致  |      |
| FAILED_PRECONDITION   | 409 |  多个参数有大小依赖关系  |      |
|  QUOTA_EXCEEDED  | 429 |  配额不足，剩余配额： limit   |      |
|  RATE_LIMIT_EXCEEDED  | 429 |  请求过频繁  |      |
| CANCELLED   | 499 |  取消操作  |      |
| UNKNOWN   | 500 |  未知错误  |      |
| INTERNAL   | 500 |  内部错误 |      |
| NOT_IMPLEMENTED   | 501 |  目前不支持 method   |      |
| SOURCE_UNAVAILABLE   | 502 |  源站不可用  |      |
| UNAVAILABLE   | 503 |  服务不可用  |      |
| DEADLINE_EXCEEDED   | 504 |  超时  |      |



####   表3.控制台错误码
|  错误码  |   HTTP状态码  |  错误信息  |  解决方案   |
|-|-|-|-|
| APIGATEWAY_SUCCESS |  200 |  成功  |      |
| APIGATEWAY_ARGUMENT_NOT_SUPPORT |  400 |  param 参数不支持  |      |
| APIGATEWAY_ARGUMENT_NOT_FOUND |  400 |  param 不能为空  |      |
| APIGATEWAY_MODIFY_ERROR |  400 |  该分组已发布，不能修改  |      |
| APIGATEWAY_DELETE_API_ERROR |  400 |  仍有上线版本，不能删除  |      |
| APIGATEWAY_NONE_VALID_PIN |  400 |  无效的用户pin  |      |
| APIGATEWAY_DELETE_ERROR |  400 |  未解除绑定，不能删除  |      |
| APIGATEWAY_BIND_GROUP_TOO_MUCH |  400 |  流控策略绑定分组多于一个  |      |
| APIGATEWAY_PATH_PARAMETERS_MUST_BE_DEFINED |  400 |  请在下面的查询参数Parameter Path中定义此路径参数:param  |      |
| APIGW_NO_HEADER | 400 |  缺少header参数userId  |           |
| APIGW_PARAMS_NOT_EXIST | 400 |  某参数不存在  |           |
| APIGW_PARAM_VALUE_INVALID | 400 |  某参数不合法  |           |
| APIGW_RECORD_CONFLICT | 403 |  已存在某参数  |           |
| APIGW_RECORD_NOT_FOUND | 404 |  某参数不存在  |           |
| APIGATEWAY_HTTP_FORBIDDEN |  403 |  没有权限  |      |
| APIGATEWAY_DOMAIN_NO_RECORDED |  403 |  没有备案  |      |
| APIGATEWAY_DOMAIN_ALREADY_EXISTS |  403 |  域名已存在  |      |
| APIGATEWAY_DOMAIN_IS_BINDED |  403 |  域名处于绑定状态，无法修改  |      |
| APIGATEWAY_DOMAIN_NUM_IS_MAX |  403 |  域名数量超过最大值  |      |
| APIGATEWAY_NONE_VALID_APPID |  404 |  无效的keyID  |      |
| APIGATEWAY_NOT_FOUND |  404 |  param 资源不存在  |      |
| APIGATEWAY_NONE_VALID_API |  404 |  该分组没有有效的API  |      |
| APIGATEWAY_NOT_EXIST_METHOD_ERROR |  404 |  不存在要验证的接口  |      |
| APIGATEWAY_SWAGGER_NULL_ERRO |  404 |  yaml文件不能为空  |      |
| APIGATEWAY_APIGROUPNAME_ISREPEAT |  409 |  分组名称重复  |      |
| APIGATEWAY_BACKENDSERVICE_PREFIX_ISREPEAT |  409 |  分组中后端服务前缀名重复  |      |
| APIGATEWAY_APINAME_ISREPEAT |  409 |  API名称重复  |      |
| APIGATEWAY_ACCESSKEY_ISREPEAT |  409 |  签名访问密钥重复  |      |
| APIGATEWAY_ACCESSKEYAUTH_ISREPEAT |  409 |  授权访问密钥重复  |      |
| APIGATEWAY_POLICYNAME_ISREPEAT |  409 |  策略名称重复  |      |
| APIGATEWAY_API_PATH_ISREPEAT |  409 |  API路径重复  |      |
| APIGATEWAY_APISNAME_ISREPEAT |  409 |  创建业务线分组名称重复  |      |
| APIGATEWAY_REVISION_ISREPEAT |  409 |  新增修订版本号重复  |      |
| APIGATEWAY_SWAGGER_PARSE_ERROR |  500 |  yaml文件解析异常  |      |
| APIGATEWAY_OPERATION_FAILED |  500 |  操作失败  |      |
| APIGATEWAY_API_BODY_ERROR |  500 |  要验证的接口的对应的body定义异常  |      |
| APIGATEWAY_INVALID_SERVICE_STATUS |  500 |  服务未开通或已停止  |      |
| APIGATEWAY_INVALID_AUTHENTICATION_STATUS |  500 |  该用户未进行实名认证  |      |



