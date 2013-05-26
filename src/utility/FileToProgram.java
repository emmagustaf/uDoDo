package utility;

import model.AllTaskListModel;
import view.*;
import model.*;
import controller.*;
public class FileToProgram {
	
	public static void SavedToList(ListView listView, CategoryListView catListView){
	
		Read.readFromFile();
		CategoryModel catModel;
		//TaskController taskController = new TaskController();
		for(int i=0; i<AllTaskListModel.getInstance().size(); i++){
			TaskPanel panel= new TaskPanel(AllTaskListModel.getInstance().get(i));
			
			catModel=panel.getModel().getCategory();
			AddedCategoryPanel catPanel = new AddedCategoryPanel(catModel);
			
			//panel.setController(taskController);
			
			catListView.panel.add(catPanel);
			listView.panelInScroll.add(panel);
			
			listView.updateView();
		}
		
	}
}
