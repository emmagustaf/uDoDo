package model;

import java.util.ArrayList;

public class FinishedTaskList extends ArrayList<TaskModel>{
	
	private static FinishedTaskList instance;

	private FinishedTaskList(){
		
	}
	
	public static FinishedTaskList getInstance(){
		if(instance == null){
			return instance = new FinishedTaskList();
		}else{
			return instance;
		}
	}
	
}
