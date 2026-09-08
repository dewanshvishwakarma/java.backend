package autowiringUsingAnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	private int roll;
	@Autowired
	@Qualifier("addreshBean2")
	private Addresh addresh;
	
	// autowired can use in fields,constructor ,setter method
	public Addresh getAddresh() {
		return addresh;
	}
	 
	public void setAddresh(Addresh addresh) {
		this.addresh = addresh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
