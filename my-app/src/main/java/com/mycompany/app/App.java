package com.mycompany.app;
import java.io.*;
import java.util.ArrayList;

/**
 * Parse .csv files
 *
 */
public class App 
{
	static String FILENAME = "data/alphabets.csv";
	
    public static void main( String[] args )
    {
    	Database db;
    	ArrayList<String[]> data = null;
    	try {
    		data = parseCSV(FILENAME);
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (IllegalArgumentException e) {
    		e.printStackTrace();
    	}
    	
    	db = createDatabaseFromData(data);
    	db.printAlphabets();
    }
	
	
    public static ArrayList<String[]> parseCSV(String filename) throws IllegalArgumentException, FileNotFoundException, IOException {
    	FileReader reader = new FileReader(filename);
    	BufferedReader br = new BufferedReader(reader);
    	ArrayList<String[]> data = new ArrayList<String[]>();
    	String row;
    	String[] rowData;
    	int numRows = 0;
    	int numColumns = 0;
    	while((row=br.readLine()) != null)
    	{
    		numRows++;
    		rowData = row.split(",");
    		if(numRows==1) numColumns = rowData.length;
    		if(rowData.length > numColumns) throw new IllegalArgumentException("Extra column data");
    		data.add(rowData);
    		if(numRows > 100) throw new IllegalArgumentException("Too many rows in CSV data");
    	}
    	if(data.size() == 0) throw new IllegalArgumentException("No data read");
    	reader.close();
    	br.close();
		return data;
    }
    
    public static Database createDatabaseFromData(ArrayList<String[]> data) {
    	Database db = new Database();
    	if(data != null) db.setData(data);
		return db;
    }

}
