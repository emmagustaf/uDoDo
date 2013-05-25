package model;

import static org.junit.Assert.*;

import org.junit.Test;


public class DisplayModelTest {

	@Test
	public void getTaskTitleTest() {
		TaskModel taskModel = new TaskModel(null);
		taskModel.setTitle("test");
		assertEquals("test", taskModel.getTitle());
	}
	
	@Test
	public void setTaskTitleTest(){
		TaskModel taskModel = new TaskModel(null);
		taskModel.setTitle("test");
		assertEquals("test", taskModel.getTitle());
	}
	
	@Test
	public void getTaskDescriptionTest(){
		TaskModel taskModel = new TaskModel(null);
		taskModel.setDescription("test");
		assertEquals("test", taskModel.getDescription());
	}
	
	@Test
	public void setTaskDescriptionTest() {
		TaskModel taskModel = new TaskModel(null);
		taskModel.setDescription("test");
		assertEquals("test", taskModel.getDescription());
	}

	@Test
	public void getTaskModelTest() {
		TaskModel taskModel = new TaskModel(null);
		TaskModel taskMod = new TaskModel(null);
		DisplayModel displayModel = new DisplayModel(taskModel);
		assertTrue(taskModel == displayModel.getTaskModel());
		assertTrue(taskMod != displayModel.getTaskModel());
	}
	
}
