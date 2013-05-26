package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.*;

import utility.GraphicConstants;

import model.AllCategoryListModel;
import model.CategoryModel;
import controller.CategoryPanelController;
/**
 * A class to represent the panels which are added when user wants to add them.
 * This class extends StartCategoryPanel
 * 
 * @author Hanna
 *
 */
public class AddedCategoryPanel extends StartCategoryPanel {

	private JButton deleteCatButton = new JButton();
	private CategoryModel model;
	private CategoryPanelController controller;
	
	
	/**
	 * Create the panel.
	 * @param model
	 */
	public AddedCategoryPanel(CategoryModel model){
		super(model);
		super.setTitle(model.getCatTitle());
		this.model=model;
		this.setToolTipText("" + model.getCatTitle());
		this.setBackground(GraphicConstants.BACKGROUND);
		setForeground(GraphicConstants.FOREGROUND);
		deleteCatButton.setRolloverIcon(new ImageIcon(AddedCategoryPanel.class.getResource("/utility/icons/delete.icon.hover.png")));
		
		deleteCatButton.setToolTipText("Delete category and all it's content");
		
		deleteCatButton.setIcon(new ImageIcon(AddedCategoryPanel.class.getResource("/utility/icons/delete_icon&16.png")));
		deleteCatButton.setBorderPainted(false);
		
		deleteCatButton.setPreferredSize(new Dimension(15, 10));
		deleteCatButton.setActionCommand("delete Category");
		GridBagConstraints gbc_deleteCatButton = new GridBagConstraints();
		gbc_deleteCatButton.anchor = GridBagConstraints.WEST;
		gbc_deleteCatButton.gridx = 2;
		gbc_deleteCatButton.gridy = 0;
		add(deleteCatButton, gbc_deleteCatButton);
		
	}
	
	/**
	 *  Set controller for the panel, mouselistener will handle what 
	 *  actions will be performed when the panel is clicked upon 
	 *	Also set controller for the deletebutton included in the panel
	 * @param controller
	 */
	
	public void setController(CategoryPanelController controller){
		super.setController(controller);
		deleteCatButton.addActionListener(controller);
	}
	
	/**
	 * 	 Method returning the actual model
	 * @return
	 */
	public CategoryModel getModel(){
		return this.model;
	}
}
