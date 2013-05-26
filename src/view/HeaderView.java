package view;

import javax.swing.*;
import controller.*;
import java.awt.event.*;
import java.awt.*;

import utility.*;
import net.miginfocom.swing.MigLayout;

/**
 * A class to represent the view where the user can add new tasks.
 */
public class HeaderView extends JPanel{
	
	private JTextField taskTitleInput;
	private JButton addNewTaskButton;
	
	/**
	 * Create the view.
	 * 
	 */
	public HeaderView() {
		
		this.setBackground(GraphicConstants.BACKGROUND);
		this.setBorder(null);
		this.setLayout(new MigLayout("", "[208.00px][53.00px]", "[-13.00px][42.00,grow,fill][12.00]"));
		this.setPreferredSize(new Dimension(300, 70));
		this.setMinimumSize(new Dimension(300, 70));
		this.setMaximumSize(new Dimension(300, 70));
		
		taskTitleInput = new HintTextField("Add task...", 25);
		taskTitleInput.setForeground(Color.gray);
		taskTitleInput.setFont(GraphicConstants.REGULARFONT);
		taskTitleInput.setActionCommand("newTask");
		this.add(taskTitleInput, "cell 0 0 1 2,growx,aligny center");
		
		addNewTaskButton = new JButton("Ok");
		addNewTaskButton.setMinimumSize(new Dimension(50, 29));
		addNewTaskButton.setMaximumSize(new Dimension(50, 29));
		addNewTaskButton.setPreferredSize(new Dimension(50, 29));
		addNewTaskButton.setOpaque(true);
		addNewTaskButton.setForeground(new Color(255, 255, 255));
		addNewTaskButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addNewTaskButton.setBorderPainted(false);
		addNewTaskButton.setBorder(null);
		addNewTaskButton.setBackground(new Color(30, 144, 255));
		addNewTaskButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.add(addNewTaskButton, "cell 1 1,alignx right,aligny top");
		addNewTaskButton.setActionCommand("newTask");
	}
	
	public void setController(HeaderController controller){
		addNewTaskButton.addActionListener(controller);
		taskTitleInput.addActionListener(controller);
	}
	
	public JTextField getTextField(){
		return taskTitleInput;
	}

}
