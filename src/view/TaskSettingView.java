package view;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import utility.GraphicConstants;

public class TaskSettingView extends JScrollPane{
	
	public JPanel panelInScroll;
	
	public TaskSettingView(){
	
	this.setBackground(GraphicConstants.BACKGROUND);
	this.setMinimumSize(new Dimension (300, 580));
	this.setMaximumSize(new Dimension (300, 580));
	this.setPreferredSize(new Dimension (300, 580));
	
	this.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
	
	panelInScroll = new JPanel();
	panelInScroll.setBackground(GraphicConstants.BACKGROUND);
	panelInScroll.setLayout(new BoxLayout(panelInScroll, BoxLayout.Y_AXIS));
	getViewport().setView(panelInScroll);
	
	}
	
	public void updateView(){
		
		panelInScroll.revalidate();
		panelInScroll.repaint();
		panelInScroll.validate();
		
		this.revalidate();
		this.repaint();
		this.setVisible(true);
	}

}
