package net.Suranjan.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import net.Suranjan.buzzdealbackend.dao.CategoryDAO;
import net.Suranjan.buzzdealbackend.dao.ProductDAO;
import net.Suranjan.buzzdealbackend.model.Category;
import net.Suranjan.buzzdealbackend.model.Product;

@Controller
public class ProductController {

	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	CategoryDAO categoryDAO;
    	
	@RequestMapping("/product")
	public String showProductPage(Model m)
	{
		Product product=new Product();
		m.addAttribute(product);
		
		List<Product> list=productDAO.getProductlist();
		m.addAttribute("listProducts",list);
		m.addAttribute("catlist",this.getCategories());
		
		return "Product";
	}
	
	@RequestMapping(value="/InsertProduct", method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product")Product product,@RequestParam("pimage")MultipartFile filedet,Model m)
	{
		productDAO.insertProduct(product);
		List<Product> list=productDAO.getProductlist();
		m.addAttribute("listProducts",list);
		m.addAttribute("catlist",this.getCategories());
		
		String path="E:\\Live Project\\Project1\\buzzdealfrontend\\src\\main\\webapp\\resources\\images\\";
		
		path=path+String.valueOf(product.getProductId())+".jpg";
		
		File file=new File(path);
		if(!filedet.isEmpty())
		{
			try{
				byte [] buffer= filedet.getBytes();
				FileOutputStream fos=new FileOutputStream(file);
				BufferedOutputStream bs=new BufferedOutputStream(fos);
				bs.write(buffer);
				bs.close();
			}catch(Exception e)
			{
				m.addAttribute("errorInfo","Exception Arised:"+e.getMessage());
			}
		}
		else
		{
			m.addAttribute("errorInfo","There Is A System Problem No Image Found In This Location");
		}
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
	
	public LinkedHashMap<Integer,String>getCategories(){
		
	List<Category>listCategories = categoryDAO.getCategorylist();
	
	LinkedHashMap<Integer,String> categoryList= new LinkedHashMap<Integer,String>();
	
	for(Category c:listCategories)
	{
		categoryList.put(c.getCategoryId(),c.getCategoryName());
	}
	
	return categoryList;
	
	}
	
	@RequestMapping(value="/productDesc/{productId}")
	public String showProductDesc(@PathVariable("productId")int productId, Model m)
	{
		Product product=(Product) productDAO.getProduct(productId);
		m.addAttribute("product",product);
		return "ProductDesc";
	}
	
	
	
}
