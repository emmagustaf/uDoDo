package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import utility.*;
import controller.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Cursor;

public class TopView extends JPanel {
	
	JToggleButton tglbtnY;
	JToggleButton tglbtnB; 
	JToggleButton tglbtnG; 
	JToggleButton tglbtnP; 
	JToggleButton tglbtnGreen; 
	
	/**
	 * A view representing the toolbar of the application.
	 */
	
	public TopView(){

		setPreferredSize(new Dimension(830, 130));
		setMinimumSize(new Dimension(830, 130));
		setMaximumSize(new Dimension(830, 130));
		this.setBackground(GraphicConstants.BACKGROUND);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TopView.class.getResource("/utility/icons/uDoDo.banner.png")));
		
		ButtonGroup group = new ButtonGroup();
		
		tglbtnY = new JToggleButton("");
		tglbtnY.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnY.setIcon(new ImageIcon(TopView.class.getResource("/utility/icons/yellow.bug.png")));
		tglbtnY.setPressedIcon(new ImageIcon(TopView.class.getResource("/utility/icons/yellow.hover.png")));
		tglbtnY.setRolloverIcon(new ImageIcon(TopView.class.getResource("/utility/icons/yellow.hover.png")));
		tglbtnY.setBorder(null);
		group.add(tglbtnY);
		tglbtnB = new JToggleButton("");
		tglbtnB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnB.setRolloverIcon(new ImageIcon(TopView.class.getResource("/utility/icons/blue.hover.png")));
		tglbtnB.setPressedIcon(new ImageIcon(TopView.class.getResource("/utility/icons/blue.hover.png")));
		tglbtnB.setIcon(new ImageIcon(TopView.class.getResource("/utility/icons/blue.bug.png")));
		tglbtnB.setBorder(null);
		group.add(tglbtnB);
		tglbtnG = new JToggleButton("");
		tglbtnG.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnG.setIcon(new ImageIcon(TopView.class.getResource("/utility/icons/grey.bug.png")));
		tglbtnG.setPressedIcon(new ImageIcon(TopView.class.getResource("/utility/icons/gray.hover.png")));
		tglbtnG.setRolloverIcon(new ImageIcon(TopView.class.getResource("/utility/icons/gray.hover.png")));
		tglbtnG.setBorder(null);
		group.add(tglbtnG);
		tglbtnP = new JToggleButton("");
		tglbtnP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnP.setIcon(new ImageIcon(TopView.class.getResource("/utility/icons/purple.bug.png")));
		tglbtnP.setPressedIcon(new ImageIcon(TopView.class.getResource("/utility/icons/purple.hover.png")));
		tglbtnP.setRolloverIcon(new ImageIcon(TopView.class.getResource("/utility/icons/purple.hover.png")));
		tglbtnP.setBorder(null);
		group.add(tglbtnP);
		tglbtnGreen = new JToggleButton("");
		tglbtnGreen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnGreen.setRolloverIcon(new ImageIcon(TopView.class.getResource("/utility/icons/green.hover.png")));
		tglbtnGreen.setPressedIcon(new ImageIcon(TopView.class.getResource("/utility/icons/green.hover.png")));
		tglbtnGreen.setIcon(new ImageIcon(TopView.class.getResource("/utility/icons/green.bug.png")));
		tglbtnGreen.setBorder(null);
		group.add(tglbtnGreen);
		
		tglbtnY.setActionCommand("yellow");
		tglbtnB.setActionCommand("blue");
		tglbtnG.setActionCommand("gray");
		tglbtnGreen.setActionCommand("green");
		tglbtnP.setActionCommand("purple");
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
					.addComponent(tglbtnY)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tglbtnGreen)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tglbtnB)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tglbtnP)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tglbtnG)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(tglbtnY)
						.addComponent(tglbtnGreen)
						.addComponent(tglbtnB)
						.addComponent(tglbtnP)
						.addComponent(tglbtnG)
						.addComponent(label))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		setVisible(true);
	
	}
	
	public void setController(TopController controller){
		tglbtnY.addActionListener(controller);
		tglbtnP.addActionListener(controller);
		tglbtnG.addActionListener(controller);
		tglbtnGreen.addActionListener(controller);
		tglbtnB.addActionListener(controller);
	}
}
