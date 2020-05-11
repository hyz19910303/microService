package com.neusoft.microservice.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Create at 2018年8月2日 下午3:20:33
 *
 * @autuor huyz
 *
 * @version 1.0
 *
 *          ProjectName microservice-consumer-user-5001
 *
 *          Description:
 * 
 */

@Configuration
public class RestConfiguration {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

//	@Bean
//	@LoadBalanced
//	public IRule getIRule() {
//		//轮训规则
//		RetryRule retryRule = new RetryRule();
////		IRule retryRule= new MyLoadBalanceRule();
//		return retryRule;
//	}
}
