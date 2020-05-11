package com.neusoft.microservice.rule;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

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
public class RuleConfiguration {


//	@Bean
//	@LoadBalanced
//	public IRule getIRule() {
//		//轮训规则
//		RetryRule retryRule = new RetryRule();
//		//IRule retryRule= new MyLoadBalanceRule();
//		return retryRule;
//	}
}
