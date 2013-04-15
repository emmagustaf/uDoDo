package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUIView extends JFrame {

	private JPanel contentPane;
	private HeaderView header;
	private ListView list;

	/**
	 * Create the frame.
	 */
	public GUIView(HeaderView header, ListView list) {
		this.header = header;
		this.list = list;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		//TODO create panels to add panels in?
		//TODO instances from the classes HeaderView and ListView should be added to the GUI. 
	}
	


}
