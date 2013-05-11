package view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import utility.GraphicConstants;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CategoryListView extends JScrollPane{ 
	
	public JPanel panel;
	public CategoryListView(){
		
		this.setBackground(GraphicConstants.BACKGROUND);
	
		this.setMinimumSize(new Dimension(200, 500));
		this.setMaximumSize(new Dimension(200, 500));
		this.setPreferredSize(new Dimension(200, 500));
		this.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);
	
		panel = new JPanel();
//		panel.setMaximumSize(new Dimension(200, 1000));
//		panel.setMinimumSize(new Dimension(200,70));
//		panel.setPreferredSize(new Dimension(200, 395));
		panel.setLayout(new GridLayout(10, 1));
		
		this.setViewportView(panel);
		
	}
	
	public void updateView(){
		panel.revalidate();
		panel.repaint();
		panel.validate();
		
		this.revalidate();
		this.repaint();
		this.setVisible(true);
		System.out.println("view updated");
	}
	
}
