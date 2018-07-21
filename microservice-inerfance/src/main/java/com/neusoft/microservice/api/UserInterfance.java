package com.neusoft.microservice.api;

import java.util.List;

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
public interface UserInterfance {
	
	boolean addUser(User user);
	
	boolean getUser(String id);
	
	List<User> getUserList();
}
