package view;

import java.awt.GridLayout;

import javax.swing.JPanel;

import utility.GraphicConstants;
import javax.swing.JScrollPane;

public class CategoryListView extends JPanel{
	private JScrollPane scrollPane = new JScrollPane();
	
	public CategoryListView(){
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new GridLayout(5, 1));
		
		add(scrollPane);
	}
	
	public void updateView(){
		this.revalidate();
		this.repaint();
		this.setVisible(true);
		System.out.println("view updated");
	}
	
}
