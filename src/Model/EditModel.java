package model;

import view.EditView;


// H�r kommer det som h�nder ligga n�r man trycker p� en knapp 
public class EditModel {

	private EditView view;
	
	public EditModel(){
		
	}

	public void updateEditView() {
		view.repaint();
	}
}
