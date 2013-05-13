package controller;
import view.*;
import model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * A class to represent a CategoryController.
 * @author Hanna
 *
 */
public class CategoryController implements ActionListener{

	private CategoryView view;
	private CategoryModel model;
	private CategoryListView catListView;
	private ListView listView;
	
	/**
	 * 	Creates a CategoryController
	 * @param view
	 * @param catListView
	 * @param listView
	 */
	public CategoryController(CategoryView view, CategoryListView catListView, ListView listView){
		this.view=view;
		this.catListView = catListView;
		this.listView = listView;
		view.setController(this);
		//		this.panelModel=panelModel;
		//panelModel.setController(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() instanceof JButton || e.getSource() instanceof JTextField){
			if(e.getActionCommand().equals("newCategory") && view.getTextField().getText().length() > 0){
				CategoryModel cat = new CategoryModel(view.getTextField().getText());
				CategoryPanel catPanel = new CategoryPanel(cat);				
				catListView.panel.add(catPanel);
				view.getTextField().setText("");
				catListView.addToCatList(catPanel);
				catListView.updateView();
				CategoryPanelController catController = new CategoryPanelController(catPanel, catListView);
				System.out.println("category added");
			}		
		}
	}
	
}
