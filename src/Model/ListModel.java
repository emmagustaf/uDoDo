package model;

import java.util.ArrayList;

public class ListModel extends ArrayList<TaskModel> {
	

	//public ListModel(){
		//ArrayList<TaskModel> taskList = new ArrayList<TaskModel>();
	//}
	
	public ArrayList<TaskModel> getTaskList(){
		return this;
	}
	
	public void addTask(TaskModel task){
		this.add(task);
	}
	
	public void removeTask(TaskModel task){
		this.remove(task);
	}

}
