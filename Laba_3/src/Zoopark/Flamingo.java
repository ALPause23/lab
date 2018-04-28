package Zoopark;

import Zoopark.Bird;

public class Flamingo extends Bird {
	public Flamingo(){
		super();
	}
	public Flamingo(boolean b, boolean c, boolean w, String s){
		super(b, c, s, w);
	}
	protected String fly() {return "I'm a fly!!!";}
	
	@Override
	public String getInfo() {
		return this.getName() + "  -  " + "wings: " + this.getWings();
			
	}

}
