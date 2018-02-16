package net.Suranjan.buzzdealbackend.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.Suranjan.buzzdealbackend.dao.SupplierDAO;
import net.Suranjan.buzzdealbackend.model.Supplier;



public class SupplierDAOTest {

static SupplierDAO supplierDAO;
	
	@BeforeClass
    public static void preExcecution()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("net.Suranjan.buzzdealbackend");
		context.refresh();
	    supplierDAO=(SupplierDAO) context.getBean("supplierDAO");
	}
	
	@Ignore	
    @Test
    public void insertSupplierTest()
    {
	  Supplier supplier =new Supplier();
	  supplier.setSupplierName("Nikon");
	  supplier.setSupplierDesc("500MegaPixelCamera");
	  assertTrue("Failed To Add Supplier",supplierDAO.insertSupplier(supplier));
    }
   @Ignore
   @Test 
   public void deleteSupplierTest()
    {
	   Supplier supplier=supplierDAO.getSupplier(2);
	   assertTrue("Failed To Delete The Supplier",supplierDAO.deleteSupplier(supplier));
     }
   
   @Ignore
   @Test 
   public void updateSupplierTest()
    {
      Supplier supplier=supplierDAO.getSupplier(2);
      supplier.setSupplierName("Lenovo");
      supplier.setSupplierDesc("Core I5 Processor");
      supplierDAO.getSupplierlist();
      assertTrue("Failed To Update Supplier",supplierDAO.updateSupplier(supplier));
  }
 
    
   @Test 
   public void listSupplierTest()
    {
	   List<Supplier> listSupplier=supplierDAO.getSupplierlist();
	   assertNotNull("Problems In Loading Product Supplier List",listSupplier);
     }

}
