
public class Employee {
	
	private int EmpId;
	private String firstName;
	private String lastName;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	

}
