package com.yiibai.HibernateQuickStart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADR")
public class Adr {
	
	private int Id;
	
	
	private String didian;
	
	
	@Id
	@Column(name="Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	@Column(name="didian")
	public String getdidian() {
		return didian;
	}
	public void setdidian(String didian) {
		this.didian = didian;
	}
	
	
}
