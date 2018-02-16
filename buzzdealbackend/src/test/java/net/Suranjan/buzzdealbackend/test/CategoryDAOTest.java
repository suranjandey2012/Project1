package net.Suranjan.buzzdealbackend.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.Suranjan.buzzdealbackend.dao.CategoryDAO;
import net.Suranjan.buzzdealbackend.model.Category;


public class CategoryDAOTest {
	static CategoryDAO categoryDAO;

	@BeforeClass
	public static void preExecution() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("net.Suranjan");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Ignore
	@Test
	public void insertCategoryTest() {
		Category category = new Category();
		category.setCategoryName("Samsung");
		category.setCategoryDesc("Samsung Mobile");

		assertTrue("Problem in Adding Category", categoryDAO.insertCategory(category));
	}
	@Ignore
	@Test
	public void updateCategoryTest() {
		Category category = categoryDAO.getCategory(1);
		category.setCategoryName("Samsung-Galaxy");
		category.setCategoryDesc("Latest Mobiles");
		assertTrue("Problem in Updating", categoryDAO.updateCategory(category));
	}

	@Ignore
	@Test
	public void deleteCategoryTest() {
		Category category = categoryDAO.getCategory(3);
		assertTrue("Failed To Delete The Category", categoryDAO.deleteCategory(category));
	}

	
	@Test
	public void listCategoryTest() {
		List<Category> listCategories = categoryDAO.getCategorylist();
		assertNotNull("Problems In Loading Product Category List", listCategories);
	}

}
