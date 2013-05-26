package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import Model.TaskModel;

import view.CategoryListView;
import view.HeaderView;
import view.ListView;
import view.TaskPanel;
import view.TaskSettingView;

public class HeaderController implements ActionListener{
	
	private ListView view;
	private HeaderView headerView;
	private CategoryListView catListView;
	private TaskSettingView taskSetting;
	
	public HeaderController(HeaderView headerView, ListView view, TaskSettingView taskSetting, CategoryListView catListView){
	
		this.headerView = headerView;
		this.headerView.setController(this);
		this.view = view;
		this.taskSetting = taskSetting;
		this.catListView = catListView;
		
	}
	
	@Override
	/**
	 * Creates a new and TaskModel and TaskPanel, adds a TaskController to the TaskPanel and adds the panel in ListView.
	 * If a category is marked in the CategoryListView, the new task is added to that category.
	 * If no category, or the Finished-tasks-category is marked, the task is added to the default category.
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton || e.getSource() instanceof JTextField){
			if(e.getActionCommand().equals("newTask") && (headerView.getTextField().getText().length() > 0) && 
					(!headerView.getTextField().getText().equals("Add task..."))){
				
				TaskModel task;
				
				if(catListView.getMarkedList().isEmpty() || catListView.getMarkedPanel().getModel().getCatTitle().equals("Finished Tasks")){
				
					task = new TaskModel(headerView.getTextField().getText(), catListView.getDefaultCategory());
					
				}else{
					
					task = new TaskModel(headerView.getTextField().getText(), catListView.getMarkedPanel().getModel());
					
				}
				
				TaskPanel taskPanel = new TaskPanel(task);
				view.panelInScroll.add(taskPanel, 0);
				view.updateView();
				headerView.getTextField().setText("");
				
				TaskController taskController = new TaskController(view, taskPanel, taskSetting, catListView);
				
			}
		}
	}

}
