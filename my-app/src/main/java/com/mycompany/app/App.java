package com.mycompany.app;
import java.io.*;
import java.util.ArrayList;

/**
 * Parse .csv files
 *
 */
public class App 
{
	private static String FILENAME = "data/alphabets.csv";
	
    public static void main( String[] args )
    {
    	Database db;
    	ArrayList<String[]> data = null;
    	try {
    		data = parseCSV(FILENAME);
    	} catch (FileNotFoundException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	db = createDatabaseFromData(data);
    	db.printAlphabets();
    }
	
	
    public static ArrayList<String[]> parseCSV(String filename) throws FileNotFoundException, IOException {
    	FileReader reader = new FileReader(filename);
    	BufferedReader br = new BufferedReader(reader);
    	ArrayList<String[]> data = new ArrayList<String[]>();
    	String row;
    	while((row=br.readLine()) != null)
    	{
    		data.add(row.split(","));
    	}
    	reader.close();
		return data;
    }
    
    public static Database createDatabaseFromData(ArrayList<String[]> data) {
    	if(data == null) return null;
    	Database db = new Database();
    	db.setData(data);
		return db;
    }

}
