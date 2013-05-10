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
	public CategoryPanelController(CategoryPanel categoryPanel, CategoryListView catListView){
		this.categoryPanel=categoryPanel;
		categoryPanel.setController(this);
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() instanceof CategoryPanel){
			categoryPanel.getModel().markCategory();
			//om den h�r metoden k�rs ska alla tasks som tillh�r categorypanelns category visas i ListView,
			//och categorymodelens status ska �ndras till markerad, samtidigt som om det finns en categorypanel med 
			//status markerad ska denna g�ras omarkerad (allts� med en metod f�r detta i categorymodel)
			//man kanske kan l�sa detta genom att l�gga in de cats som klickats p� i en lista, och s� tar man fram den
			//caten som senast lagts till i listan
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
