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
		TaskModel taskModel = new TaskModel("Bajs");
		taskModel.setTitle("test");
		assertTrue((taskModel.getTitle()).equals("teeevtfybyg"));
		
	}

}
