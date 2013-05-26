package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

import utility.ColorSettings;

public class MenuController implements ActionListener{
	
	private ColorSettings colorSettings;
	
	public MenuController(ColorSettings colorSettings){
		this.colorSettings = colorSettings;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JRadioButtonMenuItem){
			colorSettings.changeColor(e.getActionCommand());
			
			if(e.getActionCommand().equals("About")){
				JOptionPane.showMessageDialog(null, "uDoDo");
			}
		}
		
	}

}
