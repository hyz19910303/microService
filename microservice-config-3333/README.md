微服务配置中心
##该配置中心配置了微服务模块所有的配置文件
#访问方式
* (2)localhost:3333/application-dev.yml 
* (1)localhost:3333/application/dev/master 
* (3)localhost:3333/master/application-dev.yml
#有如下几种
* 1、/{application}/{profile}[/{lable}]
* 2、/{application}-{profile}.yml
* 3、/{label}/{application}-{profile}.yml
* 4、/{application}-{profile}.properties
* 5、/{lable}/{application}-{profile}.properties