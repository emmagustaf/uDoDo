package model;

import view.EditTaskPanel;


// Här kommer det som händer ligga när man trycker på en knapp 
public class EditModel {

	private EditTaskPanel view;
	
	public EditModel(){
		
	}

	public void updateEditView() {
		view.repaint();
	}
}
