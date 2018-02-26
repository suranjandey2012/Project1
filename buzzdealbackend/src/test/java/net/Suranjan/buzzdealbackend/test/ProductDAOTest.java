package net.Suranjan.buzzdealbackend.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.Suranjan.buzzdealbackend.dao.ProductDAO;
import net.Suranjan.buzzdealbackend.model.Product;



public class ProductDAOTest {

static ProductDAO productDAO;
	
	@BeforeClass
    public static void preExcecution()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("net.Suranjan.buzzdealbackend");
		context.refresh();
	    productDAO=(ProductDAO) context.getBean("productDAO");
	}
	
	@Ignore
    @Test
    public void insertProductTest()
    {
	  Product product=new Product();
	  product.setProductName("Samsung Galaxy A7");
	  product.setProductDesc("4G Qualcom Processor");
	  product.setCategoryId(34);
	  product.setSupplierId(22);
	  product.setPrice(25000);
	  product.setStock(30);
	  assertTrue("Failed To Add Product",productDAO.insertProduct(product));
    }
   
   
   @Test 
   public void deleteProductTest()
    {
	   Product product=productDAO.getProduct(5);
	   assertTrue("Failed To Delete The Supplier",productDAO.deleteProduct(product));
     }
   
   @Ignore  
   @Test 
   public void updateProductTest()
    {
      Product product=productDAO.getProduct(1);
      product.setProductName("HCL");
	  product.setProductDesc("Core I7 processor with 8Gb RAM ");
	  product.setCategoryId(34);
	  product.setSupplierId(2);
	  product.setPrice(63000);
	  product.setStock(15);
      assertTrue("Failed To Update Product",productDAO.updateProduct(product));
  }
 
   @Ignore
   @Test 
   public void listProductTest()
    {
	   List<Product> listProduct=productDAO.getProductlist();
	   assertNotNull("Problems In Loading Product Supplier List",listProduct);
     }
	

}
