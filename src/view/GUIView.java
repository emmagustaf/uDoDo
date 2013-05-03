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
	private JPanel headerPanel = new JPanel();
	private JPanel listPanel = new JPanel();
	private JPanel categoryPanel = new JPanel();
	private JPanel topPanel = new JPanel();
	
	/**
	 * Creates the frame.
	 */
	
	public GUIView(HeaderView header, ListView list, CategoryView cat, TopView top, CategoryListView listView) {
		
		this.header = header;
		this.list = list;
		this.cat=cat;
		this.top=top;
		this.listView = listView;
		
		this.setMinimumSize(new Dimension(550, 302));
		this.setBackground(GraphicConstants.BACKGROUND);
		
		headerPanel.setMinimumSize(new Dimension(397, 62));
		headerPanel.setBackground(GraphicConstants.BACKGROUND);
		
		categoryPanel.setMinimumSize(new Dimension(153, 240));
		categoryPanel.setBackground(GraphicConstants.BACKGROUND);
		
		listPanel.setMinimumSize(new Dimension(397, 240));
		listPanel.setBackground(GraphicConstants.BACKGROUND);
		
		topPanel.setMinimumSize(new Dimension(550, 62));
		topPanel.setBackground(GraphicConstants.BACKGROUND);
		
		
		FlowLayout flowLayout = (FlowLayout) listPanel.getLayout();
		
		headerPanel.add(header);
		listPanel.add(list);
		categoryPanel.add(cat);
		topPanel.add(top);
		
		this.setLayout(new BorderLayout(4, 4));
		this.add(topPanel, BorderLayout.NORTH);
		this.add(headerPanel, BorderLayout.NORTH);
		this.add(listPanel, BorderLayout.CENTER);
		this.add(categoryPanel, BorderLayout.WEST);
		this.setVisible(true);
		
	}	
}