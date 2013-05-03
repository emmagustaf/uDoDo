package controller;
import view.*;
import model.*;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class CategoryController implements ActionListener{

	private CategoryView view;
	private CategoryModel model;
	private CategoryListView listView;
	
	public CategoryController(CategoryView view, CategoryListView listView){
		this.view=view;
<<<<<<< HEAD
		this.panelModel=panelModel;
		panelModel.setController(this);
=======
		view.setController(this);
		this.listView = listView;
>>>>>>> 0a8db69a9f5822c2f103b7691e2fda38f99567e9
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton){
			if(e.getActionCommand().equals("newCategory") && view.getTextField().getText().length() > 0){
				CategoryModel cat = new CategoryModel(view.getTextField().getText());
				CategoryPanel catPanel = new CategoryPanel(cat);
				listView.add(catPanel);
				listView.updateView();
				System.out.println("category added");
				}
		}
	}
	
	
}
