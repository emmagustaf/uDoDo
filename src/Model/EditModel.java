package model;

import view.EditTaskPanel;


// H�r kommer det som h�nder ligga n�r man trycker p� en knapp 
public class EditModel {
	
	public EditModel(){
	}
	
	public void saveChanges(EditTaskPanel editTaskPanel){
		editTaskPanel.getTaskModel().setTitle(editTaskPanel.getTitleTextField());
		editTaskPanel.getTaskModel().setDescription(editTaskPanel.getDescriptionTextField());
	}
	
	 

}
