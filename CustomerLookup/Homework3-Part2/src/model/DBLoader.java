package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class DBLoader {

	
	/**
	 * loadDatabase should read the .csv file specified by the parameter fileName, and return an ArrayList of Customer objects
	 * with their data taken from the file. 
	 * 
	 * @return ArrayList<Customer> object of with customers from the file specified by fileName parameter.
	 */
	public static ArrayList<Customer> loadDatabase(String fileName)
	{
		ArrayList<Customer> aList = new ArrayList<Customer>();
		
		Scanner in = null;
		
		
		try {
	      
			in = new Scanner(new File(fileName));
			in.useDelimiter(", ");
			in.nextLine();
            
			while(in.hasNext()) {
				String fName = in.next();
				String lName = in.next();
               int phone = Integer.parseInt(in.next());
               double bill = Double.parseDouble(in.next());
                String comment = in.next();
                String image = in.nextLine().replace(", ", "");
                
                
                
                Customer c = new Customer(fName, lName, phone, bill, comment, image);
				aList.add(c);
				
			}
			in.close();
			
			
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("File not found.");

		}
		
		return aList;
	}
	
	
	
}
