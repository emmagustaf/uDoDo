package controller;

public class Main {
	
	
	//TODO Create private instancevariables
	private ListView listView;
	private ListController controller;
	private HeaderView headerView;
	private GUIView gUIView;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Create new instances of ListView and ListController
		listView = new ListView();
		controller = new ListController(listView);
		//TODO Create new instances HeaderView and GUIView
		headerView = new HeaderView(controller);
		gUIView = new GUIView(headerView, listView);
			//TODO set the GuiView visible and shit...
	}

}
