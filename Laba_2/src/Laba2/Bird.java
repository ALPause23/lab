package Laba2;

import Laba2.Animals;

public class Bird extends Animals {
    private boolean wings;
	public void setWings(boolean w) {
		wings = w;
	}
	public boolean getWings() {
		return wings;
	  }
	Bird(){
		super();
		this.wings = true;
	}
	Bird(boolean b, boolean c, String n, boolean w){
		super(b, c, n);
		this.wings = w;
	}
}
