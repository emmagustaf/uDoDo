package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

import view.*;

import model.DisplayModel;
import model.EditModel;

public class DisplayController implements ActionListener, MouseListener{
	private TaskSettingView settingView;
	private DisplayTaskPanel displayTaskPanel;
	//private MouseMethods listener = new MouseMethods();
	
	
	public DisplayController(TaskSettingView settingView, DisplayTaskPanel displayTaskPanel){
		this.settingView=settingView;
		this.displayTaskPanel=displayTaskPanel;
		displayTaskPanel.setController(this);
		displayTaskPanel.addMouseListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Entered action preformed");
		
		if(e.getSource() instanceof DisplayModel){ 
			DisplayModel model = (DisplayModel) e.getSource();
		
			if(e.getSource() instanceof JComponent){
				if(e.getActionCommand().equals("editTask")){
					System.out.println("Pressed editbutton");
					
					EditModel editModel = new EditModel();
					EditTaskPanel editTaskPanel = new EditTaskPanel(model.getTaskModel());
					settingView.removeAll();
					settingView.add(editTaskPanel);
					settingView.updateView();
				}
			}
		}
		
		
//		if(e.getSource() instanceof JComponent){
//			if(e.getActionCommand.equals("editTask")){
//				editView.setVisible(true);
//			}
				
	}
	
//	private class MouseMethods implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource() instanceof DisplayTaskPanel){
				System.out.println("Clicked Panel");
				
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			displayTaskPanel.setBackground(Color.blue);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			displayTaskPanel.setBackground(Color.white);			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
//	}

}
