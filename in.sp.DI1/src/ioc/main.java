package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.DI1.student;

//dependency injection using setter getter method use property tag in xml and ref attribute
public class main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		student std=context.getBean(student.class);
		std.display();
	}

}
