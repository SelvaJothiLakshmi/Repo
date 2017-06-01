import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	private DataSource datasource;
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	public void createTable() {
		String sql="create Table test.Employee(EmpId int,lastName varchar(255),firstName varchar(255))";
		jdbcTemplate.execute(sql);
		System.out.println("table created");
	}
	public void insertData(Employee e) {
		
		int empid=e.getEmpId();
		String firstName= e.getFirstName();
		String lastName = e.getLastName();
		
		String sql="insert into test.Employee values (?,?,?)";
		int result=jdbcTemplate.update(sql, empid,firstName,lastName);
		System.out.println(result+"row inserted");
	}
	public  List<Employee> getEmployee(){
		
		String sql="select * from test.Employee";
		List<Employee> result1=jdbcTemplate.query(sql,new EmployeeMapper());
		return result1;
	}
	
	
	public  Employee getEmployeeById(int empId){
		
		String sql="select * from test.Employee where EmpId=?";
		Employee emp=jdbcTemplate.queryForObject(sql, new Object[]{empId}, new EmployeeMapper());
		return emp;
	}
	
	

}
