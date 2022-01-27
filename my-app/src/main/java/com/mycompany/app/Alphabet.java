package com.mycompany.app;

import java.util.ArrayList;

public class Alphabet{
    private String name;
    private ArrayList<Letter> letters;
    
    public Alphabet(String name, ArrayList<Letter> letters){
        this.name = name;
        this.letters = letters;
    }


public String getName(){
    return this.name;
}

public ArrayList<Letter> getLetters(){
    return this.letters;
}
public String toString() {
	String s = new String("Alphabet name: " + name + "\n" + "Alphabet letters: " + letters.toString());
	return s;
	
}
}