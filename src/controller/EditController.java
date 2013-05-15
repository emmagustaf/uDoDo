package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import calendar.JDateTextField;

import model.*;
import view.*;

public class EditController implements ActionListener{
	private ListView listView;
	private TaskSettingView settingView;
	private EditTaskPanel editTaskPanel;
	private EditModel editModel;
	private DisplayTaskPanel displayTaskPanel;
	private DisplayController displayController;
	
	public EditController(ListView listView, TaskSettingView settingView, EditTaskPanel editTaskPanel, EditModel editModel){
		this.listView = listView;
		this.settingView = settingView;
		this.editTaskPanel=editTaskPanel;
		this.editModel=editModel;
		editTaskPanel.setController(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton){
			
//			DisplayTaskPanel panel = (DisplayTaskPanel)((JButton) e.getSource()).getParent();
//			TaskModel model = panel.getTaskModel();
		
			if(e.getActionCommand().equals("cancel")){
				toDisplayTask();
				System.out.println("Entered action commant in cancel.");
				settingView.updateView();
				listView.updateView();
				
				
			}else if(e.getActionCommand().equals("save")){
				saveChanges();
				settingView.updateView();
				listView.updatePanels();
				listView.updateView();
			}else if(e.getActionCommand().equals("calendar")){
				
				editTaskPanel.calendar.setVisible(true);
				editTaskPanel.calendar.setCalendar(editTaskPanel.calendar.getCalendar());
			}
		}
		
	}
	
	private void toDisplayTask(){
		settingView.panelInScroll.removeAll();
		DisplayModel model = new DisplayModel(editTaskPanel.getTaskModel());
		displayTaskPanel = new DisplayTaskPanel(model, editTaskPanel.getTaskModel());
		displayController = new DisplayController(listView, settingView, displayTaskPanel);
		settingView.panelInScroll.add(displayTaskPanel);
	}
	
	private void saveChanges(){
		editTaskPanel.getTaskModel().setTitle(editTaskPanel.getTitleTextField());
		editTaskPanel.getTaskModel().setDescription(editTaskPanel.getDescriptionTextField());
		listView.updatePanels();
		toDisplayTask();
	}
	
	
}