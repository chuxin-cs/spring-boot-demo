![24.png](https://cdn.nlark.com/yuque/0/2023/png/26242735/1686721742667-c75d3b5e-5381-480f-a032-bcf31c92c773.png#averageHue=%23d1a56e&clientId=ued660751-61d6-4&from=ui&id=u556bab50&originHeight=312&originWidth=937&originalType=binary&ratio=1.100000023841858&rotation=0&showTitle=false&size=124239&status=done&style=none&taskId=ueec3b974-e965-4717-a690-cf4380f9974&title=)
<a name="XspMe"></a>
## 今日话题
> 基于 Spring Boot 实现增删改查，仅仅只是提供接口不涉及数据库增删改查
> 作者：云层上的光
> 时间：2024年6月21日 15时19分14秒

<a name="WVjyU"></a>
## 主线任务
<a name="PHo63"></a>
### 一、项目创建
1、基于 idea 创建项目<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718954373442-e2585d74-9a59-478d-b6f7-c8c3e31f5d69.png#averageHue=%232c2e32&clientId=ue1e09d12-04f4-4&from=paste&height=270&id=u1b97ed2b&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=251657&status=done&style=stroke&taskId=ud1c46462-c1b6-4bef-8986-5b96f528231&title=&width=479)<br />2、选择项目依赖 Spring Web<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718954412866-7a1c5ab4-094e-4898-8ce6-4a3a8f70b9c4.png#averageHue=%232c2e32&clientId=ue1e09d12-04f4-4&from=paste&height=270&id=u84d5e04f&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=245045&status=done&style=stroke&taskId=u05d700cd-2d7a-4ee5-89b4-e2c2064e19c&title=&width=479)
<a name="luvIq"></a>
### 二、实现增删改查
1、新建 controller 软件包<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718954899482-d1446728-6810-494f-99bd-0c416079a436.png#averageHue=%232b2e32&clientId=u8c84d4af-0ef9-4&from=paste&height=270&id=u2413e91c&originHeight=1077&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=282387&status=done&style=stroke&taskId=u448f3a20-6a57-4d9f-b016-da3c66b480d&title=&width=479)<br />2、新建 UserController 文件类<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718954958908-64fbec7a-cb40-4b1f-bd07-f5d3d8476087.png#averageHue=%232b2e32&clientId=u8c84d4af-0ef9-4&from=paste&height=270&id=uda42673a&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=284963&status=done&style=stroke&taskId=u81d084d4-0a5b-4163-9150-99b4e345a03&title=&width=480)<br />选择 “类”进行创建~<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718955023934-7bb03ec9-4131-4d19-a903-579713273249.png#averageHue=%232b2d31&clientId=u8c84d4af-0ef9-4&from=paste&height=270&id=u4c146075&originHeight=1078&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=231780&status=done&style=stroke&taskId=u6b8030b9-181a-4cc8-9b04-9caad4001ec&title=&width=479)<br />3、实现 增删改查 4个方法
```java
package com.chuxin.democrud.controller;

public class UserController {
    // 增加
    public String add() {
        return "add";
    }

    // 删除
    public String delete() {
        return "delete";
    }

    // 修改
    public String edit() {
        return "edit";
    }

    // 查看
    public String getList() {
        return "getList";
    }
}
```
<a name="xTPYh"></a>
### 三、基于 Spring Boot 注解提供对外接口
1、使用 Spring Boot 注解注册为 controller ，也就是前端访问的接口
```java
package com.chuxin.democrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    // 增加
    @GetMapping("/add")
    public String add() {
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
2、运行项目<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718958327016-f3c55531-e8a5-4c93-b6dc-69163d88bf08.png#averageHue=%23222428&clientId=uafe0cc57-cd2e-4&from=paste&height=270&id=u5a6fef6b&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=242584&status=done&style=stroke&taskId=ua7782627-b7e6-4348-ae78-5d02d8a079c&title=&width=480)<br />3、浏览器访问：[http://localhost:8080/user/getList](http://localhost:8080/user/getList)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718958469788-a60763c0-9bf4-4ece-9ba3-34ba29453eab.png#averageHue=%23fefcf6&clientId=uafe0cc57-cd2e-4&from=paste&height=270&id=uc61f5438&originHeight=1079&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=166651&status=done&style=stroke&taskId=u21f25b69-81be-4ffa-99fc-01f8ff890d7&title=&width=478)
<a name="JCmQg"></a>
## 支线任务
<a name="rvlwZ"></a>
### 一、public String add 语法解析
1、以 add 方法代码举例，前端代码如下：
```javascript
class UserController {
  constructor(){}
  add() {
    return "add";
  }
}
```
2、而 Java 中 前面多了 public String
```java
package com.chuxin.democrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    // 增加
    @GetMapping("/add")
    public String add() {
        return "add";
    }
}
```
3、先说 public 意思是公共的、还有其他值：private 私有 这里声明的是否给到外部访问 目前还没有学那个受保护的那个，这里先不进行演示了<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720422105984-d83a63e0-a4d9-4148-a295-49381ae9a99e.png#averageHue=%23222428&clientId=u693a099c-816f-4&from=paste&height=270&id=u1228e6d4&originHeight=1079&originWidth=1910&originalType=binary&ratio=1&rotation=0&showTitle=false&size=306356&status=done&style=stroke&taskId=u73d75ef4-b4a8-4e82-86b2-f224055696a&title=&width=478)<br />4、浏览器访问 [http://localhost:8080/user/add](http://localhost:8080/user/add)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720422171064-ad7d485c-7f68-4d90-b0db-108bc1514c0c.png#averageHue=%23fefcf7&clientId=udc9d0e34-4a27-4&from=paste&height=269&id=uf82fb265&originHeight=1077&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=174927&status=done&style=none&taskId=uc36f4bca-1541-4f52-a5cc-d92838b3dfb&title=&width=479)<br />5、修改 public 为 private （是否接口就不能访问了呢？）<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720422664739-bc1dfac9-6d20-463d-ac5c-1e2861913851.png#averageHue=%23222428&clientId=udc9d0e34-4a27-4&from=paste&height=270&id=u00380bfd&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=307720&status=done&style=none&taskId=u1583ab8e-0710-4d80-977a-3cc3bb49bec&title=&width=479)<br />6、再次访问 [http://localhost:8080/user/add](http://localhost:8080/user/add) private 也可以访问到<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720422708461-1a4e1d7e-0903-4866-8f5f-45789ad0391c.png#averageHue=%23fdfbf5&clientId=udc9d0e34-4a27-4&from=paste&height=270&id=uabb5c752&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=171144&status=done&style=none&taskId=ud0266ed2-9511-4a8c-80f0-6cfc384ed19&title=&width=479)<br />7、这是因为：（后期再深入研究 TODO）
> private 和 public 是方法可见性，对于类而言。对注解了的接口则都提供接口访问


8、接下来解析 String ，它是 Java 中描述字符串类型<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720422904168-c599f628-bb0a-4a4b-aadb-b635e137ac8b.png#averageHue=%23222428&clientId=udc9d0e34-4a27-4&from=paste&height=270&id=u931bdbb8&originHeight=1078&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=303069&status=done&style=none&taskId=uf0c04082-84d2-41c3-81d6-59bc0bf14a4&title=&width=479)<br />代码如下：
```java
public class UserController {
    private String add() {
        // 定义一个 字符串类型的 变量
        String result = "add";
        return result + "接口";
    }
}
```
2、public String add 在这里的作用是指明返回类型，add 方法最终需要返回字符串类型值
```java
public class UserController {
    public String add() {
        return "add";
    }
}
```
<a name="ekUzQ"></a>
### 二、RestController 作用是啥？
> @RestController 是 Spring 框架中的一个注解，用于标记一个类为 RESTful 控制器。这个注解结合了 @Controller 和 @ResponseBody 的功能

1、内部重要的两个注解：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720424026285-b1de660c-3c69-4653-9cb7-f833bfce9f91.png#averageHue=%23222429&clientId=udc9d0e34-4a27-4&from=paste&height=269&id=u136a3e64&originHeight=1075&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=248500&status=done&style=none&taskId=u748a358a-94ee-43d4-b340-0dbaf55ccde&title=&width=480)<br />2、@Controller
> @Controller 注解用于标记一个类作为 Spring MVC 控制器。它告诉 Spring 这个类将处理来自用户的请求。控制器类通常包含多个方法，每个方法都映射到一个或多个 URL 请求

白话：其实就是用来定义接口的

3、@ResponseBody
> @ResponseBody 注解用于方法级别，表示该方法的返回值应该直接写入 HTTP 响应体中，而不是作为视图模型的一部分来渲染视图。这意味着如果方法返回的是 Java 对象，Spring 将尝试将其序列化为相应的格式（如 JSON 或 XML）并发送给客户端

白话：这里处理的就是前端接口返回的数据信息，表示方法的返回值应该直接写入 HTTP 响应体

总结：定义了接口，并且包装了返回给前端的数据格式 这里指 HTTP响应体，不是说的业务封装的 code 等
<a name="WYjac"></a>
### 三、RequestMapping 作用
> @RequestMapping 是 Spring MVC 框架中的一个核心注解，用于建立 Web 请求与处理器方法之间的映射关系。它可以作用于类级别或方法级别，用于指定哪些 HTTP 请求（URL 和请求类型）应该映射到特定的控制器类或其方法上

1、定义接口前缀<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720425856166-f0b2a8bf-1ab0-4390-9eb0-8d9648c42c7a.png#averageHue=%23222428&clientId=u12c153be-7d16-4&from=paste&height=270&id=u838b86c1&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=306960&status=done&style=none&taskId=udb5953c6-beaa-4f15-ab06-58e124c47df&title=&width=480)<br />2、浏览器访问时：[http://localhost:8080/user/add](http://localhost:8080/user/add) 前面必须带上 user <br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720425889113-d33b48e2-6275-43aa-9f9f-803c927755a9.png#averageHue=%23fdfbf5&clientId=u12c153be-7d16-4&from=paste&height=269&id=ue771cbee&originHeight=1078&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=162763&status=done&style=none&taskId=u32a1e5ff-e5c5-436a-8d71-d4464ecd1bb&title=&width=478)<br />3、RequestMapping 本质工作是定义接口的<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720426583964-e488a595-7460-4d4e-990e-75cb74def62c.png#averageHue=%23222428&clientId=u12c153be-7d16-4&from=paste&height=270&id=u915b506c&originHeight=1078&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=297288&status=done&style=none&taskId=u10d8389c-df26-44af-84fa-ccf006c1a87&title=&width=479)

总结：定义接口，还可以增加接口前缀，被 GetMapping 等进行了二次包赚
<a name="KVMRH"></a>
### 四、PostMapping 用法
> 详细版见：[https://www.yuque.com/chuxin-cs/spring-boot-demo/rb0vo3mme8ouibvo#hiveB](https://www.yuque.com/chuxin-cs/spring-boot-demo/rb0vo3mme8ouibvo#hiveB)

1、定义一个 POST 请求，访问：[http://localhost:8080/user/edit](http://localhost:8080/user/edit)
```java
package com.chuxin.democrud.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    // 修改
    @PostMapping("/edit")
    public String edit() {
        return "edit";
    }
}

