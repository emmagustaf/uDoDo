package model;

public class CategoryPanelModel {

	private String catTitle;
	
	//method for adding new categories 
	public void addNewCategoryPanel(String catTitle ){
		this.catTitle=catTitle;
		setCatTitle(catTitle);
	}
	
	public void removeCategoryPanel(){
		
	}
	
	public void setCatTitle(String catTitle){
		this.catTitle=catTitle;
	}
	
	public String getCatTitle(){
		return catTitle;
	}
}
