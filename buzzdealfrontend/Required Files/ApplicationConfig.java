package com.mobitel.MobitelBackend.config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.*;
import com.mobitel.MobitelBackend.dao.*;
import com.mobitel.MobitelBackend.model.*;

@Configuration
@ComponentScan("com.mobitel.MobitelBackend")
@EnableTransactionManagement
public class ApplicationConfig 
{
	
	//Method will provide the Database Specific Info
	//DataSource object will contain that
	public DataSource getH2DataSource()
	{
		System.out.println("Data Source Method");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/MyDB");
		dataSource.setUsername("user1");
		dataSource.setPassword("user1");
		System.out.println("Data Source Created");
		return dataSource;
	}
	
	//Method will provide the Hibernate Related Properties
	//Properties object will contain the data.
	public Properties getHibernateProperties()
	{
		System.out.println("Hibernate Properties -Entered");
		Properties hibernate_prop=new Properties();
		hibernate_prop.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernate_prop.put("hibernate.show_sql", "true"); //optional
		hibernate_prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		System.out.println("Hibernate Prperty Object Created");
		return hibernate_prop;
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		System.out.println("SessionFactory Method-Entered");
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Product.class);
		SessionFactory sessionfactory=sessionBuilder.buildSessionFactory();
		System.out.println("SessionFactory Object Created");
		return sessionfactory;
	}
	
	
	@Bean(name="productDAO")
	public ProductDAO getProductDAO(SessionFactory sessionFactory)
	{
		return new ProductDAO(sessionFactory);
	}
	
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("Transaction Manager");
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	
	
}
