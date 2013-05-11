package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import utility.*;
import model.*;

import java.awt.*;

public class ListView extends JScrollPane {
	
	public JPanel panelInScroll;
	
	/**
	 * Create the panel.
	 */
	public ListView() {
		this.setBackground(GraphicConstants.BACKGROUND);
		this.setMinimumSize(new Dimension (300, 500));
		this.setMaximumSize(new Dimension (300, 500));
		this.setPreferredSize(new Dimension (300, 500));
		
		panelInScroll = new JPanel();
		panelInScroll.setMinimumSize(new Dimension(400, 500));
		panelInScroll.setMaximumSize(new Dimension(400, 500));
		panelInScroll.setPreferredSize(new Dimension(400, 500));
		panelInScroll.setLayout(new GridLayout(5, 1));
		add(panelInScroll);
		
	}
	
	public void updateView(){
		panelInScroll.revalidate();
		panelInScroll.validate();
		panelInScroll.repaint();
		this.revalidate();
		this.validate();
		this.repaint();
		System.out.println("updated view");
	}
	
//	public JScrollPane getScrollPane(){
//		return scrollPane;
//	}
	
}
