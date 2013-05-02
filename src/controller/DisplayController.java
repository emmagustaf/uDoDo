package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CategoryModel;
import model.DisplayModel;

public class DisplayController implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof DisplayModel){
			DisplayModel model = (DisplayModel) e.getSource();
			if(equals(e.getActionCommand())){
				
			}
		}
				
	}

}
