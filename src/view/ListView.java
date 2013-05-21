package view;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import utility.*;
import java.awt.*;
/**
 * A class to represent a the view which will interact 
 * with the user when adding tasks.
 *
 */
public class ListView extends JScrollPane {
	
	public JPanel panelInScroll;
	
	/**
	 * Create the listview with a new panel in it.
	 */
	public ListView() {
		
		this.setBackground(GraphicConstants.BACKGROUND);
		this.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
		this.setMinimumSize(new Dimension (300, 500));
		this.setMaximumSize(new Dimension (300, 500));
		this.setPreferredSize(new Dimension (300, 500));

		panelInScroll = new JPanel();
		panelInScroll.setBackground(GraphicConstants.BACKGROUND);
		panelInScroll.setLayout(new BoxLayout(panelInScroll, BoxLayout.Y_AXIS));
		
		getViewport().setView(panelInScroll);
		
	}
	
	/**
	 * Updates the the view, except every individual task panels in the view.
	 */
	public void updateView(){
		
		panelInScroll.revalidate();
		panelInScroll.repaint();
		
		this.revalidate();
		this.repaint();
	}	
	
	/**
	 * Updates the task panels in list view with the task models data. 
	 */
	public void updatePanels(){
		
		Component[] taskPanels = new Component[panelInScroll.getComponents().length];
		taskPanels = (Component[]) panelInScroll.getComponents();

		for(int i=0; i<taskPanels.length; i++){
			((TaskPanel)taskPanels[i]).setTitle();
			((TaskPanel)taskPanels[i]).setDeadline();
			taskPanels[i].validate();
			taskPanels[i].repaint();
		}
	}
	
	public void displayTasks(StartCategoryPanel catPanel){
		
		int size = catPanel.getModel().getTaskList().size();
		
		for(int i = size - 1; i >= 0; i = i - 1){
			
			this.add(catPanel.getModel().getTaskList().get(i));
		}
		
		this.updatePanels();
		this.updateView();
	}
	
	public void hideTasks(CategoryListView catListView){
		
		if(!catListView.getLastMarkedList().isEmpty()){
			
			int size = catListView.getLastMarkedPanel().getModel().getTaskList().size();
			
			for(int i = size - 1; i >= 0; i = i - 1){
				this.remove(catListView.getLastMarkedPanel().getModel().getTaskList().get(i));
			}
		}
		this.updatePanels();
		this.updateView();
	}
}
