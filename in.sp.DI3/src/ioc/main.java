package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.DI1.Addresh;
import in.sp.DI1.student;

// circular dependency injection 
// it is an done by setter getter DI here addresh and student both class exchange there dependency


public class main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/applicationContext.xml");//spring ioc container
		student std1=context.getBean(student.class);//get the student class bean with dependency information 
		std1.Studentdisplay();
		
		 System.out.println(".......................................");
		 Addresh ad1=context.getBean(Addresh.class);
		 ad1.AddreshDisplay();
	}

}
