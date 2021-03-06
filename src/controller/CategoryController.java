package controller;
import utility.GraphicConstants;
import utility.Save;
import view.*;
import modeltest.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


import javax.swing.JButton;
import javax.swing.JTextField;

import Model.AllCategoryListModel;
import Model.CategoryModel;

/**
 * A class to represent a CategoryController.
 * @author Hanna
 *
 */
public class CategoryController implements ActionListener{

	private CategoryView view;
	private CategoryModel model;
	private CategoryListView catListView;
	private ListView listView;
	private StartCategoryPanel startCategoryPanel;
	private TaskSettingView taskSetting;

	/**
	 * Creates a CategoryController
	 * 
	 * @param view
	 * @param catListView
	 * @param listView
	 */
	public CategoryController(TaskSettingView taskSetting, CategoryView view,
			CategoryListView catListView, ListView listView) {
		this.view = view;
		this.taskSetting = taskSetting;
		this.catListView = catListView;
		this.listView = listView;
		view.setController(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton
				|| e.getSource() instanceof JTextField) {
			if (e.getActionCommand().equals("newCategory")
					&& (view.getTextField().getText().length() > 0)
					&& (!view.getTextField().getText()
							.equals("Add category..."))) {

				CategoryModel cat = new CategoryModel(view.getTextField()
						.getText());
				AddedCategoryPanel catPanel = new AddedCategoryPanel(cat);
				catListView.panel.add(catPanel);

				AllCategoryListModel.getInstance().add(cat);

				Save.saveCategories();

				view.getTextField().setText("");

				catListView.updateView();
				CategoryPanelController catController = new CategoryPanelController(
						taskSetting, catPanel, catListView, listView);
				System.out.println("category added");
			}
		}
	}

}
