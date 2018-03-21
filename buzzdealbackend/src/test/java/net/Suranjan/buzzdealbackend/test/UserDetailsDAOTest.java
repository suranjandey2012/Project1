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
	  usd.setUsername("Suranjan");
	  usd.setCustomerName("Suranjan Dey");
	  usd.setAddress("Kolkata");
	  usd.setPassword("suranjan@1997");
	  usd.setRole("ROLE_ADMIN");
	  usd.setEnabled(true);
	  usd.setEmailId("suranjandey2012@gmail.com");
	  
	  assertTrue("Failed To Register User",userdetailsDAO.RegisterUser(usd));
    }
	
       @Ignore      
	   @Test 
	   public void updateUserTest()
	    {
	      UserDetails usd= userdetailsDAO.getUser("Samir"); //Cannot Change the assigned username but else everything
	      usd.setCustomerName("Samir Das");                 //can be changed
		  usd.setAddress("Kolkata");
		  usd.setPassword("Samir@245");
		  usd.setRole("ROLE_USER");
		  usd.setEnabled(true);
		  usd.setEmailId("samir@gmail.com");
		  assertTrue("Failed To Update User",userdetailsDAO.UpdateUser(usd));
	  }
	   
       @Ignore   
	   @Test 
	   public void ApproveUserTest()
	    {
	      UserDetails usd= userdetailsDAO.getUser("Suranjan");
	      assertTrue("Not an approved user",userdetailsDAO.ApproveUser(usd));
	  }
	
	
	

}
