package com.neusoft.microservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
*Create at 2018年8月8日 下午6:06:24
*
*@autuor huyz
*
*@version 1.0
*
*ProjectName microservice-config-3333
*
*Description: 
*        
*/

@SpringBootApplication
@EnableConfigServer  //配置中心端
public class Config_Application_3333 {

	public static void main(String[] args) {
		SpringApplication.run(Config_Application_3333.class, args);
	}

}
