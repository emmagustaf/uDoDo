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
	public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand().equals("taskCheck")){
				 ((TaskPanel)((JCheckBox) e.getSource()).getParent()).getModel().changeState();
			}else if(e.getSource().equals("deleteTask")){
//				listView.
	//			listModel.removeTask(model);
			}
	}
}
