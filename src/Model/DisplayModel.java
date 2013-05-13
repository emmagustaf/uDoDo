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
	 * @return the title of the task
	 */
	public String getTaskTitle() {
		return task.getTitle();
	}

	/**
	 * Returns the description of the task
	 * 
	 * @return the description of the task
	 */
	public String getTaskDescription(){
		return  task.getDescription();
	}
	
	/**
	 * Returns the actual taskmodel.
	 * @return task
	 */
	public TaskModel getTaskModel(){
		return this.task;
	}
	
	/**
	 * Sets the title of the task
	 * 
	 * @return title
	 */
	public String setTaskTitle() {
		return title;
	}
	
	/**
	 * Sets the Description of the task
	 * @param description
	 * @return description
	 */
	public String setTaskDescription(String description){
		return description;
	}

}
