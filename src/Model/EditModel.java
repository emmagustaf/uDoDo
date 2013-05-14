package model;

import javax.swing.JButton;

import view.*;

// Här kommer det som händer ligga när man trycker på en knapp 
public class EditModel {
	
	private EditTaskPanel editTaskPanel;
	private DisplayTaskPanel displayTaskPanel;
	
	public EditModel(){
	}
	
	public void saveChanges(EditTaskPanel editTaskPanel){
		editTaskPanel.getTaskModel().setTitle(editTaskPanel.getTitleTextField());
		editTaskPanel.getTaskModel().setDescription(editTaskPanel.getDescriptionTextField());
	}
	
	public void cancelChanges(TaskSettingView settingView){
		
		settingView.panelInScroll.removeAll();
	//	settingView.panelInScroll.add(editTaskPanel.getDisplayTaskPanel());
		System.out.println("ended cancelchanges in editmodel");
	}
	
	 

}
