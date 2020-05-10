package com.neusoft.microservice.provider;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
*Create at 2018年7月21日 下午9:14:13
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName microservice-provider-user-hystrix-6001
*
*Description: 
*        
*/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient// 服务发现
@EnableCircuitBreaker  //对hystrix 熔断机制的支持
@MapperScan(basePackages= {"com.neusoft.microservice.provider.dao"})

public class UserProviderDocument_Hystrix_6001 {

	public static void main(String[] args) {
		SpringApplication.run(UserProviderDocument_Hystrix_6001.class, args);
	}

	//	/ 此配置是为了服务监控而配置，与服务容错本身无关，
	// ServletRegistrationBean因为springboot的默认路径不是"/hystrix.stream"，
	// 只要在自己的项目里配置上下面的servlet就可以了 此配置为2.0x 版本需加上 1.5不需要
	@Bean
	public ServletRegistrationBean getServlet() {
		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
		registrationBean.setLoadOnStartup(1);
		registrationBean.addUrlMappings("/hystrix.stream");
		registrationBean.setName("HystrixMetricsStreamServlet");
		return registrationBean;
	}

}
