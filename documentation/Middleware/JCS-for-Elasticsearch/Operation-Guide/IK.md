## 插件支持
由于Elasticsearch官方默认的分词插件，对中文的分词效果不理想，因此我们的云搜索Elasticsearch预置了IK分词插件，您可以利用该插件对数据中的中文关键词建立索引，更好的完成搜索功能。</br>

| 插件名称	| 简介	|
|:--|:--:|
| respository-s3 | snapshot上传到存储 |
| analysis-ik | IK分词	|
| analysis-icu | icu分析器 |
| analysis-phonetic | 音标分析插件	|
| analysis-pinyin | 拼音分词	|
| ingest-attachment | 使用Apache Tika抽取内容	|
| ingest-user-agent | 从用户Agent抽取信息	|
| mapper-size | 映射器大小，允许在索引时记录文档压缩前的大小	|
| mapper-murmur3 | 允许用户在创建索引时计算字段值的哈希值，并将获得的哈希值存储到索引中	|
| analysis-stconvert | 中文简繁体转换插件	|
