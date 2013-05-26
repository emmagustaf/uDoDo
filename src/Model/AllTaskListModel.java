package Model;


import java.util.ArrayList;
import java.io.*;

/**
 * An ArrayList (Singleton) with TaskModels, to keep track of all the tasks in the application.
 * The TaskModels are added to the ArrayList in the TaskModel constructor.
 */

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
