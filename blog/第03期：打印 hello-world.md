![24.png](https://cdn.nlark.com/yuque/0/2023/png/26242735/1686721742667-c75d3b5e-5381-480f-a032-bcf31c92c773.png#averageHue=%23d1a56e&clientId=ued660751-61d6-4&from=ui&id=u556bab50&originHeight=312&originWidth=937&originalType=binary&ratio=1.100000023841858&rotation=0&showTitle=false&size=124239&status=done&style=none&taskId=ueec3b974-e965-4717-a690-cf4380f9974&title=)
<a name="bfKNv"></a>
## 今日话题
> 基于 Spring Boot 打印输出 hello world
> 作者：云层上的光
> 时间：2024年6月20日 14时25分14秒

<a name="eU7OW"></a>
## 主线任务
<a name="jGN1A"></a>
### 一、打印 hello world
1、点击 “新建项目”用来演示 打印输出 “hello world”<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718864746730-61ebbecf-77be-4662-be61-aecc74b8b14d.png#averageHue=%232b2d31&clientId=u38b14b83-c18c-4&from=paste&height=270&id=u029d78c1&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=212641&status=done&style=stroke&taskId=u5fa9ebd9-528c-4653-ad9a-3adc01d748d&title=&width=480)<br />2、填写项目配置：（详细版见：[https://www.yuque.com/chuxin-cs/spring-boot-demo/dx1zlnxducmrtgih#ltUnP](https://www.yuque.com/chuxin-cs/spring-boot-demo/dx1zlnxducmrtgih#ltUnP)）<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718864820090-072634a7-e669-46e3-b009-76aba3c0a419.png#averageHue=%232c2e32&clientId=u38b14b83-c18c-4&from=paste&height=270&id=u289ee52c&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=249386&status=done&style=stroke&taskId=udfda6a83-8560-407c-9829-c89f0bc33e1&title=&width=479)<br />3、选择 3.2.7 项目版本作为演示，依赖选择 Spring Web，最后点击创建：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718864865639-761f30d1-1725-485f-9f18-f42e56172a92.png#averageHue=%232b2e32&clientId=u38b14b83-c18c-4&from=paste&height=270&id=uea42cd42&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=245027&status=done&style=stroke&taskId=u1224345f-13f3-49c9-9d3e-f06668cfa97&title=&width=480)<br />4、使用 System 类打印
```jsx
System.out.println("Hello World!");
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718865681796-6ba03b3c-75e9-4144-a44a-f4ca5eb54045.png#averageHue=%2324262b&clientId=uf8ee3e2b-25d4-4&from=paste&height=269&id=uc6a72166&originHeight=1077&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=260393&status=done&style=stroke&taskId=u0d529333-ed08-401c-9cdb-363a2dadd8c&title=&width=479)<br />5、运行项目，成功打印 hello world!<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718865718395-688a10b0-fe4c-4397-a6d1-a0eea82622ef.png#averageHue=%2325272b&clientId=uf8ee3e2b-25d4-4&from=paste&height=270&id=u3d5c8e46&originHeight=1079&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=329148&status=done&style=stroke&taskId=u0ac6fb26-9996-44a0-a777-d414e37b4be&title=&width=478)
<a name="s8TLV"></a>
## 支线任务
<a name="iDZJB"></a>
### 一、package 是干什么的？
> 在Java中，package主要用于：
> 1. 组织代码：帮助分类和管理类。
> 2. 命名空间：避免类名冲突。
> 3. 访问控制：限制类及成员的可见性。
> 4. 导入类：简化跨包类的引用。
> 5. 目录结构：指导源文件的存放位置

白话：前端模块化，（所以作为前端去后端很多概念是一样的 只是在语法上不同，用概念套语法）<br />对比前端，以 Vue 项目举例，功能如下：<br />1、新建 utils/indexjs 文件
```go
// 定义了add 函数 并且使用了esmodules 模块化导出
export function add(a,b){
    alert(a+b)
}
```
2、根目录 main.js 使用 utils 文件中 index.js
```go
// 导入
import {add} from "./utils/index.js"

// 调用函数使用
console.log(add(1,2));
```
3、上面的功能用后端  package 来实现一遍，首先新建 utils 工具包：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720407061495-e605abd3-d730-49f9-a383-102855b09bc9.png#averageHue=%232b2e32&clientId=u142a94da-44f9-4&from=paste&height=270&id=ub2b23f7a&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=279523&status=done&style=stroke&taskId=u4e0e3bdf-916e-44aa-a5e5-3d9b0e417d8&title=&width=479)<br />4、再创建 common 文件<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720407146094-4786de91-a513-42bc-8ab3-d9c31a8d75e2.png#averageHue=%232b2e32&clientId=u142a94da-44f9-4&from=paste&height=270&id=ub83ce2f9&originHeight=1079&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=282026&status=done&style=stroke&taskId=ue2e588f8-f659-482d-b94b-bece20d8963&title=&width=478)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720407189499-25bb07a2-d1eb-4fec-be30-d301638e9ec1.png#averageHue=%232b2d31&clientId=u142a94da-44f9-4&from=paste&height=270&id=uf1b8fc7d&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=223589&status=done&style=stroke&taskId=u50e75a85-8092-43ca-bded-099bbcc67ba&title=&width=480)<br />5、编写 add 方法：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720407985272-850a4f7b-c861-4976-916a-232d3ad7cf35.png#averageHue=%23222427&clientId=u142a94da-44f9-4&from=paste&height=269&id=ucc0bbf30&originHeight=1076&originWidth=1910&originalType=binary&ratio=1&rotation=0&showTitle=false&size=231905&status=done&style=stroke&taskId=u6d4c9db4-b652-45f3-a0eb-06d03ebeaa2&title=&width=478)<br />代码如下：
> 使用 package 指明了当前在那个包下，也可以理解为在那个文件夹下

```java
// 这里使用 package 指明了当前在那个包下，也可以理解为在那个文件夹下
package com.chuxin.demohelloworld.utils;

public class common {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
```
6、主入口调用<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720408161249-89137324-35fd-47c9-8c10-3674cd86289d.png#averageHue=%23222428&clientId=u142a94da-44f9-4&from=paste&height=270&id=u3fda4161&originHeight=1078&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=275831&status=done&style=stroke&taskId=ua2d572ae-a0e2-48bf-9381-9067a06c1bb&title=&width=479)<br />代码如下：
```java
package com.chuxin.demohelloworld;

import com.chuxin.demohelloworld.utils.common;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoHelloWorldApplication {
    public static void main(String[] args) {
        // 打印 hello world
        System.out.println("Hello World!");

        // package 代码演示
        common Common = new common();
        System.out.println(Common.add(1,2));

        // spring boot 启动
        SpringApplication.run(DemoHelloWorldApplication.class, args);
    }
}
```
7、右键运行<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720408197552-fbbe8632-f6b7-499e-b6ee-49dd23d7a484.png#averageHue=%23232529&clientId=u142a94da-44f9-4&from=paste&height=269&id=udd8573e8&originHeight=1076&originWidth=1910&originalType=binary&ratio=1&rotation=0&showTitle=false&size=278420&status=done&style=stroke&taskId=uce814c24-cb43-44ff-89fa-12892909ff7&title=&width=478)<br />8、成功运行<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720408237405-12f939b8-4b34-4649-b689-71b790af4be9.png#averageHue=%23232529&clientId=u142a94da-44f9-4&from=paste&height=270&id=uc908816a&originHeight=1079&originWidth=1912&originalType=binary&ratio=1&rotation=0&showTitle=false&size=287935&status=done&style=stroke&taskId=u887195fb-79bf-44a4-9881-0d617ff64ff&title=&width=478)<br />总结：前端编写的 utils 工具函数想要让外部访问，以 EsModules 的方式通过：
> export default 或者 export 进行导出，外部使用 import 进行导入
> Java 则是通过 package 进行导出，那么 导入也是 import 吗？

<a name="prY5o"></a>
### 二、import 导入？
1、在 package 中我们演示了 package 的作用，用于定义包，那么包是怎么导入的呢？<br />也是通过 import :<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720408747727-00c836c3-13c5-46fd-a660-2d105b587012.png#averageHue=%23232529&clientId=u142a94da-44f9-4&from=paste&height=270&id=u63a1041a&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=282854&status=done&style=stroke&taskId=u4e3f9522-67e6-4975-a54c-9ac2619a81d&title=&width=479)<br />2、不过我们发现 这里一截有点长，都有啥作用呢？
```java
com.chuxin.demohelloworld.utils.common
```
拆分为3中颜色演示：（utils 和 common 对应的是创建的utils文件夹和common文件类）<br />com.chuxin.demohelloworld.utils.common<br />3、com.chuxin.demohelloworld 在项目创建时填写的，创建一个新项目演示一下<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720409336630-e8441503-671c-46ee-900e-fb20fa53a338.png#averageHue=%23272a2e&clientId=u142a94da-44f9-4&from=paste&height=270&id=ubd8b9b50&originHeight=1079&originWidth=1911&originalType=binary&ratio=1&rotation=0&showTitle=false&size=300364&status=done&style=stroke&taskId=ucdd4e2aa-9937-4bd8-aa24-a4c63f60e7a&title=&width=478)<br />4、思考一个问题，如果把“组”和“工件”还有“ 软件包名称”都修改不一样，最终验证是以“软件包名称”为准么？（删除刚刚创建的项目 重新来一遍）<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720409590575-cd8fb7a2-4724-4421-ab82-16d2a8f8fec2.png#averageHue=%23272a2f&clientId=u142a94da-44f9-4&from=paste&height=270&id=u6cef1cec&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=301195&status=done&style=stroke&taskId=uade96206-f835-44d6-9ddb-5cbf9bec66d&title=&width=479)<br />5、最终验证是以“软件包名称”为准<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720411387456-a5588139-b282-4f3d-bf42-67d6280552ae.png#averageHue=%2324252a&clientId=u142a94da-44f9-4&from=paste&height=270&id=ub57d7ad0&originHeight=1079&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=291460&status=done&style=stroke&taskId=ub34a5347-6f17-4bdd-926e-c1bbebe267e&title=&width=479)<br />6、只是在语法上 import 和前端不一样，不用赋值
```javascript
// 前端
import {add} from "./utils/index.js"
```
7、而 Java 中
```java
import com.chuxin1.demohelloworld1.utils.common;
```
8、那么 包内能存在两个 common 吗？<br />发现不能进行相同文件的创建，会提示无法创建：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720411713159-7783bf4f-2671-404a-b65e-9515fcd059d0.png#averageHue=%2324272d&clientId=u142a94da-44f9-4&from=paste&height=269&id=u9f6e6575&originHeight=1075&originWidth=1913&originalType=binary&ratio=1&rotation=0&showTitle=false&size=302219&status=done&style=stroke&taskId=uc9bf1632-d12e-48ff-b1c9-40c7036df46&title=&width=478)
<a name="t6C7p"></a>
### 三、System 作用
1、System 好比 utils 的工具包一样，它是 Java 的内置包提供基础API <br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720411876705-175fe383-3cfd-430f-8c4d-1b75e11da738.png#averageHue=%23232529&clientId=u142a94da-44f9-4&from=paste&height=270&id=uad56107b&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=278445&status=done&style=stroke&taskId=u3d0710f8-be6e-4d61-a13e-979e1dfa1c3&title=&width=480)<br />2、类比前端的 window <br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1719459383750-4e2ce5c1-4779-4551-a6f0-f04e7150fe53.png#averageHue=%23302e2c&clientId=u6c69e585-de71-4&from=paste&height=270&id=ucf1402ac&originHeight=1079&originWidth=1918&originalType=binary&ratio=1&rotation=0&showTitle=false&size=217209&status=done&style=stroke&taskId=u26bd0fd3-3438-4433-bac5-16700e776b0&title=&width=480)<br />3、前端输出打印
```java
console.log("chuxin")
```
4、Java 输出打印
```java
System.out.println("Hello World!");
```
<a name="mmKj2"></a>
### 四、文件大小写规范
1、utils/common 作为 package 演示时 故意创建的是小写的，但是 Java 一般规范是驼峰命令，且首字母大写<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720412040431-738b829b-55d6-4249-8270-6f5a0719f121.png#averageHue=%23232428&clientId=u142a94da-44f9-4&from=paste&height=267&id=uee75b8ae&originHeight=1069&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=228619&status=done&style=stroke&taskId=u4e7d3bbc-a5b3-4596-989a-72a0e972f48&title=&width=479)<br />2、修改类名为大写<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720412248164-10bf768d-9739-4851-a14b-949911bd9513.png#averageHue=%2325272c&clientId=u142a94da-44f9-4&from=paste&height=270&id=u75f7ad94&originHeight=1078&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=318098&status=done&style=stroke&taskId=u15f48823-a1af-4f1b-afdb-b3c19971058&title=&width=479)<br />3、重命名文件名<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720412320058-3f59be24-59ad-474b-ab90-38cc0f5e7bad.png#averageHue=%2326282d&clientId=u142a94da-44f9-4&from=paste&height=269&id=u6f4fbf2f&originHeight=1074&originWidth=1915&originalType=binary&ratio=1&rotation=0&showTitle=false&size=321057&status=done&style=stroke&taskId=ub9dfebeb-fc32-4125-89e7-dc5f065efd4&title=&width=479)<br />4、调整主入口文件代码<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720412423020-5e55b598-8d6a-4070-b677-cf4629806d0a.png#averageHue=%23222428&clientId=u142a94da-44f9-4&from=paste&height=269&id=ud2d10a41&originHeight=1076&originWidth=1914&originalType=binary&ratio=1&rotation=0&showTitle=false&size=293128&status=done&style=stroke&taskId=ud60210d4-1e6c-4b59-b0d2-1a93150c7c5&title=&width=479)<br />代码如下：
```java
package com.chuxin.demohelloworld;

import com.chuxin.demohelloworld.utils.Common;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoHelloWorldApplication {

    public static void main(String[] args) {
        // 打印 hello world
        System.out.println("Hello World!");

        // package 代码演示
        Common common = new Common();
        System.out.println(common.add(1,2));

        // spring boot 启动
        SpringApplication.run(DemoHelloWorldApplication.class, args);
    }
}

```
5、运行代码，看是否报错：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720412523610-5115425b-b3d9-4e28-86f1-7c665ac20c07.png#averageHue=%23232529&clientId=u142a94da-44f9-4&from=paste&height=270&id=u6898c905&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=277201&status=done&style=stroke&taskId=uc456a847-19f2-4ba1-a8fe-c12fed687cd&title=&width=479)<br />6、输出结果<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1720412543196-22a7d695-7348-4476-9191-cf1800670cbe.png#averageHue=%23232529&clientId=u142a94da-44f9-4&from=paste&height=269&id=u0d6c9054&originHeight=1074&originWidth=1908&originalType=binary&ratio=1&rotation=0&showTitle=false&size=294619&status=done&style=stroke&taskId=ua18ad85e-e6ab-47d6-ae4a-40a96ecef8e&title=&width=477)
<a name="JjDmS"></a>
## 代码仓库
[spring-boot-demo/demo-hello-world at master · chuxin-cs/spring-boot-demo](https://github.com/chuxin-cs/spring-boot-demo/tree/master/demo-hello-world)
<a name="JJRQq"></a>
## 往期内容
[🌱 目录](https://www.yuque.com/chuxin-cs/it/ge9wybczy0wsq1l1?view=doc_embed)
