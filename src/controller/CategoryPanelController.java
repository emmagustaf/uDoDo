package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;

public class CategoryPanelController implements ActionListener {
	private CategoryPanel panel;
	private CategoryModel model;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof CategoryPanelModel){
			CategoryPanelModel model = (CategoryPanelModel) e.getSource();
			if("panelPressed".equals(e.getActionCommand())){
				//If pressed the class ListModel should be updated with tasks from the chosen category
				}
		}
	}
	
	public void updateCategoryPanel(){
		
	}
	
}