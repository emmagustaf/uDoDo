package controller;

import view.*;

public class ListController {

	private ListView view;
	
	public ListController(ListView view){
		this.view = view;
	}
	
	public void addTask(TaskPanel task){
		//TODO add task to the listview.
		view.add(task);
		view.revalidate();
		view.repaint();
		
	}
	
	public void removeTask(TaskPanel task){
		//TODO remove task from the listview.
		view.remove(task);
	}
	
	public void updateListView(){
		//TODO update the listview.
		view.repaint();
	}

}
