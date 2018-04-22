package Laba2;

import Laba2.Mammal;

public class Elephant extends Mammal{
	private boolean trunk;
	Elephant(){
		super();
		trunk = true;
	}
	Elephant(boolean b, boolean c, boolean p, boolean t, String n){
		super(b, c, p, n);
		trunk = t;
		
	}
	public void setTrunk(boolean t) {
		trunk = t;
	}
	public boolean getTrunk() {
		return trunk;
	}
	
}