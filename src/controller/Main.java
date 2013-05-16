package controller;

import java.awt.Dimension;

import javax.swing.JFrame;

import view.*;
import model.*;

public class Main {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		ListView listView = new ListView();
		
		//CategoryController catController= new CategoryController();
		CategoryView categoryView = new CategoryView();
		CategoryListView categoryListView = new CategoryListView();
		
		
		//ListController controller = new ListController(listView);
		HeaderView headerView = new HeaderView();
		
		TopView topView = new TopView();
		
		TaskSettingView taskSettings = new TaskSettingView();
		
		StartCategoryPanel allCatPanel = new StartCategoryPanel(new CategoryModel("All Tasks"));
		StartCategoryPanel finishedCatPanel = new StartCategoryPanel(new CategoryModel("Finished Tasks"));
		categoryListView.panel.add(finishedCatPanel);
		categoryListView.panel.add(allCatPanel);
		allCatPanel.setVisible(true);
		finishedCatPanel.setVisible(true);
		
		CategoryPanelController catPanController = new CategoryPanelController(allCatPanel, categoryListView);
		CategoryPanelController catPanController2 = new CategoryPanelController(finishedCatPanel, categoryListView);
		
	
		GUIView guiView = new GUIView(headerView, listView, categoryView, topView, categoryListView, taskSettings);
		
		categoryListView.updateView();
		//CategoryModel model = new CategoryModel(null);
		//AddedCategoryPanel catPanel = new AddedCategoryPanel(model);
		HeaderController controller = new HeaderController(headerView, listView, allCatPanel, taskSettings, categoryListView);
		
		CategoryController catConroller = new CategoryController(categoryView, categoryListView, listView);
		
		

		frame.setTitle("uDoDo 1.0");
		frame.setMinimumSize(new Dimension(700, 750));
		//frame.setResizable(false);

		// Add gui to window
		frame.add(guiView);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// pack() will do the layout of the window so it gets the correct size
		frame.pack();

		// Open the window
		frame.setVisible(true);
		frame.requestFocus();
	}

}
