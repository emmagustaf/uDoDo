package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUIView extends JPanel {

	private HeaderView header;
	private ListView list;

	/**
	 * Creates the frame.
	 */
	public GUIView(HeaderView header, ListView list) {
		this.header = header;
		this.list = list;
		setLayout(new BorderLayout(0, 0));
		add(header, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		TaskPanel panel = new TaskPanel(null);
	
		list.add(panel);
		repaint();

		//TODO create panels to add panels in?
		//TODO instances from the classes HeaderView and ListView should be added to the GUI. 
	}
	


}
