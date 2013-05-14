package view;

import javax.swing.JPanel;
import utility.*;
import model.*;
import view.*;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JLabel;

public class DefaultCategoryPanelAll extends JPanel {

	/**
	 * Create the panel.
	 */
	public DefaultCategoryPanelAll() {

		setBackground(GraphicConstants.BACKGROUND);
		setMaximumSize(new Dimension(200, 40));
		setMinimumSize(new Dimension(200, 40));
		setPreferredSize(new Dimension(200, 40));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 146, 41, 0};
		gridBagLayout.rowHeights = new int[]{111, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel defaultLabelAll = new JLabel("Alla");
		defaultLabelAll.setMaximumSize(new Dimension(120, 30));
		defaultLabelAll.setMinimumSize(new Dimension(120,30));
		defaultLabelAll.setPreferredSize(new Dimension(120,30));
		
		GridBagConstraints gbc_defaultLabelAll = new GridBagConstraints();
		gbc_defaultLabelAll.anchor = GridBagConstraints.WEST;
		gbc_defaultLabelAll.gridx = 1;
		gbc_defaultLabelAll.gridy = 0;
		
		add(defaultLabelAll, gbc_defaultLabelAll);
	}

}
