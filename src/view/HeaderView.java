package view;

import javax.swing.*;
import controller.*;
import java.awt.event.*;
import java.awt.*;
import model.TaskModel;
import controller.ListController;
import net.miginfocom.swing.MigLayout;

public class HeaderView extends JPanel{

	//TODO Create button "Ny" and textfield to get taskname
	//private HeaderController controller;
	private JTextField taskTitleInput;
	private JButton addNewTaskButton;
	
	public HeaderView() {
		setLayout(new MigLayout("", "[][322.00px][109.00px][]", "[23px][][]"));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		add(horizontalStrut, "cell 0 1");
		taskTitleInput = new JTextField(30);
		this.add(taskTitleInput, "cell 1 1,alignx right,aligny center");
		addNewTaskButton = new JButton("Add");
		this.add(addNewTaskButton, "cell 2 1,alignx center,aligny top");
		addNewTaskButton.setActionCommand("newTask");
	}
	
	public void setController(HeaderController controller){
		addNewTaskButton.addActionListener(controller);
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
