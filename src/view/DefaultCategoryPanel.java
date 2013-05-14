package view;

import java.awt.Dimension;

import javax.swing.JPanel;


import utility.*;
import java.awt.GridLayout;
import javax.swing.JLabel;



import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class DefaultCategoryPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public DefaultCategoryPanel() {
		
		setBackground(GraphicConstants.BACKGROUND);
		setMinimumSize(new Dimension(200, 40));
		setMaximumSize(new Dimension(200, 40));
		setPreferredSize(new Dimension(200, 40));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 146, 41 , 0};
		gridBagLayout.rowHeights = new int[]{111, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel defaultLabel = new JLabel("Avklarat");
		defaultLabel.setMaximumSize(new Dimension(120,30));
		defaultLabel.setMinimumSize(new Dimension(120,30));
		defaultLabel.setPreferredSize(new Dimension(120,30));
		
		GridBagConstraints gbc_defaultLabel = new GridBagConstraints();
		gbc_defaultLabel.anchor = GridBagConstraints.WEST;
		gbc_defaultLabel.gridx = 1;
		gbc_defaultLabel.gridy = 0;
		
		add(defaultLabel, gbc_defaultLabel);
		
		
	}

}
