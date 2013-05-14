package model;

import javax.swing.JButton;

import view.*;

// Här kommer det som händer ligga när man trycker på en knapp 
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
