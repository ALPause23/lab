package Laba2;

import Laba2.Animals;

public class Mammal extends Animals{
	private boolean paws;
	public void setPaws(boolean p) {
		paws = p;
	}
	public boolean getPaws() {
		return paws;
	  }
	Mammal(){
		super();
		paws = true;
	}
	Mammal(boolean b, boolean c, boolean p, String n){
		super(b,c,n);
		paws = p;
	}
}
