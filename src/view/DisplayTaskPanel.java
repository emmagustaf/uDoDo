package view;

import java.awt.Dimension;

import javax.swing.JPanel;
import utility.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import model.*;
import controller.*;

import javax.swing.ImageIcon;


/**
 * A class to represent the view where you can see more details about a task, which includes
 * the title, description, priority and deadline of the task
 *
 * @author Hanna Materne
 *
 */
public class DisplayTaskPanel extends JPanel {
	
	private JButton editButton = new JButton();
	private TaskModel taskModel;
	private DisplayController controller;
	private DisplayModel displayModel;
	private JLabel deadlineLabel;
	
	/**
	 * Create the panel.
	 */
	public DisplayTaskPanel(DisplayModel displayModel, TaskModel taskModel) {
		
		this.setMinimumSize(new Dimension (300, 580));
		this.setMaximumSize(new Dimension (300, 580));
		this.setPreferredSize(new Dimension (300, 580));
	
		this.taskModel=taskModel;
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new MigLayout("", "[207.00][][][]", "[][][][][][][][][]"));
		
		JLabel titleLabel = new JLabel(displayModel.getTaskModel().getTitle());
		titleLabel.setFont(GraphicConstants.SMALLHEADINGFONT);
		add(titleLabel, "cell 0 0");
		
		//JLabel descriptionLabel = new JLabel(displayModel.getTaskModel().getDescription());
		JTextField descriptionLabel = new JTextField(displayModel.getTaskModel().getDescription());
		descriptionLabel.setEditable(false);
		descriptionLabel.setBackground(GraphicConstants.BACKGROUND);
		descriptionLabel.setBorder(null);
		descriptionLabel.setMinimumSize(new Dimension (150, 20));
		descriptionLabel.setMaximumSize(new Dimension(200, 20));
		descriptionLabel.setPreferredSize(new Dimension(200, 20));
		descriptionLabel.setFont(GraphicConstants.REGULARFONT);
		add(descriptionLabel, "cell 0 2 3 1,grow");
		
		JLabel deadlineLabel = new JLabel("Deadline");
		deadlineLabel.setFont(GraphicConstants.REGULARFONT);
		add(deadlineLabel, "cell 0 4");
		
		deadlineLabel = new JLabel(taskModel.getDeadline());
		deadlineLabel.setFont(GraphicConstants.REGULARFONT);
		add(deadlineLabel, "cell 1 4");
		
		JLabel prioLabel = new JLabel("Priority");
		prioLabel.setFont(GraphicConstants.REGULARFONT);
		add(prioLabel, "cell 0 6");
		
		
		getEditButton().setIcon(new ImageIcon(DisplayTaskPanel.class.getResource("/utility/icons/cogs_icon&16.png")));
		getEditButton().setBorderPainted(false);
		getEditButton().setFont(GraphicConstants.REGULARFONT);
		add(getEditButton(), "cell 2 8");
		getEditButton().setActionCommand("editTask");

	}
	
	/**
	 * Returns the actual taskmodel.
	 * 
	 * @return taskmodel
	 */
	public TaskModel getTaskModel(){
		return this.taskModel;
	}
	
	/**
	 * Sets the controller for the panel. 
	 * Mouselistener will handle what actions will be performed when the editbutton is clicked
	 * 
	 * @param controller
	 */
	public void setController(DisplayController controller){
		
		getEditButton().addActionListener(controller);
		this.addMouseListener(controller);
	}

	/**
	 * @return the editButton
	 */
	public JButton getEditButton() {
		return editButton;
	}

	/**
	 * @param editButton the editButton to set
	 */
	public void setEditButton(JButton editButton) {
		this.editButton = editButton;
	}

}
