package com.sxt.service.impl;

import com.sxt.dao.UserDao;
import com.sxt.domain.User;
import com.sxt.factory.BeanFactory;
import com.sxt.service.UserService;

public class UserServiceImpl implements UserService{
	
	//private UserDao userDao=new UserDaoImpl();
	//private UserDao userDao=UserFactory.getUserDao();
	//private UserDao userDao=BeanFactory.getBean(UserDaoImpl.class);
	//private UserDao userDao=BeanFactory.getBean("com.sxt.dao.impl.UserDaoImpl");
	//private UserDao userDao=BeanFactory.getBean("userDao");
	private UserDao userDao=BeanFactory.getBean("userDao");

	@Override
	public User queryUserById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.queryUserById(id);
	}
	
	

}
