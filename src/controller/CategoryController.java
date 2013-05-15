package controller;
import view.*;
import model.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * A class to represent a CategoryController.
 * @author Hanna
 *
 */
public class CategoryController implements ActionListener, MouseListener{

	private CategoryView view;
	private CategoryModel model;
	private CategoryListView catListView;
	private ListView listView;
	private StartCategoryPanel startCategoryPanel;
	/**
	 * 	Creates a CategoryController
	 * @param view
	 * @param catListView
	 * @param listView
	 */
	public CategoryController(CategoryView view, CategoryListView catListView, ListView listView, StartCategoryPanel startCategoryPanel){
		this.view=view;
		this.catListView = catListView;
		this.listView = listView;
		this.startCategoryPanel = startCategoryPanel;
		view.setController(this);
		
		//		this.panelModel=panelModel;
		//panelModel.setController(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() instanceof JButton || e.getSource() instanceof JTextField){
			if(e.getActionCommand().equals("newCategory") && view.getTextField().getText().length() > 0){
				CategoryModel cat = new CategoryModel(view.getTextField().getText());
				AddedCategoryPanel catPanel = new AddedCategoryPanel(cat);		
				catListView.panel.add(catPanel);
				view.getTextField().setText("");
				catListView.addToCatList(catPanel);
				catListView.updateView();
				CategoryPanelController catController = new CategoryPanelController(catPanel, catListView);
				System.out.println("category added");
			}		
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		startCategoryPanel.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		startCategoryPanel.setBackground(Color.white);		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
