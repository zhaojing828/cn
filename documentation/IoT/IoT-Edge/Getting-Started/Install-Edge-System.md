# 安装Edge系统

Edge系统需要您手动在边缘节点上进行安装和配置。

## 前提条件

- 已经完成新建边缘节点的操作，并下载好配置文件和Edge系统安装包。

  - 如未创建边缘节点，请登录 [物联网智能边缘计算控制台](<https://iot-console.jdcloud.com/iotedge>) 创建边缘节点
  - 如未下载或丢失配置文件及Edge系统安装包，请进入 [Edge详情]() 重新下载。

- 已经开通对象存储业务，并创建好一个用于存储Edge数据的Bucket。如未开通，请先进入[对象存储](https://oss-console.jdcloud.com/)控制台申请开通服务。

  

## 操作步骤
1. 进入Ubuntu系统，打开terminal。

    

2. 解压缩Edge安装包

    ```
    sudo tar zxvf jdc-edge-install.tar.gz –C /opt
    ```

3. 编辑之前下载好的配置文件

    ```
    [Edge]
    Edgename = ''
    Region = ''
    HubHost = ''
    ComposefileUrl = ''
    [UserConfig]
    AK = ''
    SK = ''
    OSSRegion = ''
    OSSBucket = ''
    ```

    其中：

    [Edge]部分在创建Edge时，由系统自动生成。**请勿编辑修改！**

    [UserConfig]部分需要您填写。

    - AK/SK ： 请登录[京东云控制台](https://console.jdcloud.com/)，点击右上角账户，如下图所示，点击Access Key管理

    

    ​	进入Access Key 管理页面，

    

    ​	将该页面中的AK,SK填入配置文件对应项目中。

    - OSS部分，请进入[对象存储](https://oss-console.jdcloud.com/)页面，点击左侧空间管理

      

      点击空间名称，进入空间详情

    ​       

    ​       将上图红框所示内容填入配置文件对应项目中。

4. 将编辑好的配置文件拷贝至Edge安装包解压后的路径下

5. 执行安装脚本，完成Edge系统安装。

    ```
    sudo ./intall.sh
    ```

    

## 相关参考

- [导入数据](Import-Data.md)

