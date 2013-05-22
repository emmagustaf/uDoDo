package utility;

import java.awt.*;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import view.GUIView;

public class ColorSettings {
	
	private GUIView view;

	public ColorSettings(GUIView view){
		this.view = view;
	}
	
	public void changeColor(String theme){
		
		//List<JPanel> panelList = view.getPanels();
		//List<JPanel> viewList = view.getViews();
		//List<JScrollPane> scrollViewList = view.getScrollViews();
		
		for(int i = 0; i < view.getViews().size(); i++){
			
			if(theme.equals("Purple haze")){
			
				view.setBackground(GraphicConstants.PURPLEHAZE);
				view.getViews().get(i).setBackground(GraphicConstants.PURPLEHAZE);
				view.updateGUI();
				
			}else if(theme.equals("Greyhound")){
				
				view.setBackground(GraphicConstants.BACKGROUND);
				view.getViews().get(i).setBackground(GraphicConstants.BACKGROUND);
				view.updateGUI();
		
			}
		}
	}
}
