package view;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Dimension;

import java.awt.Component;
import javax.swing.JButton;
import utility.*;

import Model.TaskModel;
import controller.TaskController;
import javax.swing.JToggleButton;

/**
 * A view-class to represent a TaskPanel. 
 */

public class TaskPanel extends JPanel {
	
	private TaskModel model;
	private String taskCheck;
	private JButton deleteTaskButton;
	public JLabel taskLabel;
	private JLabel deadlineLabel;
	private JToggleButton checkbutton;
	
	/**
	 * Create the panel.
	 */
	public TaskPanel(TaskModel model) {
		
		this.model=model;
		this.setBackground(GraphicConstants.BACKGROUND);
		this.setForeground(GraphicConstants.FOREGROUND);
		
		this.setMinimumSize(new Dimension(290, 80));
		this.setPreferredSize(new Dimension(290, 72));
		this.setMaximumSize(new Dimension(290, 80));
		setLayout(new MigLayout("", "[40.00px,left][100.00][30.00][88.00][93.00]", "[45.00px,center][][]"));

		checkbutton = new JToggleButton("");
		checkbutton.setRolloverSelectedIcon(new ImageIcon(TaskPanel.class.getResource("/utility/icons/checked.box.blue.png")));
		checkbutton.setRolloverIcon(new ImageIcon(TaskPanel.class.getResource("/utility/icons/checked.box.blue.png")));
		checkbutton.setSelectedIcon(new ImageIcon(TaskPanel.class.getResource("/utility/icons/checked.box.blue.png")));
		checkbutton.setToolTipText("Change state of task");
		checkbutton.setBorderPainted(false);
		checkbutton.setIcon(new ImageIcon(TaskPanel.class.getResource("/utility/icons/checkbox_unchecked_icon&16.png")));
		checkbutton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		checkbutton.setActionCommand("taskCheck");
		checkbutton.setSelected(this.getModel().isChecked());
		add(checkbutton, "cell 0 0,alignx center,aligny center");

		taskLabel = new JLabel(model.getTitle());
		taskLabel.setMinimumSize(new Dimension(200, 30));
		taskLabel.setMaximumSize(new Dimension(200, 30));
		taskLabel.setPreferredSize(new Dimension(200, 30));
		taskLabel.setFont(GraphicConstants.SMALLHEADINGFONT);
		taskLabel.setForeground(GraphicConstants.FOREGROUND);
		add(taskLabel, "cell 1 0 3 1,alignx left,aligny center");

		
		deleteTaskButton = new JButton();
		deleteTaskButton.setRolloverIcon(new ImageIcon(TaskPanel.class.getResource("/utility/icons/delete.icon.hover.png")));
		deleteTaskButton.setToolTipText("Delete task");
		deleteTaskButton.setBorderPainted(false);
		deleteTaskButton.setIcon(new ImageIcon(TaskPanel.class.getResource("/utility/icons/delete_icon&16.png")));
		deleteTaskButton.setActionCommand("deleteTask");
		add(deleteTaskButton, "cell 4 0,alignx right,aligny center");
		
		deadlineLabel = new JLabel(model.getDeadline());
		deadlineLabel.setFont(GraphicConstants.REGULARBOLDFONT);
		deadlineLabel.setForeground(GraphicConstants.FOREGROUND);
		deadlineLabel.setMinimumSize(new Dimension(150, 15));
		deadlineLabel.setMaximumSize(new Dimension(150, 15));
		deadlineLabel.setPreferredSize(new Dimension(150, 15));
		deadlineLabel.setFont(GraphicConstants.REGULARFONT);
		add(deadlineLabel, "cell 1 1,alignx left,aligny center");
		
	}
	
	/**
	 * Setters and getter for the components of the taskpanel
	 */
	
	public void setTitle(){
		taskLabel.setText(model.getTitle());
	}
	
	public void setDeadline(){	
		deadlineLabel.setText(model.getDeadline());
	}

	public void setController(TaskController controller){
		deleteTaskButton.addActionListener(controller);
		checkbutton.addActionListener(controller);
		taskLabel.addMouseListener(controller);
	}

	
	public TaskPanel getTaskPanel(){
		return this;
	}
	
	public TaskModel getModel(){
		return this.model;
	}
	
}


