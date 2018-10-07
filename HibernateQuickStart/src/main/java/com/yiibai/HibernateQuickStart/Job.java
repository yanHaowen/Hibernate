package com.yiibai.HibernateQuickStart;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="JOB")
public class Job {
	private int Id;
	private String job;
	private int salary;
	private Set<School> schools = new HashSet<School>(); 
	private Adr adr;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	@Column(name="job")
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Column(name="salary")
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="setid")//这样删除Job时就把setid=Id（job的主键）的所有school删除了
	public Set<School> getSchools() {
		return schools;
	}
	public void setSchools(Set<School> schools) {
		this.schools = schools;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="didian")
	public Adr getAdr() {
		return adr;
	}
	
	public void setAdr(Adr adr) {
		this.adr = adr;
	}
	
	

}
