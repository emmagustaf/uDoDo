package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import utility.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class TopView extends JPanel {
	
	/**
	 * A view representing the toolbar of the application.
	 */
	
	public TopView(){
		
		this.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setPreferredSize(new Dimension(830, 130));
		setMinimumSize(new Dimension(830, 130));
		setMaximumSize(new Dimension(830, 130));
		this.setBackground(GraphicConstants.BACKGROUND);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TopView.class.getResource("/utility/icons/uDoDo.banner.jpg")));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(label)
					.addContainerGap(506, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(label)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		setVisible(true);
	
	}
}
