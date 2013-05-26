package model;

import java.io.Serializable;
import java.util.ArrayList;

public class AllCategoryListModel extends ArrayList <CategoryModel> implements Serializable {
	
	private static AllCategoryListModel instance;
	
	private AllCategoryListModel(){
		
	}
	
	public static AllCategoryListModel getInstance(){
		if(instance == null){
			return instance = new AllCategoryListModel();
		}else{
			return instance;
		}
	}

}
