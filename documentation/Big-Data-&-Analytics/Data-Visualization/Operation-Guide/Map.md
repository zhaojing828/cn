#### 4. 地图组件配置

目前大屏支持：3D边界地图（中国/世界）、2D边界地图（中国/世界）、2D/3D GIS地图
。共6种类型地图。其中边界地图可以下钻到区县级。GIS地图可以到街道界级。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/0c852ad8a6c245cb666d8b49ae507f0e.png)


每种地图组件都支持多图层数据叠加，您可以在同一份地图上叠加飞线、3D柱图、气泡，轨迹、热力效果。此外每一种数据展示方式都支持多系列业务数据。例如您可以通过散点图的颜色、形状来表示不同类型的农作物种类。

##### 4.1 3D边界地图（中国/世界）

3D地图类组件配置包括：全局设置、区域设置、数据图层设置（散点、3D柱图、飞线、热力）、光线特效设计、图表尺寸和位置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/40e68e274f2360952dc2cb32d0c148ef.png)


###### 4.1.1 3D边界地图-全局样式设置

地图类组件的全局设置主要包括：地图区域设置（例如：选择某个省）、默认地图区块颜色，地图中心点、地图缩放等级。在3D是情况下还包括地图的上下倾斜角度和左右旋转角度。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a73e615eaf695e368e5280cb443ba50e.png)


###### 4.1.2 3D边界地图-区域样式设置

您可以对地图的每个区域特别设置颜色等。您即可以通过颜色表示您重点关注的地区，也可以通过配置颜色等达到个性化的视觉效果。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/9556a61274f0b51ff89fcd395c11d457.png)


###### 4.1.3 3D边界地图-散点层样式设置

散点层支持多系列的数据绑定，数据系列的配置方法与基础图表数据系列配置方式一致。

您可以在散点层中设置散点形状，并通过散点类型来区分业务数据。目前系统支持：三角、原型、针形等共7种形状。

在散点层中通过设置文本标注，您可以将数据映射到散点层。您还可以通过JS编程方式自定义您的标注。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/97b637e48005aed910e0ab4547b673a4.png)


###### 4.1.4 3D边界地图-柱图层样式设置

柱图层支持多系列的数据绑定，数据系列的配置方法与基础图表数据系列配置方式一致。

您可以个性化的设置每个数据系列中柱子的形状，包括：粗细、颜色、倒角圆润度。和散点层一样，您可以通过柱子的形状、颜色来表示不同的业务含义。

在柱图层中，您也可以像散点层一样设置文本标注 。

在柱图层中，您还可以开启数据映射功能，一旦开启该功能，您不仅可以通过柱子高度表示数据大小还可以通过颜色来表示。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/053ceb938f0ef6a96826443869791d7d.png)


###### 4.1.5 3D边界地图-飞线层样式设置

飞线层支持多系列的数据绑定，数据系列的配置方法与基础图表数据系列配置方式一致。

您可以个性化的设置每个数据系列中飞线的形状，包括：飞线宽度、颜色、飞线尾迹特效。和散点层一样，您可以通过这些属性来表示不同的业务含义。

在飞线层中，您还可开启光线叠加效果，此时叠加的数据越多，飞线亮度越高。

在飞线层中，您仍然可以开启数据映射功能，一旦开启该功能，您可以通过颜色来表示飞线所表示的业务数据。例如：您可以通过颜色来表示北京发往上海的交易量大小。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/dc40454ea737d1eb49d1b2498a9e5aae.png)


###### 4.1.6 3D边界地图-区域热力层样式设置

区域热力仅支持单个数据系列，您可以设置数据与颜色的映射关系。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/859c422b1d040c12b255aa2f4b2d379b.png)


###### 4.1.7 3D边界地图-光线和后期特效叠加

您可以通过光影设置达到更炫酷的展示效果。您可以调节主光源、环境光、高光、景深等特效。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/819b235d2a66db0073409e42b3ac17a4.png)


下图为光源特效的对比图：左测为开启光源的效果，右侧为关闭的效果。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/7555d4bde7e4e9094c40999ae4cab325.png)


###### 4.1.8 3D地图数据设置

地图中每一种数据图层都需要单独绑定数据。系统支持的数据源类型与基础统计图表一致,包括：Json文件、API及关系型数据库。

在散点层的数据绑定时，您需要为每一个数据设置（name,lon,lat.s）4个值。name
用于表示散点的业务名称、lon/lat是数据的经纬度、S用于区分不同的数据系列。其中name
和S字段为可选字段。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a7a6407c7424291280ee2cced7413558.png)


在柱图层的数据绑定时，您需要为每一个数据设置（lon,lat,name,value,s）5个值。lon/lat是数据的经纬度、name是业务数据的名称，value用于将柱子的高度映射为业务数值、S用于区分不同的数据系列。其中name
和S字段为可选字段。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/1c4cf25008724f938758d8d731345146.png)


在飞线层的数据绑定时，您需要为每一个数据设置（from,to,value,s）4个值。From/to
是飞线的起止点,起止点需要您再通过lon/lat绑定、value用于将飞线的颜色映射为业务数值、S用于区分不同的数据系列。其中value
和S字段为可选字段。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b92e40055d47b6411a7af2fc2fd827f3.png)


