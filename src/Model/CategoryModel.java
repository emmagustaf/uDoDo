package Model;

import java.util.*;
import java.io.*;

/**
 * A class to represent a model of a category.
 *
 */
public class CategoryModel implements Serializable{

	private static final long serialVersionUID = 349685488686548422L;
	private String catTitle;
	private List<TaskModel> taskList;
	
	/**
	 * Creates a CategoryModel with an ArrayList to put TaskModels in. If the categories "Finished Tasks" 
	 * or "All Tasks" are created no ArrayList is created, since those categories are using 
	 * different ArrayLists (FinishedTaskList and AllTaskListModel).
	 */
	public CategoryModel(String catTitle) {
		if(!catTitle.equals("Finished Tasks") && !catTitle.equals("All Tasks")){
			taskList = new ArrayList<TaskModel>();
		}
		this.catTitle = catTitle;
	}
	
	
	/**
	 * Returns the List of tasks in the category
	 */
	public List<TaskModel> getTaskList(){
		if(catTitle.equals("Finished Tasks")){
			return FinishedTaskList.getInstance();
		}else if(catTitle.equals("All Tasks")){
			return AllTaskListModel.getInstance();
		}else{
			return taskList;
		}
	}

	/**
	 * Returns the title of the category
	 */
	public String getCatTitle() {
		return catTitle;
	}
	
}
