package service.impl;

import dao.UserDao;
import domain.User;
import factory.BeanFactory;
import service.UserService;

public class UserService2Impl implements UserService{
	
	//private UserDao userDao=new UserDaoImpl();
	//private UserDao userDao=UserFactory.getUserDao();
	//private UserDao userDao=BeanFactory.getBean(UserDaoImpl.class);
	//private UserDao userDao=BeanFactory.getBean("com.sxt.dao.impl.UserDaoImpl");
	//private UserDao userDao=BeanFactory.getBean("userDao");
	
	//private UserDao userDao=BeanFactory.getBean("userDao");
	private UserDao userDao;
	//加入set方法
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User queryUserById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.queryUserById(id);
	}
	
	

}
