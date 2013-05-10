package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import model.CategoryModel;
import model.ListModel;
import model.TaskModel;

import view.CategoryListView;
import view.HeaderView;
import view.ListView;
import view.TaskPanel;

public class HeaderController implements ActionListener{
	
	private ListView view;
	private HeaderView headerView;
	private CategoryListView catListView;
	
	//public HeaderController(HeaderView headerView, ListView view, CategoryListView catListView){
		//this.headerView = headerView;
		//headerView.setController(this);
		//this.view = view;
		//this.catListView = catListView;
	//}
	
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
				
				//här behövs det få tag på info om en panel är markerad eller inte, en panel markeras via
				//mouselistener i categorypanelcontroller. 
				//kanske inte behöver ha två olika konstruktorer i taskmodel, utan bara alltid skicka med
				//typ en categorypanel/model, d
				
				//if(categorypanel är markerad){
					//TaskModel task = new TaskModel(headerView.getTextField().getText(), e.getSource().getModel());
					//e.getSource().getModel().getTaskList().add(task);
				//}else{
					//TaskModel task = new TaskModel(headerView.getTextField().getText());
				//}
				TaskPanel taskPanel = new TaskPanel(task);
				//view.panelInScroll.add(taskPanel);
				view.getViewport().add(taskPanel);
				view.updateView();
				headerView.getTextField().setText("");
				
				TaskController taskController = new TaskController(view, taskPanel);
				//view.
			}
		}
	}

}
