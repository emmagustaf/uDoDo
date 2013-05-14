package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.*;
import view.*;

public class EditController implements ActionListener{
	private ListView listView;
	private TaskSettingView settingView;
	private EditTaskPanel editTaskPanel;
	private EditModel editModel;
	
	public EditController(ListView listView, TaskSettingView settingView, EditTaskPanel editTaskPanel, EditModel editModel){
		this.listView = listView;
		this.settingView = settingView;
		this.editTaskPanel=editTaskPanel;
		this.editModel=editModel;
		editTaskPanel.setController(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton){
			
//			DisplayTaskPanel panel = (DisplayTaskPanel)((JButton) e.getSource()).getParent();
//			TaskModel model = panel.getTaskModel();
		
			if(e.getActionCommand().equals("cancel")){
				System.out.println("Entered action commant in cancel.");
				editModel.cancelChanges(settingView);
				listView.updateView();
				
			}else if(e.getActionCommand().equals("save")){
				editModel.saveChanges(editTaskPanel);
				settingView.updateView();
				listView.updatePanels();
				listView.updateView();
			}
		}
		
	}
	
	
}