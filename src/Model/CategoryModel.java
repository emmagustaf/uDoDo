package model;

import java.util.*;
import view.*;

public class CategoryModel {

	private List <CategoryModel> catList= new ArrayList <CategoryModel> ();
	private String catTitle;
	private CategoryView view;
	
	public CategoryModel(String catTitle) {
		this.catTitle = catTitle;
		// list=new ArrayList<TaskModel>();

	}

	/*
	 * public void addTask(TaskModel task){ list.add(task); }
	 */

	public String getCatTitle() {
		return catTitle;
	}

	public String setCatTitle(String title) {
		return title;

	}

	public void addNewCategory(String title) {
		
	}

	public void updateCategoryView() {

		view.repaint();

	}
}
