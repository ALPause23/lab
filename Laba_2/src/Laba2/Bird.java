package Laba2;

import Laba2.Animal;

public class Bird extends Animal {
    private boolean wings;
	
    Bird(){
		super();
		this.wings = true;
	}
	Bird(boolean b, boolean c, String n, boolean w){
		super(b, c, n);
		this.wings = w;
	}
	
	public void setWings(boolean w) {
		wings = w;
	}
	
	public boolean getWings() {
		return wings;
	}
}
