package com.neusoft.microservice.api;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neusoft.microservice.beans.User;

/**
*Create at 2018年7月21日 下午6:26:30
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName microservice-inerfance
*
*Description: 
*        
*/

@FeignClient(value="MICROSERVICECLOUD-USER")
@RequestMapping("/user")
public interface UserInterfance {
	
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	boolean addUser(User user);
	
	@RequestMapping(value = "/{id}",method=RequestMethod.GET)
	User getUser(@PathVariable("id")String id);
	
	@RequestMapping(value = "/list",method=RequestMethod.GET)
	List<User> getUserList();
}
