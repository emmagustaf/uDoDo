package view;

import javax.swing.JPanel;
import model.*;

import model.TaskModel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Component;

/**
 * A class to represent a TaskPanel. 
 * 
 * @author Hanna
 */

public class TaskPanel extends JPanel {
	
	private TaskModel model;
	private String taskCheck;
	/**
	 * Create the panel.
	 */
	public TaskPanel(TaskModel model) {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setMinimumSize(new Dimension(30, 20));
		setPreferredSize(new Dimension(470, 70));
		setSize(new Dimension(30, 20));
		this.model=model;
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel taskLabel = new JLabel(model.getTitle());
		taskLabel.setSize(new Dimension(30, 20));
		taskLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		add(taskLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setAlignmentX(Component.RIGHT_ALIGNMENT);
		chckbxNewCheckBox.setActionCommand(taskCheck);
		add(chckbxNewCheckBox);
	}
}
