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
    	Database db = new Database();
    	ArrayList<String[]> data = new ArrayList<String[]>();
    	try {
    		data = parseCSV(FILENAME);
    	} catch (FileNotFoundException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	db.setData(data);
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

}
