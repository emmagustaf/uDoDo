package view;

import javax.swing.JPanel;
import utility.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;


//Denna klass ska ha en massa setters

/**
 * A class to represent the view where you can see the title, description, priority and deadline of the task
 *
 * @author Hanna
 *
 */
public class DisplayTaskView extends JPanel {

	/**
	 * Create the panel.
	 */
	public DisplayTaskView() {
		setLayout(new MigLayout("", "[207.00][][]", "[][][][][][][][][]"));
		
		JLabel titleLabel = new JLabel("Title");
		titleLabel.setFont(GraphicConstants.SMALLHEADINGFONT);
		add(titleLabel, "cell 0 0");
		
		JLabel descriptionLabel = new JLabel("Description");
		descriptionLabel.setFont(GraphicConstants.REGULARFONT);
		add(descriptionLabel, "cell 0 2");
		
		JLabel deadlineLabel = new JLabel("Deadline");
		deadlineLabel.setFont(GraphicConstants.REGULARFONT);
		add(deadlineLabel, "cell 0 4");
		
		JLabel prioLabel = new JLabel("Priority");
		prioLabel.setFont(GraphicConstants.REGULARFONT);
		add(prioLabel, "cell 0 6");
		
		JButton editButton = new JButton("Edit");
		editButton.setFont(GraphicConstants.REGULARFONT);
		add(editButton, "cell 1 8");
		
		JButton okButton = new JButton("OK");
		okButton.setFont(GraphicConstants.REGULARFONT);
		add(okButton, "cell 2 8");
		
		editButton.setActionCommand("editTask");

	}
	
}
