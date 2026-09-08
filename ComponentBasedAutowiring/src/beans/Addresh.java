package beans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Addresh {
	private int houseNo;
	private String cityString;
	private int pincode;
	
	
	public Addresh(@Value("405") int houseNo,@Value("bangladesh") String cityString,@Value("465258") int pincode) {
		super();
		this.houseNo = houseNo;
		this.cityString = cityString;
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Addresh [houseNo=" + houseNo + ", cityString=" + cityString + ", pincode=" + pincode + "]";
	}
	
	
}