```
2、改造 edit 方法之前，需要先介绍一下 实体类，新建 entity<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720427115382-21b2cd95-5e70-48ce-88a4-1ff9a91377ca.png#averageHue=%2325282c&clientId=u12c153be-7d16-4&from=paste&height=270&id=u01d4e727&originHeight=1079&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=311491&status=done&style=none&taskId=uc2b679eb-a397-4812-8b12-327499f39de&title=&width=479)<br />3、新建 User 类<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720427193817-44ac7ae7-f202-479f-8b36-9fea44f8283d.png#averageHue=%2325272b&clientId=u12c153be-7d16-4&from=paste&height=270&id=ud7a63338&originHeight=1078&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=285012&status=done&style=none&taskId=u42c890db-4287-4ca3-92b6-49064772bd7&title=&width=479)<br />4、文件名大写，并且选择 “类” 进行创建<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720427239111-90a1432c-8c74-4c91-8dc0-da05882156e9.png#averageHue=%23232529&clientId=u12c153be-7d16-4&from=paste&height=270&id=u5c2d390e&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=322913&status=done&style=none&taskId=u163efb8c-65d9-4d01-9d3c-3e618f367fb&title=&width=479)<br />5、修改 User 实体类<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720427360106-532482dd-8203-47b1-aed3-20089c6118a9.png#averageHue=%23222327&clientId=u12c153be-7d16-4&from=paste&height=269&id=u98b80a08&originHeight=1074&originWidth=1910&originalType=binary&ratio=1&rotation=0&showTitle=false&size=242409&status=done&style=none&taskId=u26e79009-9191-4a8d-a3d3-4beebe16b05&title=&width=478)<br />代码如下：
```java
package com.chuxin.democrud.entity;

