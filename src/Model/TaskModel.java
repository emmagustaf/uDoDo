package model;

public class TaskModel {
	private enum Priority{
		HIGH_PRIORITY, NO_PRIORITY
	}
	
	private boolean checked;
	private String title;
	private String description;
	private Priority prio;
	
	public TaskModel(String title){
		this.title = title;
		checked = false;
		prio = Priority.NO_PRIORITY;
	}
	public void removeTask(){
		
	}
	public void changePriority(){
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
	
	
}
