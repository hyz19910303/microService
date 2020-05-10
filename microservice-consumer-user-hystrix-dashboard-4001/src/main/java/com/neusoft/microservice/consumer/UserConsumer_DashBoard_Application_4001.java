package com.neusoft.microservice.consumer;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
*Create at 2018年8月7日 下午3:19:06
*
*@autuor huyz
*
*@version 1.0
*
*ProjectName microservice-consumer-user-hystrix-dashboard-4001
*
*Description: 
*        
*/
@SpringBootApplication
@EnableHystrixDashboard
public class UserConsumer_DashBoard_Application_4001 {

	public static void main(String[] args) {
		SpringApplication.run(UserConsumer_DashBoard_Application_4001.class, args);
	}


}
