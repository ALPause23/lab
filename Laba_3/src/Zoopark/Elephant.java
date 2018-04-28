package Zoopark;

public class Elephant extends Mammal{
	private boolean trunk;
	
	public Elephant(){
		super();
		trunk = true;
	}
	
	public Elephant(boolean b, boolean c, boolean p, boolean t, String n){
		super(b, c, p, n);
		trunk = t;
	}
	
	public void setTrunk(boolean t) {
		trunk = t;
	}
	
	public boolean getTrunk() {
		return trunk;
	}
	
	@Override
	public String getInfo() {
		return this.getName() + "  -  " + "Trunk: " + this.getTrunk();
			
	}
}