package view;

import java.awt.Dimension;

import utility.GraphicConstants;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CategoryListView extends JScrollPane{ 
	
	public JPanel panel;
	public CategoryListView(){
		
		this.setBackground(GraphicConstants.BACKGROUND);
	
		this.setMinimumSize(new Dimension(210, 500));
		this.setMaximumSize(new Dimension(210, 500));
		this.setPreferredSize(new Dimension(210, 500));
		this.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
		this.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
		
		panel = new JPanel();
		panel.setBackground(GraphicConstants.BACKGROUND);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS ));
		
		getViewport().setView(panel);
		
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
