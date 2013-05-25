package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskModelTest {

	@Test
/*	public void changePriorityTest() {
		fail("Not yet implemented");
	}
	
	public void changeStateTest(){
		fail("NOOOOT YEEET IMPLEMENTED");
	}

	public boolean getStateTest(){
		return true;
	}*/
	
	public void getTitleTest(){
		TaskModel taskModel = new TaskModel(null);
		taskModel.setTitle("test");
		assertTrue(taskModel.getTitle() == "test");
	}
	
	public void getDescriptionTest(){
		TaskModel taskModel = new TaskModel(null);
		taskModel.setDescription("test");
		assertTrue(taskModel.getDescription() == "test");
	}
	
	public void setTitleTest(){
		TaskModel taskModel = new TaskModel(null);
		taskModel.setTitle("test");
		assertTrue(taskModel.getTitle() == "test");
	}
	
	public void setDescriptionTest(){
		TaskModel taskModel = new TaskModel(null);
		taskModel.setDescription("test");
		assertTrue(taskModel.getDescription() == "test");
	}
	
	public void getDeadLineTest(){
		TaskModel taskModel = new TaskModel(null);
		
	}
	
	
}
