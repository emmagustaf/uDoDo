package view;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import utility.GraphicConstants;

public class TaskSettingView extends JScrollPane{
	
	public JPanel panelInScroll;
	
	/**
	 * Create the setting and display view with a new panel in it.
	 */
	public TaskSettingView(){
	
		this.setBackground(GraphicConstants.BACKGROUND);
		this.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
		this.setMinimumSize(new Dimension (300, 580));
		this.setMaximumSize(new Dimension (300, 580));
		this.setPreferredSize(new Dimension (300, 580));
	
		panelInScroll = new JPanel();
		panelInScroll.setBackground(GraphicConstants.BACKGROUND);
		panelInScroll.setLayout(new BoxLayout(panelInScroll, BoxLayout.Y_AXIS));
	
		getViewport().setView(panelInScroll);
	
	}
	
	/**
	 * Updates the view and the panel in it.
	 */
	public void updateView(){
		
		panelInScroll.revalidate();
		panelInScroll.repaint();
		panelInScroll.validate();
		
		this.revalidate();
		this.repaint();
	}

}
