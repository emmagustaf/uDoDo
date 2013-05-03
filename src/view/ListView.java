package view;

import javax.swing.JPanel;
import utility.*;
import model.*;

import java.awt.*;

public class ListView extends JPanel {
	/**
	 * Create the panel.
	 */
	public ListView() {
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new GridLayout(1000, 1));
		
	}
	
	public void updateView(){
		this.revalidate();
		this.repaint();
	}
	
}
