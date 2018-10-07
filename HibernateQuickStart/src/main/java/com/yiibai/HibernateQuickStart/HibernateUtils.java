package com.yiibai.HibernateQuickStart;

import org.hibernate.SessionFactory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
import org.hibernate.service.ServiceRegistry;  


@SuppressWarnings("unused")
public class HibernateUtils {
	

/*	private static SessionFactory buildSessionFactory() {
		 //Configuration configuration = new org.hibernate.cfg.AnnotationConfiguration();
		//AnnotationConfiguration configuration=new AnnotationConfiguration().configure();
		Configuration configuration = new Configuration();
		configuration=configuration.configure("hibernate.cfg.xml");
		

		//StandardServiceRegistry  serviceRegistry=new StandardServiceRegistryBuilder().configure().build(); 
        //SessionFactory sessionFactory=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		
       
				 
		
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return sessionFactory;
	}*/
	
	public static SessionFactory getSessionFactory() {
		 final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	      //2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
	      SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		return sessionFactory;
		
	}
}
