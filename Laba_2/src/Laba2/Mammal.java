package Laba2;

import Laba2.Animal;

public class Mammal extends Animal{
	private boolean paws;
		
	Mammal(){
		super();
		paws = true;
	}
	
	Mammal(boolean b, boolean c, boolean p, String n){
		super(b,c,n);
		paws = p;
	}
	
	public void setPaws(boolean p) {
		paws = p;
	}
	
	public boolean getPaws() {
		return paws;
	}
}
