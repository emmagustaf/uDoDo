package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import utility.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class TopView extends JPanel {
	
	public TopView(){
		
		setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setSize(new Dimension(620, 62));
		this.setBackground(GraphicConstants.BACKGROUND);
	
	}
}
