![24.png](https://cdn.nlark.com/yuque/0/2023/png/26242735/1686721742667-c75d3b5e-5381-480f-a032-bcf31c92c773.png#averageHue=%23d1a56e&clientId=ued660751-61d6-4&from=ui&id=u556bab50&originHeight=312&originWidth=937&originalType=binary&ratio=1.100000023841858&rotation=0&showTitle=false&size=124239&status=done&style=none&taskId=ueec3b974-e965-4717-a690-cf4380f9974&title=)
<a name="uQiaU"></a>
## 今日话题
> 基于 Spring Boot 实现增删改查，并且使用mysql数据库来实现
> 作者：云层上的光
> 时间：2024年6月21日 16时36分14秒

<a name="Zv0N4"></a>
## 主线任务
<a name="U8SkG"></a>
### 一、项目创建
1、点击 “新建项目”，创建项目用来演示 Spring Boot 实现增删改查<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718864746730-61ebbecf-77be-4662-be61-aecc74b8b14d.png#averageHue=%232b2d31&clientId=u38b14b83-c18c-4&from=paste&height=270&id=u029d78c1&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=212641&status=done&style=stroke&taskId=u5fa9ebd9-528c-4653-ad9a-3adc01d748d&title=&width=480)<br />2、填写项目配置：[详细版见：](https://www.yuque.com/chuxin-cs/spring-boot-demo/dx1zlnxducmrtgih#ltUnP)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718958991409-a423a5e1-eddc-44ea-9327-224311fd17b8.png#averageHue=%232a2d32&clientId=u5db81225-2db5-4&from=paste&height=270&id=LDqYh&originHeight=1079&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=340886&status=done&style=stroke&taskId=uba6c61a1-4dc7-452d-8c97-a7a803701e5&title=&width=478)<br />3、选择 3.1.1 项目版本作为演示，[详细见 支线任务一](#Sx7tJ)：
> 1. Lombok
> 2. Spring Web 
> 3. MyBatis Framework
> 4. MySQL Driver

![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718959159890-cd7f848e-03c5-4593-9ce2-90e094f195eb.png#averageHue=%232a2d31&clientId=ufd590516-d25e-4&from=paste&height=270&id=u1ff748e2&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=334565&status=done&style=stroke&taskId=u1e91e536-f33a-43af-a388-8dbd31cedb0&title=&width=480)<br />mysql 相关依赖选择<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718959184394-754ecb77-8a1c-44e8-9826-f01004f07e35.png#averageHue=%232a2d31&clientId=ufd590516-d25e-4&from=paste&height=270&id=uba5495f8&originHeight=1079&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=335118&status=done&style=stroke&taskId=ua6e81d2b-61d1-41e1-84d6-16388b160d5&title=&width=479)<br />4、使用 Maven 下载依赖，（详细版见：[https://www.yuque.com/chuxin-cs/spring-boot-demo/dx1zlnxducmrtgih#ltUnP](https://www.yuque.com/chuxin-cs/spring-boot-demo/dx1zlnxducmrtgih#ltUnP)）<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720487438271-a0eff66b-695c-4dd7-ad5d-7b5e20085254.png#averageHue=%23273142&clientId=u9245b177-209e-4&from=paste&height=270&id=ubfd6364f&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=318245&status=done&style=none&taskId=ue4ac32e9-28b1-464d-bfab-d01a49b2ad3&title=&width=479)<br />5、如果遇到依赖安装报错，[详细版见：支线任务二](#YkFHD)：<br />![](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718960324128-5346a6d2-95e5-48e1-b8fe-3ac58a1c98ff.png#averageHue=%232a2c30&from=url&height=270&id=y80f1&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=&width=479)
<a name="pAorP"></a>
### 二、实现 controller 增删改查方法
1、新建 controller 软件包、并且新建 UserController 文件类<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720487679160-263a8d17-c748-4da7-b1b1-66ed8c700bc7.png#averageHue=%2325282c&clientId=u21c818ba-79a4-4&from=paste&height=270&id=u572c585f&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=312689&status=done&style=stroke&taskId=u9670437a-53fd-4137-8cd5-c9edddc5ba0&title=&width=479)<br />2、编写“增删改查”方法<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720487888107-af172e0a-bda4-4d6b-9644-9a79b67b39a8.png#averageHue=%23222428&clientId=ub437a2f0-cec1-4&from=paste&height=270&id=ucdd6bae5&originHeight=1078&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=305903&status=done&style=stroke&taskId=ucaef34be-6891-405c-8cae-cb0ddd85ce6&title=&width=479)<br />3、代码如下：
```java
package com.chuxin.demotodolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    // 增加
    @PostMapping("/add")
    private String add() {
        return "add";
    }
    // 删除
    @PostMapping("/delete")
    public String delete() {
        return "delete";
    }
    // 修改
    @PostMapping("/edit")
    public String edit() {
        return "edit";
    }
    // 查看
    @GetMapping("/getList")
    public String getList() {
        return "getList";
    }
}
```
<a name="mrlUG"></a>
### 三、实现 entity 实体类
1、新建 entity 软件包<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720488036820-ef793710-2083-4324-9fbe-8a7f85911b70.png#averageHue=%2325282c&clientId=uc0f82ca0-ccf6-4&from=paste&height=270&id=udd059746&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=311246&status=done&style=stroke&taskId=u33e4967a-6fff-4a9e-b1e3-657f2fe8015&title=&width=480)<br />2、新建 User 实体类<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720488069751-e9d32687-a186-44d5-82d3-5af8f3bb6f37.png#averageHue=%2325272c&clientId=uc0f82ca0-ccf6-4&from=paste&height=269&id=uc853fa26&originHeight=1077&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=290420&status=done&style=stroke&taskId=u38bcf7a3-aca1-4bf1-a38b-e364f39dc55&title=&width=478)<br />3、User 首字母大写，然后选择“类”回车创建<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720488087749-e77d4612-2652-4ad2-9940-80d93427f498.png#averageHue=%23232529&clientId=uc0f82ca0-ccf6-4&from=paste&height=270&id=uc9c92c83&originHeight=1078&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=309876&status=done&style=stroke&taskId=u5f392bca-3f2c-4ec8-a558-0df990c58a2&title=&width=479)<br />4、在 demo-crud 中介绍了 [生成 Getter 和 Setter]() 这里采用 Lombok<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720488376961-ebe84833-f667-4371-81e2-ec558b1dde45.png#averageHue=%23222328&clientId=uc0f82ca0-ccf6-4&from=paste&height=270&id=u7f097b7d&originHeight=1078&originWidth=1910&originalType=binary&ratio=1&rotation=0&showTitle=false&size=258168&status=done&style=stroke&taskId=uc2502f26-dfaa-4ec7-8367-3a96362d8a0&title=&width=478)
<a name="KP7aU"></a>
### 四、Mysql 数据库设计
1、打开自己喜欢的数据库图形化工具，当前使用的是 [Navicat Premium](https://www.navicat.com.cn/products/)，[下载教程见](https://www.yuque.com/chuxin-cs/spring-boot-demo/wypgohgrkga0kwpp)：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720503736462-f0eff899-0443-4ff5-a459-9e7d30e6a39b.png#averageHue=%23043534&clientId=uda23c78e-af07-4&from=paste&height=270&id=ucb72e2d7&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=1252947&status=done&style=none&taskId=udd36cea4-d8d9-483a-9d07-dd06fc401ee&title=&width=479)<br />2、连接本地数据库<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720514302724-7580a614-d8fa-447f-8b95-54d441ddea17.png#averageHue=%23fbfbfb&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u6959d630&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=182311&status=done&style=stroke&taskId=u64205c77-eab4-4228-8ef8-adc71f33da2&title=&width=479)<br />3、选择 Mysql 进行连接<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720514339200-40fce1ce-2c4b-4e1b-a43f-cf0047197f2b.png#averageHue=%23fbfbfb&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=udb35970f&originHeight=1079&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=180468&status=done&style=stroke&taskId=ufece890e-2965-4e1d-bf16-e5afff41908&title=&width=479)<br />4、填写 Mysql 连接信息<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720515433333-29d52905-c45c-4bea-a798-964578318936.png#averageHue=%23f9f9f9&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u153e766e&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=215226&status=done&style=stroke&taskId=u45560497-5e21-4e51-9a45-19c7d3879c8&title=&width=480)<br />5、点击“连接测试”提示“连接成功”<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720515458585-b768da3b-848a-45ae-aa8a-4a80844cf9fa.png#averageHue=%23f9f9f9&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=uc684d1d6&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=221113&status=done&style=stroke&taskId=u6ccf3f67-d271-449f-9f87-84f8f3f4f70&title=&width=479)<br />6、点击 “确认”，进行本地 Mysql 进行连接<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720515487614-497c4633-958e-4e89-81b8-bf4b77f302b4.png#averageHue=%23f9f9f9&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u80df7053&originHeight=1077&originWidth=1910&originalType=binary&ratio=1&rotation=0&showTitle=false&size=211727&status=done&style=stroke&taskId=u59fc3b38-3b90-4685-8837-0797489701b&title=&width=478)<br />7、双击打开连接的本地数据库<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720515547287-5de2c978-f1b1-4ca9-b345-0f958f260565.png#averageHue=%23fbfbfb&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=ue6b1ab4c&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=184886&status=done&style=stroke&taskId=ue9b43298-a27e-4a48-a6a6-4d640a8f3ee&title=&width=479)<br />8、由于之前 go 在进行数据库操作时创建过，先删除 spring-boot-demo<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720517629365-edfb986d-4735-4a1e-a537-c5c28655dbf4.png#averageHue=%23fbfafa&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=uc653d1fc&originHeight=1078&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=200906&status=done&style=stroke&taskId=uc9f33300-0b84-4f03-a9ba-7997713a7b2&title=&width=479)<br />9、点击右键删除 “spring-boot-demo”<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720517692719-bfe8810d-932e-48a3-b615-769ee19c41fb.png#averageHue=%23fafafa&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u3a9fb30e&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=221536&status=done&style=stroke&taskId=u456f9a67-8aa2-4ea6-8b0c-218dccf389a&title=&width=480)<br />10、创建数据库<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720518009975-c1c97bdc-7bbd-4f6c-80cb-21b8be5b30c5.png#averageHue=%23fbfafa&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u8b11d0ab&originHeight=1080&originWidth=1920&originalType=binary&ratio=1&rotation=0&showTitle=false&size=203180&status=done&style=stroke&taskId=u0af63ecd-b082-4264-88c1-a0b446a6a0a&title=&width=480)<br />11、填写数据库信息，点击确认进行创建~<br />提示：（想了想这里按照项目名称来创建 ，此处创建 demo-todo-list，关于上面 spring-boot-demo 的删除操作多此一举了）
> 字符集：utf8mb4 -- UTF-8 Unicode
> 排序规则：utf8mb4_general_ci

![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720518346328-ef9843a9-ac67-44f4-ba36-b5939cc3f5d7.png#averageHue=%23f9f9f9&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u043003a7&originHeight=1078&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=216919&status=done&style=stroke&taskId=u09037abf-2b0c-4c88-be0d-ab2968331f0&title=&width=480)<br />12、双击打开创建的 demo-todo-list 数据库<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720518384440-0d92de2b-e5ac-4a6c-a549-7441868fd118.png#averageHue=%23fbfbfa&clientId=u0e97339f-fd1f-4&from=paste&height=269&id=ua662b418&originHeight=1076&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=200596&status=done&style=stroke&taskId=ua85c7b5c-ce9d-4293-8897-d9289b7870d&title=&width=478)<br />13、新建表<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720518428485-91441017-7057-45af-8b87-6588d085cdf3.png#averageHue=%23fbfafa&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u36713399&originHeight=1080&originWidth=1920&originalType=binary&ratio=1&rotation=0&showTitle=false&size=212013&status=done&style=stroke&taskId=u8e36f95c-3e81-47f7-9fc5-021dc258cdd&title=&width=480)<br />14、完成数据库设计（设计层面，先一切从简）<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720518664252-f11c928a-07ec-476a-9397-644c53998af3.png#averageHue=%23faf9f9&clientId=u0e97339f-fd1f-4&from=paste&height=269&id=udb01f869&originHeight=1077&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=225399&status=done&style=stroke&taskId=ua21b752c-d24c-4040-a694-b6d15664d6e&title=&width=478)<br />15、sys_user 表sql：
```sql
CREATE TABLE `sys_user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```
16、保存表，并且表名设计为  sys_user <br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720518726554-679917c5-7fd7-41a8-9acd-c21db2481125.png#averageHue=%23f9f8f8&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u23c6d363&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=238091&status=done&style=stroke&taskId=ud2c33f32-65f8-4f77-a9c2-59056e713c6&title=&width=480)<br />17、此时 sys_user 表就创建完成了<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720518757440-1b9da031-82a5-4591-9607-c492808f8a84.png#averageHue=%23fbfafa&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u0dca8a6f&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=202077&status=done&style=stroke&taskId=u2c96f45d-f772-4851-8215-8539d41d8a0&title=&width=479)
<a name="G2Y3R"></a>
### 五、Service 实现业务
1、新建 service 软件包<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720518952009-b7cca129-72d8-4504-8aed-a378c46049f2.png#averageHue=%23222428&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u18c3951b&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=255604&status=done&style=stroke&taskId=u92c6629d-0db8-4ee4-8587-afe7f7507e9&title=&width=479)<br />2、新建 UserService 选择“接口”进行创建<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720519014284-835003be-8e67-4a2f-b4fb-df7927a5af68.png#averageHue=%23222428&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u12bffe50&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=269385&status=done&style=stroke&taskId=u8df3cc44-73c4-49a2-a9db-6154dd68350&title=&width=480)<br />3、新建 impl 软件包<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720519094520-fb83c7b8-5d9f-41ec-9f27-3d89dff03a10.png#averageHue=%232b2d31&clientId=u0e97339f-fd1f-4&from=paste&height=269&id=uf9eae347&originHeight=1076&originWidth=1912&originalType=binary&ratio=1&rotation=0&showTitle=false&size=223180&status=done&style=stroke&taskId=u6a57f9df-4f8d-44b6-bef1-0fb5ce0632b&title=&width=478)<br />4、impl 包中新建 UserServiceImpl 类文件<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720519172899-dab0a944-ce35-4904-b72b-5b18a7edcef8.png#averageHue=%232b2d31&clientId=u0e97339f-fd1f-4&from=paste&height=270&id=u91db5924&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=228949&status=done&style=stroke&taskId=u667c0240-6edd-4138-9b66-4665b7b637e&title=&width=479)<br />5、此时文件路径如下：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720574728892-d7a52d6e-e256-467e-a545-f30dd099235e.png#averageHue=%23222428&clientId=u8508c9a7-e8b5-4&from=paste&height=269&id=ub15b4805&originHeight=1077&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=224617&status=done&style=stroke&taskId=ud6436605-10cb-4e0e-a060-4d2e556a196&title=&width=479)<br />6、编写 service/UserSerive 接口<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720575022416-f651dc5f-d594-41bb-b67a-fa504ae1a9ab.png#averageHue=%23222428&clientId=u8508c9a7-e8b5-4&from=paste&height=270&id=u75802cef&originHeight=1078&originWidth=1912&originalType=binary&ratio=1&rotation=0&showTitle=false&size=247136&status=done&style=stroke&taskId=ufcffd93c-0ae5-4c11-a35d-580ed3e99eb&title=&width=478)<br />代码如下：
```java
package com.chuxin.demotodolist.service;

public interface UserService {
    // 增加
    String add();
    // 删除
    String delete();
    // 修改
    String edit();
    // 查看
    String getList();
}
```
7、实现 service.impl.UserServiceImpl 业务代码<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720576225315-3e2dd862-b454-4e7b-9f92-f4bf60b57136.png#averageHue=%23222428&clientId=u8508c9a7-e8b5-4&from=paste&height=270&id=ufb1b14f7&originHeight=1079&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=266896&status=done&style=none&taskId=u1ea53f74-aeab-46f2-8dd7-57b69a4c426&title=&width=478)
<a name="Oc5nj"></a>
### 六、Mapper 层操作 mybatis
1、新建 mapper 软件包<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720589999198-e314650b-dedd-415f-8c8d-c59b77c26e62.png#averageHue=%232b2d31&clientId=u8508c9a7-e8b5-4&from=paste&height=270&id=u6fb19f48&originHeight=1078&originWidth=1912&originalType=binary&ratio=1&rotation=0&showTitle=false&size=224994&status=done&style=none&taskId=u28593a58-8fd3-4c80-9581-4acc163d619&title=&width=478)<br />2、新建 UserMapper 接口<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720590444934-dc4d993f-c311-480e-822a-d8c6c67f6822.png#averageHue=%232b2d31&clientId=u8508c9a7-e8b5-4&from=paste&height=269&id=ue33b69a3&originHeight=1076&originWidth=1911&originalType=binary&ratio=1&rotation=0&showTitle=false&size=227844&status=done&style=stroke&taskId=u0e63af8c-2d3d-4b1b-9b19-725994ff975&title=&width=478)<br />3、实现 UserMapper 增删改查<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720591187603-93e89af3-e7d1-4d71-a1e9-9533160921f8.png#averageHue=%23232529&clientId=u8508c9a7-e8b5-4&from=paste&height=270&id=u1cdf7356&originHeight=1078&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=279337&status=done&style=stroke&taskId=u28676282-60ea-4665-8642-31943090a12&title=&width=479)<br />代码如下：
```java
package com.chuxin.demotodolist.mapper;

import com.chuxin.demotodolist.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    // 增
    @Insert("insert into sys_user (name,password) values (#{name},#{password})")
    Integer add(User user);
    // 删
    @Delete("delete from sys_user where id=#{id}")
    Integer delete(Integer id);
    // 改   后期我才发现这里没有增加修改的条件 不过为了研究就先这样了
    @Update("update sys_user set name=#{name},password=#{password}")
    Integer edit(User user);
    // 查
    @Select("select * from sys_user")
    List<User> getList();
}

```
4、改造 `service/UserSerive` 接口文件<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720591494299-e379213b-93b7-44b1-a580-463e8b09c8bd.png#averageHue=%23232b3b&clientId=u8508c9a7-e8b5-4&from=paste&height=270&id=u8d27bbe0&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=334476&status=done&style=stroke&taskId=u3e1dc99a-e2b7-4fcb-8fc2-fa8454f9172&title=&width=480)<br />5、代码如下：
```java
package com.chuxin.demotodolist.service;

import com.chuxin.demotodolist.entity.User;

import java.util.List;

public interface UserService {

    // 增加
    Integer add(User user);

    // 删除
    Integer delete(Integer id);

    // 修改
    Integer edit(User user);

    // 查看
    List<User> getList();
}

```
6、改造 impl 包中新建 UserServiceImpl 类文件<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720591981638-20369933-e869-4b91-8a05-8ad2f18e3e07.png#averageHue=%23232529&clientId=u3cd86bcc-437d-4&from=paste&height=270&id=u01ded650&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=344175&status=done&style=none&taskId=u81b8d238-4ae5-4841-bbbe-4d7050d50f4&title=&width=480)<br />7、代码如下：
```java
package com.chuxin.demotodolist.service.impl;

import com.chuxin.demotodolist.entity.User;
import com.chuxin.demotodolist.mapper.UserMapper;
import com.chuxin.demotodolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    // 增加
    @Override
    public Integer add(User user) {
        return userMapper.add(user);
    }
    // 删除
    @Override
    public Integer delete(Integer id) {
        return userMapper.delete(id);
    }
    // 修改
    @Override
    public Integer edit(User user) {
        return userMapper.edit(user);
    }
    // 查看
    @Override
    public List<User> getList() {
        return userMapper.getList();
    }
}
```
8、改造 controller 下 UserController 文件类<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720593153785-1329e019-4f7e-44a3-b51b-cdf5af747baa.png#averageHue=%23222428&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=ubce88fe9&originHeight=1079&originWidth=1911&originalType=binary&ratio=1&rotation=0&showTitle=false&size=321064&status=done&style=stroke&taskId=u304f6f69-4f26-4760-995a-da250b372b4&title=&width=478)<br />代码如下：
```java
package com.chuxin.demotodolist.controller;

import com.chuxin.demotodolist.entity.User;
import com.chuxin.demotodolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    // 增加
    @PostMapping("/add")
    private Integer add(@RequestBody User user) {
        return userService.add(user);
    }
    // 删除
    @PostMapping("/delete")
    public Integer delete(@RequestBody Integer id) {
        return userService.delete(id);
    }
    // 修改
    @PostMapping("/edit")
    public Integer edit(@RequestBody User user) {
        return userService.edit(user);
    }
    // 查看
    @GetMapping("/getList")
    public List<User> getList() {
        return userService.getList();
    }
}

```
<a name="tK19S"></a>
### 七、项目启动~
1、启动项目<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720592171270-b0fd4c91-681f-43de-b1d7-f2c8a6b8f485.png#averageHue=%23222428&clientId=u3cd86bcc-437d-4&from=paste&height=270&id=uc3452de0&originHeight=1079&originWidth=1912&originalType=binary&ratio=1&rotation=0&showTitle=false&size=246512&status=done&style=stroke&taskId=u687c9e29-85fc-466b-b8a6-e237651cea1&title=&width=478)<br />2、提示 Lombok 相关操作，点击 “启动注解处理”<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720592120284-f86be98e-5117-4c4d-b447-5513e5a168e8.png#averageHue=%2323252a&clientId=u3cd86bcc-437d-4&from=paste&height=269&id=u4d1c940c&originHeight=1077&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=270465&status=done&style=stroke&taskId=ufdc3a399-5f09-446f-86af-36fae9bf73d&title=&width=478)<br />3、终端启动报错<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718962025350-a4f9ba8d-a4a6-426d-9d43-20b7657ade99.png#averageHue=%23222428&clientId=uc4d22a0c-b6b6-4&from=paste&height=269&id=ekYHn&originHeight=1078&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=272395&status=done&style=stroke&taskId=u00c1bae4-a1d9-4b09-9a6b-eebdec10e9a&title=&width=478)<br />4、将 application.properties 修改为 application.yaml 文件<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720592291028-8e2501a8-8210-4d05-bb90-d85413870425.png#averageHue=%23232429&clientId=u3cd86bcc-437d-4&from=paste&height=270&id=u1ce764bd&originHeight=1079&originWidth=1912&originalType=binary&ratio=1&rotation=0&showTitle=false&size=264168&status=done&style=stroke&taskId=u8eb81316-010f-4cbd-a516-e87684a7127&title=&width=478)<br />5、application.yaml 修改完成~<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720592330050-10fe8630-a485-4e8a-b23a-894b40827dbd.png#averageHue=%23232429&clientId=u3cd86bcc-437d-4&from=paste&height=270&id=u561060b7&originHeight=1079&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=262067&status=done&style=stroke&taskId=u33c58efe-409f-4716-9573-7ae40ec4885&title=&width=479)<br />6、为什么要修改为 yaml 文件，主要出于两个方面的原因：
> 当然两个文件用那个都是可以的，我觉得没有必要纠结，习惯那个用那个

- yaml 用的人比较多
- yaml 更加清晰，更好维护

7、解决办法，application.yaml 文件修改如下：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720592533668-6aabc725-0430-4ca2-9edc-624f3a31bbfe.png#averageHue=%23222428&clientId=u3cd86bcc-437d-4&from=paste&height=270&id=u9d476c82&originHeight=1079&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=264531&status=done&style=stroke&taskId=u1852c9bb-073f-46b1-80e7-67db6400cc9&title=&width=479)<br />代码如下：
```yaml
# spring config 配置
spring:
  # 当前项目名称
  application:
    name: demo-todo-list
  
  # 数据库相关操作
  datasource:
    # 数据库连接使用 jdbc
    driver-class-name: com.mysql.cj.jdbc.Driver
    # 连接地址
    url: jdbc:mysql://localhost:3306/demo-todo-list?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai
    # 用户名
    username: root
    # 密码
    password: 123456
```
8、再次启动，运行成功<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720592564554-b5df1003-0c8c-479e-8391-a647ef6900e8.png#averageHue=%2323262a&clientId=u3cd86bcc-437d-4&from=paste&height=270&id=ub9ce4718&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=346355&status=done&style=stroke&taskId=uf72a0900-8adc-4cf4-ad2f-dd3384c1943&title=&width=480)
<a name="W6RIt"></a>
### 八、接口测试
接口测试使用的 [Apifox](https://app.apifox.com/main/teams/2518475?tab=project) ，可以在线使用 Web 省去安装桌面端步骤<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720592736626-5832321b-6a51-4bd1-9a31-a23e1f255f7f.png#averageHue=%231a1c26&clientId=u3cd86bcc-437d-4&from=paste&height=270&id=u34c3ba76&originHeight=1079&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=210211&status=done&style=stroke&taskId=ud64cdfbc-728c-4e62-bee4-5929b671aef&title=&width=479)
<a name="nv0tS"></a>
#### 1、增加
1.1、点击发送，调用新增用户接口 [http://localhost:8080/user/add](http://localhost:8080/user/add)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720593461881-973cc221-a711-496f-b249-5db52ed31cc6.png#averageHue=%231a1c26&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=u32034863&originHeight=1077&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=250448&status=done&style=stroke&taskId=ueeaca15b-d176-4dfc-b1ce-f994f7af048&title=&width=478)<br />1.2、查看数据库，用户新增成功，但是插入数据失败<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720593552179-443b210c-1965-4d09-acb4-0f4799fbaec7.png#averageHue=%23fafafa&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=u6518fe9f&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=199804&status=done&style=stroke&taskId=ufe7cab2a-b3aa-4ff4-a6f6-0898f5be2f9&title=&width=480)<br />1.3、启动调试模式<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720593642729-d3b3ea12-5078-4ca9-97f0-66bd2789002d.png#averageHue=%2324272c&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=uab2aec7a&originHeight=1077&originWidth=1910&originalType=binary&ratio=1&rotation=0&showTitle=false&size=404849&status=done&style=stroke&taskId=u3527bedc-575b-4bdc-86a6-548c5bdc377&title=&width=478)<br />1.4、清除打印日志<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720593707840-2cc331ae-0225-421d-ae35-cac0d9c5f88d.png#averageHue=%2323262a&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=ubcf9e638&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=347874&status=done&style=stroke&taskId=u270a71a5-3525-4592-9c7a-b484e4692d2&title=&width=480)<br />1.5、添加断点<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720593874582-a0a3cbc0-0fde-4a66-9ae3-da81fc79da78.png#averageHue=%23222428&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=u5497dec6&originHeight=1075&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=300081&status=done&style=stroke&taskId=ub1ba86a0-c8aa-4be1-a816-3ffedf37d03&title=&width=479)<br />1.6、再次点击发送<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720593747817-afca4e58-c630-49dc-92a9-29f46d789040.png#averageHue=%231a1c26&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=u44fc4d9f&originHeight=1076&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=249879&status=done&style=stroke&taskId=u5af27dfd-d432-41ec-8ac2-57780e794a7&title=&width=479)<br />1.7、断点中 name 和 password 存在值<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720593958679-55c4a627-3a93-4233-88a5-94c30ef22b9a.png#averageHue=%23282b31&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=ub8c77565&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=297046&status=done&style=stroke&taskId=ua37d6519-bb7b-4253-94c0-714cb17fc10&title=&width=479)<br />1.8、查看数据库，新增成功，（问题是代码没改动，不知道为什么又好了）<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720594007300-4c1d0833-c908-47ce-a3e9-1a10abc77dff.png#averageHue=%23fafaf9&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=ufdb7b3ea&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=202102&status=done&style=stroke&taskId=u419bf86a-fede-40c1-9ea6-d8e2786c958&title=&width=479)<br />1.9、为了后续流程，取消断点调试模式<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720594222184-6d323335-69e5-4ac4-8c63-b618b71b9f8c.png#averageHue=%2326282c&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=ufb8a5cb2&originHeight=1078&originWidth=1906&originalType=binary&ratio=1&rotation=0&showTitle=false&size=284616&status=done&style=stroke&taskId=ud862fb00-bcdb-42d2-91a6-92032d42fee&title=&width=477)<br />1.10、重新运行项目<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720594246454-49c0682c-1460-4e47-9453-19e29e98ca0b.png#averageHue=%2326282c&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=u41d02ba5&originHeight=1077&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=253868&status=done&style=stroke&taskId=u1426be4c-1774-4944-8f9c-240d77fc196&title=&width=479)
<a name="NI44t"></a>
#### 2、查询
1、点击发送，调用查询用户接口 [http://localhost:8080/user/getList](http://localhost:8080/user/getList)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720594288830-09603dc5-ac11-4864-9611-9f8adfcf3ee0.png#averageHue=%231a1b25&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=u3cb08d9d&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=228643&status=done&style=stroke&taskId=ua11c5f82-2a29-409b-8672-fad24d839e3&title=&width=480)<br />2、数据查询成功<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720594311460-342e31e0-db5b-43ea-b69c-c2f6313ecb69.png#averageHue=%231a1c25&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=u8e67132c&originHeight=1077&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=249123&status=done&style=stroke&taskId=u64acc8ce-8b52-4a76-b3a2-0430a3a630e&title=&width=479)
<a name="Rzm7R"></a>
#### 3、删除
1、点击发送，调用删除用户接口 [http://localhost:8080/user/delete](http://localhost:8080/user/delete)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720594364622-fe3008d7-2bdd-4ead-9497-f3b83e11deaf.png#averageHue=%231a1b25&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=u9eb35730&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=235540&status=done&style=stroke&taskId=u53e6fc0c-65d9-44e2-adcd-8b35a6b1499&title=&width=479)<br />2、删除失败，接口 400 了<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720594437195-14284eed-88be-4cad-bfc2-9e22d22fa48c.png#averageHue=%231a1c25&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=u09674f0a&originHeight=1079&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=248267&status=done&style=stroke&taskId=u91d06dcf-d133-4562-b413-c6bc347d510&title=&width=479)<br />3、调用接口前删除日志，方便查看日志信息，此时终端已经报错<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720594736929-9f56f55e-7aef-49c5-bb5a-fca8c8719fd1.png#averageHue=%23222529&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=u93fab8a4&originHeight=1078&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=294463&status=done&style=stroke&taskId=u1765d246-f6bf-4482-a4dc-2ab31d45a3e&title=&width=478)<br />4、报错信息如下：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720594830899-b2b889ec-dd71-4c33-b9e7-d31ee338bd4b.png#averageHue=%23222428&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=u2771b8ca&originHeight=1078&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=254610&status=done&style=stroke&taskId=ue3e966ed-a311-401f-a83a-f7ed5e913b2&title=&width=479)<br />错误信息如下：
```java
Resolved [org.springframework.http.converter.HttpMessageNotReadableException: 
JSON parse error: 
Cannot deserialize value of type `java.lang.Integer` from Object value
(token `JsonToken.START_OBJECT`)]
```
5、找到问题所在，这是因为：
> 使用@RequestBody 接收的是个对象，而我们在接口传参时用的格式是：
> { id: 4 }
> 所以这里 id 是一个对象{id: 4} 调用userService.delete(id) 希望传入的是整数类型
> 我们现在传递的是 {id:1} 所以就报错

![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720595302796-ef8043d7-3013-4569-b993-1306bcf5d8f0.png#averageHue=%23222428&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=u0f2d428c&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=340771&status=done&style=stroke&taskId=u25d44f35-0f6c-4422-8b85-83003270948&title=&width=479)<br />6、改造如下：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720595334885-f50b3d6c-c069-4b4f-81e7-d41b39c953ea.png#averageHue=%23222428&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=ude9203cc&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=319332&status=done&style=stroke&taskId=uaf9e4d53-d6d4-4723-a338-4cc21b788c6&title=&width=480)<br />代码如下：
```java
package com.chuxin.demotodolist.controller;

import com.chuxin.demotodolist.entity.User;
import com.chuxin.demotodolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

     // 删除
    @PostMapping("/delete")
    public Integer delete(@RequestBody User user) {
        return userService.delete(user.getId());
    }
    
}

