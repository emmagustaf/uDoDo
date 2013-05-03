package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JButton;

import view.*;
import model.*;

public class ListController implements ActionListener {

	private ListView listView;
	private ListModel listModel;
	
	public ListController(ListView listView, ListModel listModel){
		this.listView = listView;
		this.listModel = listModel;
	}
	
	public void addTask(TaskPanel task){
		listView.add(task);
		listView.updateView();
	}
	
	public void removeTask(TaskPanel task){
		listView.remove(task);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand().equals("taskCheck")){
				 ((TaskPanel)((JCheckBox) e.getSource()).getParent()).getModel().changeState();
			}else if(e.getSource().equals("deleteTask")){
				listModel.removeTask(((TaskPanel)((JButton) e.getSource()).getParent()).getModel());
			}
	}

}
