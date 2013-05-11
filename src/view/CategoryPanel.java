package view;

import utility.*;

import javax.swing.*;

import model.*;
import controller.*;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Insets;
public class CategoryPanel extends JPanel{
	
	private CategoryPanelModel panelModel;
	private JLabel catLabel;
	private CategoryModel model;
	private JButton deleteCatButton = new JButton();
	public CategoryPanel(CategoryModel model) {
		this.model=model;
		this.setBackground(GraphicConstants.BACKGROUND);
		setMinimumSize(new Dimension(180, 40));
		setPreferredSize(new Dimension(180, 40));
		setMaximumSize(new Dimension(180, 40));
		//this.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{146, 41, 0};
		gridBagLayout.rowHeights = new int[]{111, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		GridBagConstraints gbc_catLabel = new GridBagConstraints();
		gbc_catLabel.anchor = GridBagConstraints.WEST;
		gbc_catLabel.insets = new Insets(0, 0, 0, 5);
		gbc_catLabel.gridx = 0;
		gbc_catLabel.gridy = 0;
		this.setBackground(GraphicConstants.BACKGROUND);

		catLabel = new JLabel(model.getCatTitle());
		catLabel.setMaximumSize(new Dimension(120,30));
		catLabel.setMinimumSize(new Dimension(120, 30));
		catLabel.setPreferredSize(new Dimension(120,30));
		catLabel.setBackground(Color.ORANGE);
		catLabel.setFont(GraphicConstants.REGULARFONT);

		add(catLabel, gbc_catLabel);
		
		deleteCatButton.setIcon(new ImageIcon(CategoryPanel.class.getResource("/utility/icons/delete_icon&16.png")));
		deleteCatButton.setBorderPainted(false);
		
		deleteCatButton.setPreferredSize(new Dimension(15, 10));
		deleteCatButton.setActionCommand("delete Category");
		GridBagConstraints gbc_deleteCatButton = new GridBagConstraints();
		gbc_deleteCatButton.anchor = GridBagConstraints.WEST;
		gbc_deleteCatButton.gridx = 1;
		gbc_deleteCatButton.gridy = 0;
		add(deleteCatButton, gbc_deleteCatButton);
	}
	
	public void setController(CategoryPanelController controller){
		this.addMouseListener(controller);
		deleteCatButton.addActionListener(controller);
	}
	
	
	public CategoryModel getModel(){
		return this.model;
	}
}
