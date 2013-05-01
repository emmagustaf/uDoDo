package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.HeaderView;

public class HeaderController implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof HeaderView){
			if(e.getActionCommand().equals("newTask")){
			
			}
		}
	}

}
