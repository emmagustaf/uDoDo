package model;

import java.io.Serializable;
import utility.*;
import javax.swing.JLabel;


import view.*;

public class TaskModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3243208829863896513L;

	private boolean checked;
	private String title;
	private String description;
	private CategoryModel catModel;
	private String deadline;
	private JLabel deadlineLabel = new JLabel();

	
	
	public TaskModel(String title, CategoryModel catModel){
		this.title = title;
		this.checked = false;
		this.catModel = catModel;
		catModel.getTaskList().add(this);

		if(!AllTaskListModel.getInstance().contains(this)){
			AllTaskListModel.getInstance().add(this);
		}

		Save.saveFiles();

	}
	
	/**
	 * Changes the tasks checked/unchecked state
	 */
	public void changeState(){
		checked = !checked;
		
	}
	
	/**
	 * 
	 * @return true if the task is checked, and false if the task is unchecked
	 */
	public boolean isChecked(){
		return checked;
		
	}
	
	/**
	 * 
	 * @return the title of the task
	 */
	public String getTitle(){
		return title;
	}
	
	/**
	 * 
	 * @return the description of the task
	 */
	public String getDescription(){
		return description;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	
	/**
	 * sets the deadline for the TaskModel
	 */
	public void setDeadline(String deadline){
		this.deadline=deadline;
	}
	
	/**
	 * sets the deadline in the EditTaskPanel
	 */
	public void setDeadlineLabel(String deadline){
		deadlineLabel.setText(deadline);
	}
	
	/**
	 * 
	 * @return a String with the deadline for the task, or if no deadline exists, an explanatory message
	 */
	public String getDeadline(){
		if(deadline==null){
			return "No deadline for this task";
		}else{
			return deadline;
		}
	}

	/**
	 * 
	 * @return the CategoryModel which the task belongs to
	 */
	public CategoryModel getCategory(){
		return catModel;
	}

}


