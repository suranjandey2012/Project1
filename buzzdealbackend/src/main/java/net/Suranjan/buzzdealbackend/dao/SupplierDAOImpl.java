package net.Suranjan.buzzdealbackend.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import net.Suranjan.buzzdealbackend.model.Supplier;

public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Transactional
	@Override
	public boolean insertSupplier(Supplier supplier) {
		try{
		     sessionFactory.getCurrentSession().save(supplier);
		     System.out.println("Inserted Supplier");
	 	     return true;
	 }catch(Exception e)
		{
		  e.printStackTrace();
		   return false;
		}
	}	
	
	@Transactional
	@Override
	public boolean deleteSupplier(Supplier supplier) {
		try{
		     sessionFactory.getCurrentSession().delete(supplier);
		     System.out.println("Deleted Supplier");
	 	     return true;
	 }catch(Exception e)
		{
		   e.printStackTrace();
		   return false;
		}
		
	}

	@Transactional
	@Override
	public boolean updateSupplier(Supplier supplier) {
		
		try{
		      sessionFactory.getCurrentSession().update(supplier);
		      System.out.println("Updated Supplier");
	 	      return true;
	       }catch(Exception e)
		  {
		     e.printStackTrace();
		     return false;
		}
	}

	@Override
	public Supplier getSupplier(int SupplierId) {
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier) session.get(Supplier.class,SupplierId);
		session.close();
		return supplier;
	}

	@Override
	public List<Supplier> getSupplierlist() {
		Session session=sessionFactory.openSession();
		Query q = session.createQuery("from Supplier");
		List<Supplier> supplierlist=q.list();
		for(Supplier s: supplierlist)
		{
			System.out.print(s.getSupplierId()+" ");
    	    System.out.print(s.getSupplierName()+" ");
    	    System.out.println(s.getSupplierDesc());
		}
		session.close();
		return supplierlist;
		
	}

}
