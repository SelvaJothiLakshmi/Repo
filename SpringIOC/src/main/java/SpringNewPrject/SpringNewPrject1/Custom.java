package SpringNewPrject.SpringNewPrject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Custom {
	
	private int custmerId;
	private String custName;
	private  Address address;
	public int getCustmerId() {
		return custmerId;
	}
	public void setCustmerId(int custmerId) {
		this.custmerId = custmerId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	@Qualifier("addressAnno")
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Custom [custmerId=" + custmerId + ", custName=" + custName + ", address=" + address + "]";
	}
	public Custom(int custmerId, String custName, Address address) {
		super();
		this.custmerId = custmerId;
		this.custName = custName;
		this.address = address;
	}
	public Custom() {
		super();
	}
	public Custom(int custmerId, String custName) {
		super();
		this.custmerId = custmerId;
		this.custName = custName;
	}

	
	
	
	

}
