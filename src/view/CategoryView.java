	package view;

import java.awt.*;

import utility.*;
import controller.*;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout.Alignment;
public class CategoryView extends JPanel {
	
	private JButton addNewCategoryButton;
	private JTextField categoryTitleInput;
	
	/**
	 * A class to represent the view which will interact with the user when adding new categories
	 */
	
	public CategoryView(){
		this.setBackground(GraphicConstants.BACKGROUND);
		setPreferredSize(new Dimension(210, 70));
		setMinimumSize(new Dimension(210, 70));
		setMaximumSize(new Dimension(210, 70));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(GraphicConstants.BACKGROUND);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		add(panel);
		panel.setLayout(new MigLayout("", "[67.00px][62.00px]", "[31.00px,grow]"));
		
		categoryTitleInput = new JTextField();
		
		categoryTitleInput.setFont(GraphicConstants.REGULARFONT);
		categoryTitleInput.setActionCommand("newCategory");
		panel.add(categoryTitleInput, "cell 0 0,growx,aligny center");
		
		addNewCategoryButton = new JButton("Add category");
		addNewCategoryButton.setFont(GraphicConstants.REGULARFONT);
		addNewCategoryButton.setActionCommand("newCategory");
		panel.add(addNewCategoryButton, "cell 1 0,alignx right,aligny center");
	}
	
	/**
	 * Set controller for the button and textfield
	 * @param controller
	 */
	public void setController(CategoryController controller){
		addNewCategoryButton.addActionListener(controller);
		categoryTitleInput.addActionListener(controller);
	}
	
	/**
	 * Returns the categorytitle that the user has typed in
	 * @return
	 */
	public JTextField getTextField(){
		return categoryTitleInput;
	}

}
