package com.sxt.controller;


import com.sxt.domain.User;
import com.sxt.factory.BeanFactory;
import com.sxt.factory.UserFactory;
import com.sxt.service.UserService;


public class UserController {
	
	//private UserService userService=new UserService2Impl();
	//private UserService userService=UserFactory.getUserService();
	//private UserService userService=BeanFactory.getBean("com.sxt.service.impl.UserServiceImpl");
	//private UserService userService=BeanFactory.getBean("userService");
	private UserService userService=(UserService) BeanFactory.ioc.get("userService");

	public void queryUserById(){
		int id=1;
		User user =userService.queryUserById(id);
		System.out.println(user);
	}
	

}
