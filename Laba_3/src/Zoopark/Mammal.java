package Zoopark;

public abstract class Mammal extends Animal{
	private boolean paws;
		
	public Mammal(){
		super();
		paws = true;
	}
	
	public Mammal(boolean b, boolean c, boolean p, String n){
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
