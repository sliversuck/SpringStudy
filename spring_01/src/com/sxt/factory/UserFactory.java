package com.sxt.factory;

import com.sxt.controller.UserController;
import com.sxt.dao.UserDao;
import com.sxt.dao.impl.UserDaoImpl;
import com.sxt.service.UserService;
import com.sxt.service.impl.UserServiceImpl;

public class UserFactory {
	/**
	 * ����Service
	 */
	public static UserDao getUserDao() {
		return new UserDaoImpl();
		
	}
	/**
	 * ����Service 
	 */
	public static UserService getUserService(){
		return new UserServiceImpl();
	}
	/**
	 * ����Controller 
	 */
	public static UserController getUserController(){
		return new UserController();
	}
}