public class User {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * password
     */
    private String password;
}

```
6、在 Java 中，新增和修改在实体类中 需要有 getter 和 setter 方法，改造如下：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720427519177-1d469dea-e432-4d9a-9ec7-096d5d656c42.png#averageHue=%23222428&clientId=u12c153be-7d16-4&from=paste&height=270&id=u6895af5f&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=298572&status=done&style=none&taskId=u870c189c-b75e-4817-928f-426bd9872cd&title=&width=479)<br />代码如下：
```java
package com.chuxin.democrud.entity;

public class User {
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * password
     */
    private String password;
}
```
7、使用快捷方式生成 getter 和 setter<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720427665165-79062d4e-7241-4841-8d24-a2ae6a9403a5.png#averageHue=%23232529&clientId=u12c153be-7d16-4&from=paste&height=270&id=u120ff333&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=291757&status=done&style=none&taskId=u5f9736b6-5944-4f04-aa62-39631e01e79&title=&width=480)<br />8、选择 Getter 和 Setter<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720427704048-db07bc47-f157-439f-b69c-2a5706063e0c.png#averageHue=%23232428&clientId=u12c153be-7d16-4&from=paste&height=270&id=u6646ff6b&originHeight=1078&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=293527&status=done&style=none&taskId=u94334c45-7bfe-42e1-85c8-5cb86a0c650&title=&width=479)<br />9、有了实体类，接下来改造 edit 方法，接收前端传入的 json 格式：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720427961168-f67b3e2b-62f0-4509-a9e0-59de7504aff4.png#averageHue=%23232529&clientId=u12c153be-7d16-4&from=paste&height=270&id=u862f481b&originHeight=1077&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=309599&status=done&style=none&taskId=u67f3ede6-b681-47c5-bdaa-1ab2efa7bb5&title=&width=479)<br />10、重新编译项目<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720427985006-fcd605b8-f251-40d5-8094-60255b814565.png#averageHue=%23222428&clientId=u12c153be-7d16-4&from=paste&height=270&id=uf3868e6d&originHeight=1078&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=245506&status=done&style=none&taskId=u90c16415-a74a-4732-a334-ca54c06f99e&title=&width=480)<br />11、接口访问，成功返回参数<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720428044737-7df1c4ec-cbee-4027-85e7-56e3a7998c0d.png#averageHue=%231a1c25&clientId=u12c153be-7d16-4&from=paste&height=270&id=uaa3aeb65&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=250872&status=done&style=none&taskId=u7fe7a5b0-9db3-4748-9865-fca454f6813&title=&width=480)<br />12、改造 edit1 方法，基于 ModelAttribute 接收前端传递过来的参数<br />接收格式：x-www-form-urlencoded<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720428212824-2681859c-9a88-446a-b0a9-937673844afc.png#averageHue=%23232529&clientId=u12c153be-7d16-4&from=paste&height=269&id=u92d1236c&originHeight=1075&originWidth=1912&originalType=binary&ratio=1&rotation=0&showTitle=false&size=313027&status=done&style=none&taskId=ud56e5dd2-d59a-46cd-9ebe-13aaf342b99&title=&width=478)<br />代码如下：
```java
package com.chuxin.democrud.controller;

