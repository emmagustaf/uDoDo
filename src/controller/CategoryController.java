package controller;
import view.*;
import model.*;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CategoryController implements ActionListener{

	private CategoryView view;
	private CategoryPanelModel panelModel;
	private CategoryModel model;
	
	public CategoryController(CategoryView view, CategoryPanelModel panelModel){
		this.view=view;
		this.panelModel=panelModel;
		panelModel.setController(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof CategoryModel){
			CategoryModel model= (CategoryModel) e.getSource();
			if("addCategory".equals(e.getActionCommand()) && panelModel.getCatTitle().length() > 0){
				CategoryModel cat = new CategoryModel(view.getCatTitle());
				CategoryPanel catPanel = new CategoryPanel(panelModel);
				view.repaint();
				view.revalidate();
				}
		}
	}
	
	
}
