package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import view.*;

public class TaskModel {
	private enum Priority{
		HIGH_PRIORITY, NO_PRIORITY
	}
	
	private boolean checked;
	private String title;
	private String description;
	private Priority prio;
	private Calendar deadline;
	private StartCategoryPanel catPanel;
	private EditTaskPanel editTaskPanel;
	//private List<TaskModel> uncheckedTaskList = new ArrayList<TaskModel>();
	//we will have to find a way to keep track of unchecked and checked tasks
	//I think it will be too many lists with stuff soon...
	
	public TaskModel(String title){
		this.title = title;
		this.checked = false;
		this.prio = Priority.NO_PRIORITY;
		this.deadline = null;
		
	}
	
	public TaskModel(String title, StartCategoryPanel catPanel){
		this(title);
		this.catPanel = catPanel;
		//catPanel.getModel().getTaskList().add(this);
		
		//this.uncheckedTaskList.add(this);
	}
	
	public void changePriority(){				//We probably will be needing a controller-class for the tasks, doing this kind of stuff but not yet! :D
		switch (prio) {
			case NO_PRIORITY:
				prio = Priority.HIGH_PRIORITY;
				break;
			case HIGH_PRIORITY:
				prio = Priority.NO_PRIORITY;
				break;
			default:
				prio = this.getPrio();
				break;
		}
			
	}
	
	public void changeState(){
		checked = !checked;
	}
	
	public Priority getPrio(){
		return prio;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	
	public void setPrio(Priority prio){
		this.prio=prio;
	}
	
	public String getDeadline(){
		if(deadline==null){
			return "No deadline for this task";
		}else{
			String todaysDate = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
		return todaysDate;
		}
	}
	
//	public void setDeadline(Calendar deadline){
//		String year = editTaskPanel.deadline().substring(0,4);
//		String month = editTaskPanel.deadline().substring(4, 5);
//		String day = editTaskPanel.deadline().substring(5, 6);
//		deadline.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
//		this.deadline=deadline;
//	}
//	public String deadlineToString(Calendar deadline){
//		this.deadline=deadline;
//		String year = editTaskPanel.deadline().substring(0,4);
//		String month = editTaskPanel.deadline().substring(4, 5);
//		String day = editTaskPanel.deadline().substring(5, 6);
//		return year+"/"+month+"/"+day;
//	}
//	public String todaysDateToString(){
//		String todaysDate = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
//		return todaysDate;
//	}
	
	
	public CategoryModel getCategory(){
		return catPanel.getModel();
	}
	
	
	public StartCategoryPanel getCatPanel(){
		return catPanel;
	}
	
	/**
	 * Sets the category of the task.
	 * 
	 */
	public void setCategory(){
	
	}
}


