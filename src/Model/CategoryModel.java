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
	private ListModel listModel;
	
//	private List <CategoryPanel> catList= new ArrayList <CategoryPanel> ();
	private Deque <CategoryModel> markedList = new ArrayDeque <CategoryModel>();
	private CategoryListView catList = new CategoryListView();
	
	public CategoryModel(String catTitle) {
		this.catTitle = catTitle;
		listModel = new ListModel();
	
	}
	
	public ListModel getTaskList(){
		return listModel;
	}
//	public List getList(){
//		CategoryPanel categoryPanel = new CategoryPanel(this);
//		this.setCatTitle("Alla");
//		catList.set(0, categoryPanel);
//		
//		return catList;
//	}
	public String getCatTitle() {
		return catTitle;
	}
	
	public void markCategory(){
		markedList.addFirst(this);
		System.out.println("marked");
	}
	
//	public boolean getMarkedStatus(){
//		if(markedList.getFirst().equals(this)){
//			return true;
//		}
//		return false;
//	}

	public String setCatTitle(String title) {
		return title;
	}

	public void addNewCategory(String title) {
		CategoryPanel panel = new CategoryPanel(panelModel);
		catList.add(panel);
	}
//	public void removeCategory (CategoryPanelModel panelModel){
//		catList.remove(panelModel);
//	}
}
