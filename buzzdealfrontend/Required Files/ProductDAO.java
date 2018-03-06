package com.mobitel.MobitelBackend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobitel.MobitelBackend.model.Product;

@Repository("productDAO")
public class ProductDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDAO(SessionFactory sessionFactory)
	{
		System.out.println("ProductDAO Object Created");
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertProduct(com.mobitel.MobitelBackend.model.Product product)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
	}
	
	@Transactional 
	public void deleteProduct(int prodid)
	{
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,prodid);
		session.delete(product);
	}
}
