package model;

import java.util.*;
import view.*;

public class CategoryModel {

	private String catTitle;
	private CategoryView view;
	private CategoryPanel panel;
	
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

	
}
