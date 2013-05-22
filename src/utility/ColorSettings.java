package utility;

import java.awt.*;
import java.util.List;

import javax.swing.JPanel;

import view.GUIView;

public class ColorSettings {
	
	private GUIView view;

	public ColorSettings(GUIView view){
		this.view = view;
	}
	
	public void changeColor(){
		
		List<JPanel> panelList = view.getPanels();
		
		for(int i = 0; i < view.getPanels().size(); i++){
			
			if(panelList.get(0).getBackground().equals(GraphicConstants.BACKGROUND)){
				panelList.get(i).setBackground(GraphicConstants.SWITCHBACKGROUND);
			}else{
				panelList.get(i).setBackground(GraphicConstants.BACKGROUND);
			}
		}
	}
}
