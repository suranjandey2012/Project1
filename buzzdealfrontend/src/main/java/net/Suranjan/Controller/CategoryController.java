package net.Suranjan.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String showCategory(Model m)
	{
		Category category = new Category();
		m.addAttribute(category);
		
		List<Category> list=categoryDAO.getCategorylist();
		m.addAttribute("catlist",list);
		return "Category";
	}
	
	@RequestMapping(value="/InsertCategory",method=RequestMethod.POST)
	public String insertCategory(@RequestParam("catname")String catname,@RequestParam("catdesc")String catDesc,Model m)
	{
	 
		Category category=new Category();
		category.setCategoryName(catname);
		category.setCategoryDesc(catDesc);
		categoryDAO.insertCategory(category);
		
		List<Category> catlist=categoryDAO.getCategorylist();
		m.addAttribute("catlist",catlist);
		
		return "Category";
	}
	
	@RequestMapping(value="/DeleteCategory/{categoryId}",method=RequestMethod.GET)
	public String DeleteCategory(@PathVariable("categoryId")int categoryId,Model m)
	{
	 
		Category category=(Category) categoryDAO.getCategory(categoryId);
		categoryDAO.deleteCategory(category);
		List<Category> catlist=categoryDAO.getCategorylist();
		m.addAttribute("catlist",catlist);
		
		return "Category";
	}
	
	@RequestMapping(value="/updateCategory/{categoryId}",method=RequestMethod.GET)
	public String readyUpdate(@PathVariable("categoryId")int categoryId,Model m)
	{
		Category category=(Category) categoryDAO.getCategory(categoryId);
		m.addAttribute(category);
		
		List<Category> list=categoryDAO.getCategorylist();
		m.addAttribute("catlist",list);
		
		return "UpdateCategory";
	}
	
	
	
	@RequestMapping(value="/UpdateCategory", method=RequestMethod.POST)
	public String UpdateCategory(@RequestParam("catid")int categoryId,@RequestParam("catname")String catname,@RequestParam("catdesc")String catDesc,Model m)
	{
	 
		Category category=(Category) categoryDAO.getCategory(categoryId);
		category.setCategoryName(catname);
		category.setCategoryDesc(catDesc);
		categoryDAO.updateCategory(category);
		
		List<Category> catlist=categoryDAO.getCategorylist();
		m.addAttribute("catlist",catlist);
		
		return "Category";
	}
	
	
	
	
}
