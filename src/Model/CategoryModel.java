package model;

import java.awt.Component;
import java.util.*;

import utility.Save;
import view.*;
import controller.*;
import java.io.*;
/**
 * A class to represent a model of the category.
 * 
 * @author Hanna
 *
 */
public class CategoryModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 349685488686548422L;
	private String catTitle;
	private CategoryView view;
	private AddedCategoryPanel panel;
	private CategoryModel panelModel;
	private List<TaskModel> taskList;
	private StartCategoryPanel startPanel;
	
	
//	private List <AddedCategoryPanel> catList= new ArrayList <AddedCategoryPanel> ();
//	private Deque <CategoryModel> markedList = new ArrayDeque <CategoryModel>();

	/**
	 * Creates the categoryModel
	 * @param catTitle
	 */
	@SuppressWarnings("unchecked")
	public CategoryModel(String catTitle) {
		if(!catTitle.equals("Finished Tasks") && !catTitle.equals("All Tasks")){
			taskList = new ArrayList<TaskModel>();
		}
		this.catTitle = catTitle;
		
	}
	
	/**
	 * Returns the actual TaskList
	 * @return
	 */
	public List<TaskModel> getTaskList(){
		if(catTitle.equals("Finished Tasks")){
			return FinishedTaskList.getInstance();
		}else if(catTitle.equals("All Tasks")){
			return AllTaskListModel.getInstance();
		}else{
			return taskList;
		}
	}

	/**
	 * Returns the title connected to the category
	 * @return
	 */
	public String getCatTitle() {
		return catTitle;
	}
	
}
