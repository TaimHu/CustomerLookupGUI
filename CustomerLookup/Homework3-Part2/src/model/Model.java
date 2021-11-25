package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;


import javafx.scene.image.Image;

public class Model {

	private ArrayList<Customer> custDB;
	
	
	public Model()
	{
		custDB = DBLoader.loadDatabase("customersDB.csv");
	}
	
	public ArrayList<Customer> getCustomerDB()
	{
		return custDB;
	}
	
	public Image loadImage(String fileName)
	{
    	File f = new File("src/model/images/" + fileName + ".jpg");
    	//for debugging use this: System.out.println("loading image at: " + f.getAbsolutePath());
    	try {
    	Image img = new Image(new FileInputStream(f),200, 200, true, true );
    	return img;
    	}catch (FileNotFoundException e)
    	{
    		System.out.println("File not found!");
    	}
		return null;
	}
	
}
