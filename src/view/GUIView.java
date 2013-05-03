package view;

import java.awt.*;
import javax.swing.*;
import utility.*;
public class GUIView extends JPanel {
	private HeaderView header;
	private ListView list;
	private CategoryView cat;
	private JPanel headerPanel = new JPanel();
	private JPanel listPanel = new JPanel();
	private JPanel categoryPanel = new JPanel();
	
	/**
	 * Creates the frame.
	 */
	
	public GUIView(HeaderView header, ListView list, CategoryView cat) {
		this.header = header;
		this.list = list;
		this.cat=cat;	
		this.setMinimumSize(new Dimension(550, 302));
		
		headerPanel.setMinimumSize(new Dimension(550, 62)); 
		categoryPanel.setMinimumSize(new Dimension(153, 240));
		listPanel.setMinimumSize(new Dimension(397, 240));
		headerPanel.add(header);
		FlowLayout flowLayout = (FlowLayout) listPanel.getLayout();
		listPanel.add(list);
		categoryPanel.add(cat);
		setLayout(new BorderLayout(3, 3));
		add(headerPanel, BorderLayout.NORTH);
		add(listPanel, BorderLayout.CENTER);
		add(categoryPanel, BorderLayout.WEST);
		setVisible(true);
		
	}	
}