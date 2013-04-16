package view;

import javax.swing.JPanel;
import model.*;

import model.TaskModel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;

/**
 * A class to represent a TaskPanel. 
 * 
 * @author Hanna
 */

public class TaskPanel extends JPanel {
	
	private TaskModel model;

	/**
	 * Create the panel.
	 */
	public TaskPanel(TaskModel model) {
		this.model=model;
		
		
		setLayout(new MigLayout("", "[][][][][][][]", "[]"));
		
		JLabel taskLabel = new JLabel(model.getTitle());
		taskLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		add(taskLabel, "cell 1 0");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		add(chckbxNewCheckBox, "cell 6 0");
		
		
	}


}
