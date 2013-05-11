package view;

import javax.swing.JPanel;
import model.*;

import model.TaskModel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.Box;
import utility.*;

import controller.TaskController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * A class to represent a TaskPanel. 
 * 
 * @author Hanna
 */

public class TaskPanel extends JPanel {
	
	private TaskModel model;
	private String taskCheck;
	private String deleteTask;
	private JButton deleteTaskButton;
	/**
	 * Create the panel.
	 */
	public TaskPanel(TaskModel model) {
		this.setBackground(GraphicConstants.BACKGROUND);
		setMinimumSize(new Dimension(295, 60));
		setPreferredSize(new Dimension(295, 60));
		setMaximumSize(new Dimension(295, 60));
//		setSize(new Dimension(30, 20));
		this.model=model;
		setLayout(new MigLayout("", "[27.00px][100.00][30.00][88.00][93.00]", "[45.00px,center]"));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setAlignmentX(Component.RIGHT_ALIGNMENT);
		chckbxNewCheckBox.setActionCommand(taskCheck);
		add(chckbxNewCheckBox, "cell 0 0,alignx center,aligny center");
		
		JLabel taskLabel = new JLabel(model.getTitle());
		taskLabel.setSize(new Dimension(30, 20));
		taskLabel.setFont(GraphicConstants.SMALLHEADINGFONT);
		add(taskLabel, "cell 1 0 3 1,alignx left,aligny center");
		
		deleteTaskButton = new JButton("Delete");
		deleteTaskButton.setFont(GraphicConstants.REGULARFONT);
		deleteTaskButton.setActionCommand("deleteTask");
		add(deleteTaskButton, "cell 4 0,alignx right,aligny center");
	}
	
	public void setController(TaskController controller){
		deleteTaskButton.addActionListener(controller);
	}
	
	public TaskModel getModel(){
		return this.model;
	}
	
	public TaskPanel getPanel(){
		return this;
	}
}
