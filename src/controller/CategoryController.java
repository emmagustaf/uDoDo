package controller;
import view.*;
import model.*;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class CategoryController implements ActionListener{

	private CategoryView view;
	private CategoryModel panelModel;
	private CategoryModel model;
	
	public CategoryController(CategoryView view, CategoryModel panelModel){
		this.view=view;
		this.panelModel=panelModel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton){
			if(e.getActionCommand().equals("addCategory") && panelModel.getCatTitle().length() > 0){
				CategoryModel cat = new CategoryModel(view.getCatTitle());
				CategoryPanel catPanel = new CategoryPanel(panelModel);
				view.add(catPanel);
				view.repaint();
				view.revalidate();
				}
		}
	}
	
	
}
