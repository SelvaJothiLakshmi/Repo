package org.cap.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="emp_details")
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	
	@NotEmpty(message="*Please enter Employee FirstName.")
	private String firstName;
	
	private String lastName;
	
	@Range(min=5000,max=100000,message="*Salary range should be between 5000 and 1Lak.")
	//@Min(value=5000,message="*Please enter minimum 5000.")
	private double salary;
	
	@Past(message="*Date of birth must be past Date.")
	private Date dob;
	private Date doj;
	public Employee(){
		
	}
	public Employee(int empId, String firstName, String lastName, double salary, Date dob, Date doj) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.dob = dob;
		this.doj = doj;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", dob=" + dob + ", doj=" + doj + "]";
	}
	
	

}
