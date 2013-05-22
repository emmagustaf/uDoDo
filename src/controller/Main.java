package controller;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.UIManager;

import utility.ColorSettings;
import view.*;
import model.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.JToggleButton;

import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class Main {
	private static final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		try{
			
			System.setProperty("apple.laf.useScreenMenuBar", "true");
			System.setProperty("com.apple.mrj.application.apple.menu.about.name", "uDoDo");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		}
		catch(Exception e){
			
		}
		
		JFrame frame = new JFrame();
		
		ListView listView = new ListView();
		
		//CategoryController catController= new CategoryController();
		CategoryView categoryView = new CategoryView();
		CategoryListView categoryListView = new CategoryListView();
		
		
		//ListController controller = new ListController(listView);
		HeaderView headerView = new HeaderView();
		
		TopView topView = new TopView();
		
		TaskSettingView taskSettings = new TaskSettingView();
		
		CategoryModel allModel = new CategoryModel("All Tasks");
		CategoryModel finishedModel = new CategoryModel("Finished Tasks");
		
		StartCategoryPanel allCatPanel = new StartCategoryPanel(allModel);
		
		categoryListView.setDefaultCategory(allCatPanel);
		categoryListView.getMarkedList().clear();
		categoryListView.getLastMarkedList().clear();
		
		StartCategoryPanel finishedCatPanel = new StartCategoryPanel(finishedModel);
		
		categoryListView.setFinishedCategory(finishedCatPanel);
		
		allCatPanel.setTitle("All Tasks");
		
		finishedCatPanel.setTitle("Finished Tasks");
		
		categoryListView.panel.add(allCatPanel);
		categoryListView.panel.add(finishedCatPanel);
		
		allCatPanel.setVisible(true);
		finishedCatPanel.setVisible(true);
		
		CategoryPanelController catPanController = new CategoryPanelController(allCatPanel, categoryListView, listView);
		CategoryPanelController catPanController2 = new CategoryPanelController(finishedCatPanel, categoryListView, listView);
		
	
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
		frame.getContentPane().add(guiView);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// pack() will do the layout of the window so it gets the correct size
		frame.pack();
		
		
		ColorSettings colorSettings = new ColorSettings(guiView);
		
		MenuController menuController = new MenuController(colorSettings);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		JMenu mnTheme = new JMenu("Theme");
		mnSettings.add(mnTheme);
		
		JRadioButtonMenuItem purpleHaze = new JRadioButtonMenuItem("Purple Haze");
		buttonGroup.add(purpleHaze);
		purpleHaze.addActionListener(menuController);
		purpleHaze.setActionCommand("Purple haze");
		mnTheme.add(purpleHaze);
		
		JRadioButtonMenuItem greyhound = new JRadioButtonMenuItem("Greyhound");
		buttonGroup.add(greyhound);
		greyhound.addActionListener(menuController);
		greyhound.setActionCommand("Greyhound");
		mnTheme.add(greyhound);
		
	

		// Open the window
		frame.setVisible(true);
		frame.requestFocus();
	}

}
