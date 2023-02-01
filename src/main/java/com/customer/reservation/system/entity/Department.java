package com.customer.reservation.system.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departmentId;
	private String departmentName;
	
	@OneToMany(mappedBy = "department")
	private List<Employee> employees = new ArrayList<>();
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmnetName() {
		return departmentName;
	}
	public void setDepartmnetName(String departmnetName) {
		this.departmentName = departmnetName;
	}

}
