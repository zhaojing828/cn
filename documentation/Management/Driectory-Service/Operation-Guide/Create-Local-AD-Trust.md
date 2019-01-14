### 本地目录信任关系操作

1.打开服务器管理器，然后在 **Tools** 菜单上，选择 **Active Directory Domains and Trusts**。

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-1.png)

2.打开域的上下文 (右键单击) 菜单，选择 **Properties**。
![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-2.png)

3.选择 **Trusts** 选项卡，然后选择 **New trust**。键入京东云目录服务的名称，然后选择 **Next** (下一步)。
![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-3.png)

4.选择 **Forest trust**。选择 **Next**。

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-4.png)

5.选择 **Two-way**。选择 **Next**。

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-5.png)

6.选择 **This domain only**。选择 **Next**。

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-6.png)

7.选择 **Forest-wide authentication**。选择 **Next**。

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-7.png)

8.键入 **Trust password**。请务必记住此密码，因为在为目录服务设置信任时会需要它。

![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-8.png)

9.在下一个对话框中，确认设置，然后选择 **Next**。确认已成功创建信任，再次选择 **Next**。
![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-9-1.png)![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-9-2.png)

10.选择 **No, do not confirm the outgoing trust**。选择 **Next**。
![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-10.png)

11.选择 **No, do not confirm the incoming trust**。选择 **Next**。
![img](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Create-Local-AD-Trust-11.png)