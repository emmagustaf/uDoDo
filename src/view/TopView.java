package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import utility.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;

public class TopView extends JPanel {
	
	public TopView(){
		
		this.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setPreferredSize(new Dimension(830, 130));
		setMinimumSize(new Dimension(830, 130));
		setMaximumSize(new Dimension(830, 130));
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new MigLayout("", "[]", "[]"));
		setVisible(true);
	
	}
}
