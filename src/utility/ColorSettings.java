package utility;

import java.util.List;
import javax.swing.JComponent;
import view.GUIView;

/**
 * The class to change color of the application
 */
public class ColorSettings {
	
	//	The view to change color in.
	private GUIView view; 

	public ColorSettings(GUIView view){
		this.view = view;
	}
	
	public void changeColor(String theme){
		
		List<JComponent> viewList = view.getViews(); //The list containing the view 
		
		//Loop to set the correct color.
		for(int i = 0; i < viewList.size(); i++){
			
			if(theme.equals("Purple haze")){
					viewList.get(i).setBackground(GraphicConstants.PURPLEHAZE);
					
			}else if(theme.equals("Greyhound")){
				viewList.get(i).setBackground(GraphicConstants.BACKGROUND);

			}else if(theme.equals("Green disease")){
				viewList.get(i).setBackground(GraphicConstants.GREENDISEASE);

			}else if(theme.equals("Blue jean")){
				viewList.get(i).setBackground(GraphicConstants.BLUEJEAN);
			
			}else if(theme.equals("Yellow submarine")){
				viewList.get(i).setBackground(GraphicConstants.YELLOWSUBMARINE);
			}
			view.updateGUI();
		}
	}
}
