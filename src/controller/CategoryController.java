package controller;

import view.*;
import model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoryController implements ActionListener {

	private CategoryModel model;
	private CategoryView view;
	private ActionListener actionListener;

	public CategoryController(CategoryModel model, CategoryView view) {
		this.model = model;
		this.view = view;
	}

	public void control() {
		actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				model.addNewCategory(model.getCatTitle());
			}
		};
		view.getAddButton().addActionListener(actionListener);
	}

	public void updateCategoryView() {

		view.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof CategoryModel) {
			CategoryModel model = (CategoryModel) e.getSource();
		}

	}

}
