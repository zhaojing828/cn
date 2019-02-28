## FAQ

**Q：jdcloud-codedeploy.yml中的hooks是否支持执行命令？**

A：hooks需要填写的location项为脚本所在的位置，而非执行脚本的命令本身，因此，请避免出现 /home/app/control start这样的操作命令。

**Q：如何处理上一次部署任务的缓存呢？**

A：若本次部署成功，那么上次部署任务的缓存将成为备份；若本次部署失败，那么本次缓存将被删除。
