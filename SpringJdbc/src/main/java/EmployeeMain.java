import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeMain {

	
	public static void main(String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("JdbcBeans.xml");
				
		EmployeeDaoImpl emp=(EmployeeDaoImpl)context.getBean("empDao");
				
		//emp.createTable();
		
		/*Employee e1=new Employee();
		e1.setEmpId(3028);
		e1.setFirstName("surya");
		e1.setLastName("errat");
		
		Employee e2=new Employee();
		e2.setEmpId(1995);
		e2.setFirstName("Lakshman");
		e2.setLastName("suresh");*/
		
		//emp.insertData(e1);
		//emp.insertData(e2);
		
		/*List<Employee> Elist = emp.getEmployee();
		for(Employee e1:Elist){
			System.out.println("list---"+e1);
		} */		
		
		Employee e1=emp.getEmployeeById(3028);
		System.out.println("Employee====" + e1);
		
		
		
	}
}
