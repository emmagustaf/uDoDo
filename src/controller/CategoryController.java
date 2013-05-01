package controller;
import view.*;
import model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CategoryController implements ActionListener{

	private List <CategoryModel> catList= new ArrayList <CategoryModel> ();
	private CategoryModel model;
	private CategoryView view;
	private CategoryPanelModel panelModel;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof CategoryModel){
			CategoryModel model = (CategoryModel) e.getSource();
		}
		addNewCategory(model.getCatTitle());
	}
	public void addNewCategory(String title) {
		CategoryPanel panel = new CategoryPanel(panelModel);
		catList.add(panel);
		updateCategoryView();
		
	}

	public void updateCategoryView() {
		view.repaint();
	}
}
