package view;

import utility.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

import model.*;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
public class CategoryPanel extends JPanel{
	
	private CategoryPanelModel panelModel;
	private JLabel catLabel;
	private CategoryModel model;
	
	public CategoryPanel(CategoryModel model) {
		this.model=model;
		this.setBackground(GraphicConstants.BACKGROUND);
		setMinimumSize(new Dimension(180, 40));
		setPreferredSize(new Dimension(180, 40));
		setMaximumSize(new Dimension(180, 40));
		this.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{208, 0};
		gridBagLayout.rowHeights = new int[]{111, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		GridBagConstraints gbc_catLabel = new GridBagConstraints();
		gbc_catLabel.gridx = 0;
		gbc_catLabel.gridy = 0;
		this.setBackground(GraphicConstants.BACKGROUND);

		JLabel catLabel = new JLabel(model.getCatTitle());
		catLabel.setBackground(Color.ORANGE);
		catLabel.setFont(GraphicConstants.REGULARFONT);

		add(catLabel, gbc_catLabel);
	}
	

}
