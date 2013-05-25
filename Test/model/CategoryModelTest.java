package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CategoryModelTest {
	
	@Test
	public void getCatTitleTest(){
		CategoryModel categoryModel = new CategoryModel(null);
		

		//assertEquals(categoryModel == categoryModel.getCatTitle());	
		
	}
	
	@Test
	public void getTaskListTest(){
		ListModel listModel = new ListModel();
		CategoryModel categoryModel = new CategoryModel(null);
		assertTrue(listModel == categoryModel.getTaskList());
	}
	
}

