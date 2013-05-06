package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.*;

public class CategoryPanelController implements ActionListener {
	private CategoryPanel categoryPanel;
	private MouseMethods listener = new MouseMethods();
	
	//create a categorypanel which will be added in categoryListView
	public CategoryPanelController(CategoryPanel categoryPanel){
		this.categoryPanel=categoryPanel;
		
		//categoryPanel.setController(this);
		categoryPanel.addMouseListener(listener);
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
	//add mouselistener to each categorypanel to show which one is in focus
	private class MouseMethods implements MouseListener{

		@Override
		public void mouseEntered(MouseEvent arg0) {
			categoryPanel.setBackground(Color.blue);
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			categoryPanel.setBackground(Color.white);
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	}
	
}
