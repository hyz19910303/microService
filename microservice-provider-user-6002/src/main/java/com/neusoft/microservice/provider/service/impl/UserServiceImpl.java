package com.neusoft.microservice.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.microservice.beans.User;
import com.neusoft.microservice.provider.dao.UserDao;
import com.neusoft.microservice.provider.service.UserService;

/**
*Create at 2018年7月22日 下午12:23:49
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

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserDao  userdao;
	
	
	@Override
	public User getUser(String id) {
		User user = userdao.findUser(id);
		return user;
	}

	@Override
	public boolean addUser(User user) {
		Integer insert = userdao.addUser(user);
		return insert==1?true:false;
	}

	@Override
	public List<User> getUserList() {
		List<User> selectList = userdao.selectList();
		return selectList;
	}

}
