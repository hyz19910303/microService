package com.neusoft.microservice.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserInterfance userService;
	
	
	@RequestMapping("{id}")
	private String  getUserInfo(@PathVariable(name="id")String id) {
		 User user = userService.getUser(id);
		 return user.toString();
	}
	
}
