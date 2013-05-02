package view;

import javax.swing.*;
import controller.*;
import java.awt.event.*;
import java.awt.*;
import model.TaskModel;
import controller.ListController;

public class HeaderView extends JPanel{

	//TODO Create button "Ny" and textfield to get taskname
	private HeaderController controller;
	private JTextField taskTitleInput;

	
	public HeaderView() {
		taskTitleInput = new JTextField(50);
		JButton addNewTaskButton = new JButton("Add");
		this.add(taskTitleInput);
		this.add(addNewTaskButton);
		controller = new HeaderController(this);
		addNewTaskButton.addActionListener(controller);
		addNewTaskButton.setActionCommand("newTask");
	}
	
	public String getTextField(){
		return taskTitleInput.getText();
	}

	//private class NewTaskListener implements ActionListener{
		//public void actionPerformed(ActionEvent e){
				//controller.addTask(taskPanel);
				//controller.updateListView();
		
		//}
		
	//}
	
	//TODO Create action event for button "Ny". 
		//TO DO Should create a new instance of the TaskModel-class (with the string from the textfield).
		//TODO Create a new instance from the TaskPanel-class with the new model as parameter.
		//TODO Use the controller with the method addTask(TaskPanel), to add the new task to the listView.

}
