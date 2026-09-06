package spSpring1;

public class student {
	private String name;
	private int roll;
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
	
	public void display() {
		System.out.println("name of student" + name);
		System.out.println("roll number of student is" + roll);
	}

}
