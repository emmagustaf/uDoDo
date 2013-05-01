package view;

import java.awt.*;
import controller.*;
import javax.swing.*;
public class CategoryView extends JPanel {
	private CategoryController controller;
	private JTextField categoryTitleInput;
	private String addCategory;
	JButton addNewCategoryButton = new JButton ("New");
	
	public CategoryView(CategoryController controller){
		categoryTitleInput = new JTextField(10);
		this.controller=controller;
		
		add(categoryTitleInput);
		add(addNewCategoryButton);
		addNewCategoryButton.setActionCommand("addCategory");
	}
	
	public JButton getAddButton(){
		return addNewCategoryButton;
	}

}
