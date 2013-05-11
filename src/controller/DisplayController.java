package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



import javax.swing.JComponent;

import view.GUIView;

import model.DisplayModel;
import view.EditTaskPanel;

public class DisplayController implements ActionListener{
	private EditTaskPanel editView;
	@Override
	public void actionPerformed(ActionEvent e) {
		//if(e.getSource() instanceof DisplayModel){
  //		DisplayModel model = (DisplayModel) e.getSource();
			//if("editButton".equals(e.getActionCommand())){
				//editView.setVisible(true);
			//}
		//}
		
		
//		if(e.getSource() instanceof JComponent){
//			if(e.getActionCommand.equals("editTask")){
//				editView.setVisible(true);
//			}
				
	}
	private class MouseMethods implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}

}
