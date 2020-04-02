package test;
import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Person;
import domain.User;
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
		ApplicationContext context= new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");
//		User user01 = (User) context.getBean("user01");
//		User user02 = (User) context.getBean("user01");
//		System.out.println(user01);
//		System.out.println(user02);
//		Date date =(Date) context.getBean("date01");
//		System.out.println(date);
		Person user02 = (Person) context.getBean("person02");
	}

}
