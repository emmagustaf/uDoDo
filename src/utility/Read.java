package utility;

import java.awt.Component;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

import model.*;
import view.*;

public class Read {
	
	@SuppressWarnings("unchecked")
	public static void readFromFile() {

		ObjectInputStream inputStream = null;
		ArrayList<TaskModel> obj = new ArrayList<TaskModel>();
		try {
			inputStream = new ObjectInputStream(new FileInputStream("AllTask.ser"));
			obj = null;
			
			while((obj = (ArrayList<TaskModel>)inputStream.readObject()) != null){
				if ( obj instanceof ArrayList){
					
					AllTaskListModel.getInstance().addAll(((ArrayList<TaskModel>)obj));
				}
			}
			
		}catch (EOFException ex){
			System.out.println("End of file reached");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch (FileNotFoundException ex){
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			try{
				if (inputStream !=null){
					inputStream.close();
				}
			}catch (IOException ex){
				ex.printStackTrace();
			}
		}
		System.out.println("Read saved state");
		
	}
	@SuppressWarnings("unchecked")
	public static void readCategories(){

		ObjectInputStream inputStream = null;
		ArrayList<CategoryModel> obj = new ArrayList<CategoryModel>();
		try {
			inputStream = new ObjectInputStream(new FileInputStream("AllCategories.ser"));
			obj = null;
			
			while((obj = (ArrayList<CategoryModel>)inputStream.readObject()) != null){
				if ( obj instanceof ArrayList){
					if(obj.contains(StartCategoryPanel.class)){
						obj.remove(StartCategoryPanel.class);
					}
					AllCategoryListModel.getInstance().addAll((ArrayList<CategoryModel>)obj);
				}
			}
			
		}catch (EOFException ex){
			System.out.println("End of file reached");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch (FileNotFoundException ex){
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			try{
				if (inputStream !=null){
					inputStream.close();
				}
			}catch (IOException ex){
				ex.printStackTrace();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public static void readFinishedTasks(){

		ObjectInputStream inputStream = null;
		ArrayList<TaskModel> obj = new ArrayList<TaskModel>();
		try {
			inputStream = new ObjectInputStream(new FileInputStream("FinishedCategories.ser"));
			obj = null;
			
			while((obj = (ArrayList<TaskModel>)inputStream.readObject()) != null){
				if ( obj instanceof ArrayList){
					
					FinishedTaskList.getInstance().addAll((ArrayList<TaskModel>)obj);
				}
			}
			
		}catch (EOFException ex){
			System.out.println("End of file reached");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch (FileNotFoundException ex){
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			try{
				if (inputStream !=null){
					inputStream.close();
				}
			}catch (IOException ex){
				ex.printStackTrace();
			}
		}
	}
}
