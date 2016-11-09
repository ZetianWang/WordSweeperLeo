package server.model;

import java.util.LinkedList;

import server.util.Letters;
import server.util.Location;


public class Cell {
	
	Location location;
	String letter;
	Boolean seleted; //Selected: true, otherwise: off
	
	
	
	public Location getPosition(){
		return this.location;
	}
	
	
	public boolean hasLetter(){
		if(this.letter!=null) return true;
		return false;
	}
	
	
	//如何random生成letter：http://stackoverflow.com/questions/2149914/randomly-generate-letters-according-to-their-frequency-of-use
	public void setLetter(){
		this.letter= Letters.chooseLetter();
	}
	
	public void setLetter(Cell c){///////
		this.letter = c.getLetter();		
	}
	
	
	public String getLetter(){
		return this.letter;
	}
	
	public void removeLetter(){
		this.letter = null;	
	}
	
	public boolean isSeleted(){
		return this.seleted;
	}
	
	public void setSeleted(){
		this.seleted = true;
	}
	

	
}