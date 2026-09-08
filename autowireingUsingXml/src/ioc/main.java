package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.DI1.student;

//learn autowireing in XML configuration by using autowiring attribute have mode like byName,byType,no 
public class main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		student std=context.getBean(student.class);
		std.display();
	}

}