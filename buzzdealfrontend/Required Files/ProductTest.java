package com.mobitel.MobitelBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.*;
import com.mobitel.MobitelBackend.model.*;

public class ProductTest 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.mobitel.MobitelBackend");
		context.refresh();
		
		
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Inserting the Product
		
		/*Product product=new Product();
		
		product.setProdid(1008);
		product.setProdname("Samsung Galaxy 7");
		product.setCatid(1001);
		product.setSuppid(1002);
		product.setPrice(19000);
		product.setStock(10);
		product.setDesc("This is 4G Mobile");
		
		productDAO.insertProduct(product);
		
		System.out.println("Product Inserted:");*/
		
		//Deleting the Product.
		
		productDAO.deleteProduct(1002);
		
		System.out.println("Deleted");
		
	}
}
