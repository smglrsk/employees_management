package com.example.demo.vo;

import java.util.ArrayList;

public class EmployeeVO {
	
		
	private int id;
	private String name;
	private String surname;
	private ArrayList<PrivilegeVO> privileges;
	private int companyId;
	
	
	
	

	public EmployeeVO(int id, String name, String surname, int companyId) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.companyId= companyId;
		this.privileges= new ArrayList<PrivilegeVO>();
	}

		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	

    
	public ArrayList<PrivilegeVO> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(ArrayList<PrivilegeVO> privileges) {
		this.privileges = privileges;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", name=" + name + ", surname=" + surname  + "]";
	}
	
	
}