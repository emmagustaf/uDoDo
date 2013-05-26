package utility;


import java.awt.*;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import view.GUIView;
import view.ListView;

public class ColorSettings {
	
	private GUIView view;

	public ColorSettings(GUIView view){
		this.view = view;
	}
	
	public void changeColor(String theme){
		
		//List<JPanel> panelList = view.getPanels();
		List<JComponent> viewList = view.getViews();
		
		for(int i = 0; i < viewList.size(); i++){
			
			if(theme.equals("Purple haze")){
					viewList.get(i).setBackground(GraphicConstants.PURPLEHAZE);
					System.out.println("I hate scrollpanes.");
					
			}else if(theme.equals("Greyhound")){
//				view.setBackground(GraphicConstants.BACKGROUND);
				viewList.get(i).setBackground(GraphicConstants.BACKGROUND);

			}else if(theme.equals("Green disease")){
//				view.setBackground(GraphicConstants.GREENDISEASE);
				viewList.get(i).setBackground(GraphicConstants.GREENDISEASE);

			}else if(theme.equals("Blue jean")){
				view.setBackground(GraphicConstants.BLUEJEAN);
				viewList.get(i).setBackground(GraphicConstants.BLUEJEAN);
			
			}else if(theme.equals("Yellow submarine")){
//				view.setBackground(GraphicConstants.YELLOWSUBMARINE);
				viewList.get(i).setBackground(GraphicConstants.YELLOWSUBMARINE);
			}
			view.updateGUI();
		}
	}
}
