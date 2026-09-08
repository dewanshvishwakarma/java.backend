package in.sp.DI1;

public class student {
	private String name;
	private int roll;
	private Addresh addresh;
	
	
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
	public Addresh getAddresh() {
		return addresh;
	}
	public void setAddresh(Addresh addresh) {
		this.addresh = addresh;
	}
	
	
	@Override
	public String toString() {
		return "student [name=" + name + ", roll=" + roll + ", addresh=" + addresh + "]";
	}
	
	public void display() {
		System.out.println("name is " + name);
		System.out.println("roll number is " + roll);
		System.out.println("addresh " + addresh);
	}
	
	
	

}
