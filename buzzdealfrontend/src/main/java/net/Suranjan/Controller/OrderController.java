package net.Suranjan.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.Suranjan.buzzdealbackend.dao.CartDAO;
import net.Suranjan.buzzdealbackend.dao.OrderDAO;
import net.Suranjan.buzzdealbackend.model.Cart;
import net.Suranjan.buzzdealbackend.model.OrderDetail;

@Controller
public class OrderController {

	@Autowired
	CartDAO cartDAO;
	
	@Autowired
	OrderDAO orderDAO;
	
	
	@RequestMapping(value="/CheckOut")
	public String checkOut(HttpSession session,Model m)
	{
		String username=(String)session.getAttribute("username");
		List<Cart> listCartItems=cartDAO.listCartItems(username);
		m.addAttribute("cartItems",listCartItems);
		m.addAttribute("totalAmount",this.calcTotalAmount(listCartItems));
		return "OrderConfirm";
	}
	
	
	@RequestMapping(value="/Payment",method=RequestMethod.POST)
	public String processPayment(@RequestParam("pmode")String pmode,HttpSession session,Model m)
	{
		String username=(String)session.getAttribute("username");
		
		
		OrderDetail orderDetail=new OrderDetail();
		
		List<Cart> listCartItems=cartDAO.listCartItems(username);
		
		orderDetail.setPmode(pmode);
		orderDetail.setTotalShoppingAmount(this.calcTotalAmount(listCartItems));
		orderDetail.setUsername(username);
		orderDetail.setOrderDate(new java.util.Date());
		orderDAO.paymentProcess(orderDetail);
	   return "ThankYou";
	
	
	}
	
	
	
	
	public int calcTotalAmount(List<Cart> cartItems)
	{
		int var=0;
	    int totalAmount=0;
	    while(var<cartItems.size())
	    {
	      Cart cart=cartItems.get(var);
	      totalAmount+=(cart.getPrice()*cart.getQuantity());
	      var++;
	    
	    }
	   return totalAmount;
	} 
	
}
