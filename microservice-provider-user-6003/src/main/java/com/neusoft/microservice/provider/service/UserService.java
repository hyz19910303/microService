package com.neusoft.microservice.provider.service;

import java.util.List;

import com.neusoft.microservice.beans.User;

/**
*Create at 2018年7月22日 下午12:22:36
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
public interface UserService {
	
	User  getUser(String id);
	
	
	boolean addUser(User user);
	
	
	List<User> getUserList();
	
}
