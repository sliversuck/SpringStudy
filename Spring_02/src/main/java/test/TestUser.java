package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.UserController;
import factory.BeanFactory;

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
//		UserController userController1=BeanFactory.getBean("userController");
//		userController1.queryUserById();
		//加载spring的配置文件，并初始化IOC容器
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println(applicationContext);
		//方法1，使用id从IOC容器里面取出生成对象
		UserController userController=(UserController) applicationContext.getBean("userController");
		//方法二  如果有多个不能用，使用对象的类型从IOC容器里面取对象
		//UserController userController=applicationContext.getBean(UserController.class);
		userController.queryUserById();
	}

}
