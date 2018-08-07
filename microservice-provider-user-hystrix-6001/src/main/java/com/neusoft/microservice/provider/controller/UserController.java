package com.neusoft.microservice.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
	
	//服务熔断机制 找不到即调用对应的熔断方法
	@HystrixCommand(fallbackMethod="captureUserNoFound")
	@RequestMapping("/{id}")
	public Object getUserInfo(@PathVariable(name="id")String id) {
		User user = userService.getUser(id);
		if(user == null) {
			throw new NullPointerException("未找到ID为:"+id+"的用户");
		}
		return user;
	}
	
	//熔断 后调用的 方法
	public Object captureUserNoFound(@PathVariable(name="id")String id) {
		User user = new User();
		return user.setName("该ID:"+id+"没有对应的信息 @HystrixCommand").setEmail("5657*****@qq.com");
	}
	
	
	@RequestMapping("/list")
	public Object getUserList() {
		List<User> userList = userService.getUserList();
		if(userList.size()==0) {
			throw new NullPointerException("列表少于1个");
		}
		return userList;
	}
	
	@RequestMapping("/add")
	public Object addUser(User user) {
		return userService.addUser(user);
	}
	
}
