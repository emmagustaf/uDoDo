package view;

import utility.*;
import javax.swing.*;
import model.*;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
public class CategoryPanel extends JPanel{
	
	private CategoryPanelModel model;
	
	public CategoryPanel(CategoryPanelModel model) {
		this.model=model;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{208, 0};
		gridBagLayout.rowHeights = new int[]{111, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		GridBagConstraints gbc_catLabel = new GridBagConstraints();
		gbc_catLabel.gridx = 0;
		gbc_catLabel.gridy = 0;
		
		JLabel catLabel = new JLabel(model.getCatTitle());
		add(catLabel, gbc_catLabel);
	}
	

}
