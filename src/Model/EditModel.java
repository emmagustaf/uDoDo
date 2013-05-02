package model;

import view.EditView;


// Här kommer det som händer ligga när man trycker på en knapp 
public class EditModel {

	private EditView view;
	
	public EditModel(){
		
	}

	public void updateEditView() {
		view.repaint();
	}
}
