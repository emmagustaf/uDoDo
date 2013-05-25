package utility;

import java.awt.Component;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

import model.*;
import view.*;

public class Read {
	
	@SuppressWarnings("unchecked")
	public static ArrayList <TaskModel> readFromFile() {

		ObjectInputStream inputStream = null;
		Object obj = new Object();
		try {
			inputStream = new ObjectInputStream(new FileInputStream("AllTask.ser"));
			obj = null;
			
			while((obj = inputStream.readObject()) != null){
				if ( obj instanceof ArrayList){
					System.out.println(((ArrayList<TaskModel>)obj).toString());
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
		return (ArrayList<TaskModel>)obj;
		
	}
}
