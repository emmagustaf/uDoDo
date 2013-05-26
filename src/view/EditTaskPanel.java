package view;

import java.awt.Dimension;

import javax.swing.JPanel;
import utility.*;
import model.TaskModel;
import net.miginfocom.swing.MigLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import controller.*;
import javax.swing.JEditorPane;
import javax.swing.UIManager;
import calendar.*;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.Font;

/**
 * A class to represent the view where you can edit a task.
 * 
 * @author Hanna
 *
 */
public class EditTaskPanel extends JPanel {
	
	private JTextField titleTextField;
	private JEditorPane descriptionTextField;
	private TaskModel taskModel;
	private JButton cancelButton;
	private JButton saveButton;
	private DisplayTaskPanel displayTaskPanel;
	private JLabel dateLabel;
	private JButton calendarButton;
	private JCalendar calendar;
	private JDateTextField dateTextField;
	public JLabel deadlineLabel;

	/**
	 * Create the panel.
	 */
	public EditTaskPanel(TaskModel taskModel) {
		
		this.taskModel = taskModel;
		
		this.setMinimumSize(new Dimension (300, 500));
		this.setMaximumSize(new Dimension (300, 500));
		this.setPreferredSize(new Dimension (300, 500));
		this.setBackground(GraphicConstants.BACKGROUND);
		this.setLayout(new MigLayout("", "[][172.00][99.00]", "[][][][][][][][][][][][89.00]"));
		
		
		//Create and initialize the labels and fields of the panel
		JLabel changeTitleLabel = new JLabel("Set new title");
		changeTitleLabel.setFont(GraphicConstants.REGULARFONT);
		changeTitleLabel.setForeground(GraphicConstants.FOREGROUND);
		add(changeTitleLabel, "cell 1 0,alignx left");
		
		titleTextField = new JTextField(taskModel.getTitle());
		titleTextField.setFont(GraphicConstants.REGULARFONT);
		add(titleTextField, "cell 1 1,alignx left");
		titleTextField.setColumns(15);
		
		JLabel changeDescriptionLabel = new JLabel("Change description");
		changeDescriptionLabel.setFont(GraphicConstants.REGULARFONT);
		changeDescriptionLabel.setForeground(GraphicConstants.FOREGROUND);
		add(changeDescriptionLabel, "cell 1 3,alignx left,aligny top");
		
		descriptionTextField = new JEditorPane();
		descriptionTextField.setAlignmentX(1.0f);
		descriptionTextField.setMaximumSize(new Dimension(230, 125));
		descriptionTextField.setPreferredSize(new Dimension(230, 125));
		descriptionTextField.setMinimumSize(new Dimension(230, 125));
		descriptionTextField.setText(taskModel.getDescription());
		descriptionTextField.setBorder(UIManager.getBorder("TextField.border"));
		descriptionTextField.setFont(GraphicConstants.REGULARFONT);
		add(descriptionTextField, "cell 1 4 2 1,growx");
		
		JLabel changePriorityLabel = new JLabel("Change priority");
		changePriorityLabel.setFont(GraphicConstants.REGULARFONT);
		changePriorityLabel.setForeground(GraphicConstants.FOREGROUND);
		add(changePriorityLabel, "cell 1 6,alignx left");
		
		dateLabel = new JLabel("Current deadline");
		dateLabel.setFont(GraphicConstants.REGULARFONT);
		dateLabel.setForeground(GraphicConstants.FOREGROUND);
		add(dateLabel, "cell 1 8,alignx left");
		
		//Creating the calendar to set the deadline with.
		calendar = new JCalendar(null, "Calendar", true, calendar.RIGHT_SPINNER);
		
		//the label representing the deadline on the task.
		deadlineLabel = new JLabel("" + taskModel.getDeadline());
		deadlineLabel.setFont(GraphicConstants.REGULARFONT);
		deadlineLabel.setForeground(GraphicConstants.FOREGROUND);
		add(deadlineLabel, "cell 1 9,alignx left");
		
		//The button to display the calendar to set the deadline.
		calendarButton = new JButton("");
		calendarButton.setRolloverIcon(new ImageIcon(EditTaskPanel.class.getResource("/utility/icons/calendar.hover.png")));
		calendarButton.setIcon(new ImageIcon(EditTaskPanel.class.getResource("/utility/icons/calendar_1_icon&32.png")));
		calendarButton.setBorderPainted(false);
		calendarButton.setBorder(null);
		calendarButton.setFont(GraphicConstants.REGULARFONT);
		calendarButton.setActionCommand("calendar");
		add(calendarButton, "cell 2 9,alignx center");
		
		//the text field representing the deadline of the task.
		//This never adds to the gui but is needed to set the deadline to the task.
		dateTextField = new JDateTextField();
		dateTextField.setText("" + taskModel.getDeadline());
		
		//the button to save the changes to the task.
		saveButton = new JButton("Ok");
		saveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		saveButton.setOpaque(true);
		saveButton.setBorderPainted(false);
		saveButton.setForeground(new Color(255, 255, 255));
		saveButton.setMinimumSize(new Dimension(50, 35));
		saveButton.setBorder(null);
		saveButton.setBackground(new Color(30, 144, 255));
		saveButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		saveButton.setActionCommand("save");
		add(saveButton, "cell 1 11,alignx right,aligny bottom");
		
		//The button to cancel changes made to the task
		cancelButton = new JButton("Cancel");
		cancelButton.setRolloverEnabled(true);
		cancelButton.setPreferredSize(new Dimension(100, 35));
		cancelButton.setOpaque(true);
		cancelButton.setForeground(new Color(255, 255, 255));
		cancelButton.setBackground(new Color(30, 144, 255));
		cancelButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cancelButton.setBorder(null);
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		cancelButton.setActionCommand("cancel");
		add(cancelButton, "flowx,cell 2 11,alignx left,aligny bottom");
		
	

	}
	
	/**
	 * @return the calendar to set date with
	 */
	public JCalendar getCalendar(){
		return calendar;
	}
	
	/**
	 * @return the visual view of the task
	 */
	public DisplayTaskPanel getDisplayTaskPanel(){
		return displayTaskPanel;
	}

	/**
	 * @return the title of the task
	 */
	public String getTitleTextField(){
		return titleTextField.getText();
	}
	
	/**
	 * @return the deadline of the task
	 */
	public String getJDateTextField(){
		dateTextField.getCalendar();
		dateTextField.setDate(calendar.getDate());
		return dateTextField.getText();
	}
	
	/**
	 * @return the description of the task
	 */
	public String getDescriptionTextField(){
		return descriptionTextField.getText();
	}
	
	/**
	 * @return Taskmodel the model that will be edited.
	 */
	public TaskModel getTaskModel(){
		return taskModel;
	}
	
	/**
	 * Sets the controller for the panel. 
	 * Mouselistener will handle what actions will be performed when the editbutton is clicked
	 * 
	 * @param controller the controller that controlls the buttons
	 */
	public void setController(EditController controller){
		
		saveButton.addActionListener(controller);
		cancelButton.addActionListener(controller);
		calendarButton.addActionListener(controller);
	}
}
