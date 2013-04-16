package model;

import java.util.*;

public class Category {
	
	private List <Task> list;
	private String catTitle;
	
	public Category(String catTitle){
		this.catTitle=catTitle;
		list=new ArrayList<Task>();
	
	}
	
	public void addTask(Task task){
		list.add(task);
	}
	
	public String getCatTitle(){
		return catTitle;
	}
}
