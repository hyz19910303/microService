package com.neusoft.microservice.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

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
@EnableFeignClients
//@EnableDiscoveryClient
public class UserConsumerApplication_5001 {
	
	public static void main(String[] args) {
		SpringApplication.run(UserConsumerApplication_5001.class, args);
	}

}
