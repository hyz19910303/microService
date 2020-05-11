#微服务网关 Zuul
###所有的服务调用都先经过zuul网关
###调用格式为
http:ip:port/zuul-prefix/[serviceid/path]/真实url
* http://localhost:9521/microservice/microservicecloud-user/user/list
* http://localhost:9521/microservice/provier/user/list
###
* http://localhost:9521/microservice/microservicecloud-user/user/1
* http://localhost:9521/microservice/provier/user/1

