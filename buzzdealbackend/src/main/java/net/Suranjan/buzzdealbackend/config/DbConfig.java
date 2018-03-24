package net.Suranjan.buzzdealbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import net.Suranjan.buzzdealbackend.dao.CartDAO;
import net.Suranjan.buzzdealbackend.dao.CartDAOImpl;
import net.Suranjan.buzzdealbackend.dao.CategoryDAO;
import net.Suranjan.buzzdealbackend.dao.CategoryDAOImpl;
import net.Suranjan.buzzdealbackend.dao.ProductDAO;
import net.Suranjan.buzzdealbackend.dao.ProductDAOImpl;
import net.Suranjan.buzzdealbackend.dao.SupplierDAO;
import net.Suranjan.buzzdealbackend.dao.SupplierDAOImpl;
import net.Suranjan.buzzdealbackend.dao.UserDetailsDAO;
import net.Suranjan.buzzdealbackend.dao.UserDetailsDAOImpl;
import net.Suranjan.buzzdealbackend.model.Cart;
import net.Suranjan.buzzdealbackend.model.Category;
import net.Suranjan.buzzdealbackend.model.Product;
import net.Suranjan.buzzdealbackend.model.Supplier;
import net.Suranjan.buzzdealbackend.model.UserDetails;


@Configuration
@EnableTransactionManagement
public class DbConfig {
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("1234");
		
		System.out.println("---Data Source Object created-----");
		
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProp=new Properties();
		
		hibernateProp.put("hibernate.hbm2ddl.auto", "update");
		hibernateProp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		
		LocalSessionFactoryBuilder factory=new LocalSessionFactoryBuilder(getH2DataSource());
		factory.addProperties(hibernateProp);
		
		factory.addAnnotatedClass(Category.class);
		factory.addAnnotatedClass(Supplier.class);
		factory.addAnnotatedClass(Product.class);
		factory.addAnnotatedClass(UserDetails.class);
		factory.addAnnotatedClass(Cart.class);
		SessionFactory sessionFactory=factory.buildSessionFactory();
		System.out.println("----SessionFactory Object Created------");	
		return sessionFactory;
		
	}
	
	@Bean(name="categoryDAO")
	public CategoryDAO getCategoryDAO()
	{
		System.out.println("---Category Bean Created---");
		return new CategoryDAOImpl();
	}
	
	@Bean(name="supplierDAO")
	public SupplierDAO getSupplierDAO()
	{
		System.out.println("---Supplier Bean Created---");
		return new SupplierDAOImpl();
	}
	
	@Bean(name="productDAO")
	public ProductDAO getProductDAO()
	{
		System.out.println("---Product Bean Created---");
		return new ProductDAOImpl();
	}
	
	@Bean(name="userDetailsDAO")
	public UserDetailsDAO getUserDetailsDAO()
	{
		System.out.println("---UserDetails Bean Created---");
		return new UserDetailsDAOImpl();
			
	}
	
	@Bean(name="cartDAO")
	public CartDAO getCartDAO()
	{
		System.out.println("---Cart Bean Created---");
		return new CartDAOImpl();
			
	}
	
	@Bean(name="txManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("---Hibernate Transaction Bean Created---");
		return new HibernateTransactionManager(sessionFactory);
	}

}
