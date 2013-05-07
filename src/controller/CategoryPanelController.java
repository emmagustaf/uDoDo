package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.*;

public class CategoryPanelController implements ActionListener, MouseListener {
	private CategoryPanel categoryPanel;
	
	//create a categorypanel which will be added in categoryListView
	public CategoryPanelController(CategoryPanel categoryPanel){
		this.categoryPanel=categoryPanel;
		categoryPanel.setController(this);
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() instanceof CategoryPanel){
			//categoryPanel.getModel();
			//om den här metoden körs ska alla tasks som tillhör categorypanelns category visas i ListView
		}
		
	}

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
	
}
