package controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JPanel;

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
	private StartCategoryPanel startCategoryPanel;
	
	/**
	 * Create a categorypanel which will be added in categoryListView
	 * @param categoryPanel
	 * @param catListView
	 */
	public CategoryPanelController(StartCategoryPanel startCategoryPanel, CategoryListView catListView){
		this.catListView=catListView;
		this.startCategoryPanel = startCategoryPanel;
		startCategoryPanel.setController(this);

		
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() instanceof JComponent){
			if(e.getActionCommand().equals("delete Category")){
				catListView.panel.remove(startCategoryPanel);
				catListView.updateView();
			}
			
		}
	}
	
	/**
	 * Mouseclicked-events for when the user clicks on categorypanels
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() instanceof StartCategoryPanel){
			catListView.markCategory((StartCategoryPanel)e.getComponent());
			e.getComponent().setBackground(GraphicConstants.BUTTONPRESSED);
			((StartCategoryPanel)e.getComponent()).setTextColor(GraphicConstants.BUTTONPRESSEDFOREGROUND);
			
			if(!catListView.getLastMarkedList().isEmpty()){
				catListView.getLastMarkedPanel().setBackground(GraphicConstants.BACKGROUND);
				catListView.getLastMarkedPanel().setTextColor(GraphicConstants.FOREGROUND);
			}
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
		if(catListView.getMarkedList().isEmpty() || !isSelected(arg0.getComponent())){ 
			arg0.getComponent().setBackground(GraphicConstants.BUTTONHOVER);
			
		}
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
		if(catListView.getMarkedList().isEmpty() || !isSelected(arg0.getComponent())){
			arg0.getComponent().setBackground(GraphicConstants.BACKGROUND);
			
		}else{
			catListView.markLastCategory((StartCategoryPanel)arg0.getComponent());
		}
		
	}
	
	@Override
	public void mousePressed(MouseEvent arg0) {

		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isSelected(Component comp){
		
		if(comp instanceof StartCategoryPanel){
			return catListView.getMarkedPanel().equals((StartCategoryPanel)comp);
			
		}else{
			return false;
		}
		
	}
	
}
