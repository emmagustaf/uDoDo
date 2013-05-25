package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

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
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton || e.getSource() instanceof JTextField){
			if(e.getActionCommand().equals("newTask") && headerView.getTextField().getText().length() > 0){
				TaskModel task;
				if(catListView.getMarkedList().isEmpty()){
				
					task = new TaskModel(headerView.getTextField().getText(), catListView.getDefaultCategory());
				
				}else{
					
					task = new TaskModel(headerView.getTextField().getText(), catListView.getMarkedPanel());
				}
				//h�r beh�vs det f� tag p� info om en panel �r markerad eller inte, en panel markeras via
				//mouselistener i categorypanelcontroller. 
				//kanske inte beh�ver ha tv� olika konstruktorer i taskmodel, utan bara alltid skicka med
				//typ en categorypanel/model
				
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