import com.chuxin.democrud.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/edit1")
    public String edit1(@ModelAttribute User user) {
        return "add:" + user.getUserName() + user.getId() + user.getPassword();
    }
}

```
13、重新编译<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720428312407-12edf89b-5d9a-4745-a806-2704f9e788d2.png#averageHue=%2324324c&clientId=u12c153be-7d16-4&from=paste&height=269&id=ud83ddb4e&originHeight=1074&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=385909&status=done&style=none&taskId=u9c622c65-6119-48b3-9608-e270dceaa86&title=&width=479)<br />13、接口访问，成功返回参数<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720428340363-5a9b9d68-cb5d-4197-98c5-233e1a476924.png#averageHue=%231a1c25&clientId=u12c153be-7d16-4&from=paste&height=269&id=u488e67c0&originHeight=1078&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=252759&status=done&style=none&taskId=u4df807c5-019b-4c00-9b03-7a5c57c53c2&title=&width=478)
<a name="J6Etm"></a>
### 五、GetMapping 用法
> 详细版见： [https://www.yuque.com/chuxin-cs/spring-boot-demo/rb0vo3mme8ouibvo#hzswp](https://www.yuque.com/chuxin-cs/spring-boot-demo/rb0vo3mme8ouibvo#hzswp)

1、定义一个 GET 请求，访问：[http://localhost:8080/user/add](http://localhost:8080/user/add)
```java
package com.chuxin.democrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    // 增加
    @GetMapping("/add")
    public String add() {
        String result = "add";
        return result + "接口";
    }
}