```
7、重启项目，并且启动成功之后清除日志<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720595489102-e8d07327-1c32-4c8b-bfa0-2c084f1b30c1.png#averageHue=%2323252a&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=u02e89ef0&originHeight=1079&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=311193&status=done&style=stroke&taskId=u5a40af07-c3a8-4787-b45e-715b4936a66&title=&width=478)<br />8、调用接口删除，返回1 说明数据库成功 这里的1代表在数据库中影响1行<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720595421560-f4de2e92-ad51-44c2-9a3b-4aea561efc26.png#averageHue=%231a1c25&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=u0323aa87&originHeight=1074&originWidth=1906&originalType=binary&ratio=1&rotation=0&showTitle=false&size=246618&status=done&style=stroke&taskId=u3bf028b6-573a-4b35-a5e8-f3e28cf835c&title=&width=477)<br />9、数据库查看，删除成功<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720595583344-f1894914-3e74-4e50-bb28-c4c437efe5dd.png#averageHue=%23fafaf9&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=ue673a5f2&originHeight=1079&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=201788&status=done&style=stroke&taskId=u8da81856-c05b-4645-8681-0358d13987b&title=&width=478)
<a name="dUMnN"></a>
#### 4、修改
1、在“删除”接口报错时看到了这里的sql 语句错误，没有给定修改条件，先尝试不删除试试报出的错误是什么样的<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720595714418-529ef2c9-bb59-41d3-b4c8-b3d620fd5f8c.png#averageHue=%23222428&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=uc4e39d81&originHeight=1079&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=284975&status=done&style=stroke&taskId=u77c033a2-f8d7-4873-9c8a-0ccb092deb2&title=&width=479)<br />2、重启项目，清除日志<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720595920856-35a1ff9f-4f40-4703-908d-a7f8ca221d4c.png#averageHue=%2323262a&clientId=u4dc3421b-4ff7-4&from=paste&height=266&id=ue49624bf&originHeight=1061&originWidth=1890&originalType=binary&ratio=1&rotation=0&showTitle=false&size=339799&status=done&style=stroke&taskId=u18721ed6-5041-4ca2-8a24-02a25a21b2a&title=&width=473)<br />3、点击发送，调用修改用户接口 [http://localhost:8080/user/edit](http://localhost:8080/user/edit)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720596076135-92193268-ab22-49e4-9f5b-ef904325382c.png#averageHue=%231a1c25&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=ub66a81f8&originHeight=1075&originWidth=1907&originalType=binary&ratio=1&rotation=0&showTitle=false&size=250248&status=done&style=stroke&taskId=u68dac57b-82e9-4ea8-8cc0-4822011d8ac&title=&width=477)<br />4、返回整数3，这说明数据影响了3行，不会不给条件的话 给所有的数据进行更新吧？而且程序并没有报错<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720596114927-cf1d58e8-ace0-4b34-8deb-30661e3bbbca.png#averageHue=%231a1c25&clientId=u4dc3421b-4ff7-4&from=paste&height=270&id=u1d621ce3&originHeight=1078&originWidth=1910&originalType=binary&ratio=1&rotation=0&showTitle=false&size=243251&status=done&style=stroke&taskId=u933d363f-a663-47cd-bde9-9bd3bcd8a99&title=&width=478)<br />5、查看 数据库，数据全部同步更新了~<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720596186581-7fd2f3b0-71e8-4a00-b3c9-c81f6b1949d9.png#averageHue=%23fafafa&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=u7d411b20&originHeight=1074&originWidth=1910&originalType=binary&ratio=1&rotation=0&showTitle=false&size=195753&status=done&style=stroke&taskId=u157dcaa0-cb5c-4cb1-b77e-d84716dff99&title=&width=478)<br />6、改造 UserMapper 接口文件，增加条件，然后重启项目<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720596280362-c85d4a81-2848-4d1a-b33d-74ae0d02c46d.png#averageHue=%2323262b&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=ubce6e5be&originHeight=1078&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=376418&status=done&style=stroke&taskId=u5b63014c-2782-4b5e-a473-a10862b1f68&title=&width=478)<br />7、重新调用接口，修改id=1 的name为 chuxin<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720596374222-7cdbdf9c-4993-424e-b4d1-ec2e4007e5e8.png#averageHue=%231a1c25&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=ub8975119&originHeight=1074&originWidth=1911&originalType=binary&ratio=1&rotation=0&showTitle=false&size=249847&status=done&style=stroke&taskId=u52ac3cd7-24d4-49dc-8c7f-39fe6880021&title=&width=478)<br />8、查看数据库，修改成功<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720596407311-017ad1af-8c3b-45f5-a426-d1b0b9054362.png#averageHue=%23fafafa&clientId=u4dc3421b-4ff7-4&from=paste&height=269&id=u1f403bd5&originHeight=1077&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=195630&status=done&style=stroke&taskId=udd4321e9-b718-4452-8e10-fd591c4ee0b&title=&width=479)
<a name="MfXKa"></a>
## 支线任务
<a name="Sx7tJ"></a>
### 一、项目依赖介绍
1、Lombok
> 用来生成实体类 Getter 和 Setter 架包

不使用 Lombok 的情况<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720597486383-3c5249d6-6a45-4303-a43f-5ea3bece10e2.png#averageHue=%23222428&clientId=uf7c452ca-2a32-4&from=paste&height=270&id=u516af23d&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=302714&status=done&style=stroke&taskId=u3bc21cb4-b04f-4fc0-90d7-f39ef9cc9d2&title=&width=480)<br />使用 Lombok <br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720597567068-932ab664-1526-4e3d-88ae-122a3b6bf2fc.png#averageHue=%2323252a&clientId=uf7c452ca-2a32-4&from=paste&height=268&id=u0d2737bc&originHeight=1073&originWidth=1908&originalType=binary&ratio=1&rotation=0&showTitle=false&size=351866&status=done&style=stroke&taskId=ud28b2046-ad5d-4059-a771-7358d1b28dd&title=&width=477)<br />总结： 简化代码

2、Spring Web
> Spring Web 提供了强大的 Web MVC 框架，用于构建灵活和可扩展的 Web 应用程序

简单点理解就是专门做 web 端接口开发，提供了很多注解，目前常用的注解有：<br />controller 相关的就有：

- @RestController
- @RequestMapping
- @GetMapping
- @PostMapping
- @RequestBody

总结：还有很多并没有列举出来，但是只是知道 Spring Web 是干什么的，也可以理解为前端的 Vue

3、MyBatis Framework
> 是一个优秀的持久层框架，它确实支持自定义 SQL、存储过程以及高级映射。它通过提供映射文件（或注解）来配置 SQL 映射规则，将 Java 对象与 SQL 查询结果进行映射，提供了灵活的数据库操作方式

提供了很多注解：

- @Insert     更新
- @Delete    删除
- @Update   更新
- @Select     查询

![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720597926185-c67d7214-17fe-43bc-a5b7-7a8a6c9e105d.png#averageHue=%23222429&clientId=ue5ad9482-98b3-4&from=paste&height=269&id=uddf76dac&originHeight=1078&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=294375&status=done&style=stroke&taskId=uc5759681-ac55-408e-8f69-e01a6c9c7e9&title=&width=479)<br />总结：方便 mysql 数据库操作

4、MySQL Driver
> Java 应用程序中连接和操作 MySQL 数据库的驱动程序，它实现了 JDBC（Java Database Connectivity）API 规范。MySQL Driver 提供了连接 MySQL 数据库、执行 SQL 查询和更新等功能，是 Java 开发中与 MySQL 数据库交互的基础

当前架包会在 application.yaml 进行配置<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720598451685-341cff5a-0c30-4011-b6df-1cec0e411209.png#averageHue=%23222428&clientId=ue5ad9482-98b3-4&from=paste&height=269&id=uf6e78ac1&originHeight=1078&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=270847&status=done&style=stroke&taskId=u2fe5ad34-bb14-4342-8f62-1bcfe31b907&title=&width=479)<br />总结：Spring Boot 作为 Web 框架，实际项目中可能存在不使用 mysql 有可能会使用其他的数据库，每个数据库都有自己的标准，所以就会让数据库厂商自己开发数据库驱动架包提供给开发者使用，这样厂商自己做兼容不比 Java 去做兼容好的多，这样也好发展生态<br />所以流程是：controller -> service -> mapper-> mybatis -> jdbc.Driver -> 操作mysql数据库<br />此时如果换数据库的话 只需要把 jdbc.Driver 换成其他对应的数据库的数据驱动~ 想让我Java来干这么多数据库的连接兼容门都没有，想都不要想

5、pom.xml 相关依赖如下：
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <!-- 父工程 spring web -->
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.3.1</version>
    <relativePath/> <!-- lookup parent from repository -->
  </parent>

  <!--  -->
  <groupId>com.chuxin</groupId>
  <artifactId>demo-todo-list</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>demo-todo-list</name>
  <description>demo-todo-list</description>

  <!-- java jdk 版本17 -->
  <properties>
    <java.version>17</java.version>
  </properties>

  <dependencies>

    <!-- Spring Web 依赖 -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!--  mybatis -->
    <dependency>
      <groupId>org.mybatis.spring.boot</groupId>
      <artifactId>mybatis-spring-boot-starter</artifactId>
      <version>3.0.3</version>
    </dependency>

    <!-- MySQL Driver -->
    <dependency>
      <groupId>com.mysql</groupId>
      <artifactId>mysql-connector-j</artifactId>
      <scope>runtime</scope>
    </dependency>

    <!-- lombok -->
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <optional>true</optional>
    </dependency>

    <!-- Spring Web 单元测试依赖 -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>

    <!-- mybatis 单元测试依赖 -->
    <dependency>
      <groupId>org.mybatis.spring.boot</groupId>
      <artifactId>mybatis-spring-boot-starter-test</artifactId>
      <version>3.0.3</version>
      <scope>test</scope>
    </dependency>
  </dependencies>


  <!-- 项目打包相关依赖 -->
  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>

          <!-- 排除lombok -->
          <excludes>
            <exclude>
              <groupId>org.projectlombok</groupId>
              <artifactId>lombok</artifactId>
            </exclude>
          </excludes>
        </configuration>
      </plugin>
    </plugins>
  </build>

</project>

```
总结：此文件相当于前端的 package.json 文件，后续会重新增加一篇文件进行深入学习
<a name="YkFHD"></a>
### 二、项目架包安装依赖报错
1、如果部分依赖下载失败，此时控制台会抛出错误：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718960324128-5346a6d2-95e5-48e1-b8fe-3ac58a1c98ff.png#averageHue=%232a2c30&clientId=ubae9b9ea-0d53-4&from=paste&height=270&id=uad4cfd69&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=277270&status=done&style=stroke&taskId=u7d5a56ac-277d-4bd4-a370-7b529849265&title=&width=479)<br />2、点击“刷新”按钮，重新下载依赖，先排除一下看是否是网络的问题<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718960927109-f30dd216-b790-4da4-b77d-e57bef62000f.png#averageHue=%232a2c31&clientId=ubae9b9ea-0d53-4&from=paste&height=269&id=ud3a809f8&originHeight=1076&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=327161&status=done&style=stroke&taskId=ud7f097c7-f0c6-4766-8008-12cf9fe2492&title=&width=478)<br />3、再次点击 “Maven”刷新之后 发现还是报错，按照图中 “第2步” 操作，点击进行强制更新~<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718960980889-51defded-724e-4f26-a188-f7e4c62a0eb2.png#averageHue=%232a2c30&clientId=ubae9b9ea-0d53-4&from=paste&height=270&id=uc24561ab&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=287302&status=done&style=stroke&taskId=uf2e30f82-1cbc-4332-8c40-1a91acafd2b&title=&width=480)<br />4、点击强制更新之后，发现 Maven 报错：Could not acquire lock(s)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718961235309-12b02fff-e87d-47b6-b33e-11a27a3e769b.png#averageHue=%2326282d&clientId=ubae9b9ea-0d53-4&from=paste&height=270&id=ub0887bb5&originHeight=1079&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=321640&status=done&style=stroke&taskId=u66c593c2-4f25-49e7-91c3-eb55d5f80d4&title=&width=479)<br />5、在网上找到类似的问题，大致解决的方式如下：

