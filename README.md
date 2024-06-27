# jar包模板

> ### 1.作用：此项目是一个基于springboot的初始化jar包模板，旨在快速开发一个基于springboot的web项目。
> ### 2.使用：将模板中的内容替换成自己的项目内容，然后使用maven打包成jar包。
> ### 3.注意：使用时注意配置application.yml文件。以及配置数据库连接信息。还有maven配置。
> ### 4.项目结构：
> 1. src/main/java/com/zzh/controller：控制层
> 2. src/main/java/com/zzh/config：配置层
> 3. src/main/java/com/zzh/mapper：数据层
> 4. src/main/java/com/zzh/pojo：实体类
> 5. src/main/java/com/zzh/service：业务层
> 6. src/main/java/com/zzh/utils：工具类
> 7. src/main/java/com/zzh/AppStart.java：启动类
> 8. src/main/resources/com/zzh/mapper：mybatis的xml文件
> 9. src/main/resources/application.yml：项目配置文件
> 10. src/main/resources/logback-spring.xml：日志配置文件
> 
> ### 5.项目依赖：
> 1. spring-boot-starter-web：web开发模块
> 2. spring-boot-starter-parent：springboot的父项目
> 3. spring-boot-starter-test：springboot的单元测试模块
> 4. lombok：简化实体类开发
> 5. mysql-connector-java：mysql驱动
> 6. mybatis-spring-boot-starter：mybatis的springboot模块
> 7. druid：数据库连接池
> 8. slf4j-api：日志接口
> 9. logback-classic：日志实现类
> 10. logback-core：日志实现类
> 11. spring-boot-maven-plugin：maven打包插件
> ### 6.项目开发部署说明：
> 1. pom文件是否配置了maven打包插件，如果没有配置，请配置maven打包插件。
> 2. 使用maven的命令打包jar包：mvn clean package -Dmaven.test.skip=true或mvn clean install -Dmaven.test.skip=true还可以直接用idea的maven插件打包。
> 3. maven项目打包成jar包后，将jar包放到服务器的bin目录下，然后执行startup.bat启动项目。
> 4. 或者直接使用命令行启动项目：java -jar jar包名.jar（注：打jar包可以将配置文件放到jar包外方便管理，jar包外使用命令行java -jar jar包名.jar --spring.config.location=application.yml）
> 5. 可以将命令行放到bat文件中，方便启动项目。
> 6. 启动项目后，访问项目地址：http://localhost:8080/
