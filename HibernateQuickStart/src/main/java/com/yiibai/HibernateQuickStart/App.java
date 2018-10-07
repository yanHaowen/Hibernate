package com.yiibai.HibernateQuickStart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Hello world!
 *
 */

public class App 
{
	private int id;
   private String student;

   @Column(name="student")
public String getStudent() {
	return student;
}

@Id
@Column(name="id")
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public void setStudent(String student) {
	this.student = student;
}
   
}
