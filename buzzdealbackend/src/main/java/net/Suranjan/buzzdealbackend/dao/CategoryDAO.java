package net.Suranjan.buzzdealbackend.dao;

import java.util.List;

import net.Suranjan.buzzdealbackend.model.Category;



public interface CategoryDAO {
	
	public boolean insertCategory(Category category);
	public boolean deleteCategory(Category category);
	public boolean updateCategory(Category category);
	public Category getCategory(int CategoryId);
	public List<Category> getCategorylist();

}
