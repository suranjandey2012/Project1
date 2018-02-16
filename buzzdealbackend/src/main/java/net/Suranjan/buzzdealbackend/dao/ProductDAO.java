package net.Suranjan.buzzdealbackend.dao;

import java.util.List;

import net.Suranjan.buzzdealbackend.model.Product;



public interface ProductDAO {
	
	public boolean insertProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProduct(int ProductId);
	public List<Product> getProductlist();

}
