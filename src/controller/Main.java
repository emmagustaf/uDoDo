package controller;

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
		ListController controller = new ListController(listView);
		HeaderView headerView = new HeaderView(controller);
		GUIView guiView = new GUIView(headerView, listView);

		frame.setTitle("uDoDo 1.0");

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
