package zoo_keeper;

public class Bat extends Mammal
{
	public Bat()
	{
		energyLevel=300;
	}
	
	void fly()
	{
		System.out.println("Whoose *Bat Takes Flight*");
		energyLevel-=50;
	}
	
	void eatHumans()
	{
		System.out.println("Crunchy Yummy Bits...");
		energyLevel+=25;
	}
	
	void attackTown()
	{
		System.out.println("*Screams from the town..* Burning embers float throughout the town..");
		energyLevel-=100;
	}
};
