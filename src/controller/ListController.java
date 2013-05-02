package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;
import model.*;

public class ListController implements ActionListener {

	private ListView view;
	private ListModel model;
	
	public ListController(ListView view, ListModel model){
		this.view = view;
		this.model = model;
	}
	
	public void addTask(TaskPanel task){
		view.add(task);
		view.updateView();
	}
	
	public void removeTask(TaskPanel task){
		view.remove(task);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
