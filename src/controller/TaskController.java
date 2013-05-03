package controller;


import model.*;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;

public class TaskController implements ActionListener {
	private ListModel listModel;
	private ListView listView;
	private TaskPanel taskPanel;

	public TaskController(ListView listView, TaskPanel taskPanel){
		this.listView = listView;
		this.taskPanel = taskPanel;
		taskPanel.setController(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JComponent){
			if(e.getActionCommand().equals("deleteTask")){
				listView.remove(taskPanel.getPanel());
				listView.updateView();
			}else if(e.getActionCommand().equals("taskCheck")){
				taskPanel.getModel().changeState();
			}
		}
	}
}
