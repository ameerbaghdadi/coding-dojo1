package ZooKeeper2;

public class Bat extends Mammal {
	
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("----------- Fly -----------");
		System.out.println("the bat energy level is "+this.getEnergyLevel());
		System.out.println("wwwwwwwwwwwwwwww");
		this.setEnergyLevel(this.getEnergyLevel()-50);
		System.out.println("the bat energy level is "+this.getEnergyLevel());
	}
	
	public void eatHumans() {
		System.out.println("----------- Eat Humans -----------");
		System.out.println("the bat energy level is "+this.getEnergyLevel());
		System.out.println("Ok");
		this.setEnergyLevel(this.getEnergyLevel()+25);
		System.out.println("the bat energy level is "+this.getEnergyLevel());
	}
	
	public void attackTown() {
		System.out.println("----------- Attack -----------");
		System.out.println("the bat energy level is "+this.getEnergyLevel());
		System.out.println("Opaaaaaaaaaaaa");
		this.setEnergyLevel(this.getEnergyLevel()-100);
		System.out.println("the bat energy level is "+this.getEnergyLevel());
	}
}
