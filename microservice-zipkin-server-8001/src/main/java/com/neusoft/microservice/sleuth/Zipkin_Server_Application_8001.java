package com.neusoft.microservice.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient// 服务发现
@EnableZipkinServer
public class Zipkin_Server_Application_8001 {

    public static void main(String[] args) {
        SpringApplication.run(Zipkin_Server_Application_8001.class, args);
    }
}
