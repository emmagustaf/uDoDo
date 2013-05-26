package utility;

import model.AllTaskListModel;
import view.*;

public class FileToProgram {
	private ListView listView;
	public void TaskToList(ListView listView){
		this.listView=listView;
		Read.readFromFile();
		for(int i=0; i<AllTaskListModel.getInstance().size(); i++){
			TaskPanel panel= new TaskPanel(AllTaskListModel.getInstance().get(i));
			listView.panelInScroll.add(panel);
			listView.updateView();
		}
	}
}
