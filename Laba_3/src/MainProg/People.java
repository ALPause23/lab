package MainProg;

import Zoopark.Zoo;
//import Zoopark.Animal;

public class People {
    
	private Zoo zoo;
	
	public People(Zoo z) {
		this.zoo = z;
	}
	public void setZoo(Zoo z) {
		zoo = z;
	}
	public Zoo getZoo() {
		return zoo;
	}
	
	public String seeAnimal() {
		int i = zoo.getRandomAnimal();
		return zoo.getAnimals(i).getInfo(); 
	}
	

}

 