- 在网上找到的第一个方案说的大致原因是：
   - 另一个 Maven 进程正在运行，占用了所需的文件锁 Maven 进程意外终止，但文件锁未被释放
- 解决方案：
   - 感觉看着不像是这个问题，不过我先试试吧，方案是：重启 idea

重启 idea 之后，点击 Maven 刷新 按钮，确实不报错了!  <br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718961513156-a0f717e7-1114-439e-adaa-dfe243cf4daa.png#averageHue=%2326282c&clientId=ubae9b9ea-0d53-4&from=paste&height=270&id=u5f6da5ac&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=295937&status=done&style=stroke&taskId=ud21ca25a-01f1-443f-b1af-d8f9fb12e4c&title=&width=479)
<a name="xvuiQ"></a>
### 三、启动项目，编译报错，配置Mysql
1、启动项目，终端控制台编译报错，这是因为我们集成了 Mysql Driver 架包，而 Spring Boot 是一个约定大于配置，使用了 Mysql Driver 架包就需要要配置相应的 Spring Boot 配置，所以在启动的时候会报错<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718962025350-a4f9ba8d-a4a6-426d-9d43-20b7657ade99.png#averageHue=%23222428&clientId=uc4d22a0c-b6b6-4&from=paste&height=269&id=KBuWB&originHeight=1078&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=272395&status=done&style=stroke&taskId=u00c1bae4-a1d9-4b09-9a6b-eebdec10e9a&title=&width=478)<br />2、将 application.properties 修改为 application.yaml 文件<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720592291028-8e2501a8-8210-4d05-bb90-d85413870425.png#averageHue=%23232429&clientId=u3cd86bcc-437d-4&from=paste&height=270&id=AjgsK&originHeight=1079&originWidth=1912&originalType=binary&ratio=1&rotation=0&showTitle=false&size=264168&status=done&style=stroke&taskId=u8eb81316-010f-4cbd-a516-e87684a7127&title=&width=478)<br />3、为什么要修改为 yaml 文件，主要出于两个方面的原因：
> 当然两个文件用那个都是可以的，我觉得没有必要纠结，习惯那个用那个

