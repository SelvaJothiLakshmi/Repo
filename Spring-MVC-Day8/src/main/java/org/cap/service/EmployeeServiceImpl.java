package org.cap.service;

import java.util.List;

import org.cap.dao.EmployeeDao;
import org.cap.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao empDao;
	
	@Transactional
	public void createEmployee(Employee employee) {
		empDao.createEmployee(employee);
	}

	@Transactional
	public List<Employee> getAllEmployees() {
		
		return empDao.getAllEmployees();
	}

	@Transactional
	public void delete(int employeeId) {
		 empDao.delete(employeeId);
	}
	
	@Transactional
	public Employee update(int employeeId) {
		return empDao.update(employeeId);
	}
	
	@Transactional
	public List<Employee> updateEmployee(Employee employee) {
		return empDao.updateEmployee(employee);
	}
	
	

}
