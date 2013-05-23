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
		//List<JScrollPane> scrollViewList = view.getScrollViews();
		
		for(int i = 0; i < viewList.size(); i++){
			
			if(theme.equals("Purple haze")){
			
				//view.setBackground(GraphicConstants.PURPLEHAZE);
				if(viewList.get(i) instanceof JScrollPane){
					((JScrollPane)viewList.get(i)).getViewport().getView().setBackground(GraphicConstants.PURPLEHAZE);
					System.out.println("I'm a scrollpane! <3");
				
				}else{
					viewList.get(i).setBackground(GraphicConstants.PURPLEHAZE);
					System.out.println("I hate scrollpanes.");
				}
				
				view.updateGUI();
				
			}else if(theme.equals("Greyhound")){
				
				view.setBackground(GraphicConstants.BACKGROUND);
				viewList.get(i).setBackground(GraphicConstants.BACKGROUND);
				view.updateGUI();
		
			}
		}
	}
}
