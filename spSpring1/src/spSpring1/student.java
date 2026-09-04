package spSpring1;

import java.util.List;
import java.util.Map;

public class student {
	private String name;
	private int roll;
	private List<String> subjects;
	private Map<String,Integer> submarksMap;
	
	public String getName() {
		return name;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public Map<String, Integer> getSubmarksMap() {
		return submarksMap;
	}
	public void setSubmarksMap(Map<String, Integer> submarksMap) {
		this.submarksMap = submarksMap;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
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
	
	public void display() {
		System.out.println("name of student" + name);
		System.out.println("roll number of student is" + roll);
		System.out.println("list is " + subjects);
		System.out.println("subject marks is " + submarksMap);
		
	}

}
