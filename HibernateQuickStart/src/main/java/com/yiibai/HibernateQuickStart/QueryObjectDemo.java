package com.yiibai.HibernateQuickStart;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;




public class QueryObjectDemo {

public static void main(String[] args) {
	/*SessionFactory sessionFactory=null;
	
	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
	.configure().build();
	
	sessionFactory = new MetadataSources(registry).buildMetadata()
	.buildSessionFactory();*/
	
	
	
	Configuration  conf = new Configuration().configure();  
     //2 根据Configuration 配置信息创建 SessionFactory  
     SessionFactory sessionFactory = conf.buildSessionFactory();  
	
	//2.创建一个Session对象
	Session session = sessionFactory.getCurrentSession();
	Transaction transaction= session.beginTransaction();
//						
//						School app=session.get(School.class, 1);
//						System.out.println(app.getStudent()); 成功查询单挑数据
	
	
/*							String sql="from School where Id=1";
							Query query=session.createQuery(sql);
							List<School> list=query.list();
							
							 for(School employee:list) {
								 System.out.println(employee.getStudent());
							 }
				成功			*/
	
//							School School1=new School();
//							School1.setId(2);
//							School1.setStudent("yhw");
//							session.persist(School1);
//							transaction.commit();
//							System.out.println(000);     成功插入
	
	/*School school=new School();
	Adr adr=new Adr();
	
	adr.setdidian("hangzhou");
	adr.setId(6);
	
	school.setAdr(adr);
	session.save(school);
	transaction.commit();
	System.out.println("ok");*/
	
/*	School school=new School();
	Adr adr=session.get(Adr.class, 5);
	Job job=new Job();
	
	job.setAdr(adr);

	job.setSalary(1111);
	job.setJob("dagong");

	
	school.setAdr(adr);
	school.setJob(job);
	school.setStudent("mydd");
	Set<School> schools=new HashSet<School>();
	schools.add(school);
	job.setSchools(schools);
	
	session.save(school);
	transaction.commit();*/
	School school=session.get(School.class, 10);
	Job job=session.get(Job.class, 69);
	session.delete(school);
	transaction.commit();
	System.out.println("ok");
	/*
	 * Transaction tx=null;
	
	SessionFactory factory=HibernateUtils.getSessionFactory();
	Session session=factory.openSession();
	 *  tx=session.beginTransaction();
	 System.out.println(111);
	 Employee employee=session.get(Employee.class, 7369);
	 System.out.println(employee);
	 System.out.println(111);
	 */
	/*
	 String sql = "Select e from " +"Employee"+" e "
             + " order by e.empName,e.empNo";
	 Query query=session.createQuery(sql);
	 List<Employee> list=query.list();
	 for(Employee employee:list) {
		 System.out.println(employee);
	 }*/

}
}

