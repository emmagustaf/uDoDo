package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisplayModelTest {

	@Test
	public void getTaskTitleTest() {
		TaskModel taskModel = new TaskModel(null);
		taskModel.setTitle("test");
		assertTrue(taskModel.getTitle() == "test");
	}
	
	public void setTaskTitleTest(){
		TaskModel taskModel = new TaskModel("testing");
		taskModel.setTitle("test");
		assertTrue(taskModel.getTitle() == "test");
	}
	
	public void getTaskDescriptionTest(){
		TaskModel taskModel = new TaskModel(null);
		taskModel.setDescription("test");
		assertTrue(taskModel.getDescription() == "test");
	}
	
	public void setTaskDescriptionTest(){
		TaskModel taskModel = new TaskModel(null);
		taskModel.setDescription("test");
		assertTrue(taskModel.getDescription() == "test");
	}

	public void getTaskModelTest(){
		TaskModel taskModel = new TaskModel(null);
		
	}
}
