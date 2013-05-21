package view;

import javax.swing.JPanel;

import model.TaskModel;
import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Dimension;

import java.awt.Component;
import javax.swing.JButton;
import utility.*;

import controller.TaskController;
import javax.swing.JToggleButton;
import java.awt.Color;

/**
 * A view-class to represent a TaskPanel. 
 * 
 * @author Hanna
 */

public class TaskPanel extends JPanel {
	
	private TaskModel model;
	private String taskCheck;
	private JButton deleteTaskButton;
	private JLabel taskLabel;
	
	/**
	 * Create the panel.
	 */
	public TaskPanel(TaskModel model) {
		
		this.model=model;
		model.getCategory().getTaskList().add(this);
		System.out.println(model.getTitle() + " skapad");
		
		this.setBackground(GraphicConstants.BACKGROUND);
		this.setForeground(GraphicConstants.FOREGROUND);
		setMinimumSize(new Dimension(290, 60));
		setPreferredSize(new Dimension(290, 60));
		setMaximumSize(new Dimension(290, 60));
//		setSize(new Dimension(30, 20));
		
		setLayout(new MigLayout("", "[40.00px,left][100.00][30.00][88.00][93.00]", "[45.00px,center]"));
		
		
		JToggleButton checkbutton = new JToggleButton("");
		checkbutton.setToolTipText("Check task as completed");
		checkbutton.setBorderPainted(false);
		checkbutton.setIcon(new ImageIcon(TaskPanel.class.getResource("/utility/icons/checkmark_icon&16.png")));
		checkbutton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		checkbutton.setActionCommand(taskCheck);
		add(checkbutton, "cell 0 0,alignx center,aligny center");

		taskLabel = new JLabel(model.getTitle());
		taskLabel.setMinimumSize(new Dimension(200, 30));
		taskLabel.setMaximumSize(new Dimension(200, 30));
		taskLabel.setPreferredSize(new Dimension(200, 30));
		taskLabel.setFont(GraphicConstants.SMALLHEADINGFONT);
		taskLabel.setForeground(GraphicConstants.FOREGROUND);
		add(taskLabel, "cell 1 0 3 1,alignx left,aligny center");

		
		deleteTaskButton = new JButton();
		deleteTaskButton.setToolTipText("Delete task");
		deleteTaskButton.setBorderPainted(false);
		deleteTaskButton.setIcon(new ImageIcon(AddedCategoryPanel.class.getResource("/utility/icons/delete_icon&16.png")));
		//deleteTaskButton.setFont(GraphicConstants.REGULARFONT);
		deleteTaskButton.setActionCommand("deleteTask");
		add(deleteTaskButton, "cell 4 0,alignx right,aligny center");
		
	}
	
	public void setTitle(){
		taskLabel.setText(model.getTitle());
	}

	public void setController(TaskController controller){
		deleteTaskButton.addActionListener(controller);
	}
	
	public TaskPanel getTaskPanel(){
		return this;
	}
	
	public TaskModel getModel(){
		return this.model;
	}
	
}
