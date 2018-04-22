package Laba2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private List<Animals> animal;
	
	Employee(Elephant elephant, Ostrich ostrich){
		this.animal = new ArrayList<Animals>();
		animal.add(elephant);
		animal.add(ostrich);
	}
	
	public String feed(int i) {
		return animal.get(i).eat();
	}
	
	public String clean(int i) {
		return animal.get(i).cleanCell();
	}
	
}
