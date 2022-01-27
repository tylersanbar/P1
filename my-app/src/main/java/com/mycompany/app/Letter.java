package com.mycompany.app;

public class Letter {
	Character letter;
	
	public Letter(Character letter) {
		if(Character.isAlphabetic(letter)) (this.letter) = letter;
	}
	public String toString() {
		return letter.toString();
	}
}
