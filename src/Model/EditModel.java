package model;

import javax.swing.JButton;

import view.*;

// H�r kommer det som h�nder ligga n�r man trycker p� en knapp 
public class EditModel {
	
	private EditTaskPanel editTaskPanel;
	
	public EditModel(){
	}
	
	public void saveChanges(EditTaskPanel editTaskPanel){

	}
	
	public void cancelChanges(TaskSettingView settingView){
		

		System.out.println("ended cancelchanges in editmodel");
	}
	
	 

}
