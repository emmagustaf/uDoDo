package model;

import java.util.*;

import view.*;
import controller.*;

public class CategoryModel {

	private String catTitle;
	private CategoryView view;
	private CategoryPanel panel;
	private CategoryPanelModel panelModel;
	
	private List <CategoryPanel> catList= new ArrayList <CategoryPanel> ();

	public CategoryModel(String catTitle) {
		this.catTitle = catTitle;
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
		CategoryPanel panel = new CategoryPanel();
		catList.add(panel);
		updateCategoryView();
		
	}
	public void updateCategoryView() {
		view.repaint();
	}
}
