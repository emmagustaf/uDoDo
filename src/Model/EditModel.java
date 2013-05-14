package model;

import javax.swing.JButton;

import view.*;

// H�r kommer det som h�nder ligga n�r man trycker p� en knapp 
public class EditModel {
	
	private EditTaskPanel editTaskPanel;
	
	public EditModel(){
	}
	
	public void saveChanges(EditTaskPanel editTaskPanel){
		editTaskPanel.getTaskModel().setTitle(editTaskPanel.getTitleTextField());
		editTaskPanel.getTaskModel().setDescription(editTaskPanel.getDescriptionTextField());
	}
	
	public void cancelChanges(TaskSettingView settingView){
		
		settingView.panelInScroll.removeAll();
		System.out.println("ended cancelchanges in editmodel");
	}
	
	 

}
