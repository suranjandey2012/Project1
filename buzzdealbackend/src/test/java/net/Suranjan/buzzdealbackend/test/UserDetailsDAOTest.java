package net.Suranjan.buzzdealbackend.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.Suranjan.buzzdealbackend.dao.UserDetailsDAO;
import net.Suranjan.buzzdealbackend.model.UserDetails;



public class UserDetailsDAOTest {

static UserDetailsDAO userdetailsDAO;
	
	@BeforeClass
    public static void preExcecution()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("net.Suranjan.buzzdealbackend");
		context.refresh();
	    userdetailsDAO=(UserDetailsDAO) context.getBean("userDetailsDAO");
	}
	
	@Ignore 
    @Test
    public void RegisterUserTest()
    {
	  UserDetails usd=new UserDetails();
	  usd.setCustomerName("Sandip Sharma");
	  usd.setAddress("Kolkata");
	  usd.setPassword("sandip@345");
	  usd.setRole("Admin");
	  usd.setEnabled(true);
	  usd.setEmailId("sandipswagger@gmail.com");
	  
	  assertTrue("Failed To Register User",userdetailsDAO.RegisterUser(usd));
    }
	
	   @Ignore 
	   @Test 
	   public void updateUserTest()
	    {
	      UserDetails usd= userdetailsDAO.getUser("1");
	      usd.setCustomerName("Suranjan Dey");
		  usd.setAddress("Kolkata");
		  usd.setPassword("SD@1997");
		  usd.setRole("Admin");
		  usd.setEnabled(true);
		  usd.setEmailId("suranjandey2012@gmail.com");
		  assertTrue("Failed To Update User",userdetailsDAO.UpdateUser(usd));
	  }
	   
	   
	   @Test 
	   public void ApproveUserTest()
	    {
	      UserDetails usd= userdetailsDAO.getUser("1");
	      assertTrue("Not an approved user",userdetailsDAO.ApproveUser(usd));
	  }
	
	
	

}
