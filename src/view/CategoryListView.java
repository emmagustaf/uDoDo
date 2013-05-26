package view;

import java.awt.Dimension;
import java.util.ArrayDeque;
import java.util.Deque;

import utility.GraphicConstants;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Model.CategoryModel;


/**
 * A class to keep a graphical list of panels each representing a category.
 * The list will be represented in a scroll pane.
 *
 */

public class CategoryListView extends JScrollPane{ 
	
	/**
	 * 	Create a panel that will be the actual container 
	 *	 for the added category panels 
	 */
	
	public JPanel panel;
	
	private CategoryModel defaultCategory;
	private StartCategoryPanel finishedCategory;
	
	//Deque containing categorypanels. 
	//Used to get information about marked and last marked categorys.
	private Deque<StartCategoryPanel> catDeque = new ArrayDeque<StartCategoryPanel>();
	private Deque<StartCategoryPanel> lastCatDeque = new ArrayDeque<StartCategoryPanel>();
	
	/**
	 * 	Set all the graphical data for the scrollpane
	 */
	public CategoryListView(){
		

		this.setMinimumSize(new Dimension(210, 500));
		this.setMaximumSize(new Dimension(210, 500));
		this.setPreferredSize(new Dimension(210, 500));
		this.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
		this.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
		this.setBackground(GraphicConstants.BACKGROUND);
		
		//The panel to view in scroll pane
		panel = new JPanel();
		panel.setBackground(GraphicConstants.BACKGROUND);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS ));

		//set panel visible in viewport
		getViewport().setView(panel);
			
	}
	
	/**
	 *  Update method that will be invoked each time anything is changed in the view
	 */
	public void updateView(){
		
		panel.revalidate();
		panel.repaint();
		panel.validate();
		
		this.revalidate();
		this.repaint();
		this.setVisible(true);
	}
	
	
	/**
	 * Sets a default category to use when creating new tasks in HeaderController
	 * in case no category panel is marked
	 */
	public void setDefaultCategory(CategoryModel catModel){
		this.defaultCategory = catModel;		//in this case default category is All tasks.
		
	}
	
	/**
	 * Returns the default category
	 * @return the default StartCategoryPanel
	 */
	public CategoryModel getDefaultCategory(){
		return defaultCategory;
	}
	
	/**
	 * sets the category finished tasks
	 * @param categoryPanel the category finished task
	 */
	public void setFinishedCategory(StartCategoryPanel categoryPanel){
		this.finishedCategory = categoryPanel;
		
	}
	
	/**
	 * get the category finished tasks
	 * @return finishedCategory the category finished task
	 */
	public StartCategoryPanel getFinishedCategoryPanel(){
		return finishedCategory;
		
	}
	
	/**
	 * Marks a category panel in the deque.
	 * @param catPanel the category to be marked
	 */
	public void markCategory(StartCategoryPanel catPanel){
		
		catDeque.addFirst(catPanel);
		
		//Stops the list to grow.
		if(catDeque.size() >= 2){ 
			catDeque.removeLast();
		}
	}
	
	/**
	 * Returns the marked category panel from deque
	 * @return category the category which is marked
	 */
	
	public StartCategoryPanel getMarkedPanel(){
		
		//The first category in the deque is the marked category
		//Returns null if no category have been marked since the program started.
		if(catDeque.getFirst().equals(null)){
			return null;
		}else{
			return catDeque.getFirst();
		}
	}
	
	/**
	 * Marks the panel as last marked
	 * @param catPanel the category which was marked last
	 */
	public void markLastCategory(StartCategoryPanel catPanel){
		
		lastCatDeque.addFirst(catPanel);
		
		if(lastCatDeque.size() >= 2){
			lastCatDeque.removeLast();
		}
		
	}
	
	/**
	 * gets the category which was marked last
	 * @return categoryPanel the category which was marked last.
	 */
	public StartCategoryPanel getLastMarkedPanel(){
		
		//Returns null if no category have been marked since the program started.
		if(lastCatDeque.getFirst().equals(null)){
			return null;
		}else{
			
			return lastCatDeque.getFirst();
		}
	}
	
	/**
	 * the list that contains the category which is marked
	 * @return catDeque the list with marked panels
	 */
	public Deque<StartCategoryPanel> getMarkedList(){
		return catDeque;
		
	}
	
	/**
	 * the list that contains the category which was marked last
	 * @return lastCatDeque the last marked category
	 */
	public Deque<StartCategoryPanel> getLastMarkedList(){
		return lastCatDeque;
		
	}
	
}
