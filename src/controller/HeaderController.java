package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

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
		if(e.getSource() instanceof JButton || e.getSource() instanceof JTextField){
			if(e.getActionCommand().equals("newTask") && headerView.getTextField().getText().length() > 0){
				TaskModel task = new TaskModel(headerView.getTextField().getText());
				TaskPanel taskPanel = new TaskPanel(task);
				view.add(taskPanel);
				headerView.getTextField().setText("");
				view.updateView();
				TaskController taskController = new TaskController(view, taskPanel);
				//view.
			}
		}
	}

}
