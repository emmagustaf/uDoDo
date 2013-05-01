package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class EditView extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public EditView() {
		setLayout(new MigLayout("", "[][283.00,grow]", "[][][][][][][][][][]"));
		
		JLabel lblChangeTitle = new JLabel("Change title:");
		add(lblChangeTitle, "cell 0 1,alignx right");
		
		textField = new JTextField();
		add(textField, "cell 1 1,growx");
		textField.setColumns(10);
		
		JLabel lblChangeDescription = new JLabel("Change description:");
		add(lblChangeDescription, "cell 0 3,alignx right");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 1 3,growx");
		textField_1.setColumns(10);
		
		JLabel lblChangePriority = new JLabel("Change priority:");
		add(lblChangePriority, "cell 0 5,alignx right");
		
		JLabel lblChangeDeadline = new JLabel("Change deadline:");
		add(lblChangeDeadline, "cell 0 7,alignx right");
		
		JButton cancelButton = new JButton("Cancel");
		add(cancelButton, "flowx,cell 1 9,alignx right");
		
		JButton saveButton = new JButton("Save");
		add(saveButton, "cell 1 9,alignx right");

	}

}
