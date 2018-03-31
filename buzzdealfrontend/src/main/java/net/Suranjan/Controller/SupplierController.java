package net.Suranjan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.Suranjan.buzzdealbackend.dao.SupplierDAO;
import net.Suranjan.buzzdealbackend.model.Category;
import net.Suranjan.buzzdealbackend.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping("/supplier")
	public String showSupplier(Model m)
	{
		Supplier supplier=new Supplier();
		m.addAttribute(supplier);
		
		List<Supplier> list=supplierDAO.getSupplierlist();
		m.addAttribute("supplist",list);
		return "Supplier";
	}
	
	@RequestMapping(value="/InsertSupplier",method=RequestMethod.POST)
	public String insertSupplier(@RequestParam("suppname")String suppname,@RequestParam("suppdesc")String suppDesc,Model m)
	{
	 
		Supplier supplier=new Supplier();
		supplier.setSupplierName(suppname);
        supplier.setSupplierDesc(suppDesc);		
        supplierDAO.insertSupplier(supplier);
        List<Supplier> list=supplierDAO.getSupplierlist();
		m.addAttribute("supplist",list);
		return "Supplier";

	}
	
	@RequestMapping(value="/DeleteSupplier/{supplierId}",method=RequestMethod.GET)
	public String DeleteSupplier(@PathVariable("supplierId")int supplierId,Model m)
	{
	 
		Supplier supplier =supplierDAO.getSupplier(supplierId);
		supplierDAO.deleteSupplier(supplier);
		
		List<Supplier> list=supplierDAO.getSupplierlist();
		m.addAttribute("supplist",list);
		return "Supplier";

	}
	
	
	@RequestMapping(value="/updateSupplier",method=RequestMethod.GET)
	public String readyUpdate()
	{
		return "UpdateSupplier";
	}
	
	@RequestMapping(value="/updatedSupplier", method=RequestMethod.POST)
	public String UpdateSupplier(@RequestParam("suppid")int supplierId,@RequestParam("suppname")String supplierName,@RequestParam("suppdesc")String supplierDesc,Model m)
	{
	 
		Supplier supplier =(Supplier)supplierDAO.getSupplier(supplierId);
		supplier.setSupplierName(supplierName);
        supplier.setSupplierDesc(supplierDesc);		
		supplierDAO.updateSupplier(supplier);
		
		List<Supplier> list=supplierDAO.getSupplierlist();
		m.addAttribute("supplist",list);
		return "Supplier";

	}

	
}
