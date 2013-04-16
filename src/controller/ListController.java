package controller;

import view.*;

public class ListController {

	private ListView view;
	
	public ListController(ListView view){
		this.view = view;
	}
	
	private void addTask(TaskPanel task){
		//TODO add task to the listview.
		view.add(task);
		view.repaint();
		
	}
	
	private void removeTask(TaskPanel task){
		//TODO remove task from the listview.
		view.remove(task);
	}
	
	private void updateListView(){
		//TODO update the listview.
		view.repaint();
	}

}
