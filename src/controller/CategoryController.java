package controller;
import view.*;
import model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CategoryController implements ActionListener{

	private CategoryView view;
	private CategoryPanelModel panelModel;
	
	public CategoryController(CategoryView view, CategoryPanelModel panelModel){
		this.view=view;
		this.panelModel=panelModel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof CategoryModel){
			CategoryModel model = (CategoryModel) e.getSource();
			if("addCategory".equals(e.getActionCommand())){
				model.addNewCategory(view.getCatTitle());
				view.repaint();
				view.revalidate();
				}
		}
	}
	
	
}
