package com.mycompany.app;

import java.util.ArrayList;

public class Database {
	
	private Alphabet[] alphabets;
	private ArrayList<String[]> data;
	public Database() {
		
	}
	public void setAlphabets(Alphabet[] a){
		this.alphabets = a;
	}
	public Alphabet[] getAlphabets(){
		return this.alphabets;
	}
	public void setData(ArrayList<String[]> data) {
		this.data = data;
		this.alphabets = getAlphabetsFromData(data);
	}
	private int numberOfAlphabetsInData(ArrayList<String[]> data) {
		return data.get(0).length;
	}
	private Alphabet[] getAlphabetsFromData(ArrayList<String[] > data) {
		Alphabet[] alphabets = new Alphabet[numberOfAlphabetsInData(data)];
		for(int i = 0; i < alphabets.length; i++) {
			alphabets[i] = getAlphabetFromColumn(i);
		}
		return alphabets;
	}
	private Alphabet getAlphabetFromColumn(int columnNumber) {
		Alphabet alphabet = new Alphabet(getNameFromColumn(columnNumber),getLettersFromColumn(columnNumber));
		return alphabet;
	}
	private String getNameFromColumn(int columnNumber) {
		return data.get(0)[columnNumber];
	}
	private ArrayList<Letter> getLettersFromColumn(int columnNumber) {
		ArrayList<Letter> letters = new ArrayList<Letter>();
		String[] row;
		Letter letter;
		for(int i = 1; i < data.size(); i++) {
			row = data.get(i);
			letter = getLetterFromString(row[columnNumber]);
			if(letter != null) letters.add(letter);
		}
		return letters;
	}
	private Letter getLetterFromString(String s) {
		Letter letter = null;
		if(s.length() == 1) {
			letter = new Letter(s.charAt(0));
		}
		return letter;
	}
	public void printAlphabets() {
		for(Alphabet alphabet : alphabets) {
			System.out.println(alphabet);
		}
	}
}
