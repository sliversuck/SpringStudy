package dao.impl;
import dao.UserDao;
import domain.User;

public class UserDao2Impl implements UserDao {

	public User queryUserById(Integer id) {
		// TODO Auto-generated method stub
		User user=null;
		switch (id) {
		case 1:
			user= new User(1,"С��1","�人");
			break;
		case 2:
			user= new User(2,"laozhang2","shenzheng");
			break;
		case 3:
			user= new User(3,"����3","�ձ�");
			break;
			
		}
		 return user;
	}

}
