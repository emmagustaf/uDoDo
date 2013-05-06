package view;

import java.awt.GridLayout;

import javax.swing.JPanel;

import utility.GraphicConstants;

public class CategoryListView extends JPanel{
	
	public CategoryListView(){
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new GridLayout(5, 1));
	}
	
	public void updateView(){
		this.revalidate();
		this.repaint();
		this.setVisible(true);
		System.out.println("view updated");
	}
	
}
