![24.png](https://cdn.nlark.com/yuque/0/2023/png/26242735/1686721742667-c75d3b5e-5381-480f-a032-bcf31c92c773.png#averageHue=%23d1a56e&clientId=ued660751-61d6-4&from=ui&id=u556bab50&originHeight=312&originWidth=937&originalType=binary&ratio=1.100000023841858&rotation=0&showTitle=false&size=124239&status=done&style=none&taskId=ueec3b974-e965-4717-a690-cf4380f9974&title=)
<a name="nEBcM"></a>
## 今日话题
> Java 环境安装
> 作者：云层上的光
> 时间：2024年6月20日 15时43分14秒

<a name="lgI2N"></a>
## 主线任务 
<a name="GHYni"></a>
### 一、idea 安装 
安装方式非常简单，一路回车即可~<br />[Download IntelliJ IDEA – The Leading Java and Kotlin IDE](https://www.jetbrains.com/idea/download/)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718869409606-34e963bc-32ac-4229-b3f5-fc49c6c90abe.png#averageHue=%23f3dfad&clientId=uff5a1c19-d687-4&from=paste&height=269&id=udeeb200e&originHeight=1075&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=392761&status=done&style=stroke&taskId=ubf02a0e4-ab2a-4b70-9d24-7fb1294feae&title=&width=479)
<a name="QIkMw"></a>
### 二、idea 安装 JDK 
在idea编辑器中进行JDK下载，选择自己需要的JDK版本<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718870998835-f54392e3-2a6d-40de-bc1e-db96176ed3ad.png#averageHue=%2316272e&clientId=uff5a1c19-d687-4&from=paste&height=267&id=u2313e2eb&originHeight=1068&originWidth=1904&originalType=binary&ratio=1&rotation=0&showTitle=false&size=1017305&status=done&style=stroke&taskId=u0911c393-9c46-47b9-a9d7-4df1a9b7bf4&title=&width=476)
<a name="uZzoG"></a>
## 支线任务 
<a name="epM1I"></a>
### 一、为什么使用 idea 下载 JDK
Java 开发环境需要安装 [JDK](https://www.oracle.com/java/technologies/downloads/) 和 [Maven](https://maven.apache.org/download.cgi) ，之后需要设置环境变量，作为老前端，前期在不了解 Java 的情况下，有什么替代方案嘛？
> 暂时先借助 [idea](https://www.jetbrains.com/idea/download/?section=windows) 进行JDK安装、并且 idea 自带 Maven，可以不需要手动下载 Maven，前期不需要把重心放到环境上

<a name="pIrkt"></a>
### 二、传统方式可能会出现的痛点

- 以前端举例，传统开发中，前端通过node官网下载指定版本安装，随着业务发展出现了 nvm 进行node版本切换和维护管理，避免了不同项目依赖不同node版本的痛点
- 使用 idea 的话 好像还挺方便来管理维护 JDK 的版本，并且编辑器也自带了 Maven 
- 不过我有预感，后续如果上手做项目 可能还得手动下载 JDK 和 Maven 到本地，目前先就这样吧
<a name="Ip2T5"></a>
### 三、JDK 是什么？

- Java 版本指的是 Java JDK 版本
- Java JDK 经典版本  Java 8 ，也可以叫 Java 1.8
- 目前的 Spring Boot 必须需要使用 Java JDK 17 版本，并且新版编辑器都选择不到 Java SDK 8
- 站在前端的视角，JDK 就是前端的 node
- 它用来运行和编译 Java 代码的 编译出来的文件后缀是 .class
<a name="NinkT"></a>
### 四、本地安装 JDK
TODO 2024年6月20日 15时43分14秒
<a name="GLspI"></a>
### 五、新款编辑如何选择 JDK 8
新款的 idea 编辑器为了推 spring boot 3 从而放弃了 JDK 8 的选择，老款的编辑器则是有8的版本的<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718872324866-1b3b3a5d-c8f7-47f0-923f-7860f8658544.png#averageHue=%2327292d&clientId=uae3ae134-7d99-4&from=paste&height=270&id=u9a2350f7&originHeight=1079&originWidth=1916&originalType=binary&ratio=1&rotation=0&showTitle=false&size=269836&status=done&style=stroke&taskId=ub57408f4-c64f-4461-82b2-9250338e730&title=&width=479) <br />解决办法：<br />安装旧的版本编辑器就不考虑了，这里使用阿里的镜像：[https://start.aliyun.com](https://start.aliyun.com)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718872402396-3ec6cc71-cd46-4946-a92c-fcf0efb5d4df.png#averageHue=%2327292d&clientId=uae3ae134-7d99-4&from=paste&height=270&id=u1b34e55d&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=277719&status=done&style=stroke&taskId=u91307944-129c-4369-a4b9-72bc6375cc5&title=&width=479)<br />此时可以选择 Java JDK 8<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/26242735/1718872427647-3a5f90f3-0815-4862-a051-1b0757ec1393.png#averageHue=%2326292d&clientId=uae3ae134-7d99-4&from=paste&height=270&id=u61a04442&originHeight=1079&originWidth=1917&originalType=binary&ratio=1&rotation=0&showTitle=false&size=268968&status=done&style=stroke&taskId=u7137bfb5-5f3a-41af-9fa0-dfd99c120a7&title=&width=479)
<a name="hc2Hl"></a>
### 六、Maven 又是什么？

- 用于安装和管理项目依赖，对标前端的npm
- 拥有pnpm的本地依赖功能，依赖下载之后下次再下载时优先查找本地依赖
- npm 可以搭建私服，嘿嘿 Maven 表示也可以，所以有些公司会搭建私服指定固定的版本，这个时候就需要下载Maven 在 idea 中导入
- 还有很多其他功能，暂时先了解到这里~
<a name="fbVvP"></a>
## 往期内容
[🌱 目录](https://www.yuque.com/chuxin-cs/it/ge9wybczy0wsq1l1?view=doc_embed)


<a name="XNApr"></a>
## 

