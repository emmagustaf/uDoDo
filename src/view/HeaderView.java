package view;

import javax.swing.*;
import controller.*;
import java.awt.event.*;
import java.awt.*;
import model.TaskModel;
import controller.ListController;

public class HeaderView extends JPanel{

	//TODO Create button "Ny" and textfield to get taskname
	private ListController controller;
	private JTextField taskTitleInput;

	
	public HeaderView(ListController controller) {
		this.controller = controller;
		taskTitleInput = new JTextField(50);
		JButton addNewTaskButton = new JButton("Add");
		this.add(taskTitleInput);
		this.add(addNewTaskButton);
		addNewTaskButton.addActionListener(new HeaderController());
		addNewTaskButton.setActionCommand("newTask");
	}
	
	public JTextField getTextField(){
		return taskTitleInput;
	}
	private class NewTaskListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() instanceof JButton){
				if(taskTitleInput.getText().length() > 0){
					TaskModel task = new TaskModel(taskTitleInput.getText());
					TaskPanel taskPanel = new TaskPanel(task);
					controller.addTask(taskPanel);
					controller.updateListView();
				}
			}
		}
		
	}
	
	//TODO Create action event for button "Ny". 
		//TO DO Should create a new instance of the TaskModel-class (with the string from the textfield).
		//TODO Create a new instance from the TaskPanel-class with the new model as parameter.
		//TODO Use the controller with the method addTask(TaskPanel), to add the new task to the listView.

}
