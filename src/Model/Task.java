package model;

public class Task {
	private enum Priority{
		HIGH_PRIORITY, NO_PRIORITY
	}
	private String title;
	private String description;
	private Priority prio;
	
	public Task(String title){
		this.title = title;
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
	public Priority getPrio(){
		return prio;
	}
	public String getTitle(){
		return title;
	}
	public String getDescription(){
		return description;
	}
}
