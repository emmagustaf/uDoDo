package model;

public class DisplayModel {
	private String title;
	private String description;
	private TaskModel task;
	
	public DisplayModel(TaskModel task){
		this.task=task;
	}
	public String getTaskTitle() {
		return task.getTitle();
	}

	public String getTaskDescription(){
		return  task.getDescription();
	}
	
	public String setTaskTitle() {
		return title;
	}
	
	public String setTaskDescription(String description){
		return description;
	}
}
