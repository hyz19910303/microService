package com.neusoft.microservice.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.neusoft.microservice.api.UserInterfance;
import com.neusoft.microservice.beans.User;

/**
*Create at 2018年7月28日 下午9:06:15
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName microservice-consumer-user-5001
*
*Description: 
*        
*/

@RestController
@RequestMapping("/consumer/user")
public class UserController {
	
	@Autowired
	private UserInterfance userService;
	
//	private String url="http://localhost:6001/user/";
	private String url="http://MICROSERVICECLOUD-USER/user/";
	
	@Autowired
	private RestTemplate restTemp;
			
	
	
	@RequestMapping("/{id}")
	public Object  getUserInfo(@PathVariable(name="id")String id) {
		 User user = userService.getUser(id);
		 return user;
	}
	

	@RequestMapping("/list")
	public Object getUserList() {
		return userService.getUserList();
//		Object forObject = restTemp.getForObject(url+"list", Object.class);
//		return forObject;
	}
	
	@RequestMapping("/add")
	public Object addUser(User user) {
		return userService.addUser(user);
	}
	
}
