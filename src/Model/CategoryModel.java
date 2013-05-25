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
		listModel = new ListModel();
		this.catTitle = catTitle;
	
	}
	
	/**
	 * Returns the actual TaskList
	 * @return
	 */
	public ListModel getTaskList(){
		return listModel;
	}

	/**
	 * Returns the title connected to the category
	 * @return
	 */
	public String getCatTitle() {
		return catTitle;
	}
	
}
