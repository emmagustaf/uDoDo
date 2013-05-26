package view;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.TaskController;
import model.CategoryModel;
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
	 * Create the listview as scolpane and with a new panel to show in it.
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
		panelInScroll.validate();
		panelInScroll.repaint();
		
		this.revalidate();
		this.repaint();
		
	}	
	
	/**
	 * Updates the task panels in list view with the task models data.
	 */
	public void updatePanels(){
		
		Component[] taskPanels = new Component[panelInScroll.getComponents().length]; //List containing the panels in the view at the moment.
		taskPanels = (Component[]) panelInScroll.getComponents();

		for(int i=0; i<taskPanels.length; i++){		//loops through the panels in the view.
			((TaskPanel)taskPanels[i]).setTitle();
			((TaskPanel)taskPanels[i]).setDeadline();
			taskPanels[i].validate();
			taskPanels[i].repaint();
		}
		
	}
	
	/**
	 * To show tasks for a spesific category
	 * @param catModel the categorymodel to get the tasks from
	 * @param taskSetting the setting to the controller for the task
	 * @param catListView the lisview to the controller for the task
	 */
	public void displayTasks(CategoryModel catModel, TaskSettingView taskSetting, CategoryListView catListView){
		
		panelInScroll.removeAll();
		
		int size = catModel.getTaskList().size();
		
		for(int i = size - 1; i >= 0; i = i - 1){
			
			TaskPanel taskPanel = new TaskPanel(catModel.getTaskList().get(i));
			
			panelInScroll.add(taskPanel);
			
			TaskController taskController = new TaskController(this, taskPanel, taskSetting, catListView);
			
			this.updateView();
		}
		
	}
	
}
