package model;

import java.util.ArrayList;

public class ListModel extends ArrayList<TaskModel> {

	public ListModel(){
		
	}
	
	public void addTask(TaskModel task){
		this.add(task);
	}
	
	public void removeTask(TaskModel task){
		this.remove(task);
	}

}
