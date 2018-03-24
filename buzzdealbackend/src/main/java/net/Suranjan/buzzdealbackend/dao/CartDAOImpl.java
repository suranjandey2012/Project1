package net.Suranjan.buzzdealbackend.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import net.Suranjan.buzzdealbackend.model.Cart;
import net.Suranjan.buzzdealbackend.model.Category;

public class CartDAOImpl implements CartDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	
	
	@Transactional
	@Override
	public boolean addToCart(Cart cart) {
		
		try
		{
		sessionFactory.getCurrentSession().save(cart);
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
	public boolean deleteItemFromCart(Cart cart) {
		try
		{
		sessionFactory.getCurrentSession().delete(cart);
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
	public boolean updateItemFromCart(Cart cart) {
		try
		{
		sessionFactory.getCurrentSession().update(cart);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;	
		}
	}
	@Override
	public List<Cart> listCartItems() {
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Cart");
		List<Cart> listCart=query.list();
		
		 for(Cart c:listCart)
    	 {
    		System.out.print(c.getCartItemId()+" ");
    	    System.out.print(c.getProductId()+" ");
    	    System.out.print(c.getUsername()+" ");
    	    System.out.print(c.getProductName()+" ");
    	    System.out.print(c.getQuantity()+" ");
    	    System.out.print(c.getStatus()+" ");
    	    System.out.println(c.getPrice());
    	}
		session.close();
		return listCart;
	}

	@Override
	public Cart getCartItem(int cartItemId) {
		Session session=sessionFactory.openSession();
		Cart cart=(Cart)session.get(Cart.class,cartItemId);
		session.close();
		return cart;
		
	}
		
}


