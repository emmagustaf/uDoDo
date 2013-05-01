package model;

import java.util.*;

public class CategoryModel {
	
	//private List <TaskModel> list;
	private String catTitle;
	
	public CategoryModel(String catTitle){
		this.catTitle=catTitle;
	//	list=new ArrayList<TaskModel>();
	
	}
	
/*	public void addTask(TaskModel task){
		list.add(task);
	}
	*/
	
	public String getCatTitle(){
		return catTitle;
	}
	public String setCatTitle(String title){
		return title;
		
	}
	public void addNewCategory(String title){
		
	}
}
