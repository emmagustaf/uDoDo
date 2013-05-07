package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskModel {
	private enum Priority{
		HIGH_PRIORITY, NO_PRIORITY
	}
	
	private boolean checked;
	private String title;
	private String description;
	private Priority prio;
	private Date deadline;
	private ListModel listModel;
	//private List<TaskModel> uncheckedTaskList = new ArrayList<TaskModel>();
	//we will have to find a way to keep track of unchecked and checked tasks
	//I think it will be too many lists with stuff soon...
	
	public TaskModel(String title){
		this.title = title;
		this.checked = false;
		this.prio = Priority.NO_PRIORITY;
	}
	
	public TaskModel(String title, ListModel listModel){
		this(title);
		this.listModel = listModel;
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
	
	public ListModel getCategory(){
		return listModel;
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
	public Date getDeadline(){
		return deadline;
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
	public void setDeadline(Date deadline){
		this.deadline=deadline;
	}
}


