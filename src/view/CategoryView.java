package view;

import java.awt.*;
import utility.*;
import controller.*;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout.Alignment;
public class CategoryView extends JPanel {
	private String addCategory;
	private JButton addNewCategoryButton;
	private JTextPane categoryTitleInput;
	
	public CategoryView(){
		setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setSize(new Dimension(153, 420));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		add(panel);
		panel.setLayout(new MigLayout("", "[67.00px][62.00px]", "[31.00px,grow]"));
		
		categoryTitleInput = new JTextPane();
		panel.add(categoryTitleInput, "cell 0 0,growx,aligny center");
		
		addNewCategoryButton = new JButton("New");
		panel.add(addNewCategoryButton, "cell 1 0,alignx right,aligny center");
	}
	public void setController(CategoryController controller){
		addNewCategoryButton.addActionListener(controller);
	}
	
	public String getCatTitle(){
		return categoryTitleInput.getText();
	}

}
