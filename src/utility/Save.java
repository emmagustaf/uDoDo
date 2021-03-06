package utility;

import java.awt.Component;
import java.io.*;

import Model.AllCategoryListModel;
import Model.AllTaskListModel;
import Model.FinishedTaskList;

import modeltest.*;
import view.*;
import controller.*;

public class Save {

	public static void saveFiles() {

		ObjectOutputStream outputStream = null;

		try {

			outputStream = new ObjectOutputStream(new FileOutputStream(
					"AllTask.ser"));
			outputStream.writeObject(AllTaskListModel.getInstance());
			outputStream.close();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			// Close the ObjectOutputStream
			try {
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}
	public static void saveCategories(){
		ObjectOutputStream outputStream = null;

		try {

			outputStream = new ObjectOutputStream(new FileOutputStream(
					"AllCategories.ser"));
			outputStream.writeObject(AllCategoryListModel.getInstance());
			outputStream.close();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			// Close the ObjectOutputStream
			try {
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}
	public static void saveFinishedTasks(){
		ObjectOutputStream outputStream = null;

		try {

			outputStream = new ObjectOutputStream(new FileOutputStream(
					"FinishedCategories.ser"));
			outputStream.writeObject(FinishedTaskList.getInstance());
			outputStream.close();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			// Close the ObjectOutputStream
			try {
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}
}
