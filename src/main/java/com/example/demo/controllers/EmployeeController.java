package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.EmployeeService;
import com.example.demo.vo.EmployeeVO;
import com.example.demo.vo.PrivilegeVO;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<EmployeeVO> getEmployees() {
		return employeeService.getEmployees();
	}

	@RequestMapping("/employees/{id}")
	public EmployeeVO getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(Integer.parseInt(id));
		
	}
	
	
	@RequestMapping("/employees/type/{t}")
	public List<EmployeeVO> getEmployeesWithOneTypeOfPermissionOnly(@PathVariable String t) {
		return employeeService.getEmployeesWithOneTypeOfPermissionOnly(t);
		
	}

	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody EmployeeVO employee) {
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employees/{id}")
	public void addPrivilege(@RequestBody PrivilegeVO privilegeVO,  @PathVariable String id) {
		employeeService.addPrivilege( privilegeVO, Integer.parseInt(id));
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value="/employees/{id}/{privilegedNo}")
	public void removePrivilege(@PathVariable String id,  @PathVariable String privilegedNo) {
		employeeService.removePrivilege( privilegedNo, Integer.parseInt(id));
	}
	
	
	
	@RequestMapping(method = RequestMethod.DELETE, value="/employees/{id}")
	public void deleteEmployee( @PathVariable String id) {
		employeeService.deleteEmployee(Integer.parseInt(id));
	}
	
}
