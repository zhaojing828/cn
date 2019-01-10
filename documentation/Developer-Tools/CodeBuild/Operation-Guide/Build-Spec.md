# 构建规范

构建规范是构建命令及相关设置的编译脚本，采用 YAML 格式。您可以把构建规范脚本放在源代码中，也可以在创建项目时定义。如果在源代码中包含构建规范，构建规范文件必须名为 build.yml 且放置在源目录的根目录中。

构建规范语法如下：

```
cmds:
  - name: 'list current dir'
    cmd: 'ls'
  - name: 'make output dir'
    cmd: 'mkdir -p output'
  - name: 'touch some files'
    cmd: 'touch a b c'
  - name: 'copy to output dir'
    cmd: 'cp a b c output'

# 抽包路径, 这个是必选项
out_dir: 'output'
```

