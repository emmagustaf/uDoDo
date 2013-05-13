package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CategoryModel;
import model.*;

public class EditController implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {	
		if(e.getSource() instanceof EditModel){
			EditModel model = (EditModel) e.getSource();
			
		}
		if(e.getActionCommand().equals("cancel")){
			
			
		}else if(e.getActionCommand().equals("save")){
			
		}
		
		
			
	}
	
	
}
