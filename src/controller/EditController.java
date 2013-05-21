package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import calendar.JCalendar;
import calendar.JDateTextField;

import model.*;
import view.*;

public class EditController implements ActionListener{
	private ListView listView;
	private TaskSettingView settingView;
	private EditTaskPanel editTaskPanel;
	private EditModel editModel;
	private DisplayTaskPanel displayTaskPanel;
	private DisplayController displayController;
	private Calendar calendar;
	private JDateTextField text = new JDateTextField();
	
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
				toDisplayTask();
				System.out.println("Entered action commant in cancel.");
				settingView.updateView();
				listView.updateView();
				
				
			}else if(e.getActionCommand().equals("save")){
				saveChanges();
				settingView.updateView();
				listView.updatePanels();
				listView.updateView();
			}else if(e.getActionCommand().equals("calendar")){
				
				editTaskPanel.getCalendar().setVisible(true);
				editTaskPanel.getCalendar().setEnabled(true);
				if(editTaskPanel.getCalendar().isOkPressed()){
					Date date = new Date();
//					editTaskPanel.getCalendar().setCalendar(calendar);
					editTaskPanel.getCalendar().setDate(date);
					//editTaskPanel.getJDateTextField().setCalendar(editTaskPanel.getCalendar().getCalendar());
					editTaskPanel.getJDateTextField().setDate(date);
					editTaskPanel.getTaskModel().setDeadline(editTaskPanel.getJTextField().getText());
					
					System.out.println(""+ editTaskPanel.getJTextField().getText() + editTaskPanel.getTaskModel().getDeadline());
				}
				settingView.updateView();
				
			}
		}
		
	}
	
	private void toDisplayTask(){
		settingView.panelInScroll.removeAll();
		DisplayModel model = new DisplayModel(editTaskPanel.getTaskModel());
		displayTaskPanel = new DisplayTaskPanel(model, editTaskPanel.getTaskModel());
		displayController = new DisplayController(listView, settingView, displayTaskPanel);
		settingView.panelInScroll.add(displayTaskPanel);
	}
	
	private void saveChanges(){
		editTaskPanel.getTaskModel().setTitle(editTaskPanel.getTitleTextField());
		editTaskPanel.getTaskModel().setDescription(editTaskPanel.getDescriptionTextField());
		editTaskPanel.getTaskModel().setDeadline(editTaskPanel.getJDateTextField().getText());		
		listView.updatePanels();
		toDisplayTask();
	}
	
	
}