package org.cap.dao;

import java.util.List;

import org.cap.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void createEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emps=sessionFactory.getCurrentSession().createQuery("from Employee").list();
		
		System.out.println(emps);
		return emps;
	}

	@Override
	public void delete(int employeeId) {
		Employee employee=(Employee)sessionFactory.getCurrentSession().get(Employee.class, employeeId);
		if(employee!=null)
			sessionFactory.getCurrentSession().delete(employee);
	}
	
	@Override
	public Employee update(int employeeId) {
		Employee employee=(Employee)sessionFactory.getCurrentSession().get(Employee.class, employeeId);
		return employee;
	}

	@Override
	public List<Employee> updateEmployee(Employee employee) {
			sessionFactory.getCurrentSession().saveOrUpdateCopy(employee);
			List<Employee> emps=sessionFactory.getCurrentSession().createQuery("from Employee").list();
		return emps;
	}

}
