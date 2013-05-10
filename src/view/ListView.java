package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import utility.*;
import model.*;

import java.awt.*;

public class ListView extends JPanel {
	/**
	 * Create the panel.
	 */
	public ListView() {
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new GridLayout(5, 1));
		
//		JScrollPane scrollPane = new JScrollPane();
//		add(scrollPane);
		
	}
	
	public void updateView(){
		this.revalidate();
		this.repaint();
	}
	
}
