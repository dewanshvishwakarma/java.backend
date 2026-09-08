package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import autowiringUsingAnotation.Student;

import resources.applicationConfiguration;
// handle multiple beans object using qualifier annotation

public class main {
	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(applicationConfiguration.class);
	Student std=context.getBean(Student.class);
	std.display();
	}
}
