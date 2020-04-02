

import controller.UserController;
import factory.BeanFactory;


public class TestUser {
	public static void main(String[] args) {
		//����UserController ����
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
