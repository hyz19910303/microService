package com.neusoft.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
*Create at 2018年7月21日 下午6:40:05
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName microservice-euraeke-9002
*
*Description: 
*        
*/
@SpringBootApplication
@EnableEurekaServer
public class EurakaApplication_9002 {

	
	public static void main(String[] args) {
		SpringApplication.run(EurakaApplication_9002.class, args);
	}

}
