package com.sxt.dao.impl;

import com.sxt.dao.UserDao;
import com.sxt.domain.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User queryUserById(Integer id) {
		// TODO Auto-generated method stub
		User user=null;
		switch (id) {
		case 1:
			user= new User(1,"小明","武汉");
			break;
		case 2:
			user= new User(2,"laozhang","shenzheng");
			break;
		case 3:
			user= new User(3,"老周","日本");
			break;
			
		}
		 return user;
	}

}
