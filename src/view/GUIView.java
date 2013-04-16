package view;

import java.awt.*;
<<<<<<< HEAD
import java.awt.Event.*;
=======
>>>>>>> 8f70487c55a96f3fc3ffe6157a3bcd9de7e07959
import javax.swing.*;

public class GUIView extends JPanel {

	private HeaderView header;
	private ListView list;
	private JPanel headerPanel = new JPanel();
	private JPanel listPanel = new JPanel();
	
	
	/**
	 * Creates the frame.
	 */
	public GUIView(HeaderView header, ListView list) {
		this.header = header;
		this.list = list;
		headerPanel.add(header);
		listPanel.add(list);
		setLayout(new BorderLayout(0, 0));

		add(headerPanel, BorderLayout.NORTH);
		add(listPanel, BorderLayout.CENTER);
				
		setVisible(true);

		}
	
}
