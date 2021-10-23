package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.vo.EmployeeVO;
import com.example.demo.vo.PrivilegeVO;

@Service
public class EmployeeService {

	private List<EmployeeVO> employees 
			= new ArrayList<>(Arrays.asList(
					new EmployeeVO(1, "John", "Smith",2), 
					new EmployeeVO(2, "Nick", "Taylor",3)
										
					));

	
	public void addPrivilege( PrivilegeVO privilegeVO, int id)
	{
		//employees.get(id).getPrivileges().add(privilegeVO);  //ArrayList<PrivilegesVO>
		employees.stream().filter(t -> t.getId() == id).findFirst().get().getPrivileges().add(privilegeVO);  //ArrayList<PrivilegesVO>
		
	}
	
	
	public void removePrivilege( String privilegedNo, int id)
	{
		
		List<PrivilegeVO> found = new ArrayList<PrivilegeVO>();
		//employees.get(id).getPrivileges().add(privilegeVO);  //ArrayList<PrivilegesVO>
		    for (PrivilegeVO _privilegeVO :   employees.stream().filter(t -> t.getId() == id).findFirst().get().getPrivileges() )
		    {
		    	if (_privilegeVO.getPrivilegedNo().equals(privilegedNo))
		    	{
		    		found.add(_privilegeVO);
		    	}
		    }
		    
		    
		    employees.stream().filter(t -> t.getId() == id).findFirst().get().getPrivileges().removeAll(found);
		
	}
	
	
	public List<EmployeeVO> getEmployees() {
		System.out.println("EmployeeService.getEmployees() " + employees );
		return employees;
	}
	
	public EmployeeVO getEmployee(int id) {
		System.out.println("EmployeeService.getEmployee(id)  " + id );
		return employees.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public void addEmployee(EmployeeVO employee) {
		employees.add(employee);
		System.out.println("EmployeeService.addEmployee()  " + employee);
	}

	

	public void deleteEmployee(int id) {
		employees.remove(employees.stream().filter(t -> t.getId() == id).findFirst().get());
		System.out.println("EmployeeService.deleteEmployee()  id= " + id);
	}
	
	
	public List<EmployeeVO> getEmployeesWithOneTypeOfPermissionOnly(String type) {
		System.out.println("EmployeeService.getEmployeesWithOneTypeOfPermissionOnly() " + type );
		
		List<EmployeeVO> found = new ArrayList<EmployeeVO>();
		
		  for (EmployeeVO employee : employees) {
			  
			 Boolean bTheSame=true;
			 
			 if (employee.getPrivileges().size()==0 )
				 {
				   bTheSame=false;
				 }
			  
			  for (PrivilegeVO privilegeVO :   employee.getPrivileges() )
			    {
				  
				   
			    	if (!(privilegeVO.getType().equals(type)))
			    	{
			    		bTheSame=false;
			    	}
			    }
			    if (bTheSame)
			    {
			    	found.add(employee);
			    }
	            
	        }
		
		return found;
	}

	
}
