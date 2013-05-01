package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class DisplayTaskView extends JPanel {

	/**
	 * Create the panel.
	 */
	public DisplayTaskView() {
		setLayout(new MigLayout("", "[207.00][]", "[][][][][][][][][]"));
		
		JLabel titleLabel = new JLabel("Title");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		add(titleLabel, "cell 0 0");
		
		JLabel descriptionLabel = new JLabel("Description");
		descriptionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		add(descriptionLabel, "cell 0 2");
		
		JLabel deadlineLabel = new JLabel("Deadline");
		deadlineLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		add(deadlineLabel, "cell 0 4");
		
		JLabel prioLabel = new JLabel("Priority");
		prioLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		add(prioLabel, "cell 0 6");
		
		JButton okButton = new JButton("OK");
		add(okButton, "cell 1 8");

	}

}
