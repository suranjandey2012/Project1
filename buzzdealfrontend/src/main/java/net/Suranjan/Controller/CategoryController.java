package net.Suranjan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.Suranjan.buzzdealbackend.dao.CategoryDAO;
import net.Suranjan.buzzdealbackend.model.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/category")
	public String showCategory()
	{
		return "Category";
	}
	
	@RequestMapping(value="/InsertCategory",method=RequestMethod.POST)
	public String addCategory(@RequestParam("catname")String catname,@RequestParam("catdesc")String catDesc)
	{
	 
		Category category=new Category();
		category.setCategoryName(catname);
		category.setCategoryDesc(catDesc);
		categoryDAO.insertCategory(category);
		return "Category";
	 
	}
	
	
}
