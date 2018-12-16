# 准备本地域

首先需要完成对本地域完成几个先决条件步骤。

## 配置本地防火墙

必须配置内部防火墙，以便为包含京东云目录服务的 VPC 所使用的所有子网，面向 CIDR 打开以下端口。在本教程中，我们在以下端口上允许来自 10.0.0.0/16（目录服务的VPC的CIDR数据块）的传入和传出流量：

- TCP/UDP 53 - DNS
- TCP/UDP 88 - Kerberos 身份验证
- TCP/UDP 389 - LDAP
- TCP 445 - SMB

注意

这些是将 VPC 连接到本地目录所需的最少端口。根据您的特定配置，您可能需要打开其他端口。

## 确保已启用 Kerberos 预身份验证

这两个目录中的用户账户必须启用 Kerberos 预身份验证。这是默认值，但让我们检查任何随机用户的属性以确保无任何更改。

**查看用户 Kerberos 设置**

1. 在本地域控制器上，打开服务器管理器。

2. 在 **Tools** 菜单上，选择 **Active Directory Users and Computers**。

3. 选择 **Users** 文件夹并打开上下文（右键单击）菜单。选择右窗格中列出的任何随机用户账户。选择 **Properties**.

4. 选择 **Account** 选项卡。在 **Account options** 列表中，向下滚动并确保*未* 选中 **Do not require Kerberos preauthentication**。

![1](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Local-AD-Prepartion-1.png)

## 为本地域配置 DNS 条件转发服务器

必须在每个域中都设置 DNS 条件转发服务器。对本地域执行此操作之前，首先要获取有关目录服务详情的一些信息。

**在本地域中配置条件转发服务器**

1. 登录管理控制台，选择目录服务界面。

2. 在列表中选择要做信任的目录ID。

3. 在**详细信息**页面上，记下您的目录的**目录名称**和 **DNS 地址**中的值。

4. 现在返回到本地域控制器。打开服务器管理器。

5. 在 **Tools** 菜单上，选择 **DNS**。

6. 在控制台树中，展开为其设置信任的域的 DNS 服务器。我们的服务器是 [WIN-5V70CN7VJ0.corp.example.com](http://win-5v70cn7vj0.corp.example.com/)。

7. 在控制台树中，选择 **Conditional Forwarders**。

8. 在 **Action** 菜单上，选择 **New conditional forwarder**。

9. 在 **DNS domain (DNS 域)** 中，键入前面记下的目录服务的完全限定域名 (FQDN)。在此示例中，FQDN 是 [MyManagedAD.example.com](http://mymanagedad.example.com/)。

10. 选择 **IP addresses of the master servers (主服务器的 IP 地址)**，然后键入前面记下的京东云目录服务的 DNS 地址。在此示例中，这些是：10.0.10.246、10.0.20.121

    输入 DNS 地址之后，可能遇到“超时”或“无法解析”错误。通常可以忽略这些错误。

![2](https://github.com/jdcloudcom/cn/blob/joytaobao-ad-20181122/image/DirectoryService/Local-AD-Prepartion-2.png)

11. 选择 **Store this conditional forwarder in Active Directory, and replicate it as follows**。

12. 选择 **All DNS servers in this domain**，然后选择 **OK**。
