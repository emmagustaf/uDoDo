package utility;

import java.awt.Component;
import java.sql.Array;
import java.util.ArrayList;

import com.sun.org.apache.xpath.internal.operations.Equals;

import model.AllCategoryListModel;
import model.AllTaskListModel;
import model.CategoryModel;
import model.FinishedTaskList;
import view.*;
import modeltest.*;
import controller.*;

public class FileToProgram {

	public static void savedToList(ListView listView,
			CategoryListView catListView, TaskSettingView taskSettingView) {

		Read.readFromFile();
		Read.readCategories();
		Read.readFinishedTasks();

		for (int i = 0; i < AllTaskListModel.getInstance().size(); i++) {
			boolean getLucky = false;
			
			TaskPanel panel = new TaskPanel(AllTaskListModel.getInstance().get(i));
			TaskController taskController = new TaskController(listView, panel,
					taskSettingView, catListView);
			panel.setController(taskController);
			panel.getModel().getCategory();

			for(int k = 0; k<AllCategoryListModel.getInstance().size(); k++)
			{
				CategoryModel cm = AllCategoryListModel.getInstance().get(k);
				if(cm.getCatTitle().equals(panel.getModel().getCategory().getCatTitle())){
					StartCategoryPanel cPanel = new AddedCategoryPanel(cm);
					CategoryPanelController catPanelController = new CategoryPanelController(
							taskSettingView, cPanel, catListView, listView);
					catListView.panel.add(cPanel);
					cPanel.setController(catPanelController);
					getLucky = true;
					
					if (cPanel.getModel().getCatTitle().equals(panel.getModel().getCategory().getCatTitle())) {
						cPanel.getModel().getTaskList().add(panel.getModel());
						
					}
					
				
				}
				
				if (panel.getModel().getCategory().getCatTitle().equals("Finished Tasks")) {
						FinishedTaskList.getInstance().add(panel.getModel());
				}
			}
			
		}
	
	}
}

