package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utility.*;

import view.*;

public class TopController implements ActionListener {
	
	private ColorSettings settings;
	private TopView topView;

	public TopController(TopView topView, ColorSettings settings) {
		topView.setController(this);
		this.topView = topView;
		this.settings = settings;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("gray")) {
			settings.changeColor("Greyhound");
		
		} else if (e.getActionCommand().equals("green")) {
			settings.changeColor("Green disease");
		
		} else if (e.getActionCommand().equals("yellow")) {
			settings.changeColor("Yellow submarine");
		
		} else if (e.getActionCommand().equals("purple")) {
			settings.changeColor("Purple haze");
		
		} else if (e.getActionCommand().equals("blue")) {
			settings.changeColor("Blue jean");
		
		}
		
	}
	
	

}
