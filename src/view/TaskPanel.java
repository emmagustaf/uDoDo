package view;

import javax.swing.JPanel;
import model.*;

import model.TaskModel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;

public class TaskPanel extends JPanel {
	
	private TaskModel model;

	//TODO Create textlabels, checkbox and other shit that every task should show in the list.
	/**
	 * Create the panel.
	 */
	public TaskPanel(TaskModel model) {
		this.model=model;
		
		
		setLayout(new MigLayout("", "[][][][][][][]", "[]"));
		
		JLabel taskLabel = new JLabel("ToDo-task");
		taskLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		add(taskLabel, "cell 1 0");
		taskLabel.setText(model.getTitle());
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		add(chckbxNewCheckBox, "cell 6 0");
		
		
		
		//TODO Get the information from the model and place it in this panel. This panel should represent a new task in the list. 
		//(Name, checkbox and so on)
		
	}


}
