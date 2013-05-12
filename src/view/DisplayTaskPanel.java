package view;

import javax.swing.JPanel;
import utility.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import model.*;
import controller.*;

import java.awt.Font;
import javax.swing.ImageIcon;



/**
 * A class to represent the view where you can see the title, description, priority and deadline of the task
 *
 * @author Hanna
 *
 */
public class DisplayTaskPanel extends JPanel {
	private JButton editButton;
	private TaskModel taskModel;

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
		
		JButton editButton = new JButton("");
		editButton.setIcon(new ImageIcon(DisplayTaskPanel.class.getResource("/utility/icons/cogs_icon&16.png")));
		editButton.setBorderPainted(false);
		editButton.setFont(GraphicConstants.REGULARFONT);
		add(editButton, "cell 1 8");
		editButton.setActionCommand("editTask");
		
		editButton.setActionCommand("editTask");

	}
	public void setController(DisplayController controller){
		System.out.println("Entered setController in disptaskpanel");

		editButton.addActionListener(controller);
		System.out.println("added actionlistener");
	}
	
}
