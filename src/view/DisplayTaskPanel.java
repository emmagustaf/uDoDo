package view;

import java.awt.Dimension;

import javax.swing.JPanel;
import utility.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;

import model.*;
import controller.*;
import javax.swing.ImageIcon;


/**
 * A class to represent the view where you can see more details about a task, which includes
 * the title, description, priority and deadline of the task
 *
 */
public class DisplayTaskPanel extends JPanel {
	
	private JButton editButton;
	private TaskModel taskModel;
	private DisplayController controller;
	private DisplayModel displayModel;
	private JLabel deadlineLabel;
	private JLabel deadlineLabel_1;	//The label that contains the deadline
	
	/**
	 * Create the panel.
	 */
	public DisplayTaskPanel(DisplayModel displayModel, TaskModel taskModel) {
		
		this.taskModel=taskModel;
		this.editButton = new JButton();
		//All graphical settings and components created with correct settings
		this.setMinimumSize(new Dimension (300, 500));
		this.setMaximumSize(new Dimension (300, 500));
		this.setPreferredSize(new Dimension (300, 500));
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new MigLayout("", "[110.00][][][]", "[][][][][][][][][][][]"));

		//The label containing the title of the task.
		JLabel titleLabel = new JLabel(displayModel.getTaskModel().getTitle());
		titleLabel.setFont(GraphicConstants.HEADINGFONT);
		titleLabel.setForeground(GraphicConstants.FOREGROUND);
		add(titleLabel, "cell 0 0 2 1");
		
		//The pain containing the description of the task.
		JTextPane descriptionPane = new JTextPane();
		descriptionPane.setMinimumSize(new Dimension (230, 30));
		descriptionPane.setMaximumSize(new Dimension(230, 125));
		descriptionPane.setPreferredSize(new Dimension(230, 125));
		descriptionPane.setText(displayModel.getTaskModel().getDescription());
		descriptionPane.setDragEnabled(false);
		descriptionPane.setEditable(false);
		descriptionPane.setBorder(null);
		descriptionPane.setFont(GraphicConstants.REGULARFONT);
		descriptionPane.setBackground(GraphicConstants.BACKGROUND);
		descriptionPane.setForeground(GraphicConstants.FOREGROUND);
		add(descriptionPane, "cell 0 2 2 2,alignx left,aligny top");
		
		//Deadline label created and initializes
		JLabel deadlineLabel = new JLabel("Deadline");
		deadlineLabel.setFont(GraphicConstants.REGULARFONT);
		deadlineLabel.setForeground(GraphicConstants.FOREGROUND);
		add(deadlineLabel, "cell 0 5");
		
		//Deadline label that contains the deadline initialized
		deadlineLabel_1 = new JLabel(taskModel.getDeadline());
		deadlineLabel_1.setFont(GraphicConstants.REGULARBOLDFONT);
		deadlineLabel_1.setForeground(GraphicConstants.FOREGROUND);
		add(deadlineLabel_1, "cell 0 6");
		
		//Edit button created and initialized
		editButton.setRolloverIcon(new ImageIcon(DisplayTaskPanel.class.getResource("/utility/icons/setting.edit.hover.png")));
		editButton.setToolTipText("change task");
		editButton.setIcon(new ImageIcon(DisplayTaskPanel.class.getResource("/utility/icons/cogs_icon&24.png")));
		editButton.setBorderPainted(false);
		add(editButton, "cell 2 10,alignx left,aligny top");
		editButton.setActionCommand("editTask");

	}
	
	/**
	 * Returns the taskmodel that this displayPanel is created from.
	 * @return taskmodel the model this panel displays
	 */
	public TaskModel getTaskModel(){
		return this.taskModel;
	}
	
	/**
	 * Sets the controller for the panel. 
	 * Mouselistener will handle what actions will be performed when the editbutton is clicked
	 * 
	 * @param controller the controller that controlls the buttons
	 */
	public void setController(DisplayController controller){
		
		editButton.addActionListener(controller);
		this.addMouseListener(controller);
	}

}
