package model;

import java.util.ArrayList;

import view.TaskPanel;

public class ListModel extends ArrayList<TaskModel> {
	
	
	public ArrayList<TaskModel> getTaskList(){
		return this;
	}
	
	//beh�vs inte
	public void addTask(TaskModel task){
		this.add(task);
	}
	
	//beh�vs inte
	public void removeTask(TaskModel task){
		this.remove(task);
	}

}
