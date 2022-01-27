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
    public void fileIsCSV() {
    	String filename = App.FILENAME;
    	assertTrue(filename.endsWith(".csv"));
    }
    @Test
    public void csvContainsTitleStringsInFirstRow() {
    	
    }
    @Test
    public void csvParsesData() {
    	
    }
    @Test
    public void createAlphabetFromData() {
    	
    }
    
}
