package view;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import utility.*;

/**
 * This view-class is the container of all panels. It will add and organize panels to create a GUI
 */
public class GUIView extends JPanel {
	private HeaderView header;
	private ListView list;
	private CategoryView cat;
	private TopView top;
	private CategoryListView listView;
	private TaskSettingView taskSettings;
	private JPanel headerPanel = new JPanel();
	private JPanel listPanel = new JPanel();
	private JPanel categoryPanel = new JPanel();
	private JPanel categoryListPanel = new JPanel();
	private JPanel topPanel = new JPanel();
	private JPanel taskSettingPanel = new JPanel();
	private JPanel displayPanel = new JPanel();
	private List<JPanel> panelList = new ArrayList<JPanel>();
	private List<JComponent> viewList = new ArrayList<JComponent>();
	
	/**
	 * Create the container panel
	 */
	
	public GUIView(HeaderView header, ListView list, CategoryView cat, TopView top, CategoryListView listView, TaskSettingView taskSettings) {
				
		this.addViewsToList(header, cat, top);
		this.setMinimumSize(new Dimension(700, 750));
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		this.addPanelsToList();
	
		//the GridBag to organize the placing of the panels in the container.
		topPanel.add(top);     
		c.weightx = 0.0;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 0;
		add(topPanel, c);
		
		categoryPanel.add(cat);
		c.weightx = 0.0;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		add(categoryPanel, c);

		categoryListPanel.add(listView);	
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 2;
		add(categoryListPanel, c);
		
		listPanel.add(list);
		c.weightx = 0.0;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 2;
		add(listPanel, c);		
		
		headerPanel.add(header);
		c.weightx = 0.0;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 1;
		add(headerPanel, c);
		
		c.gridheight = 2;
		c.gridx = 2;
		c.gridy = 1;
		add(displayPanel, c);
		
		taskSettingPanel.add(taskSettings);
		c.gridheight = 2;
		c.gridwidth = 1;
		c.gridx = 2;
		c.gridy = 1;
		add(taskSettingPanel, c);
		
		this.updateGUI();
		this.setVisible(true);
		
	}	
	
	/**
	 * updates the container, not the components in the container
	 */
	public void updateGUI(){
		this.revalidate();
		this.validate();
		this.repaint();
	}
	
	/**
	 * @return list the list contains the panels to be colorchanged.
	 */
	public List<JPanel> getPanels(){
		return panelList;
		
		
	}
	/**
	 * adds the choosed panels to change color of.
	 */
	public void addPanelsToList(){
		panelList.add(headerPanel);
		panelList.add(categoryPanel);
		panelList.add(topPanel);
	}
	
	/**
	 * the Views to be colorchanged.
	 * @param header the headerView
	 * @param cat the categoryView
	 * @param top the topview
	 */
	public void addViewsToList(HeaderView header, CategoryView cat, TopView top) {
	
		viewList.add(header);
		viewList.add(cat);
		viewList.add(top);
		
	}
	
	/**
	 * @return the list containing the views to be updated.
	 */
	public List<JComponent> getViews(){
		return viewList;
	}
	
}