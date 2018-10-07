package com.yiibai.HibernateQuickStart;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;


@Entity
@Table(name="SCHOOL")
public class School {
	
	private Adr adr;
	
	
	private Job job;
	

	private int Id;
	
	private String student;
	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="outid")
		public Adr getAdr() {
		return adr;
	}

	public void setAdr(Adr adr) {
		this.adr = adr;
	}

	   @Column(name="student")
	public String getStudent() {
		return student;
	}

	

	public void setStudent(String student) {
		this.student = student;
	}
	
  @ManyToOne(cascade= {CascadeType.REFRESH,CascadeType.PERSIST})
	@JoinColumn(name="jobid")
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
}
