package com.neusoft.microservice.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.microservice.beans.User;

/**
*Create at 2018年7月21日 下午10:01:28
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

public interface UserDao// extends BaseMapper<User>
{
	int addUser(User user);
	
	User findUser(@Param("id")String id);
	
	List<User> selectList();
}
