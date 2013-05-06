package model;

import java.awt.Component;
import java.util.*;

import view.*;

public class CategoryModel {

	private String catTitle;
	private CategoryView view;
	private CategoryPanel panel;
	private CategoryModel panelModel;
	
	private List <CategoryPanel> catList= new ArrayList <CategoryPanel> ();
	
	
	public CategoryModel(String catTitle) {
		this.catTitle = catTitle;

		ListModel listModel = new ListModel();
	
	}
	
	public List getList(){
//		CategoryPanel categoryPanel = new CategoryPanel(this);
//		this.setCatTitle("Alla");
//		catList.set(0, categoryPanel);
//		
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
}
