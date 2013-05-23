package view;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import utility.*;

/**
 * This view-class is the base of a window. It will add panels to create a GUI
 * 
 *
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
	 * Create the frame.
	 */
	
	public GUIView(HeaderView header, ListView list, CategoryView cat, TopView top, CategoryListView listView, TaskSettingView taskSettings) {
				
		this.addViewsToList(header, list, cat, top, listView, taskSettings);
		
		
		this.setMinimumSize(new Dimension(700, 750));
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		categoryPanel.setBackground(Color.yellow);
		listPanel.setBackground(Color.green);
		topPanel.setBackground(Color.ORANGE);																						
		topPanel.setBackground(Color.pink);
		taskSettingPanel.setBackground(Color.CYAN);
		this.addPanelsToList();
	
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
	
	public void updateGUI(){
		this.revalidate();
		this.validate();
		this.repaint();
	}
	
	public List<JPanel> getPanels(){
		return panelList;
		
		
	}
	
	public void addPanelsToList(){
		panelList.add(categoryListPanel);
		panelList.add(headerPanel);
		panelList.add(categoryPanel);
		panelList.add(listPanel);
		panelList.add(topPanel);
		panelList.add(taskSettingPanel);
		panelList.add(displayPanel);
		
	}
	
	public void addViewsToList(HeaderView header, ListView list, CategoryView cat, TopView top, CategoryListView listView, TaskSettingView taskSettings) {
			
		viewList.add(list);
		viewList.add(listView);
		viewList.add(taskSettings);
		viewList.add(header);
		viewList.add(cat);
		viewList.add(top);
		
	}
	
	
	public List<JComponent> getViews(){
		
		return viewList;
		
	}
	
}