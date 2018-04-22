package Laba2;



public class Animals {
	private boolean body;
	private String name;
	private boolean cell;
	
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
	public String eat() {
		cell = false;
		return "Поел!";
	}
	public String cleanCell() {
		if(this.cell == true)
			return "Клетка уже чистая!";
		else {
			this.cell = true;
			return "Очищена";
		}
	}
	Animals(){
		body = true;
		cell = true;
	}
	Animals(boolean b, boolean c, String n){
		body = b;
		cell = c;
		name = n;
	}
	
}
