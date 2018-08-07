package com.neusoft.microservice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
*Create at 2018年8月7日 下午4:39:26
*
*@autuor huyz
*
*@version 1.0
*
*ProjectName microservice-zuul-gateway-9521
*
*Description: 
*        
*/

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication_9521 {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication_9521.class, args);
	}

}
