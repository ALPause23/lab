package Zoopark;

public class Zoo {
	private Employee[] emp;
	private Animal[] ani;
	
	public Zoo(int i){
		emp = new Employee[i];
		ani = new Animal[i];
	}
	
	public void setEmployee(Employee e, int i){
		this.emp[i] = e;
		e.setZoo(this);
	}
	
	public Employee getEmployee(int i){
		return emp[i];
	}
	
	public void setAnimals(Animal a, int i){
		this.ani[i] = a;
	}
	
	public Animal getAnimals(int i){
		return ani[i];
	}
	
	public int getRandomAnimal() {
		int a = 0;
		int b = 4; 
		int random_number = a + (int) (Math.random() * b); 
		return random_number;
	}
	
}


