package view;

import java.awt.Dimension;

import utility.GraphicConstants;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

//A class to keep a graphical list of panels each representing a category
// the list will be represented in a scrollpane
public class CategoryListView extends JScrollPane{ 
	
	//Create a panel that will be the actual container
	// for the categorypanels 
	public JPanel panel;
	
	//Set all the graphical data for the scrollpane
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
	// Updatemethod that will be invoked each time anything is changed in the 
	// categorylist
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
