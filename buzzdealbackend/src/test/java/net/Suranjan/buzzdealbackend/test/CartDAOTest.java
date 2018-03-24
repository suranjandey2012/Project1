package net.Suranjan.buzzdealbackend.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.Suranjan.buzzdealbackend.dao.CartDAO;
import net.Suranjan.buzzdealbackend.dao.CategoryDAO;
import net.Suranjan.buzzdealbackend.model.Cart;
import net.Suranjan.buzzdealbackend.model.Category;

public class CartDAOTest {
	static CartDAO cartDAO;
	
	
	
	@BeforeClass
	public static void preExecution() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("net.Suranjan.buzzdealbackend");
		context.refresh();

		cartDAO = (CartDAO) context.getBean("cartDAO");
	}
	
	@Ignore
	@Test
	public void addTOCartTest() {
		Cart cart=new Cart();
		cart.setProductId(31);
		cart.setProductName("MI phones");
		cart.setStatus("NP");
		cart.setPrice(12000);
		cart.setQuantity(1);
		cart.setUsername("Samir");
		

		assertTrue("Problem in Adding Cart", cartDAO.addToCart(cart));
	}
	
	@Ignore
	@Test
	public void updateItemFromCartTest()
	{
		Cart cart=cartDAO.getCartItem(1);
		cart.setProductName("MAX T Shirts");
		cart.setQuantity(5);
		cart.setPrice(1200);
		assertTrue("Problem in Updating CartItem", cartDAO.updateItemFromCart(cart));
	}
	
	@Ignore
	@Test
	public void deleteItemFromCartTest()
	{
	   Cart cart=cartDAO.getCartItem(33);
	   assertTrue("Failed To Delete the CartItem",cartDAO.deleteItemFromCart(cart));
	}
    
	@Ignore
	@Test
	public void listCartItems()
	{
		List<Cart> listCartItems=cartDAO.listCartItems();
		assertNotNull("Problems In Loading CartItems", listCartItems);
	}
}
