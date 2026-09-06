package in.sp.DI1;

public class Addresh {
	private int houseno;
	private String city;
	private int pin;
	 
	public Addresh(int houseno, String city, int pin) {
		super();
		this.houseno = houseno;
		this.city = city;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Addresh [houseno=" + houseno + ", city=" + city + ", pin=" + pin + "]";
	}
	

}
