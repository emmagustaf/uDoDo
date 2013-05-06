package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;

import view.GUIView;

import model.DisplayModel;
import view.EditView;

public class DisplayController implements ActionListener{
	private EditView editView;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof DisplayModel){
//			DisplayModel model = (DisplayModel) e.getSource();
			if("editButton".equals(e.getActionCommand())){
				editView.setVisible(true);
			}
		}
				
	}

}
