package org.cap.dao;

import java.util.List;

import org.cap.model.Employee;

public interface EmployeeDao {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void delete(int employeeId);
	public Employee update(int employeeId);
	public List<Employee> updateEmployee(Employee employee);
}
