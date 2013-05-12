package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;





import view.*;

import model.DisplayModel;
import model.EditModel;
import view.EditTaskPanel;

public class DisplayController implements ActionListener{
	private TaskSettingView settingView;
	private DisplayTaskPanel displayTaskPanel;
	private MouseMethods listener = new MouseMethods();
	
	
	public DisplayController(TaskSettingView settingView, DisplayTaskPanel displayTaskPanel){
		this.settingView=settingView;
		this.displayTaskPanel=displayTaskPanel;
		displayTaskPanel.setController(this);
		this.displayTaskPanel.addMouseListener(listener);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Entered action preformed");
		
		if(e.getSource() instanceof DisplayModel){
			DisplayModel model = (DisplayModel) e.getSource();
			
			if("editButton".equals(e.getActionCommand())){
				EditModel editModel = new EditModel();
				EditTaskPanel editTaskPanel = new EditTaskPanel(model.getTaskModel());
				settingView.removeAll();
				settingView.add(editTaskPanel);
				settingView.updateView();

			}
		}
		
		
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
