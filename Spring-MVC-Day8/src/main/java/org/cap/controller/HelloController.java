package org.cap.controller;

import javax.validation.Valid;

import org.cap.model.Employee;
import org.cap.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/hello")
	public ModelAndView sayHello(){
		String message="Welcome To Spring MVC World!";
		return new ModelAndView("helloPage", "msg", message);
	}
	
	@RequestMapping("/employee")
	public String showEmployeeForm(ModelMap map){
		//return new ModelAndView("employee", "employee", new Employee());
		map.put("employee", new Employee());
		System.out.println(employeeService.getAllEmployees());
		map.put("employees", employeeService.getAllEmployees());
		return "employee";
	
	}
	
	@RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee,
			BindingResult result ){
		//System.out.println(employee);
		
		if(result.hasErrors())
			return "employee";
		else{
			employeeService.createEmployee(employee);
			return "redirect:employee";
		}
	}
	
	@RequestMapping("deleteEmp/{empId}")
	public String deleteEmployee(@PathVariable("empId") Integer employeeId){
		
		employeeService.delete(employeeId);
		
		return "redirect:/employee";
	}
	
	@RequestMapping("getEmpRcrd/{empId}")
	public ModelAndView getEmployeeRecord(@PathVariable("empId") Integer employeeId){

		return new ModelAndView("employee", "employee", employeeService.update(employeeId));
	
	}
	
	@RequestMapping(value="getEmpRcrd/updateEmployee",method=RequestMethod.POST)
	public String updateEmployee(@Valid @ModelAttribute("employee") Employee employee,
			BindingResult result,ModelMap map ){
				
		if(result.hasErrors())
			return "employee";
		else{
			map.put("employees", employeeService.updateEmployee(employee));
			return "redirect:/employee";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
