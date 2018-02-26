package net.Suranjan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.Suranjan.buzzdealbackend.dao.ProductDAO;
import net.Suranjan.buzzdealbackend.model.Category;
import net.Suranjan.buzzdealbackend.model.Product;

@Controller
public class ProductController {

	@Autowired
	ProductDAO productDAO;
    	
	@RequestMapping("/product")
	public String showProductPage(Model m)
	{
		Product product=new Product();
		m.addAttribute(product);
		
		List<Product> list=productDAO.getProductlist();
		m.addAttribute("listProducts",list);
		return "Product";
	}
	
	@RequestMapping(value="/InsertProduct", method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product")Product product, Model m)
	{
		productDAO.insertProduct(product);
		List<Product> list=productDAO.getProductlist();
		m.addAttribute("listProducts",list);
		return "Product";
	}
	
	@RequestMapping(value="/deleteProduct/{productId}",method=RequestMethod.GET)
	public String deleteProduct(@PathVariable("productId")int productId, Model m)
	{
		Product product=(Product) productDAO.getProduct(productId);
		productDAO.deleteProduct(product);
		m.addAttribute(product);
		List<Product> list=productDAO.getProductlist();
		m.addAttribute("listProducts",list);
		
		return "Product";
	}
	
	@RequestMapping(value="/updateProduct/{productId}",method=RequestMethod.GET)
	public String readyUpdate(@PathVariable("productId")int productId, Model m)
	{
		Product product=(Product) productDAO.getProduct(productId);
		m.addAttribute(product);
		
		List<Product> list=productDAO.getProductlist();
		m.addAttribute("listProducts",list);
		
		return "UpdateProduct";
	}
	
	
	
	@RequestMapping(value="/UpdateProduct", method=RequestMethod.POST)
	public String UpdateProduct(@RequestParam("productId")int productId,@RequestParam("productName")String productName,@RequestParam("price")int price,@RequestParam("stock")int stock,@RequestParam("categoryId")int categoryId,@RequestParam("supplierId")int supplierId,@RequestParam("productDesc")String productDesc,Model m)
	{
	     
	    Product product=(Product) productDAO.getProduct(productId);
	    product.setProductName(productName);
		product.setPrice(price);
		product.setPrice(price);
		product.setCategoryId(categoryId);
		product.setSupplierId(supplierId);
		product.setProductDesc(productDesc);
		productDAO.updateProduct(product);
	    m.addAttribute(product);
		List<Product> list=productDAO.getProductlist();
		m.addAttribute("listProducts",list);
		
		return "Product";
	}
	
	
	
	
	
	
	
}
