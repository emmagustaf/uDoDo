package view;

import java.awt.*;
import controller.*;
import javax.swing.*;
public class CategoryView extends JPanel {
	
	private JTextField categoryTitleInput;
	private String addCategory;
	JButton addNewCategoryButton = new JButton ("New");
	
	public CategoryView(){
		categoryTitleInput = new JTextField(10);
		
		
		add(categoryTitleInput);
		add(addNewCategoryButton);
		addNewCategoryButton.setActionCommand("addCategory");
	}
	
	public JButton getAddButton(){
		return addNewCategoryButton;
	}

}
