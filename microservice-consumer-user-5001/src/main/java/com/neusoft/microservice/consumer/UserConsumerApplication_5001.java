package com.neusoft.microservice.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import com.neusoft.microservice.rule.configuration;

/**
*Create at 2018年7月28日 下午6:07:51
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName microservice-consumer-user-5001
*
*Description: 
*        
*/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.neusoft.microservice")
@ComponentScan("com.neusoft.microservice")
//自定义负载均衡策略
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=configuration.class)
public class UserConsumerApplication_5001 {
	
	public static void main(String[] args) {
		SpringApplication.run(UserConsumerApplication_5001.class, args);
	}

}
