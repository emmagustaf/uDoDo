package model;

import java.util.ArrayList;

import view.TaskPanel;

public class ListModel extends ArrayList<TaskPanel> {
	

	//public ListModel(){
		//ArrayList<TaskModel> taskList = new ArrayList<TaskModel>();
	//}
	
	public ArrayList<TaskPanel> getTaskList(){
		return this;
	}
	
	public void addTask(TaskPanel task){
		this.add(task);
	}
	
	public void removeTask(TaskPanel task){
		this.remove(task);
	}

}
