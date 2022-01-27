package com.mycompany;

public class Alphabet{
    private String name;
    private char[] letters;
    
    public Alphabet(String name, char[] letters){
        this.name = name;
        this.letters = letters;
    }


public String getName(){
    return this.name;
}

public char[] getLetters(){
    return this.letters;
}
}