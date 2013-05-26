package utility;

import java.awt.Component;

import model.AllTaskListModel;
import view.*;
import model.*;
import controller.*;
public class FileToProgram {
	
	public static void SavedToList(ListView listView, CategoryListView catListView, TaskSettingView taskSettingView){
	
		Read.readFromFile();

		
		for(int i=0; i<AllTaskListModel.getInstance().size(); i++){
			TaskPanel panel= new TaskPanel(AllTaskListModel.getInstance().get(i));
			TaskController taskController = new TaskController(listView, panel, taskSettingView, catListView);
			panel.setController(taskController);
				
			listView.panelInScroll.add(panel);
			
		}
		
	}
}
