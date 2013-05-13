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
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
//H�r kommer vi beh�va �ndra statet p� task


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
	
	/**
	 * Create the panel.
	 */
	public EditTaskPanel(TaskModel taskModel) {
		
		this.setMinimumSize(new Dimension (300, 580));
		this.setMaximumSize(new Dimension (300, 580));
		this.setPreferredSize(new Dimension (300, 580));
		this.taskModel = taskModel;
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new MigLayout("", "[][283.00,grow]", "[][][][][][][][][][]"));
		
		JLabel changeTitleLabel = new JLabel("Change title:");
		changeTitleLabel.setFont(GraphicConstants.REGULARFONT);
		add(changeTitleLabel, "cell 0 1,alignx right");
		
		titleTextField = new JTextField(taskModel.getTitle());
		titleTextField.setFont(GraphicConstants.REGULARFONT);
		add(titleTextField, "cell 1 1,alignx left");
		titleTextField.setColumns(10);
		
		JLabel changeDescriptionLabel = new JLabel("Change description:");
		changeDescriptionLabel.setFont(GraphicConstants.REGULARFONT);
		add(changeDescriptionLabel, "cell 0 3,alignx right,aligny top");
		
		descriptionTextField = new JEditorPane();
		descriptionTextField.setText(taskModel.getDescription());
		descriptionTextField.setBorder(UIManager.getBorder("TextField.border"));
		descriptionTextField.setPreferredSize(new Dimension(150, 90));
		descriptionTextField.setFont(GraphicConstants.REGULARFONT);
		add(descriptionTextField, "cell 1 3,alignx left");
		
		JLabel changePriorityLabel = new JLabel("Change priority:");
		changePriorityLabel.setFont(GraphicConstants.REGULARFONT);
		add(changePriorityLabel, "cell 0 5,alignx right");
		
		JLabel changeDeadlineLabel = new JLabel("Change deadline:");
		changeDeadlineLabel.setFont(GraphicConstants.REGULARFONT);
		add(changeDeadlineLabel, "cell 0 7,alignx right");
		
		cancelButton = new JButton("cancel");
		cancelButton.setFont(GraphicConstants.REGULARFONT);
		cancelButton.setActionCommand("cancel");
		add(cancelButton, "flowx,cell 1 9,alignx right");
		
		saveButton = new JButton("save");
		saveButton.setFont(GraphicConstants.REGULARFONT);
		saveButton.setActionCommand("save");
		add(saveButton, "cell 1 9,alignx right");
		
	

	}
	
	public String getTitleTextField(){
		return titleTextField.getText();
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
	}

}
