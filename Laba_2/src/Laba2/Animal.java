package Laba2;



public class Animal {
	private boolean body;
	private String name;
	private boolean cell;
	private Zoo z;
	
	Animal(){
		body = true;
		cell = true;
	}
	
	Animal(boolean b, boolean c, String n){
		body = b;
		cell = c;
		name = n;
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setBody(boolean b) {
		body = b;
	}
	
	public boolean getBody() {
		return body;
	}
	
	public void setCell(boolean c) {
		cell = c;
	}
	
	public boolean getCell() {
		return cell;
	}
	
	public void setZoo(Zoo _z) {
		z = _z;
	}
	
	public Zoo getZoo() {
		return z;
	}
	
	public String eat() {
		cell = false;
		return "I just ate!";
	}
	
	public String cleanCell() {
		if(this.cell == true)
			return "The cage is clean!";
		else {
			this.cell = true;
			return "Cleared";
		}
	}	
}
