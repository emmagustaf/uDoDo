package controller;


import model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskController implements ActionListener {

	public TaskController(){
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof TaskModel){
			TaskModel model = (TaskModel) e.getSource();
			if(e.getActionCommand().equals("taskCheck")){
				model.changeState();
			}
			
		}
		
	}


}
