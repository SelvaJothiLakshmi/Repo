import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	
	private String firstName;
	private String lastName;
	private int empid;
	private double salary;
	
	public Employee(){}
	
	
	public Employee(String firstName, String lastName, int empid, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empid = empid;
		this.salary = salary;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empid=" + empid + ", salary=" + salary
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}


	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid;
		
	}
	
	public static Comparator<Employee> byNameComparator = new Comparator<Employee>(){
		@Override
		public int compare(Employee emp1, Employee emp2){
			return emp1.getFirstName().compareTo(emp2.getFirstName());
		}
		
	};

	
	
	
	

}
