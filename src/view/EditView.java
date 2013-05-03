package view;

import javax.swing.JPanel;
import utility.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

//Här kommer vi behöva ändra statet på task


/**
 * A class to represent the view where you can edit a task.
 * 
 * @author Hanna
 *
 */
public class EditView extends JPanel {
	private JTextField titleTextField;
	private JTextField descriptionTextField;

	/**
	 * Create the panel.
	 */
	public EditView() {
		setLayout(new MigLayout("", "[][283.00,grow]", "[][][][][][][][][][]"));
		
		JLabel changeTitleLabel = new JLabel("Change title:");
		add(changeTitleLabel, "cell 0 1,alignx right");
		
		titleTextField = new JTextField();
		add(titleTextField, "cell 1 1,growx");
		titleTextField.setColumns(10);
		
		JLabel changeDescriptionLabel = new JLabel("Change description:");
		add(changeDescriptionLabel, "cell 0 3,alignx right");
		
		descriptionTextField = new JTextField();
		add(descriptionTextField, "cell 1 3,growx");
		descriptionTextField.setColumns(10);
		
		JLabel changePriorityLabel = new JLabel("Change priority:");
		add(changePriorityLabel, "cell 0 5,alignx right");
		
		JLabel changeDeadlineLabel = new JLabel("Change deadline:");
		add(changeDeadlineLabel, "cell 0 7,alignx right");
		
		JButton cancelButton = new JButton("Cancel");
		add(cancelButton, "flowx,cell 1 9,alignx right");
		
		JButton saveButton = new JButton("Save");
		add(saveButton, "cell 1 9,alignx right");
		
	

	}
	public String getTitleTextField(){
		return titleTextField.getText();
	}
	public String getDescriptionTextField(){
		return descriptionTextField.getText();
	}
	

}
