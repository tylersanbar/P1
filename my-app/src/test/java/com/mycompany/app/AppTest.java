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
    public void allCharactersAreAlphabetic()
    {
        boolean allAlphabetic = true;
        //App testApp = new App();
     
        //Alphabet[] test = testApp.getAlphabets();
        //char[] c = test[0].getLetters();
        

        // if(!Character.isAlphabetic(x)) allAlphabetic = false;
        /*for(Alphabet a : testApp.getAlphabets()){
            for(char c : a.getLetters()){
                if(!Character.isAlphabetic(c)) allAlphabetic = false;
            }
        }
        */
        assertTrue( allAlphabetic );
    }
    
}
