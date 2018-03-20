package net.Suranjan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
  
  
  @RequestMapping("/login_success")
  public String successfulLogin()
  {
	  String page="AdminHome";
	  return page;
  }
}
