package model;


import java.util.ArrayList;
import java.io.*;

public class AllTaskListModel extends ArrayList<TaskModel> implements Serializable {
	
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
