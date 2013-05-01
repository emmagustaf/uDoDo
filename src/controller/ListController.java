package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;

public class ListController implements ActionListener {

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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
