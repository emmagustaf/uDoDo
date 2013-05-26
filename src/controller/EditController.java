package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.util.*;

import calendar.JDateTextField;

import model.DisplayModel;
import modeltest.*;
import view.*;

public class EditController implements ActionListener{
	
	private ListView listView;
	private TaskSettingView settingView;
	private EditTaskPanel editTaskPanel;
	private DisplayTaskPanel displayTaskPanel;
	private DisplayController displayController;
	private Calendar calendar;
	private JDateTextField text = new JDateTextField();
	
	public EditController(ListView listView, TaskSettingView settingView, EditTaskPanel editTaskPanel){
		this.listView = listView;
		this.settingView = settingView;
		this.editTaskPanel=editTaskPanel;

		editTaskPanel.setController(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton){
			
//			DisplayTaskPanel panel = (DisplayTaskPanel)((JButton) e.getSource()).getParent();
//			TaskModel model = panel.getTaskModel();
			
			//Cancels editing
			if(e.getActionCommand().equals("cancel")){
				toDisplayTask();
				System.out.println("Entered action commant in cancel.");
				settingView.updateView();
				listView.updateView();
				
			//Saves all updates in edittaskpanel
			}else if(e.getActionCommand().equals("save")){
				setDate();
				saveChanges();
				settingView.updateView();
				listView.updatePanels();
				listView.updateView();
				
			// Enables the calendar pop-up
			}else if(e.getActionCommand().equals("calendar")){
				
				editTaskPanel.getCalendar().setVisible(true);
				editTaskPanel.getCalendar().setEnabled(true);
				
				//Updates the deadlinelabel in edittaskpanel before saving to all panels
				if(editTaskPanel.getCalendar().isOkPressed()){
					editTaskPanel.deadlineLabel.setText(editTaskPanel.getJDateTextField());
				}
				
				
			}
			settingView.updateView();
		}
		
	}
	
	/**
	 * Returns the user to displayTaskPanel after canceling
	 */
	private void toDisplayTask(){
		settingView.panelInScroll.removeAll();
		DisplayModel model = new DisplayModel(editTaskPanel.getTaskModel());
		displayTaskPanel = new DisplayTaskPanel(model, editTaskPanel.getTaskModel());
		displayController = new DisplayController(listView, settingView, displayTaskPanel);
		settingView.panelInScroll.add(displayTaskPanel);
	}
	
	/**
	 * Sets the selected date as deadline
	 */
	private void setDate(){
		editTaskPanel.getTaskModel().setDeadline(editTaskPanel.getJDateTextField());
		listView.updatePanels();
	}
	
	/**
	 * Saves all changes made in edittaskpanel
	 */
	private void saveChanges(){
		editTaskPanel.getTaskModel().setTitle(editTaskPanel.getTitleTextField());
		editTaskPanel.getTaskModel().setDescription(editTaskPanel.getDescriptionTextField());
		listView.updatePanels();
		toDisplayTask();
	}
	
	
}