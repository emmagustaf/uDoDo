package modeltest;

import static org.junit.Assert.*;

import model.CategoryModel;
import model.TaskModel;

import org.junit.Test;

/**
 * A class testing the TaskModel
 */
public class TaskModelTest {
	
	CategoryModel categoryModel = new CategoryModel("category");//A categoryModel created to be able to test the taskmodel

	@Test
	public void getTitleTest(){
		TaskModel taskModel = new TaskModel(null, categoryModel);

		taskModel.setTitle("test");
		
		assertEquals("test", taskModel.getTitle());
	}
	
	@Test
	public void getDescriptionTest(){
		TaskModel taskModel = new TaskModel(null, categoryModel);
		taskModel.setDescription("test");
		
		assertEquals("test", taskModel.getDescription());
	}
	
	@Test
	public void setTitleTest(){
		TaskModel taskModel = new TaskModel(null, categoryModel);
		taskModel.setTitle("test");
		
		assertEquals("test", taskModel.getTitle());
	}
	
	@Test
	public void setDescriptionTest(){
		TaskModel taskModel = new TaskModel(null, categoryModel);
		taskModel.setDescription("test");
		
		assertEquals("test", taskModel.getDescription());
	}
	
	@Test
	public void getDeadlineTest(){
		TaskModel taskModel = new TaskModel(null, categoryModel);
		taskModel.setDeadline("2013-05-26");
		
		assertEquals("2013-05-26",taskModel.getDeadline());
	}
	
	@Test
	public void setDeadlineTest(){
		TaskModel taskModel = new TaskModel(null, categoryModel);
		taskModel.setDeadline("2013-05-26");
		
		assertEquals("2013-05-26", taskModel.getDeadline());
	
	}
	
}
