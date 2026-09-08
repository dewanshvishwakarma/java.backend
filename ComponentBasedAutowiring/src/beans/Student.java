package beans;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	private String name;
	private int roll;
	private Addresh addresh;
	

	public Student(@Value("dewansh") String name, @Value("45")int roll,@Value("dewans nagar") @Autowired Addresh addresh) {
		super();
		this.name = name;
		this.roll = roll;
		this.addresh = addresh;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", addresh=" + addresh + "]";
	}
	
	public void display() {
		System.out.println("name is = " + name);
		System.out.println("roll number is " +  roll);
		System.out.println(" addresh is an "  + addresh);
		
	}

}
