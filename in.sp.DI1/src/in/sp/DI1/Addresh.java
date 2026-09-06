package in.sp.DI1;

public class Addresh {
	private int houseno;
	private String city;
	private int pin;
	
	
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Addresh [houseno=" + houseno + ", city=" + city + ", pin=" + pin + "]";
	}
	

}
