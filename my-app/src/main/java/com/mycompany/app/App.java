package com.mycompany;
import java.io.*;
import java.util.ArrayList;

/**
 * Parse .csv files
 *
 */
public class App 
{
	private Alphabet[] alphabets;


    public static void main( String[] args )
    {
    ArrayList<String[]> split = new ArrayList<String[]>();
    String[] names;
    char[][] letters;
	try{
	StringBuffer sb = new StringBuffer();
	String file = "/home/ubuntu/alphabets.csv";
	FileReader reader = new FileReader(file);
	BufferedReader br = new BufferedReader(reader);
	String line;
	String pline;
	
	
	while((line=br.readLine()) != null)
	{
		pline = line.replaceAll("\"","");
		split.add(pline.split(","));
	}
	reader.close();
        //System.out.println(sb.toString());
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	names=split.get(0);
	letters = new char[split.size()-1][names.length];
	for(int i = 0; i < split.size()-1; i++){
		for(int j = 0; j < names.length; j++){
			if(split.get(i+1)[j].length() == 1){
				letters[i][j] = split.get(i+1)[j].charAt(0);
			}
		}
	}
	int num = 0;
	for(String n : names){
		System.out.println(n);
		char[] l = new char[split.size()-1];
		for(int i = 0; i < l.length; i++){
			l[i] = letters[i][num];
		}
		int legitChars = 0;
		for(char c : l){
			if(c != 0) legitChars++;
		}
		char[] finalAlphabet = new char[legitChars];
		for(int i = 0; i < legitChars; i++){
			finalAlphabet[i] = l[i];
		}
		System.out.println(finalAlphabet);
		System.out.println(finalAlphabet.length);
		Alphabet a = new Alphabet(n,finalAlphabet);
		num++;
	}
	}
}
