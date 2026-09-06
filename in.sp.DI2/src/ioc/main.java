package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.DI1.student;
// dependency injection using constructor
//use constructor argu property in xml , use ref


public class main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/applicationContext.xml");//spring ioc container
		student std=context.getBean(student.class);//get the student class bean with dependency information 
		std.display();//call the display of student
	}

}
