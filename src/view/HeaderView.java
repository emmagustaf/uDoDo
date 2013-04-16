package view;

import javax.swing.JPanel;
import controller.*;


public class HeaderView extends JPanel {

	//TODO Create button "Ny" and textfield to get taskname
	private ListController controller;

	
	public HeaderView(ListController controller) {
		this.controller = controller;
	}
	
	//TODO Create action event for button "Ny". 
		//TODO Should create a new instance of the TaskModel-class (with the string from the textfield).
		//TODO Create a new instance from the TaskPanel-class with the new model as parameter.
		//TODO Use the controller with the method addTask(TaskPanel), to add the new task to the listView.

}
