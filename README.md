# microService 微服务 example
微服务---springcloud
##启动流程
+ 1、启动配置中心（config模块，可以设置读取远程配置也可以设置读取本地配置，动态刷新配置文件未加依赖包），此处配置了所有模块的配置文件
+ 2、启动服务注册中心 eureka模块，分别为 eureka9001,eureka9002,eureka9003,他们的配置文件都从config模块拉取
+ 3、启动服务提供者 provier模块，分别为6001-6003
+ 4、启动消费者 consumer模块，为5001
+ 5、启动zipkin 服务端 进行链路追踪
+ 6、按照实际情况决定是否启动zuul网关，启动前重新配置路由信息