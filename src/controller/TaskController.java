package controller;


import model.*;
import utility.GraphicConstants;
import utility.Save;
import view.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class TaskController implements ActionListener, MouseListener {
	
	private ListModel listModel;
	private ListView listView;
	private TaskPanel taskPanel;
	private TaskSettingView taskSetting;
	private CategoryListView catListView;

	public TaskController(ListView listView, TaskPanel taskPanel, TaskSettingView taskSetting, CategoryListView catListView){
		
		this.listView = listView;
		this.taskPanel = taskPanel;
		this.catListView = catListView;
		this.taskSetting = taskSetting;
		taskPanel.setController(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("entered action performed in taskcontroller");
		if(e.getSource() instanceof JComponent){
			
			if(e.getActionCommand().equals("deleteTask")){
				
				System.out.println("entered delete task");
				System.out.println("" + taskPanel.getModel().getTitle());
				listView.panelInScroll.remove(taskPanel);
				taskPanel.getModel().getCategory().getTaskList().remove(taskPanel.getModel());
			
				listView.updateView();
				
				AllTaskListModel.getInstance().remove(taskPanel.getModel());
				FinishedTaskList.getInstance().remove(taskPanel.getModel());
				Save.saveFinishedTasks();
				Save.saveFiles();
				
			}else if(e.getActionCommand().equals("taskCheck")){
				
				System.out.println("task checked");
				taskPanel.getModel().changeState();
				
				CategoryModel cModel = taskPanel.getModel().getCategory();
				
				if(taskPanel.getModel().isChecked() && !FinishedTaskList.getInstance().contains(taskPanel.getModel())){
				
					
//					catListView.getFinishedCategoryPanel().setBackground(GraphicConstants.BUTTONPRESSED);
//					catListView.getFinishedCategoryPanel().setTextColor(GraphicConstants.BUTTONPRESSEDFOREGROUND);
//					catListView.getMarkedPanel().setBackground(GraphicConstants.BACKGROUND);
//					catListView.getMarkedPanel().setTextColor(GraphicConstants.FOREGROUND);
					
					FinishedTaskList.getInstance().add(taskPanel.getModel());
					listView.panelInScroll.remove(taskPanel);
					cModel.getTaskList().remove(taskPanel.getModel());
					AllTaskListModel.getInstance().remove(taskPanel.getModel());
					FinishedTaskList.getInstance().add(taskPanel.getModel());
					Save.saveFinishedTasks();
					Save.saveFiles();
					//listView.displayTasks(catListView.getFinishedCategoryPanel().getModel(), taskSetting, catListView);
					
					
				}else if(taskPanel.getModel().isChecked() && FinishedTaskList.getInstance().contains(taskPanel.getModel())){
					
					cModel.getTaskList().add(taskPanel.getModel());
					listView.panelInScroll.remove(taskPanel);
					FinishedTaskList.getInstance().remove(taskPanel.getModel());
					AllTaskListModel.getInstance().add(taskPanel.getModel());
					
					
				}
				listView.updateView();
			}
		}
	}
	
		@Override
		public void mouseEntered(MouseEvent arg0) {
			taskPanel.taskLabel.setForeground(GraphicConstants.BUTTONHOVER);
			taskPanel.taskLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			taskPanel.taskLabel.setForeground(GraphicConstants.FOREGROUND);
			taskPanel.taskLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			
			DisplayModel displayModel = new DisplayModel(taskPanel.getModel());
			
			DisplayTaskPanel displayPanel = new DisplayTaskPanel(displayModel, taskPanel.getModel());
			DisplayController displayController = new DisplayController(listView, taskSetting, displayPanel);

			taskSetting.panelInScroll.removeAll();
			taskSetting.panelInScroll.add(displayPanel);
			taskSetting.updateView();

		}
}
