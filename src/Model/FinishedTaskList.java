package Model;

import java.util.ArrayList;

import java.io.*;

/**
 * An ArrayList (Singleton) with TaskModels, to keep track of all the finsihed tasks in the application.
 * The TaskModels are added to the ArrayList in the TaskController, when the checked state is changed.
 */

public class FinishedTaskList extends ArrayList<TaskModel> implements Serializable{
	
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
