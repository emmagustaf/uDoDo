package view;

import java.awt.*;
import controller.*;
import javax.swing.*;
public class CategoryView extends JPanel {
	private CategoryController controller;
	private JTextField categoryTitleInput;
	
	public CategoryView(CategoryController controller){
		categoryTitleInput = new JTextField(20);
		this.controller=controller;
		JButton addNewCategoryButton = new JButton ("Create new category");
		this.add(categoryTitleInput);
		this.add(addNewCategoryButton);
		addNewCategoryButton.addActionListener(null);
	}

}
