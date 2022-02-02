package com.mycompany.app;
import java.io.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    //Tests that the characters are alphabetic
    @Test
    public void lettersOnlyAlphabetic()
    {
    	Letter alphaLetter = null;
    	Letter digitLetter = null;
        try {
        	alphaLetter = new Letter('c');
        	digitLetter = new Letter('1');
        }
        catch(IllegalArgumentException e){
        	
        }
     
        assertTrue(alphaLetter != null);
        assertTrue(digitLetter == null);
    }
    @Test
    public void emptyAlphabetsCreateDefault() {
    	Alphabet empty = new Alphabet(null, null);
    	assertTrue(empty.getLetters().get(0).toString().equals("a"));
    	assertTrue(empty.getName().equals("default"));
    }
    @Test
    public void fileIsCSV() {
    	String filename = App.FILENAME;
    	assertTrue(filename.endsWith(".csv"));
    }
    @Test
    public void csvContainsTitleStringsInFirstRow() {
    	BufferedReader br = new BufferedReader(new FileReader(App.FILENAME));
    	String text = br.readLine();
    	String[] ptext = text.split(",");
    	boolean flag = true;
    	for(int x = 0; x < ptext.length; ++x)
    	{
    		if(ptext[x].length() < 2 || ptext[x].length() > 10)
    		{
    			flag = false;
    		}
    	}
        br.close();
    	assertTrue(flag);
    }
    @Test
    public void csvParsesData() {
    	
    }
    @Test
    public void createAlphabetFromData() {
    	
    }
    
}
