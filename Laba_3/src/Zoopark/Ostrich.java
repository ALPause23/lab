package Zoopark;

public class Ostrich extends Bird {
	
	public Ostrich(){
		super();
	}
	
	public Ostrich(boolean b, boolean c, boolean w, String n){
		super(b, c, n, w);
	}
	
	@Override
	public String getInfo() {
		return this.getName() + "  -  " + "wings: " + this.getWings();
			
	}
}
