package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import autowiringUsingAnotation.Addresh;
import autowiringUsingAnotation.Student;



@Configuration
public class applicationConfiguration {
	@Bean
	public Addresh addreshBean() {
		Addresh ad1=new Addresh();
		ad1.setCityString( "piparia");
		ad1.setHouseNo(72);
		ad1.setPincode(462026);
		return ad1; 
	}
	@Bean
	public Student studentcreate() {
		Student std=new Student();
		std.setName("sanjana");
		std.setRoll(75);
		//std.setAddresh(addreshBean());//manually dependency injection
		return std;
		
	}
}
