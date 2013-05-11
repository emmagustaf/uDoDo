package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import utility.GraphicConstants;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CategoryListView extends JScrollPane{ 
	
	public JPanel panel = new JPanel();
	public CategoryListView(){
		this.setBackground(GraphicConstants.BACKGROUND);
		this.setPreferredSize(new Dimension(200, 70));
		this.setMinimumSize(new Dimension(200, 70));
		this.setMaximumSize(new Dimension(200, 1000));
		this.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
		panel.setLayout(new GridLayout(10, 1));
	}
	
	public void updateView(){
		this.revalidate();
		this.repaint();
		this.setVisible(true);
		System.out.println("view updated");
	}
	
}
