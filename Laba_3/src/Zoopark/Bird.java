package Zoopark;

public abstract class Bird extends Animal {
    private boolean wings;
	
    public Bird(){
		super();
		this.wings = true;
	}
    public Bird(boolean b, boolean c, String n, boolean w){
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
