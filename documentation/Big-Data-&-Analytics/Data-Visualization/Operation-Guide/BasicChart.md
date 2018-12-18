#### 3 基础图表组件配置

目前大屏提供：折线图、柱图、条形图、饼图、气泡图、散点图、水位图、仪表盘等29个统计类基础图表。

些图表在样式和数据配置上具有相似性。基本上均包括三大类设置：
全局字体及图表位置设置、坐标轴设置（X轴/Y轴/极轴）、数据系列设置及图例设置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/d703ad879e5a5b4d939078caecbac8b4.png)


##### 3.1 柱、折、箱线图

柱图、折线图以及箱线图（K线图）都采用直角坐标系。在样式设置上都包括X轴设置、Y轴设置、多系列数据设置及图表上装饰部分的样式设置。在数据绑定上也是通过(X
,Y,S) 三个变量绑定到图表上，其中X表示X轴数值，Y表示Y轴数值，S表示数据系列值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/95906102ac9c00942c9ebbf37994d14e.png)


柱折箱线图属于复合图形，它具备两个Y轴，其中折线和箱线共用一个Y轴。在样式设置和数据设置上都具备代表性，其他图表的样式设置您可以参照柱折箱线图。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e1dd4f6f71b9241e709e72ec04c208cd.png)


###### 3.1.1 柱折箱线图-全局样式

全局样式：全局字体的默认样式、以及基础图表相对于容器边框的位置

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e9056e0fe1d433d6c6245ac437e51397.png)


###### 3.1.2 柱折箱线图-X轴

主要包括：坐标、轴线、刻度线以及网格线的样式设置

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/017a51b20cb537fcacfef98b0960cf85.png)


###### 3.1.3 柱折箱线图-Y折线轴

在K线图是一个双轴图表。其中Y轴(折线)为左侧坐标轴。K线以及折线公用这个坐标轴。Y轴样式设置与X轴线一致,都包括坐标、轴线、刻度线以及网格线的样式设置，此外Y折线轴还允许用户设置最大刻度及最小刻度。用户可以通过修改刻度最值，控制折现与柱图的相对位置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2e06e3f55c9a4fb64181fbc2cb82c7fa.png)


###### 3.1.4 柱折箱线图-Y柱轴

Y轴(柱图)为右侧坐标轴配置属性与Y折线设置一致。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/7fcd785501f0abc39f10063785fc03e4.png)


###### 3.1.5 柱折箱线图-图例

在多系列（多种业务数据）数据展示时，需要使用图例来区分业务。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/85c2e14c7c1b4202da9c41dca5e1d464.png)


###### 3.1.6 柱折箱线图-数据标签

数据标签用于显示图形数值。当用户勾选显示数据标签后，柱图显示业务数据。如下图所示：

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/80a0b7c7302669c047a9766314370716.png)


###### 3.1.7 柱折箱线图-数据系列

数据系列是数据在组件的具体展示内容。用户可以通过添加和删除选项控制图表需要显示的业务数据。

例如：下图中展示了稻谷、小麦、玉米三种业务数据。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/6d9e6aa43693a915cef5d51f97aeccc0.png)


新增数据系列：对于每一个数据系列都可以绑定K线图（箱线）、折现、柱图
三种数据。当用户点击增加数据系列按钮后，系统默认顺序增加一个数据系列的配置项，例如当前图表已经存在3个数据系列后，新增的数据系类值，默认为4。只有当用户配置的数据中存在系列值为4的业务数据时，图表才能显示该业务数据，否则不显示。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e2670305307a4cb7f2dfe0ef823ba8c8.png)


数据系列与数据绑定：用户通过与数据一致的系类值，将数据映射到图表中。如果用户设置的系列值与数据不一致，那么图表将不会显示该数据。同理，如果数据没有在系列中维护，那么图表也不会显示该数据。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2e12b5eace9739124ec8dbb6df0a2d63.png)


图表数据样式设置：用户可以选择是否显示柱图、折线、K线(箱线)，并且对图表的样式细节进行设置，例如：修改柱图的粗细，颜色等。下图为仅显示折线和柱图的效果。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b6ea92259d9375988bffdf0083500dc5.png)


###### 3.1.8 柱折箱线图-图表尺寸和位置

用户可以通过拖拽和缩放的方式控制图表在画布种的大小和位置。用户也可以通过录入数值来精确的改变图表的大小和位置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/648098390e740aa8ff4c9e519ed6dad8.png)


###### 3.1.9 柱折箱线图-数据源设置

系统支持BDP平台数据计算服务、RDS云数据库，API、Json
4种数据源（在大屏独立部署版本还支持JDBC方式访问本地关系型数据库，如：mysql,postgresql,oracle
及达蒙等）。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2053c7923f6ce31af037268241810562.png)


SQL及API情况下，支持数据定时查询：用户维护数据刷新频率,组件数据自动更新。

数据设置的目的是将图表的属性与数据进行映射。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/632a3e3ab7b0c1970d24e70cfb830a98.png)


##### 3.2 饼图/指标占比图

当您需要指标占比类数据表现时，您可以选择水位图、圆环图、指标图、饼图及仪表盘。这几类图形都存在丰富的图形表现能力，除了数据表现外还叠加了装饰组件。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/c82e0f81d8a4b01d8b87ec841de237f4.png)


###### 3.2.1 水位图

水位图样式设计包括外框装饰及数据区。目前系统支持5种边框。您可以通过修改外边框的形状、颜色、宽度等属性从而达到不同的视觉效果。数据区主要包括文本和水波纹样式设置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b3eb0085dbb117aad1f53a7bdcb8cf9e.png)


