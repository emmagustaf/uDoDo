package model;

import static org.junit.Assert.*;

import org.junit.Test;


public class CategoryModelTest {
	
	@Test
	public void getTaskListTest(){
		
		ListModel listModel = new ListModel();
		CategoryModel categoryModel = new CategoryModel(null);
		
		assertTrue(listModel == categoryModel.getTaskList());
	
	}
	
}

