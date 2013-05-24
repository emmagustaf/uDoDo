package view;

import java.awt.Dimension;

import javax.swing.JPanel;
import utility.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import model.*;
import controller.*;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.DropMode;


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
		
		this.setMinimumSize(new Dimension (300, 500));
		this.setMaximumSize(new Dimension (300, 500));
		this.setPreferredSize(new Dimension (300, 500));
	
		this.taskModel=taskModel;
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new MigLayout("", "[207.00][][][]", "[][][][][][][][][]"));
		
		JLabel titleLabel = new JLabel(displayModel.getTaskModel().getTitle());
		titleLabel.setFont(GraphicConstants.HEADINGFONT);
		titleLabel.setForeground(GraphicConstants.FOREGROUND);
		add(titleLabel, "cell 0 0");
		
		//JLabel descriptionLabel = new JLabel(displayModel.getTaskModel().getDescription());
		JTextPane descriptionLabel = new JTextPane();
		descriptionLabel.setText(displayModel.getTaskModel().getDescription());
		descriptionLabel.setDragEnabled(false);
		descriptionLabel.setEditable(false);
		descriptionLabel.setBorder(null);
		descriptionLabel.setMinimumSize(new Dimension (150, 50));
		descriptionLabel.setMaximumSize(new Dimension(200, 90));
		descriptionLabel.setPreferredSize(new Dimension(200, 20));
		descriptionLabel.setFont(GraphicConstants.REGULARFONT);
		descriptionLabel.setBackground(GraphicConstants.BACKGROUND);
		descriptionLabel.setForeground(GraphicConstants.FOREGROUND);
		add(descriptionLabel, "cell 0 2 3 1,alignx left,aligny top");
		
		JLabel deadlineLabel = new JLabel("Deadline");
		deadlineLabel.setFont(GraphicConstants.REGULARFONT);
		deadlineLabel.setForeground(GraphicConstants.FOREGROUND);
		add(deadlineLabel, "cell 0 4");
		
		deadlineLabel = new JLabel(taskModel.getDeadline());
		deadlineLabel.setFont(GraphicConstants.REGULARFONT);
		deadlineLabel.setForeground(GraphicConstants.FOREGROUND);
		add(deadlineLabel, "cell 1 4");
		
		JLabel prioLabel = new JLabel("Priority");
		prioLabel.setFont(GraphicConstants.REGULARFONT);
		prioLabel.setForeground(GraphicConstants.FOREGROUND);
		add(prioLabel, "cell 0 6");
		
		
		getEditButton().setIcon(new ImageIcon(DisplayTaskPanel.class.getResource("/utility/icons/cogs_icon&16.png")));
		getEditButton().setBorderPainted(false);
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
