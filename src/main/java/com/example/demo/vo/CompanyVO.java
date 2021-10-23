package com.example.demo.vo;

public class CompanyVO {
	
		
	private int id;
	private String name;
	
	public CompanyVO() {
	
	}

	public CompanyVO(int id, String name) {
		this.id = id;
		this.name = name;
	}

		

	@Override
	public String toString() {
		return "CompanyVO [id=" + id + ", name=" + name + "]";
	}
	
	
}