package controller;


import model.*;
import utility.GraphicConstants;
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
	private TaskSettingView taskSetting;

	public TaskController(ListView listView, TaskPanel taskPanel, TaskSettingView taskSetting){
		this.listView = listView;
		this.taskPanel = taskPanel;
		this.taskSetting = taskSetting;
		taskPanel.setController(this);
		taskPanel.addMouseListener(listener);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("entered action preformed in taskcontroller");
		if(e.getSource() instanceof JComponent){
			if(e.getActionCommand().equals("deleteTask")){
				System.out.println("entered delete task");
				System.out.println("" + taskPanel.getModel().getTitle());
				listView.panelInScroll.remove(taskPanel);
				listView.updateView();
			}else if(e.getActionCommand().equals("taskCheck")){
				taskPanel.getModel().changeState();
			}
		}
	}
	
	private class MouseMethods implements MouseListener{

		@Override
		public void mouseEntered(MouseEvent arg0) {
			taskPanel.setBackground(GraphicConstants.BUTTONHOVER);
			taskPanel.setForeground(GraphicConstants.FOREGROUND);
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			taskPanel.setBackground(GraphicConstants.BACKGROUND);
			taskPanel.setForeground(GraphicConstants.FOREGROUND);
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			
			taskPanel.setBackground(GraphicConstants.BUTTONPRESSED);
			taskPanel.setForeground(GraphicConstants.BUTTONPRESSEDFOREGROUND);
			
			DisplayModel displayModel = new DisplayModel(taskPanel.getModel());
			
			DisplayTaskPanel displayPanel = new DisplayTaskPanel(displayModel, taskPanel.getModel());
			DisplayController displayController = new DisplayController(listView, taskSetting, displayPanel);

			taskSetting.panelInScroll.removeAll();
			taskSetting.panelInScroll.add(displayPanel);
			taskSetting.updateView();

		}
	}
}
