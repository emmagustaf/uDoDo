package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import model.AllTaskListModel;
import model.CategoryModel;
import model.ListModel;
import model.TaskModel;

import view.CategoryListView;
import view.AddedCategoryPanel;
import view.HeaderView;
import view.ListView;
import view.StartCategoryPanel;
import view.TaskPanel;
import view.TaskSettingView;

public class HeaderController implements ActionListener{
	
	private ListView view;
	private HeaderView headerView;
	private CategoryListView catListView;
	private StartCategoryPanel catPanel;
	private TaskSettingView taskSetting;
	
	public HeaderController(HeaderView headerView, ListView view, StartCategoryPanel catPanel, TaskSettingView taskSetting, CategoryListView catListView){
		this.headerView = headerView;
		this.headerView.setController(this);
		this.view = view;
		this.catPanel = catPanel;
		this.taskSetting = taskSetting;
		this.catListView = catListView;
	}
	
	@Override
	/**
	 * Creates a new TaskPanel and TaskModel, adds the panel to ListView.
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
					System.out.println("task belongs to cat: " + task.getCategory().getCatTitle());
					//AllTaskListModel.getInstance().add(task);
				
				}else{
					
					task = new TaskModel(headerView.getTextField().getText(), catListView.getMarkedPanel().getModel());
					System.out.println("task belongs to category: " + task.getCategory().getCatTitle());
				}
				
				TaskPanel taskPanel = new TaskPanel(task);
				view.panelInScroll.add(taskPanel, 0);
				view.updateView();
				headerView.getTextField().setText("");
				
				TaskController taskController = new TaskController(view, taskPanel, taskSetting, catListView);
				//view.
			}
		}
	}

}
