package model;

import view.EditTaskPanel;


// Här kommer det som händer ligga när man trycker på en knapp 
public class EditModel {
	
	public EditModel(){
	}
	
	public void saveChanges(EditTaskPanel editTaskPanel){
		editTaskPanel.getTaskModel().setTitle(editTaskPanel.getTitleTextField());
		editTaskPanel.getTaskModel().setDescription(editTaskPanel.getDescriptionTextField());
	}
	
	 

}
