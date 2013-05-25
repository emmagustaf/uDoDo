package model;

import java.util.ArrayList;

public class AllTaskListModel extends ArrayList<TaskModel> {
	
	private static AllTaskListModel instance;
	
	private AllTaskListModel(){
		
	}
	
	public static AllTaskListModel getInstance(){
		if(instance == null){
			return instance = new AllTaskListModel();
		}else{
			return instance;
		}
	}

}
