package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spSpring1.student;

//import org.apache.catalina.core.ApplicationContext;

//import jdk.internal.loader.URLClassPath;

public class main {
	public static void main(String[] args) {
		ApplicationContext container =new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		student std=(student)container.getBean("std1");
		std.display();
	}

}
