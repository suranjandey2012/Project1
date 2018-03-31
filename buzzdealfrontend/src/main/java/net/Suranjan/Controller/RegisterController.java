package net.Suranjan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.Suranjan.buzzdealbackend.dao.UserDetailsDAO;
import net.Suranjan.buzzdealbackend.model.UserDetails;



@Controller
public class RegisterController {

	@Autowired
	UserDetailsDAO userDetailsDAO;
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public String insertUser(@RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("CustomerName")String CustomerName,@RequestParam("emailId")String emailId,@RequestParam("address")String address){
		
		UserDetails user=new UserDetails();
		user.setUsername(username);
		user.setPassword(password);
		user.setCustomerName(CustomerName);
		user.setEmailId(emailId);
		user.setAddress(address);
		user.setEnabled(true);
		user.setRole("ROLE_USER");
		
		userDetailsDAO.RegisterUser(user);
		
		return "Register";
		
	}
	
	@RequestMapping(value="/UpdateUser")
	public String showUpdateUserPage()
	{
		return "UpdateUser";
	}
	
	@RequestMapping(value="/updateUser",method=RequestMethod.POST)
	public String UpdateUser(@RequestParam("username")String username,@RequestParam("newpassword")String password,@RequestParam("newemailId")String emailId,@RequestParam("newaddress")String address){
		
		UserDetails user=(UserDetails)userDetailsDAO.getUser(username);
		String custname=user.getCustomerName();
		user.setPassword(password);
		user.setCustomerName(custname);
		user.setEmailId(emailId);
		user.setAddress(address);
		user.setEnabled(true);
		user.setRole("ROLE_USER");
		
		userDetailsDAO.UpdateUser(user);
		
		return "Login";
		
	}
	
	
	
}