- yaml 用的人比较多
- yaml 更加清晰，更好维护

4、解决办法，application.yaml 文件修改如下：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720592533668-6aabc725-0430-4ca2-9edc-624f3a31bbfe.png#averageHue=%23222428&clientId=u3cd86bcc-437d-4&from=paste&height=270&id=IItZ1&originHeight=1079&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=264531&status=done&style=stroke&taskId=u1852c9bb-073f-46b1-80e7-67db6400cc9&title=&width=479)<br />代码如下：
```yaml
# spring config 配置
spring:
  # 当前项目名称
  application:
    name: demo-todo-list
  
  # 数据库相关操作
  datasource:
    # 数据库连接使用 jdbc
    driver-class-name: com.mysql.cj.jdbc.Driver
    # 连接地址
    url: jdbc:mysql://localhost:3306/demo-todo-list?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai
    # 用户名
    username: root
    # 密码
    password: 123456
```
5、再次启动，运行成功<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720592564554-b5df1003-0c8c-479e-8391-a647ef6900e8.png#averageHue=%2323262a&clientId=u3cd86bcc-437d-4&from=paste&height=270&id=Qybt8&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=346355&status=done&style=stroke&taskId=uf72a0900-8adc-4cf4-ad2f-dd3384c1943&title=&width=480)
<a name="QwWH5"></a>
### 四、Service 层概念是做什么的？
1、Java 中 Service 层一般用于 编写业务代码<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720599225391-9f772795-e294-485c-89f9-905f45628880.png#averageHue=%23222428&clientId=u213ce044-90c8-4&from=paste&height=269&id=u9958fc9f&originHeight=1075&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=314108&status=done&style=stroke&taskId=u19c0a893-6d9a-4e45-8442-9485d8ac82c&title=&width=478)<br />2、implements 文件是干什么的<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720599306818-f90bf2ba-3564-4546-85ed-9832c56b133d.png#averageHue=%23232429&clientId=u213ce044-90c8-4&from=paste&height=269&id=ufb899298&originHeight=1076&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=320621&status=done&style=stroke&taskId=u128892d2-7672-492e-8ffb-1641d830bd5&title=&width=479)<br />3、那它有什么好处呢？我们可以尝试把现有的增删改差删除掉<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720599402037-90abdb29-31fc-4c2f-89bc-ada526ee74c1.png#averageHue=%23232529&clientId=u213ce044-90c8-4&from=paste&height=269&id=u5cc984f6&originHeight=1078&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=300616&status=done&style=stroke&taskId=u8d319c8f-d9df-404d-b086-eab118f391e&title=&width=478)<br />4、目前能想到的场景就是：
> 如果当前内部的业务写了有超过1000行，然后想在业务中增加一个方法 并且需要重构其中业务，代码假如又不是自己写的，而且又不知道当前 Service 中那些方法被外部其他类调用了，如果不敢直接在这个文件中重构，如果新增一个类进行重构，那么这个时候 接口 就很好的帮我们解决了
> 通过继承之后 我们至少知道要实现几个方法 并且方法的传参 显而易见

