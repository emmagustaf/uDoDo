package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.TaskModel;

import view.HeaderView;
import view.TaskPanel;

public class HeaderController implements ActionListener{
	
	private HeaderView view;
	
	public HeaderController(HeaderView view){
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof HeaderView){
			if(e.getActionCommand().equals("newTask") && view.getTextField().length() > 0){
				TaskModel task = new TaskModel(view.getTextField());
				TaskPanel taskPanel = new TaskPanel(task);
			}
		}
	}

}
