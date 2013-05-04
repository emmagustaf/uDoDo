package view;

import javax.swing.*;
import controller.*;
import java.awt.event.*;
import java.awt.*;
import utility.*;
import model.TaskModel;
import controller.ListController;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;

public class HeaderView extends JPanel{

	//TODO Create button "Ny" and textfield to get taskname
	//private HeaderController controller;
	private JTextField taskTitleInput;
	private JButton addNewTaskButton;
	
	public HeaderView() {
		this.setBackground(GraphicConstants.BACKGROUND);
		setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setLayout(new MigLayout("", "[][391.00px][98.00px][90.00]", "[23px][][]"));
		setSize(new Dimension(620, 62));
		Component horizontalStrut = Box.createHorizontalStrut(20);
		add(horizontalStrut, "cell 0 1");
		taskTitleInput = new JTextField(30);
		taskTitleInput.setFont(GraphicConstants.REGULARFONT);
		taskTitleInput.setActionCommand("newTask");
		
		this.add(taskTitleInput, "cell 1 1,alignx right,aligny center");
		addNewTaskButton = new JButton("Add");
		addNewTaskButton.setFont(GraphicConstants.REGULARFONT);
		this.add(addNewTaskButton, "cell 2 1,alignx center,aligny top");
		addNewTaskButton.setActionCommand("newTask");
	}
	
	public void setController(HeaderController controller){
		addNewTaskButton.addActionListener(controller);
		taskTitleInput.addActionListener(controller);
	}
	
	public JTextField getTextField(){
		return taskTitleInput;
	}

}
