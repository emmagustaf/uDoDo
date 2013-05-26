package utility;

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
			TaskPanel panel = new TaskPanel(AllTaskListModel.getInstance().get(i));
			TaskController taskController = new TaskController(listView, panel, taskSettingView, catListView);
			panel.setController(taskController);

			//listView.panelInScroll.add(panel);
			
			for (int j = 0; j < AllCategoryListModel.getInstance().size(); j++) {
				AddedCategoryPanel catPanel = new AddedCategoryPanel(AllCategoryListModel.getInstance().get(j));
				if (catPanel.getTitle() != null) {
					CategoryPanelController catPanelController = new CategoryPanelController(
							taskSettingView, catPanel, catListView, listView);

					catPanel.setController(catPanelController);
					panel.getModel().getCategory();
					catPanel.getModel().getTaskList().add(panel.getModel());
					catListView.panel.add(catPanel);
					
					
					
					if(panel.getModel().getCategory().getCatTitle().equals("Finished Tasks")){
						FinishedTaskList.getInstance().add(panel.getModel());
					}
				}
			}
		}
	}
}
