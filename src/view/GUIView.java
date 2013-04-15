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
	 * Create the frame.
	 */
	public GUIView(HeaderView header, ListView list) {
		this.header = header;
		this.list = list;

		//TODO create panels to add panels in?
		//TODO instances from the classes HeaderView and ListView should be added to the GUI. 
	}
	


}
