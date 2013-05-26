package utility;

import java.awt.Component;
import java.sql.Array;
import java.util.ArrayList;

import com.sun.org.apache.xpath.internal.operations.Equals;

import model.AllTaskListModel;
import view.*;
import model.*;
import controller.*;

public class FileToProgram {

	public static void savedToList(ListView listView,
			CategoryListView catListView, TaskSettingView taskSettingView) {

		Read.readFromFile();
		Read.readCategories();
		Read.readFinishedTasks();

		for (int i = 0; i < AllTaskListModel.getInstance().size(); i++) {
			boolean getLucky = false;
			
			TaskPanel panel = new TaskPanel(AllTaskListModel.getInstance().get(
					i));
			TaskController taskController = new TaskController(listView, panel,
					taskSettingView, catListView);
			panel.setController(taskController);
			
			// listView.panelInScroll.add(panel);

			for(int k = 0; k<AllCategoryListModel.getInstance().size(); k++)
			{
				CategoryModel cm = AllCategoryListModel.getInstance().get(k);
				if(cm.getCatTitle().equals(panel.getModel().getCategory().getCatTitle())){
					StartCategoryPanel cPanel = new AddedCategoryPanel(cm);
					CategoryPanelController catPanelController = new CategoryPanelController(
							taskSettingView, cPanel, catListView, listView);
					cPanel.setController(catPanelController);
					catListView.panel.add(cPanel);
					getLucky = true;
					break;
				}
			}
			
			/*for (int j = 0; j < AllCategoryListModel.getInstance().size(); j++) {
				StartCategoryPanel catPanel = new AddedCategoryPanel(
						AllCategoryListModel.getInstance().get(j));
				
				CategoryModel [] catList = new CategoryModel[AllCategoryListModel.getInstance().size()];
				if (catPanel.getTitle() != null) {
					CategoryPanelController catPanelController = new CategoryPanelController(
							taskSettingView, catPanel, catListView, listView);
					
//					for(int k = 0; k<AllCategoryListModel.getInstance().size(); k++){
//						catList[k]=AllCategoryListModel.getInstance().get(k);
//						StartCategoryPanel catPanel2 = new AddedCategoryPanel(catList[k]);
//						catListView.panel.add(catPanel2);
//					
//						catPanel2.setController(catPanelController);
//					}
					
					if (catPanel.getModel().getCatTitle().equals(panel.getModel().getCategory().getCatTitle())) {
						catPanel.getModel().getTaskList().add(panel.getModel());
						//catListView.panel.add(catPanel);
						if(!catList[j].equals(AllCategoryListModel.getInstance().get(j))){
							catList[j].setController(catPanelController);
						}
					}

					if (panel.getModel().getCategory().getCatTitle().equals("Finished Tasks")) {
						FinishedTaskList.getInstance().add(panel.getModel());
					}
				}
			}*/
		}
	}
}
