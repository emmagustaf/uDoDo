package controller;
import view.*;
import model.*;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JTextField;


public class CategoryController implements ActionListener{

	private CategoryView view;
	private CategoryModel model;
	private CategoryListView catListView;
	private ListView listView;
	
	//set the constructor of the CategoryController
	public CategoryController(CategoryView view, CategoryListView catListView, ListView listView){
		this.view=view;
		this.catListView = catListView;
		this.listView = listView;
		view.setController(this);

		//		this.panelModel=panelModel;
		//panelModel.setController(this);
		
	}
	//Adds actionlistener for adding new categories to the categoryview
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton || e.getSource() instanceof JTextField){
			if(e.getActionCommand().equals("newCategory") && view.getTextField().getText().length() > 0){
				CategoryModel cat = new CategoryModel(view.getTextField().getText());
				CategoryPanel catPanel = new CategoryPanel(cat);
				catListView.add(catPanel);
				view.getTextField().setText("");
				catListView.updateView();
				CategoryPanelController catController = new CategoryPanelController(catPanel, catListView);

				System.out.println("category added");
				}
		}
	}
	
}
