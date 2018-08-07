package com.neusoft.microservice.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.microservice.beans.User;
import com.neusoft.microservice.provider.service.UserService;

/**
*Create at 2018年7月21日 下午9:46:24
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName microservice-provider-user-6001
*
*Description: 
*        
*/
@RestController()
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/{id}")
	public Object getUserInfo(@PathVariable(name="id")String id) {
		User user = userService.getUser(id);
		if(user==null) {
			throw new NullPointerException("未找到相应的用户信息");
		}
		return user;
	}
	
	@RequestMapping("/list")
	public Object getUserList() {
		return userService.getUserList();
	}
	
	@RequestMapping("/add")
	public Object addUser(User user) {
		return userService.addUser(user);
	}
	
}
