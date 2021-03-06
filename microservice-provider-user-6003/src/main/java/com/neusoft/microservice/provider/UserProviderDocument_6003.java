package com.neusoft.microservice.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
*Create at 2018年7月21日 下午9:14:13
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName microservice-provider-user-6001
*
*Description: 
*        
*/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient// 服务发现
@MapperScan(basePackages= {"com.neusoft.microservice.provider.dao"})
public class UserProviderDocument_6003 {

	public static void main(String[] args) {
		SpringApplication.run(UserProviderDocument_6003.class, args);
	}

}
