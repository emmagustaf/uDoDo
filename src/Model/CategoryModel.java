package model;

import java.awt.Component;
import java.util.*;

import view.*;
import controller.*;

public class CategoryModel {

	private String catTitle;
	private CategoryView view;
	private CategoryPanel panel;
	private CategoryModel panelModel;
	
	private List <CategoryPanel> catList= new ArrayList <CategoryPanel> ();

	public CategoryModel(String catTitle) {
		this.catTitle = catTitle;
	}
	public List getList(){
		return catList;
	}
	public String getCatTitle() {
		return catTitle;
	}

	public String setCatTitle(String title) {
		return title;
	}

	public void addNewCategory(String title) {
		CategoryPanel panel = new CategoryPanel(panelModel);
		catList.add(panel);
	}
	public void removeCategory (CategoryPanelModel panelModel){
		catList.remove(panelModel);
	}
	
	public void updateCategoryView() {
		view.add((Component) catList);
		view.repaint();
		view.revalidate();
	}
}
