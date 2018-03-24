package net.Suranjan.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.Suranjan.buzzdealbackend.dao.CartDAO;
import net.Suranjan.buzzdealbackend.dao.ProductDAO;
import net.Suranjan.buzzdealbackend.model.Cart;

@Controller
public class CartController {

	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	CartDAO cartDAO;
	
	@RequestMapping(value="/addToCart/{productId}")
	public String addToCart(@PathVariable("productId")int productId,@RequestParam("quantity")int quantity,HttpSession session,Model m)
	{
		Cart cart=new Cart();
		cart.setProductId(productId);
		cart.setProductName(productDAO.getProduct(productId).getProductName());
		cart.setQuantity(quantity);
		cart.setPrice(productDAO.getProduct(productId).getPrice());
		cart.setStatus("NP");
		cart.setUsername((String)session.getAttribute("username"));
		cartDAO.addToCart(cart);
		
		List<Cart> listCartItems=cartDAO.listCartItems();
		m.addAttribute("cartItems",listCartItems);
		m.addAttribute("totalAmount",this.calcTotalAmount(listCartItems));
		return "Cart";
		
	}
	
	@RequestMapping(value="/updateCartItem/{cartItemId}")
	public String updateCartItem(@PathVariable("cartItemId")int cartItemId,@RequestParam("quantity")int quantity,HttpSession session,Model m)
	{
		Cart cart=cartDAO.getCartItem(cartItemId);
		cart.setQuantity(quantity);
		cartDAO.updateItemFromCart(cart);
		
		List<Cart> listCartItems=cartDAO.listCartItems();
		m.addAttribute("cartItems",listCartItems);
		m.addAttribute("totalAmount",this.calcTotalAmount(listCartItems));
		return "Cart";
		
		
	}
	
	@RequestMapping(value="/deleteCartItem/{cartItemId}")
	public String deleteCartItem(@PathVariable("cartItemId")int cartItemId,HttpSession session,Model m)
	{
		Cart cart=cartDAO.getCartItem(cartItemId);
		cartDAO.deleteItemFromCart(cart);
		
		List<Cart> listCartItems=cartDAO.listCartItems();
		m.addAttribute("cartItems",listCartItems);
		m.addAttribute("totalAmount",this.calcTotalAmount(listCartItems));
		return "Cart";
			
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
