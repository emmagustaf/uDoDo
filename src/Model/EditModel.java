package model;

import view.EditTaskPanel;


// H�r kommer det som h�nder ligga n�r man trycker p� en knapp 
public class EditModel {

	private EditTaskPanel view;
	
	public EditModel(){
		
	}

	public void updateEditView() {
		view.repaint();
	}
}
