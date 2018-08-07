package com.neusoft.microservice.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.neusoft.microservice.beans.User;

import feign.hystrix.FallbackFactory;

/**
*Create at 2018年8月7日 上午10:39:31
*
*@autuor huyz
*
*@version 1.0
*
*ProjectName microservice-inerfance
*
*Description: 
*        
*/

//hystrix  熔断 返回工厂

@Component
public class UserFallbackFactory implements FallbackFactory<UserInterfance>{

	@Override
	public UserInterfance create(Throwable cause) {
		
		return new UserInterfance() {
			
			@Override
			public List<User> getUserList() {
				return Arrays.asList();
			}
			
			@Override
			public User getUser(String id) {
				
				return new User().setAccountno(null).setName("未找到ID为："+id+"的相应的用户信息");
			}
			
			@Override
			public boolean addUser(User user) {
				return false;
			}
		};
	}

}