![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720599681387-366d1a8a-5bd2-45e2-9d97-9decf8f33870.png#averageHue=%23222428&clientId=u213ce044-90c8-4&from=paste&height=270&id=u82e7c4ef&originHeight=1079&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=270623&status=done&style=stroke&taskId=ua02ef5db-949a-48e9-b404-73bfe1a4d85&title=&width=479)
<a name="zt7YJ"></a>
### 五、@Service 和 @Override 是干啥的
> 传统开发中 用一个类 需要new  这样的在业务很复杂的时候改动起来就很麻烦 然后Spring boot 就有了ioc 就像一个池子 把项目中用到的所有的类通过 @Component 注入到池子中再通过 @Autowired取出来 这样在用的地方就不需要new了
> 
> 所以：@service 它的作用是将类实例化和组件化，交给 ioc 容器进行生命周期管理 
> 先小总结一下：很像 Vuex 状态管理，用一个池子将项目所有用到的类管理起来 在内部就实例化了再通过 @Autowired进行取值

1、@Service 其实就是一个注解，主要的是免除在其他类中使用时不用进行 new 实例化操作<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720600005742-9c730d75-d990-4c25-bb1e-76f0e031f4b2.png#averageHue=%23232429&clientId=u213ce044-90c8-4&from=paste&height=269&id=u8557c63c&originHeight=1075&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=329203&status=done&style=stroke&taskId=u7480264b-0ae3-44a6-a539-5eb4621c675&title=&width=478)<br />2、内部值得一提的注解 @Component<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720600393243-a24394c0-665c-40bb-98d4-7a838433fde8.png#averageHue=%23222429&clientId=u213ce044-90c8-4&from=paste&height=269&id=u08da0438&originHeight=1074&originWidth=1911&originalType=binary&ratio=1&rotation=0&showTitle=false&size=268925&status=done&style=stroke&taskId=u8894187c-c55c-4e42-ae61-4c8a7bcec77&title=&width=478)<br />3、配合 @Autowired 在池子中取出来，简化了 new 实例化，<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720600092331-6b4c2f1f-39c6-45ea-b2c5-7ac4cd94877e.png#averageHue=%23222429&clientId=u213ce044-90c8-4&from=paste&height=270&id=u470a0c21&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=350249&status=done&style=stroke&taskId=uc3acb9dc-664f-4608-8725-7f375f8d79b&title=&width=479)<br />总结：作为前端我太熟了，不就是直接在 Vue.prototype 上挂载属性和属性方法嘛，这样在内部使用时就不需要老是导入

3、@Override 实现父类中的方法
> @Service 注解用于标识一个类作为 Spring 中的服务层组件，而 @Override 注解用于标识方法覆盖了父类或接口中的方法。这两个注解都是在不同的上下文中用来增强代码的可读性、可维护性和安全性的工具。

![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720600322662-63cfc600-f5e5-45fa-8b77-2a1c4ce16c79.png#averageHue=%23222429&clientId=u213ce044-90c8-4&from=paste&height=270&id=ud59f7129&originHeight=1078&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=328157&status=done&style=stroke&taskId=u20e1e0a5-d7ec-4eb5-854c-40e08ce7af9&title=&width=480)<br />总结：有点像 ts 中给定了 interface 就需要实现它，只是 Spring Boot 中覆写需要用 @Override
<a name="cHVMw"></a>
### 六、Mapper 层概念用处？
> 在 Spring Boot 中，@Mapper 注解通常用于标记一个接口，指示 MyBatis 或者其他类似的持久层框架来扫描并生成对应的实现类

1、定义数据访问接口，这样就可以定义一个 Java 接口，其中声明了需要执行的 SQL 操作，如插入、更新、删除、查询等操作方法，但不需要实现这些方法的具体逻辑
```java
package com.chuxin.demotodolist.mapper;

import com.chuxin.demotodolist.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    // 增
    @Insert("insert into sys_user (name,password) values (#{name},#{password})")
    Integer add(User user);
    // 删
    @Delete("delete from sys_user where id=#{id}")
    Integer delete(Integer id);
    // 改
    @Update("update sys_user set name=#{name},password=#{password} where id=#{id}")
    Integer edit(User user);
    // 查
    @Select("select * from sys_user")
    List<User> getList();
}

```
2、和Service一样会注入到 Spring 容器中：生成的实现类会被作为 Spring Bean 注入到 Spring 容器中，可以在其他组件（如 Service 层）中直接通过依赖注入来使用，而不需要手动编写实现类<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720601345679-d7f84cdc-c967-4e44-b45d-c1a971a12c83.png#averageHue=%23222428&clientId=u439fa38f-8cec-4&from=paste&height=269&id=u908e6a1e&originHeight=1078&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=321865&status=done&style=stroke&taskId=u8130606f-53ec-49bb-a8a1-56f7dfe00f5&title=&width=478)
<a name="Z63JB"></a>
### 七、pom.xml 项目依赖文件
```xml
<!-- 这里一般不会变 xml 的格式 -->
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  
  <!--继承父工程 好处：自动帮我们管理包的版本-->
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.3.1</version>
    <relativePath/> <!-- lookup parent from repository -->
  </parent>
  
  <!-- 结合maven仓库来看，groupId 就是一个目录位置，artifactId 是打包后的包名 -->
  <!-- 工程包名 -->
  <groupId>com.chuxin</groupId>

   <!-- 项目名 -->
  <artifactId>demo-todo-list</artifactId>

  <!-- 项目版本 -->
  <version>0.0.1-SNAPSHOT</version>

  <!-- 名称 -->
  <name>demo-todo-list</name>

  <!--项目描述-->
  <description>demo-todo-list</description>
  
  <!-- Java版本 现在基本上用8  我在学习阶段无所谓 -->
  <properties>
    <java.version>17</java.version>
  </properties>

  <!--项目依赖-->
  <dependencies>

     <!-- spring boot web 启动依赖  这个就好比是前端的 vue  -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!--  mybatis 依赖架包 -->
    <dependency>
      <groupId>org.mybatis.spring.boot</groupId>
      <artifactId>mybatis-spring-boot-starter</artifactId>
      <version>3.0.3</version>
    </dependency>

    <!-- MySQL Driver 数据驱动 -->
    <dependency>
      <groupId>com.mysql</groupId>
      <artifactId>mysql-connector-j</artifactId>
      <scope>runtime</scope>
    </dependency>

    <!-- lombok 注解生成插件 少写getter/setter -->
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <optional>true</optional>
    </dependency>

    <!-- Spring Web 单元测试依赖 -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>

    <!-- mybatis 单元测试依赖 -->
    <dependency>
      <groupId>org.mybatis.spring.boot</groupId>
      <artifactId>mybatis-spring-boot-starter-test</artifactId>
      <version>3.0.3</version>
      <scope>test</scope>
    </dependency>
  </dependencies>


  <!-- 项目打包相关依赖 -->
  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>

          <!-- 排除lombok -->
          <excludes>
            <exclude>
              <groupId>org.projectlombok</groupId>
              <artifactId>lombok</artifactId>
            </exclude>
          </excludes>
          
        </configuration>
      </plugin>
    </plugins>
  </build>

</project>

```
<a name="RLiLR"></a>
## 代码仓库
[spring-boot-demo/demo-todo-list at master · chuxin-cs/spring-boot-demo](https://github.com/chuxin-cs/spring-boot-demo/tree/master/demo-todo-list)
<a name="jFjku"></a>
## 往期内容
[🌱 目录](https://www.yuque.com/chuxin-cs/it/ge9wybczy0wsq1l1?view=doc_embed)



