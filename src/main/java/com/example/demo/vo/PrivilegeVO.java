package com.example.demo.vo;

import java.util.Date;

public class PrivilegeVO {
	
		
	private int id;
	private String type;
	private String privilegedNo;
	private Date validDate;
	private String name;
	
	
	public PrivilegeVO() {
	
	}

	public PrivilegeVO(String type, String privilegedNo, Date validDate, String name) {
	
		this.type = type;
		this.privilegedNo=privilegedNo;
		this.validDate=validDate;
		this.name = name;
	}

		

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrivilegedNo() {
		return privilegedNo;
	}

	public void setPrivilegedNo(String privilegedNo) {
		this.privilegedNo = privilegedNo;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PrivilegeVO [id=" + id + ", type=" + type+",  privilegedNo="+privilegedNo + ", validDate"+ validDate.toString()+" , name="+name+"]";
	}
	
	
}