```
2、改造 getList 方法，基于 RequestParam 接收前端传递过来的参数<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720423583952-396e40ca-6715-4bf5-b208-42713649e749.png#averageHue=%23222428&clientId=udc9d0e34-4a27-4&from=paste&height=270&id=uf9fda4c5&originHeight=1078&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=298145&status=done&style=none&taskId=udfbc5f80-bf1a-41f6-83af-48c188d61f4&title=&width=479)<br />代码如下：
```java
package com.chuxin.democrud.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    // 查看
    @GetMapping("/getList")
    public String getList(@RequestParam int page, @RequestParam int pageSize) {
        return "getList：" + page + " " + pageSize;
    }
}

```
3、浏览器访问 [http://localhost:8080/user/getList?page=1&pageSize=20](http://localhost:8080/user/getList?page=1&pageSize=20)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720423632382-2636145b-ea26-44aa-ae57-d11a59067ba7.png#averageHue=%23fdfbf5&clientId=udc9d0e34-4a27-4&from=paste&height=270&id=u994c19cb&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=173322&status=done&style=none&taskId=u7ab2eff3-e98e-4e2e-b0bb-8d92b14907c&title=&width=479)<br />4、改造 getList1 方法，基于 PathVariable 接收前端传递过来的参数<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720424707570-45e6e387-42b9-4d1c-823c-5aa34ba7f67e.png#averageHue=%23222428&clientId=udc9d0e34-4a27-4&from=paste&height=269&id=ub545c311&originHeight=1075&originWidth=1911&originalType=binary&ratio=1&rotation=0&showTitle=false&size=303709&status=done&style=none&taskId=ud571a105-a921-4806-a444-445cda0eeff&title=&width=478)<br />代码如下：
```java
package com.chuxin.democrud.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    // 查看
    @GetMapping("/getList1/{page}/{pageSize}")
    public String getList1(@PathVariable String page, @PathVariable String pageSize) {
        return "getList：" + page + " " + pageSize;
    }
}

```
5、运行代码<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720424771192-55294a91-dc3a-4881-a242-3c6cdf915b07.png#averageHue=%2323262a&clientId=udc9d0e34-4a27-4&from=paste&height=269&id=u2619081d&originHeight=1077&originWidth=1919&originalType=binary&ratio=1&rotation=0&showTitle=false&size=344763&status=done&style=none&taskId=u12a865c7-9c65-44fe-9371-4d579d90294&title=&width=480)<br />6、浏览器访问：[http://localhost:8080/user/getList1/1/20](http://localhost:8080/user/getList1/1/20)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720424831963-0b842bfb-adfc-42e5-bcfa-ffe5b73d44e4.png#averageHue=%23fdfaf5&clientId=udc9d0e34-4a27-4&from=paste&height=270&id=u5d61d5db&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=171383&status=done&style=none&taskId=u07f290db-f945-48dc-b4f8-69ab82f06ee&title=&width=479)
<a name="bsZkp"></a>
## 代码仓库
[spring-boot-demo/demo-crud at master · chuxin-cs/spring-boot-demo](https://github.com/chuxin-cs/spring-boot-demo/tree/master/demo-crud)
<a name="x0nzM"></a>
## 往期内容
[🌱 目录](https://www.yuque.com/chuxin-cs/it/ge9wybczy0wsq1l1?view=doc_embed)
