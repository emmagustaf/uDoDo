package model;

import java.awt.Component;
import java.util.*;

import view.*;
import controller.*;

/**
 * A class to represent a model of the category.
 * 
 * @author Hanna
 *
 */
public class CategoryModel {

	private String catTitle;
	private CategoryView view;
	private AddedCategoryPanel panel;
	private CategoryModel panelModel;
	private ListModel listModel;
	private StartCategoryPanel startPanel;
	
	
//	private List <AddedCategoryPanel> catList= new ArrayList <AddedCategoryPanel> ();
//	private Deque <CategoryModel> markedList = new ArrayDeque <CategoryModel>();

	/**
	 * Creates the categoryModel
	 * @param catTitle
	 */
	public CategoryModel(String catTitle) {
		this.catTitle = catTitle;
		listModel = new ListModel();
	
	}
	/**
	 * Returns the actual TaskList
	 * @return
	 */
	public ListModel getTaskList(){
		return listModel;
	}
	
//	public List getList(){
//		catList.set(0, categoryPanel);
//		
//		return catList;
//	}
	
	/**
	 * Returns the title connected to the category
	 * @return
	 */
	public String getCatTitle() {
		return catTitle;
	}
	
	/**
	 * Sets a title of the category
	 * @param title
	 * @return 
	 */
	public String setCatTitle(String title) {
		return title;
	}

	/**
	 * Adds a new categoryPanel 
	 * @param title
	 */
	public void addNewCategory(String title) {
		AddedCategoryPanel panel = new AddedCategoryPanel(panelModel);
		//catList.add(panel);
	}
	
	/**
	 * Removes the selected category
	 * @param panelModel
	 */
	public void removeCategory (AddedCategoryPanel panelModel){
		//catList.remove(panelModel);
	}
	
	/**
	 * Returns the categorymodel
	 * 
	 * @return categorymodel
	 */
	public CategoryModel getCategory(){
		return panelModel;
	}
	
}
