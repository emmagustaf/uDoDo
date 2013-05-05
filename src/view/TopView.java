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
		//this.setSize(new Dimension(620, 70));
		setPreferredSize(new Dimension(600, 70));
		setMinimumSize(new Dimension(600, 70));
		setMaximumSize(new Dimension(600, 70));
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new MigLayout("", "[]", "[]"));
		setVisible(true);
	
	}
}
