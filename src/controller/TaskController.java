package controller;


import model.*;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

public class TaskController implements ActionListener {
	ListModel listModel;
	ListView listView;

	public TaskController(ListView listView, ListModel listModel){
		this.listView = listView;
		this.listModel = listModel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
