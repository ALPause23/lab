package Zoopark;

public class Tiget extends Mammal {
	private String streaks;
	public Tiget() {
		super();
		streaks = "Black";
	}
	public Tiget(boolean b, boolean c, boolean p, String s, String s1) {
		super(b, c, p, s);
		streaks = s1;
	}
	public void setStreaks(String s) {
		streaks = s;
	}
	public String getStreaks() {
		return streaks;
	}
	
	@Override
	public String getInfo() {
		return this.getName() + "  -  " + "Color treaks: " + this.getStreaks();
			
	}

}