水位图仅需要您绑定一个变量，系统自动将该值转换为百分比且对末尾进行四舍五入取整。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/bcec775e09ab48672b176c911ef16a2d.png)


###### 3.2.2 百分比条形图

百分比条形图样式设计包括外框装饰、指示线、数据区。您可以在外框样式中修改数据条的颜色及其背景色。指示线用于标记数据，您可以修改每一段线段的长度及线段间的圆滑度。数据系列样式中，您可以为每一条数据设置圆环的内外半径。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2ef2c862b61f41db5fadff435f6234b7.png)


百分比条形图需要您绑定3个变量（X，Y，S），其中X为每一个数据条的业务指标，Y为对应的指标值，S用于您将数据绑定到数据系列中。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a56fdafc32e4ac65fd8351f6540b03dd.png)


###### 3.2.3 指标占比图

指标占比图的样式设计包括外框装饰和数据区。您可以在外框样式中修改颜色宽度以及外框的起止角度。在数据区，您可以修改数据条的颜色以及数据指标的字体、颜色等。在创作大屏过程中您还可以将多个指标占比图拼成圆环图。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/f257135572e0a830d7cc391bb9172402.png)


指标占比图您只需要绑定指标值（Y）。如果您还需要设置业务指标名称，那么您可以在样式中设置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/20593e6699f3c0f60e2ae2286095882c.png)


###### 3.2.4 百分比拼图

百分比饼图属于基本饼图，您可以设置数据指标的名称、颜色等。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5a45edf69b3d372912db6d2c9d91dc76.png)


百分比饼图的数据绑定需要您设置（X，Y）,其中X为指标名称，Y为指标值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/53b5c35905df5d0eb898ca8e98ef7898.png)


###### 3.2.5 仪表盘

仪表盘是特殊的占比图。它以绝对数值的方式展示数据。在仪表盘样式配置中分为两部分盘面的样式及数据区的设置。其中盘面的设置包括：边框、刻度线、分割线以及指针。数据区的设置主要包括：指标及指标值的字体、颜色、位置等。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e22d396a17b256df71aae04c1fb368ff.png)


仪表盘的数据设置包括两个值（name,value），其中name 为指标项，value为指标值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/0ab9fc0a7a705ce8616216eca8177ce4.png)


##### 3.3 雷达图

雷达图在样式上支持圆型雷达图和折线雷达图。在样式设置上包括：极轴设置、雷达图样式、数据标签样式及数据系列样式。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/db4f588fcff74a1611c17a5607f4d66b.png)


在雷达图的极轴中，您可以调节每个轴的最大刻度值。如果您没有维护最大刻度，那么系统将会根据数据的最大值设置轴的最大刻度。此外，您还可以调节轴线的颜色、粗细，刻度值的字体等。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/408da87d1906473454bbbd136c330f3d.png)


雷达图的样式设置主要是对分割线及分割区域的设置。您可以通过调节极轴的刻度数来调节分割线及分割区域的数量。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e0aa47ccb0807a30d0e4b30872997ed4.png)


数据标签和数据系列是业务数据在雷达图上的表现。您可以调整数据区的边线、填充去颜色、标签字段等属性。雷达图也支持多系列数据展示，您可以在数据系列中增加多种业务项。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/44dcf22dbee25f4eae1a90cddeacbae3.png)


您需要绑定数据系列（S）及统计维度，S是您需要描述的数据系列。指标项是数据系列的统计维度。其中S是一个保留字，您必须在绑定的数据中以固定字符S标记。系统在读取数据时，会将S作为业务描述（系列名称），其他列数据作为统计维度。此外，雷达图还支持统计维度重命名功能。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/78840f3dc63fd57d8ca244b05db6aa35.png)


##### 3.4 榜单/列表图

系统提供两种类型的榜单，单指标榜单和多指标榜单。单指标榜单只有序号列和数据列，多指标榜单允许用户添加任意数量的指标。单指标榜单中指标与指标值以折行的方式在一列中显示。多指标榜单每一列表示一种数据指标。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/906db7306fd1a2009ddc95449dde1339.png)


在样式设置中两类榜单均包括：全局样式、边框样式、表头样式设置、行样式设置、序号列样式设置、以及数据列样式设置。

您可以在全局设置中设置榜单的字体、榜单显示行数及滚动动画。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/6449b5918c93f988705b25bf88295478.png)


边框和表头都是可选项，您可以通过显示框来控制。您可以修改外边框的线条颜色、宽度，还可以表头的字体。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/399570c612d154bcdc89cf3736be9158.png)


行配置主要对每一行的背景色、分割线进行配置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/58874c01eb7a0565dace5db51126472f.png)


序号列和数据列配置基本相同，两者都包括列宽和字体的设置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5e8bdb72d74e3c330273cc01c9ca5c79.png)


您需要将数据以列表的格式上传。在榜单中列的顺序与您上传的数据一致。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/45bbed7260816cf12128657e1ac01b4c.png)


##### 3.5 日期热力图

日期热力图是在直角坐标系绘制的热力图，其中X/Y轴的数据可以是任意的类目。

热力图样式设置包括：全局设置、X/Y轴及数据区设置。其中全局设置、X/Y轴的配置项与基础图表一致。在数据区设置中，您需要将指标值与组件的颜色进行映射。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/64e68dee5c97efd74f14cbc780995aeb.png)


在热力图数据配置中，您需要为每一个数据块提供(X,Y,VALUE),其中X,Y
轴是业务数据在直角坐标系的位置，Value表示业务数据的热力值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b80eb123dd37b606b8f4e1c66dd7b707.png)

