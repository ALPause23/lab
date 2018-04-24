package Laba2;

import java.util.ArrayList;
import java.util.List;

public class Employee{
	private List<Animal> animal;
	private Zoo z;
	
	Employee(Elephant elephant, Ostrich ostrich){
		this.animal = new ArrayList<Animal>();
		animal.add(elephant);
		animal.add(ostrich);
	}
	
	public void setZoo(Zoo _z) {
		z = _z;
	}
	
	public Zoo getZoo() {
		return z;
	}
	
	public String feed(int i){
		return animal.get(i).eat();
	}
	
	public String clean(int i){
		return animal.get(i).cleanCell();
	}
	
}
