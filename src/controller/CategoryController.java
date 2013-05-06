package controller;
import view.*;
import model.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTextField;


public class CategoryController implements ActionListener{

	private CategoryView view;
	private CategoryModel model;
	private CategoryListView listView;
	
	
	public CategoryController(CategoryView view, CategoryListView listView){
		this.view=view;
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
				listView.add(catPanel);
				view.getTextField().setText("");
				listView.updateView();
				System.out.println("category added");
				}
		}
	}
	
}
