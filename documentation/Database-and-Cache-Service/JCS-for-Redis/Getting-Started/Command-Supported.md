# Redis命令支持

京东云缓存Redis基于2.8和4.0版本，命令请参见：[http://redis.io/commands](http://redis.io/commands)

## 支持的命令操作

Key(键)|String(字符串)|Hash（哈希表）|List（列表）|Set（集合）|SortedSet（有序集合） 
:--:|:--:|:--:|:--:|:--:|:--:
DEL|APPEND|HDEL|LINDEX|SADD|ZADD            
DUMP|BITCOUNT|HEXISTS|LINSERT|SCARD|ZCARD            
EXISTS|BITPOS|HGET|LLEN|SISMEMBER|ZCOUNT            
EXPIRE| DECR |HGETALL| LPOP|SMEMBERS|ZINCRBY            
EXPIREAT|DECRBY|HINCRBY|LPUSH|SPOP| ZRANGE            
KEYS*|GET|HINCRBYFLOAT|LPUSHX|SRANDMEMBER|ZRANGEBYSCORE           
PERSIST|GETBIT|HKEYS|LRANGE       |     	SREM     |ZRANK            
PEXPIRE|GETRANGE|HLEN|    	LREM        |    	SSCAN      | ZREM            
PEXPIREAT|GETSET|HMGET|     	LSET         |   	|ZREMRANGEBYRANK            
PTTL|INCR|HMSET|LTRIM | |        	ZREMRANGEBYSCORE            
RESTORE|INCRBY|HSET|RPOP      | |      	ZREVRANGE            
SORT|INCRBYFLOAT|HSETNX|RPUSH  | |          	ZREVRANGEBYSCORE            
TTL|MGET|HVALS|RPUSHX     | |       	ZREVRANK            
TYPE|MSET|HSCAN| | |       	       	ZSCORE            
SCAN|PSETEX| | | |ZSCAN            
| |SET   | |  |       	|ZRANGEBYLEX            
| |SETBIT      | | |   |   	ZLEXCOUNT            
| |SETEX       | | |    | 	ZREMRANGEBYLEX            
| |SETNX| | | | |             	
| |SETRANGE   | | | |         	
| |STRLEN    | | | |        	

以及

Connection（连接）|Server（服务器）     
:--:|:--:
AUTH|INFO*            
PING|CONFIG GET*           
QUIT|FLUSHDB         
ECHO|FLUSHALL             
SELECT|              

说明：

- KEYS命令，只能在VPC网络下使用，属于危险的命令，可能造成性能问题，请确保在key很少的情况下使用。如果需要从一个大数据集中查找特定的 key ，推荐使用 Redis 的集合结构(set)

- INFO命令，在集群版中使用受限：不支持 info cpu/replication/persistence

- CONFIG GET命令，在集群版中返回参数暂时未进行叠加

## 集群实例不支持的命令

Key(键)|String(字符串)|List（列表）|Set（集合）|SortedSet（有序集合）|Server（服务器）|Transaction(事务)
:--:|:--:|:--:|:--:|:--:|:--:|:--:
RENAME|BITOP|RPOPLPUSH|SDIFF|ZUNIONSTORE|SLOWLOG|DISCARD
RENAMENX|MSETNX	||SDIFFSTORE|ZINTERSTORE|CONFIG REWRITE|EXEC
OBJECT|||SINTER||CONFIG RESETSTAT|MULTI
|			|||SINTERSTORE||COMMAND COUNT|UNWATCH
|			|||SMOVE||COMMAND GETKEYS|WATCH
|			|||SUNION||COMMAND INFO	|
|			|||SUNIONSTORE||		|	
	
Redis2.8版本主从支持事务，集群不支持；Redis4.0主从集群都支持。事务中不支持的命令: SCRIPT *、INFO、SLOWLOG、LATENCY、EVAL、FLUSHALL、SCAN、AUTH、EVALSHA、DBSIZE、CONFIG、FLUSHDB、RANDOMKEY、PING

ZUNIONSTORE/ZINTERSTORE命令，参数为destination numkeys key [key ...] [WEIGHTS weight] [SUM|MIN|MAX]
1.	指定的所有key和destination 必须要要同属于一个槽，否则会(error) ERR CROSSSLOT Keys in request don't hash to the same slot错误

## 4.0新增支持的命令

Key(键)|Hash(哈希表)|SortedSet（有序集合）|Server（服务器）|Scripting(脚本)|HyperLogLog（HLL）|Geo(地理位置)
:--:|:--:|:--:|:--:|:--:|:--:|:--:
OBJECT|	HSTRLEN	|ZREVRANGEBYLEX	|DBSIZE|	EVAL|	PFADD|	GEOADD
TOUCH|		|	|RANDOMKEY|	EVALSHA|	PFCOUNT	|GEORADIUS
UNLINK|		|	|MEMORY|	SCRIPT EXISTS|	PFMERGE	|GEORADIUSBYMEMBER
BITOP|		|	|LATENCY|	SCRIPT FLUSH|	|	GEOHASH
MOVE|		|	|	|SCRIPT KILL	|	|GEOPOS
|	|	|	|	|SCRIPT LOAD|		|GEODIST

latency:  集群版的模式下，可以指定shardId。用来获取指定分片的数据，默认返回分片0的数据。
1.	latency支持的子命令有：[LATEST] [DOCTOR] [ HISTORY event-name] [RESET [event-name … event-name]] [GRAPH event-name] 
2.	在集群版模式下，例如：latency latest 1，来查看1号分片的最近一次的延迟时间信息。不指定shardId则默认为0号分片
MEMORY命令，支持help，doctor，stats，purge，malloc-stats这几个子命令，支持指定shardId
1.	memory stats 1，表示查看1号分片的内存统计信息，不指定则默认0号分片


   
## 暂未开放的命令

Key(键)|List（列表）|Server（服务器）|Pub/Sub（发布/订阅）|Geo(地理位置)|Cluster(集群)|Connection(连接)
:--:|:--:|:--:|:--:|:--:|:--:|:--:
RANDOMKEY|BLPOP|TIME|PSUBSCRIBE|GEOADD|READWRITE|SWAPDB
MIGRATE|BRPOP|MONITOR|PUBLISH	|GEOHASH|READONLY|
WAIT|BRPOPLPUSH|BGREWRITEAOF|PUBSUB|GEOPOS|CLUSTER *|
| ||BGSAVE|PUNSUBSCRIBE|GEODIST		|
| ||CONFIG SET|SUBSCRIBE|GEORADIUS		
| ||COMMAND|UNSUBSCRIBE|GEORADIUSBYMEMBER		
|	||DEBUG OBJECT|		|		
|	||DBSIZE| 				|
|	||DEBUG	|			|
|	||DEBUG SEGFAULT|	|			
|	||SAVE|				
|	||LASTSAVE|				
|	||SHUTDOWN|				
|	||SLAVEOF	|			
|	||SYNC	|			
|	||PSYNC	|			
|	||ROLE	|			



