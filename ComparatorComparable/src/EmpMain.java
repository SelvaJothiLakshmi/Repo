import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setEmpid(1);
		e1.setFirstName("surya");
		e1.setLastName("Errat");
		e1.setSalary(100000);
		Employee e2=new Employee();
		
		//e2.setEmpid(1);
		//e2.setFirstName("surya");
		//e2.setLastName("Errat");
		//e2.setSalary(100000);
		
			e2.setEmpid(2);
		e2.setFirstName("surya");
		e2.setLastName("mariappan");
		e2.setSalary(100000);
		
		//HashMap<Employee,String> h1=new HashMap<Employee,String>();
		TreeMap<Employee,String> h1=new TreeMap<Employee,String>();
		h1.put(e1,"firstEmp");
		h1.put(e2,"secEmp");
		ArrayList l1=new ArrayList();
		for (Map.Entry<Employee,String> entry : h1.entrySet()) {
		    Employee key = entry.getKey();
			l1.add(key);
		    String value = entry.getValue();
		    System.out.println("employee key :: "+key +"value ::: "+value);
		    
		}
		
		
	
		
		Collections.sort(l1,Employee.byNameComparator);
		
		for(int i=0;i<l1.size();i++){
			 System.out.println("my list ------- "+l1.get(i));
			
		}
		
	}

}
