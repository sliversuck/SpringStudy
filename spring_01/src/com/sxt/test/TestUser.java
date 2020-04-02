package com.sxt.test;

import com.sxt.controller.DeptController;
import com.sxt.controller.UserController;
import com.sxt.factory.BeanFactory;
import com.sxt.factory.UserFactory;

public class TestUser {
	public static void main(String[] args) {
		//创建UserController 对象
		/*UserController userController=new UserController();
		userController.queryUserById();*/
		
		//using factory
//		UserController userController1=UserFactory.getUserController();
//		userController1.queryUserById();
		
		//using benfactory
		//UserController userController1=BeanFactory.getBean(UserController.class);
		//UserController userController1=BeanFactory.getBean("userController");
		UserController userController1=BeanFactory.getBean("userController");
		userController1.queryUserById();

	}

}
