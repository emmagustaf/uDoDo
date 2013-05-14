package model;

import view.*;


// Här kommer det som händer ligga när man trycker på en knapp 
public class EditModel {
	
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
