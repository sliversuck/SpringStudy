package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
//		UserController userController1=BeanFactory.getBean("userController");
//		userController1.queryUserById();
		//����spring�������ļ�������ʼ��IOC����
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println(applicationContext);
		//����1��ʹ��id��IOC��������ȡ�����ɶ���
		UserController userController=(UserController) applicationContext.getBean("userController");
		//������  ����ж�������ã�ʹ�ö�������ʹ�IOC��������ȡ����
		//UserController userController=applicationContext.getBean(UserController.class);
		userController.queryUserById();
	}

}
