package in.sp.DI1;

public class student {
	private String name;
	private int roll;
	private Addresh addresh;
	
	
	
	public student(String name, int roll, Addresh addresh) {
		super();
		this.name = name;
		this.roll = roll;
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
