package model;

/**
 * A class to represent a model of the display.
 * 
 * @author Hanna
 *
 */
public class DisplayModel {
	
	private String title;
	private String description;
	private TaskModel task;
	
	/**
	 * Create a new model
	 * @param task
	 */
	public DisplayModel(TaskModel task){
		this.task=task;
	}
	
	/**
	 * Returns the title of the task.
	 * 
	 * @return 
	 */
	public String getTaskTitle() {
		return task.getTitle();
	}

	/**
	 * Returns the description of the task
	 * 
	 * @return
	 */
	public String getTaskDescription(){
		return  task.getDescription();
	}
	
	/**
	 *
	 * @return
	 */
	public TaskModel getTaskModel(){
		return this.task;
	}
	
	public String setTaskTitle() {
		return title;
	}
	
	public String setTaskDescription(String description){
		return description;
	}

}
