package net.Suranjan.buzzdealbackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import net.Suranjan.buzzdealbackend.model.Category;

public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean insertCategory(Category category) 
	{
		try
		{
		sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;	
		}
		
	}

	@Transactional
	@Override
	public boolean updateCategory(Category category)
	{
		try
		{
		sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;	
		}
	}

	@Transactional
	@Override
	public boolean deleteCategory(Category category) 
	{
		try
		{
		sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;	
		}
	}

	@Override
	public Category getCategory(int categoryId) 
	{
		Session session=sessionFactory.openSession();
		Category category=(Category)session.get(Category.class,categoryId);
		session.close();
		return category;
	}

	@Override
	public List<Category> getCategorylist() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Category");
		List<Category> listCategories=query.list();
		
		 for(Category c:listCategories)
    	 {
    		System.out.print(c.getCategoryId()+" ");
    	    System.out.print(c.getCategoryName()+" ");
    	    System.out.println(c.getCategoryDesc());
    	}
		session.close();
		return listCategories;
	}

}
