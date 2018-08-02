package com.neusoft.microservice.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
*Create at 2018年8月2日 下午3:20:33
*
*@autuor huyz
*
*@version 1.0
*
*ProjectName microservice-consumer-user-5001
*
*Description: 
*        
*/

@Configuration
public class RestConfiguration {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