在热力层的数据绑定时，您需要为每一个数据设置（name,value）2个值。与其他数据图层设置不同，热力层需要您绑定地图区域名称例如北京市、河北省，value用于将飞线的颜色映射为业务数值、S用于区分不同的数据系列。其中value
和S字段为可选字段。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/baedf6313a387eda4b9f335cb99c2169.png)


##### 4.2 2D边界地图（中国/世界）

2D地图类组件配置包括：全局设置、区域设置、数据图层设置（涟漪层、飞线层、区域热力层、点热力层）及图表尺寸和位置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a6e1777695446b8fd260696755f8dd19.png)


###### 4.2.1 2D边界地图-全局样式设置

2D地图的全局设置用于确认地图的区域（例如某个省份、城市地图）、边界线样式、默认区域颜色及区域标签。此外您还通过拖拽的方式调整地图的大小和位置，也可以通过修改地图中心及地图缩放等级精确调整。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b6aefc5bc52208c6835b3dbbe536a731.png)


###### 4.2.2  2D边界地图-交互样式设置

交互样式仅当您在交互设置中启动了地图下钻交互才能生效。交互样式用于设置地图区域被选中时的颜色。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/ef6e611498ae8920291cc3653df62fcc.png)


###### 4.2.3 2D边界地图-区域样式设置

区域设置用于您个性化设置地图的样式。您可以设置区域的颜色、区域边界的颜色及边界宽度。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/809d9b5d90a235758047737225477720.png)


###### 4.2.4 2D边界地图-涟漪层样式

数据涟漪层具有丰富的表现形式。你可以设置涟漪的形状（例如圆形、方形、三角等共7种）、绘制方式（填充、边线）、涟漪颜色、波纹大小及波纹动画等。下图为通过调整涟漪形状、绘制方式、颜色
属性后的效果。

此外涟漪层支持多系列的数据展示。您可以在同一张地图上展示多个业务指标

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/ec47d4f6fc8d4fe2dc77b605f4d855eb.png)


###### 4.2.5 2D边界地图-飞线层样式

飞线层多用于表示业务数据的流向。您可以调整每一根飞线的起止标、飞线颜色/宽度
及尾迹特效。

数据飞线层也支持多系列的数据展示。您可以在同一张地图上展示多个业务的流向。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/7d5512108b27900872f52c0c39af230f.png)



###### 4.2.6 2D边界地图-区域热力样式

您可以在区域热力层上将地图颜色与业务数据进行映射。区域热力层仅支持单系列的数据展示。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/9906bf888b405dad754c76e4860ce6ff.png)



###### 4.2.7 2D边界地图-点热力层样式

您可以在点热力层上将地图颜色与业务数据进行映射。与区域热力层不同，点热力不受限于地图区域边界，仅取决于所绑定数据的经纬度。

在点热力层中，您可以通过调整热力点的模糊半径和热力半径从而更精细的表示业务数据。点热力层支持多单系列的数据展示，您可以通过颜色来区分不同的业务数据。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/32e43dee6505e802eb617335a0b5175b.png)



###### 4.2.8 2D边界地图-数据设置

在涟漪层的数据设置中，您需要设置（lon,lat,value,s,name），其中lon,lat是业务数据的经纬度，value
是业务数据的指标值（例如：100笔订单），Name字段是业务名称标记，S是业务数据类型。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e5db4d4711f36d9afa4ba448dd4e1bec.png)



在飞线层的数据设置中，您需要设置（from,to,value,s），其中from/to是业务数据流向的起止点（此外您还需要设置起止点经纬度），value
可以用于表示该流向的数据指标（例如：北京发往上海的物流量），S是业务数据类型。S与Value
都为可选值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/db4d904ba8066c13bffb98812c61d91d.png)



在区域热力的数据设置中，您需要设置（name,value,s）,其中name字段是业务数据区域名称（例如：北京市）,value
是业务数据的热度值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2f2ade52e6dded29812942cf96705d92.png)



在点热力的数据设置，您需要设置为每一个数据的（lon,lat,value,s）,其中lon,lat是业务数据的经纬度,value
是业务数据的热度值，S是业务数据类型。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/de424d7616e68c58e66f27bf602afe5c.png)



##### 4.3 2D/3D边界地图-交互设置

2D/3D边界地图均支持下钻，您在交互设置中点击开启按钮，那么预览/发布状态下的地图将会实现下钻功能。此外您还可以个性化设置下钻后地图的中心点、缩放等级。如下示例中：左测为地图下钻前数据大屏，右侧为点击某个区域后的数据大屏。

在2D/3D边界地图下钻事件中，您可以通过点击鼠标逐级下钻地图（最小下钻粒度为区县级）；如果您需要返回上一层，点击地图区域的空白区就可以返回。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/de7fcd3bc3d64c8b12f4ee149ba20b45.png)



![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5f9ab4d2703fe2243a55172d71aadd2f.png)


如果您希望地图下钻后其他图表能随之联动，那么您需要将图表中的区域设置为变量，并将其他图表的SQL与这个变量进行绑定。例如：在下图中，如果您希望地图下钻后右侧折线图数据随之联动。那么您需要在折线图SQL中绑定地图区域变量area。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/37cb4b90956177849834ab00e8f0b24f.png)
