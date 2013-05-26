package utility;

import model.AllTaskListModel;
import view.*;
import model.*;
import controller.*;
public class FileToProgram {
	
	public static void SavedToList(ListView listView, CategoryListView catListView){
	
		Read.readFromFile();
		CategoryModel catModel;
		TaskSettingView taskSettingView = new TaskSettingView();
		
		for(int i=0; i<AllTaskListModel.getInstance().size(); i++){
			TaskPanel panel= new TaskPanel(AllTaskListModel.getInstance().get(i));
			TaskController taskController = new TaskController(listView, panel, taskSettingView, catListView);
			catModel=panel.getModel().getCategory();
			AddedCategoryPanel catPanel = new AddedCategoryPanel(catModel);
			
			CategoryPanelController catController = new CategoryPanelController(taskSettingView, catPanel, catListView, listView);
		
			panel.setController(taskController);
			catPanel.setController(catController);
			
			catListView.panel.add(catPanel);
			listView.panelInScroll.add(panel);
			
			listView.updateView();
		}
		
	}
}
