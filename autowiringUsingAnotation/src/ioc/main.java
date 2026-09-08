package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import autowiringUsingAnotation.Student;

import resources.applicationConfiguration;
//in this i learn how i can inject beans manually by java configuration class an by using Annotation autowired 
//in this two class Student and addresh and here beans of Addresh inject in Student object

public class main {
	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(applicationConfiguration.class);
	Student std=context.getBean(Student.class);
	std.display();
	}
}
