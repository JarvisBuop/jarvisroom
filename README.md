# jarvisroom. (developing...)
spring-boot demo

-----
-----------summary------------
-----

>war:

manager + manager web;

----

>jar:
 
kit 



-----
-----------relation knowledge------------
-----

>版本锁定

```

	apply plugin: 'io.spring.dependency-management'
	
	dependencyManagement {
	    dependencies {
	        dependency rootProject.ext.dependencies.thirdparty_fastjson
	        dependency rootProject.ext.dependencies.thirdparty_druid
	        dependency rootProject.ext.dependencies.thirdparty_httpclient
	        dependency rootProject.ext.dependencies.thirdparty_freemarker
	        dependency rootProject.ext.dependencies.thirdparty_mysql
	    }
	}

```

>@Value与@ConfigurationProperties 依赖注入实现变量的初始化;

1. `@Componen`组合`@Value` 使用application.properties的key:value注入;

2. 使用`@Component` `@ConfigurationProperties(prefix = "demo.bookVo")`
`@Validated`注入属性;


