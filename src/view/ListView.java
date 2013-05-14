package view;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import utility.*;
import model.*;

import java.awt.*;

public class ListView extends JScrollPane {
	
	public JPanel panelInScroll;
	
	/**
	 * Create the panel.
	 */
	public ListView() {
		
		this.setBackground(GraphicConstants.BACKGROUND);
		this.setMinimumSize(new Dimension (300, 500));
		this.setMaximumSize(new Dimension (300, 500));
		this.setPreferredSize(new Dimension (300, 500));
		this.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
		
		panelInScroll = new JPanel();
		panelInScroll.setBackground(GraphicConstants.BACKGROUND);
		panelInScroll.setLayout(new BoxLayout(panelInScroll, BoxLayout.Y_AXIS));
		
		getViewport().setView(panelInScroll);
		
		
	}
	
	public void updateView(){
		
		
		panelInScroll.revalidate();
		panelInScroll.repaint();
		
		this.revalidate();
		this.validate();
		this.repaint();
		
	}	
	
	public void updatePanels(){
		//TODO P� n�got j�vla s�tt skall vi s�tta om texten i taskpanelerna.. 
		//TODO Pallar inte lista ut hur �n. men taskpanelens textfields skall 
		//TODO s�ttas om med det nya namnet fr�n taskmodellen
		
		Component[] taskPanels = new Component[panelInScroll.getComponents().length];
		taskPanels = (Component[]) panelInScroll.getComponents();

		for(int i=0; i<taskPanels.length; i++){
			System.out.println("Was here");
			((TaskPanel)taskPanels[i]).setTitle();
			taskPanels[i].validate();
			taskPanels[i].repaint();
		}
	}
}
