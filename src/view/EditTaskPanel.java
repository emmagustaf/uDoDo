package view;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JPanel;
import utility.*;
import model.TaskModel;
import net.miginfocom.swing.MigLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import controller.*;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import calendar.*;

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
		
		this.setMinimumSize(new Dimension (300, 500));
		this.setMaximumSize(new Dimension (300, 500));
		this.setPreferredSize(new Dimension (300, 500));
		this.taskModel = taskModel;
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new MigLayout("", "[][172.00][99.00]", "[][][][][][][][][][][][]"));
		
		JLabel changeTitleLabel = new JLabel("Set new title");
		changeTitleLabel.setFont(GraphicConstants.REGULARFONT);
		changeTitleLabel.setForeground(GraphicConstants.FOREGROUND);
		add(changeTitleLabel, "cell 1 0,alignx left");
		
		titleTextField = new JTextField(taskModel.getTitle());
		titleTextField.setFont(GraphicConstants.REGULARFONT);
		add(titleTextField, "cell 1 1,growx");
		titleTextField.setColumns(15);
		
		JLabel changeDescriptionLabel = new JLabel("Change description");
		changeDescriptionLabel.setFont(GraphicConstants.REGULARFONT);
		changeDescriptionLabel.setForeground(GraphicConstants.FOREGROUND);
		add(changeDescriptionLabel, "cell 1 3,alignx left,aligny top");
		
		descriptionTextField = new JEditorPane();
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
		
		deadlineLabel = new JLabel("Current deadline");
		deadlineLabel.setFont(GraphicConstants.REGULARFONT);
		deadlineLabel.setForeground(GraphicConstants.FOREGROUND);
		add(deadlineLabel, "cell 1 8,alignx left");
		
		calendar = new JCalendar(null, "Calendar", true, calendar.RIGHT_SPINNER);
		
		
		dateLabel = new JLabel("" + taskModel.getDeadline());
		dateLabel.setFont(GraphicConstants.REGULARFONT);
		dateLabel.setForeground(GraphicConstants.FOREGROUND);
		add(dateLabel, "cell 1 9,alignx left");
		
		calendarButton = new JButton("Set date");
		calendarButton.setFont(GraphicConstants.REGULARFONT);
		calendarButton.setActionCommand("calendar");
		add(calendarButton, "cell 2 9,alignx center");
		//deadlineInput.setColumns(10);
		
		dateTextField = new JDateTextField();
		dateTextField.setText("" + taskModel.getDeadline());
		
		saveButton = new JButton("Ok");
		saveButton.setFont(GraphicConstants.REGULARFONT);
		saveButton.setActionCommand("save");
		add(saveButton, "cell 1 11,alignx right");
		
		cancelButton = new JButton("cancel");
		cancelButton.setFont(GraphicConstants.REGULARFONT);
		cancelButton.setActionCommand("cancel");
		add(cancelButton, "flowx,cell 2 11,alignx right");
		
	

	}
	public JCalendar getCalendar(){
		return calendar;
	}
	
	public DisplayTaskPanel getDisplayTaskPanel(){
		return displayTaskPanel;
	}

	public String getTitleTextField(){
		return titleTextField.getText();
	}
	
	public String getJDateTextField(){
		dateTextField.getCalendar();
		dateTextField.setDate(calendar.getDate());
		return dateTextField.getText();
	}
	public String getDescriptionTextField(){
		return descriptionTextField.getText();
	}
	
	public TaskModel getTaskModel(){
		return taskModel;
	}
	
	public void setController(EditController controller){
		saveButton.addActionListener(controller);
		cancelButton.addActionListener(controller);
		calendarButton.addActionListener(controller);
	}
}
