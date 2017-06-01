package SpringNewPrject.SpringNewPrject1;

public class Address {
	
	
	private String doorNo;
	private String streetName;
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + "]";
	}
	public Address(String doorNo, String streetName) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
	}
	public Address() {
		super();
		System.out.println("inside constructor method");
	}

	public void init(){
		
		System.out.println("inside init method");
	}
	
	public void destroy(){
		
		System.out.println("inside destory method");
	}
	 

}



