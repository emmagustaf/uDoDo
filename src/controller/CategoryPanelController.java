package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

import utility.GraphicConstants;
import view.*;

/**
 * A class to represent a controller for the CategoryPanel.
 * @author Hanna
 *
 */
public class CategoryPanelController implements ActionListener, MouseListener {
	private AddedCategoryPanel categoryPanel;
	private CategoryListView catListView;
	private StartCategoryPanel startCategoryPanel = new StartCategoryPanel(null);;
	/**
	 * Create a categorypanel which will be added in categoryListView
	 * @param categoryPanel
	 * @param catListView
	 */
	public CategoryPanelController(AddedCategoryPanel categoryPanel, CategoryListView catListView){
		this.categoryPanel= categoryPanel;
		categoryPanel.setController(this);
		this.catListView=catListView;
		
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() instanceof JComponent){
			if(e.getActionCommand().equals("delete Category")){
				catListView.panel.remove(categoryPanel);
				catListView.updateView();
			}
			
		}
	}
	
	/**
	 * Mouseclicked-events for when the user clicks on categorypanels
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource() instanceof AddedCategoryPanel){
			catListView.markCategory(categoryPanel);
			//om den här metoden körs ska alla tasks som tillhör categorypanelns category visas i ListView,
			//och categorymodelens status ska ändras till markerad, samtidigt som om det finns en categorypanel med 
			//status markerad ska denna göras omarkerad (alltså med en metod för detta i categorymodel)
			//man kanske kan lösa detta genom att lägga in de cats som klickats på i en lista, och så tar man fram den
			//caten som senast lagts till i listan
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		arg0.getComponent().setBackground(Color.white);
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		arg0.getComponent().setBackground(GraphicConstants.BACKGROUND);
	
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
