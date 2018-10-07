package com.yiibai.HibernateQuickStart;

import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="DEPARTMENT",uniqueConstraints= {@UniqueConstraint(columnNames= {"DEPT_NO"})})
public class Department {
	private Integer deptId;
	private String deptNo;
	private String depName;
	private String location;
	private HashSet<Employee> employees=new HashSet<Employee>(0);
	
	public Department() {}
	

	public Department(Integer deptId, String deptNo, String depName, String location, HashSet<Employee> employees) {
		
		this.deptId = deptId;
		this.deptNo = deptNo;
		this.depName = depName;
		this.location = location;
		this.employees = employees;
	}

	@Id
	@Column(name="DEPT_ID")
	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Column(name="DEPT_NO",length=20,nullable=false)
	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	
	@Column(name="DEPT_NAME",nullable=false)
	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Column(name="LOCATION")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@OneToMany(fetch=FetchType.LAZY,mappedBy="departemnt")//表示放弃维权，那么就不会主动更新关联的表
	public HashSet<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(HashSet<Employee> employees) {
		this.employees = employees;
	}
	}
