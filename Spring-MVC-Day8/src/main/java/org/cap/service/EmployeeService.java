package org.cap.service;

import java.util.List;

import org.cap.model.Employee;

public interface EmployeeService {
	
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees() ;
	public void delete(int employeeId);
	public Employee update(int employeeId);
	public List<Employee> updateEmployee(Employee employee);
	
}
