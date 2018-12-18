# 编程模型（Python）

## 处理程序

在创建function函数时，需要指定一个事件处理程序，并指定对象 `event`、`context` 和 `callback`。遵循以下通用的语法结构：

   

`event`:function从event参数中获取函数的输入事件，调用函数时传入的数据。此参数通常是Python dict类型。也可以是list、str、int、float或NoneType类型。您可以根据function定义好的格式编写代码从event参数中获取需要的信息。

 

`context`:function通过context参数向您的处理程序提供运行时信息。包括您的个人信息和其他信息。格式参考如下：

代码

 

 

 

 

`Callback`（可选）：处理程序返回值，通知终止运行函数并返回信息给调用方。您必须主动和调用callback函数，否则会出现超时错误。

o   如果您使用 RequestResponse 调用类型（同步调用），function会将 Python 函数调用的结果返回到调用 function函数的客户端。例如，function控制台使用 RequestResponse 调用类型，因此当您使用控制台调用函数时，控制台将显示返回的值。

如果处理程序返回 NONE，function将返回 null。

o   如果您使用 Event 调用类型（异步调用），则丢弃该值。

 

 

## context对象 

通过Context可获取函数运行时的函数相关信息。

例如：获取函数基本信息，在context中获得本次请求的 ID，并记录到函数运行日志中。后续通过该 ID 来追踪请求执行的详细信息。

 

Context对象属性

| 属性                    | 说明                                                         |
| ----------------------- | ------------------------------------------------------------ |
| **request_id**          | 与请求关联的请求 ID。这是返回到调用了 `invoke` 方法的客户端的 ID。   注意   如果重试调用，请求 ID 保持不变。 |
| **function_name**       | 正在执行的function函数的名称。                               |
| **function_handler**    | 处理函数                                                     |
| **function_version**    | 正在执行的function函数版本。如果别名用于调用函数，`function_version` 将为别名指向的版本。 |
| **invoked_function_id** | id 用于调用此函数。一个function_id对应一个版本的函数。       |
| **memory_size**         | 为function函数配置的内存限制（以 MB 为单位）。您在创建函数时设置内存限制，并且随后可更改此限制。 |
| **timeout**             | 函数超时时间                                                 |
| **logset**              | 函数日志集，若未创建则为空                                   |
| **logtopic**            | 日志主题，若未创建则为空                                     |

 

## 日志记录

您可在函数中使用日志记录语句，function会将这些日志写入函数日志，若您使用控制台调用函数，控制台将显示相同日志。

以下 Python 语句生成日志条目：

* `print` 语句。

* `logging` 模块中的 `Logger` 函数

`print` 和 `logging.*` 函数将日志写入函数日志中，而 `logging.*` 函数将额外信息写入每个日志条目中，例如时间戳和日志级别。

**使用 `logging` 语句写入日志**

您可以通过使用`logging`模块将信息写入函数日志，示例如下： 

```
import logging

logger = logging.getLogger()

logger.setLevel(logging.INFO)

def my_logging_handler(event, context):

  logger.info('got event{}'.format(event))

  logger.error('something is error')

return 'function is worked'  
```


 

您可以在日志服务的对应函数页面查看代码中的函数日志。日志级别标志日志的类型，如：info、warn、error、debug。
 
**使用 `print` 语句写入日志**

您可以通过`print`语句打印函数日志，示例如下：

```
from __future__ import print_function

def lambda_handler(event, context):

  print('it is running')`

  return 'Hello World!'`   
```  

在此示例中，仅将打印文本发送到日志服务。日志条目将不会包含 `logging.*` 函数返回的额外信息。
