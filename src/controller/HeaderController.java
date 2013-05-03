package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.TaskModel;

import view.HeaderView;
import view.ListView;
import view.TaskPanel;

public class HeaderController implements ActionListener{
	
	private ListView view;
	private HeaderView headerView;
	
	public HeaderController(HeaderView headerView, ListView view){
		this.headerView = headerView;
		headerView.setController(this);
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton){
			if(e.getActionCommand().equals("newTask") && headerView.getTextField().length() > 0){
				TaskModel task = new TaskModel(headerView.getTextField());
				TaskPanel taskPanel = new TaskPanel(task);
				view.add(taskPanel);
				view.updateView();
				//view.
			}
		}
	}

}
