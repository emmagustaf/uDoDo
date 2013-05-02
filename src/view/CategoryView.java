package view;

import java.awt.*;
import controller.*;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
public class CategoryView extends JPanel {
	
	private JTextField categoryTitleInput;
	private String addCategory;
	JButton addNewCategoryButton = new JButton ("New");
	
	public CategoryView(){
		setLayout(new MigLayout("", "[82.00px][53px]", "[23px]"));
		categoryTitleInput = new JTextField(8);
		add(categoryTitleInput, "cell 0 0,alignx left,aligny center");
		add(addNewCategoryButton, "cell 1 0,alignx left,aligny top");
		addNewCategoryButton.setActionCommand("addCategory");
	}
	public void setController(CategoryController controller){
		addNewCategoryButton.addActionListener(controller);
	}
	public JButton getAddButton(){
		return addNewCategoryButton;
	}
	public String getCatTitle(){
		return categoryTitleInput.getText();
	}

}
