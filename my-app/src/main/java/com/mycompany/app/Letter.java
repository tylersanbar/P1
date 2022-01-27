package com.mycompany.app;

public class Letter  {
	Character letter;
	
	public Letter(Character letter) throws IllegalArgumentException {
		if(Character.isAlphabetic(letter)) (this.letter) = letter;
		else {throw new IllegalArgumentException("Letter not alphabetic");}
	}
	public String toString() {
		return letter.toString();
	}
}
