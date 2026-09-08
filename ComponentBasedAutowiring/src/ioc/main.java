package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Student;
import resources.springConfiguration;

public class main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(springConfiguration.class);

        Student std = context.getBean(Student.class);

        std.display();
    }
}