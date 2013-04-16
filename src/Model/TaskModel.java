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
<<<<<<< HEAD:src/Model/Task.java
=======
	
	//TODO going to need setters and getters for ALL the variables owned by a new task.
	
	
>>>>>>> d1e91b487a20301c0ba16875b6ffd53d8a0c1310:src/Model/TaskModel.java
}
