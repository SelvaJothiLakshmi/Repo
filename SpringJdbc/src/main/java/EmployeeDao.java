import java.util.List;

public interface EmployeeDao {
	
	public void createTable();
	
	public void insertData(Employee e) ;
	
	public List<Employee> getEmployee();
	
	public  Employee getEmployeeById(int empId);

}
