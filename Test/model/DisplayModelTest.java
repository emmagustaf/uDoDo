package model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A Class testning the DisplayModel
 */
public class DisplayModelTest {
	
	CategoryModel categoryModel = new CategoryModel("category"); //A categoryModel created to be able to test the displaymodel
	
	@Test
	public void getTaskTitleTest() {
		TaskModel taskModel = new TaskModel(null, categoryModel);
		taskModel.setTitle("test");
		
		assertEquals("test", taskModel.getTitle());
	}
	
	@Test
	public void setTaskTitleTest(){
		TaskModel taskModel = new TaskModel(null, categoryModel);
		taskModel.setTitle("test");
		
		assertEquals("test", taskModel.getTitle());
	}
	
	@Test
	public void getTaskDescriptionTest(){
		TaskModel taskModel = new TaskModel(null, categoryModel);
		taskModel.setDescription("test");
		
		assertEquals("test", taskModel.getDescription());
	}
	
	@Test
	public void setTaskDescriptionTest() {
		TaskModel taskModel = new TaskModel(null, categoryModel);
		taskModel.setDescription("test");
		
		assertEquals("test", taskModel.getDescription());
	}

	@Test
	public void getTaskModelTest() {
		TaskModel taskModel = new TaskModel(null, categoryModel);
		TaskModel taskMod = new TaskModel(null, categoryModel);
		
		DisplayModel displayModel = new DisplayModel(taskModel);
		
		assertTrue(taskModel == displayModel.getTaskModel());
		assertTrue(taskMod != displayModel.getTaskModel());
	}
	
}
