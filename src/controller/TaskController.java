package controller;


import model.*;
import view.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class TaskController implements ActionListener {
	private ListModel listModel;
	private ListView listView;
	private TaskPanel taskPanel;
	private MouseMethods listener = new MouseMethods();
	private DisplayTaskView displayView;

	public TaskController(ListView listView, TaskPanel taskPanel){
		this.listView = listView;
		this.taskPanel = taskPanel;
		taskPanel.setController(this);
		taskPanel.addMouseListener(listener);
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
	
	private class MouseMethods implements MouseListener{

		@Override
		public void mouseEntered(MouseEvent arg0) {
			taskPanel.setBackground(Color.blue);
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			taskPanel.setBackground(Color.white);
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			taskPanel.setBackground(Color.red);
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			//displayView.setVisible(true);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
		
		}
	}
}
