package view;

import java.awt.*;

import javax.swing.*;
import utility.*;
public class GUIView extends JPanel {
	private HeaderView header;
	private ListView list;
	private CategoryView cat;
	private TopView top;
	private CategoryListView listView;
	private EditView editView;
	private JPanel headerPanel = new JPanel();
	private JPanel listPanel = new JPanel();
	private JPanel categoryPanel = new JPanel();
	private JPanel topPanel = new JPanel();
	private JPanel editPanel = new JPanel();
	private JPanel displayPanel = new JPanel();
	private JScrollPane listScroll = new JScrollPane();
	
	/**
	 * Create the frame.
	 */
	
	public GUIView(HeaderView header, ListView list, CategoryView cat, TopView top, CategoryListView listView, EditView editView) {
		
		this.header=header;
		this.list=list;
		this.cat=cat;
		this.top=top;
		this.listView = listView;
		this.editView=editView;
		this.listView=listView;
		
		this.setMinimumSize(new Dimension(640, 490));
		this.setBackground(GraphicConstants.BACKGROUND);
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//headerPanel.setMinimumSize(new Dimension(200, 62));
//		headerPanel.setBackground(Color.blue);
//		headerPanel.setPreferredSize(new Dimension(650, 100));
//		headerPanel.setMinimumSize(new Dimension(650, 100));
//		headerPanel.setMaximumSize(new Dimension(650, 100));
		
		//categoryPanel.setMinimumSize(new Dimension(200, 240));
		categoryPanel.setBackground(Color.yellow);
		
		//listPanel.setMinimumSize(new Dimension(150, 240));
		listPanel.setBackground(Color.green);
		
		//topPanel.setMinimumSize(new Dimension(630, 62));
		topPanel.setBackground(Color.ORANGE);
		
		
		//FlowLayout flowLayout = (FlowLayout) listPanel.getLayout();
		topPanel.add(top);
		//c.ipady = 40;      
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
		

		topPanel.add(top);
		//setLayout(new BorderLayout());
		//this.add(topPanel, BorderLayout.NORTH);
		//this.add(headerPanel, BorderLayout.CENTER);
		//this.add(listPanel, BorderLayout.SOUTH);
		//this.add(categoryPanel, BorderLayout.WEST);
		//this.add(editPanel, BorderLayout.EAST);
		

		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 2;
		add(listView, c);
		
		listScroll.add(list);
		//listScroll.add(listPanel);
		c.weightx = 0.0;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 2;
		add(listPanel, c);
		listPanel.add(listScroll);
		
		
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
		//setLayout(new BorderLayout());
		//this.add(topPanel, BorderLayout.NORTH);
//		this.add(headerPanel, BorderLayout.CENTER);
//		this.add(listPanel, BorderLayout.SOUTH);
//		this.add(categoryPanel, BorderLayout.WEST);
		revalidate();
		repaint();

		this.setVisible(true);
		
	}	
}