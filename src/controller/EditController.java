package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;

public class EditController implements ActionListener{
	private ListView listView;
	private EditTaskPanel editTaskPanel;
	
	@Override
	public void actionPerformed(ActionEvent e) {	
		if(e.getSource() instanceof EditModel){
			EditModel model = (EditModel) e.getSource();
		}
		if(e.getActionCommand().equals("cancel")){
			
			
		}else if(e.getActionCommand().equals("save")){

			listView.updateView();
		}
		
		
			
	}
	
	
}
