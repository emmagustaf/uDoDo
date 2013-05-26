package model;

import java.util.ArrayList;
import java.io.*;

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
