package view;

import javax.swing.*;
import model.*;
import net.miginfocom.swing.MigLayout;


public class CategoryPanel extends JPanel{

	private CategoryPanelModel panelModel;
	private CategoryModel model;
	private CategoryPanel panel;
	
	public CategoryPanel(CategoryPanelModel panelModel) {
		this.panelModel=panelModel;
		setLayout(new MigLayout("", "[][][][][]", "[][][][][][]"));
		
		JLabel catLabel = new JLabel(model.getCatTitle());
		add(catLabel, "cell 2 2,growy");
	}

}
