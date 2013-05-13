package view;

import javax.swing.JPanel;
import utility.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
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
	
	/**
	 * Create the panel.
	 */
	public DisplayTaskPanel(DisplayModel displayModel, TaskModel taskModel) {
	
		this.taskModel=taskModel;
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new MigLayout("", "[207.00][][]", "[][][][][][][][][]"));
		
		JLabel titleLabel = new JLabel(displayModel.getTaskModel().getTitle());
		titleLabel.setFont(GraphicConstants.SMALLHEADINGFONT);
		add(titleLabel, "cell 0 0");
		
		JLabel descriptionLabel = new JLabel(displayModel.getTaskModel().getDescription());
		descriptionLabel.setFont(GraphicConstants.REGULARFONT);
		add(descriptionLabel, "cell 0 2");
		
		JLabel deadlineLabel = new JLabel("Deadline");
		deadlineLabel.setFont(GraphicConstants.REGULARFONT);
		add(deadlineLabel, "cell 0 4");
		
		JLabel prioLabel = new JLabel("Priority");
		prioLabel.setFont(GraphicConstants.REGULARFONT);
		add(prioLabel, "cell 0 6");
		
		
		editButton.setIcon(new ImageIcon(DisplayTaskPanel.class.getResource("/utility/icons/cogs_icon&16.png")));
		editButton.setBorderPainted(false);
		editButton.setFont(GraphicConstants.REGULARFONT);
		add(editButton, "cell 1 8");
		editButton.setActionCommand("editTask");

	}
	public TaskModel getModel(){
		return this.taskModel;
	}

	
	/**
	 * Set controller for the panel. 
	 * Mouselistener will handle what actions will be performed when the editbutton is clicked
	 * 
	 * @param controller
	 */
	public void setController(DisplayController controller){
		
		editButton.addActionListener(controller);
		this.addMouseListener(controller);
	}
	
}
