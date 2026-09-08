package autowiringUsingAnotation;

public class Addresh {
	private int houseNo;
	private String cityString;
	private int pincode;
	
	
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Addresh [houseNo=" + houseNo + ", cityString=" + cityString + ", pincode=" + pincode + "]";
	}
	
}
