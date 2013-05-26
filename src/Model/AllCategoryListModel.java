package Model;

import java.io.Serializable;
import java.util.ArrayList;

/** 
 * An ArrayList (Singleton) for keeping track of all the existing CategoryModels in the application
 * CategoryModels are added when created in the CategoryController, and deleted when the AddedCategoryPanels are 
 * deleted in CategoryPanelController.
 */

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
