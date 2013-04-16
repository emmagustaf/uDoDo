package view;

import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;

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
		
		JPanel taskPresenter = new JPanel();
		TaskPanel panel = new TaskPanel(null);
		add(taskPresenter, BorderLayout.CENTER);
		taskPresenter.add(panel);
		this.pack();
		repaint();

		//TODO create panels to add panels in?
		//TODO instances from the classes HeaderView and ListView should be added to the GUI. 
	}
	


}
