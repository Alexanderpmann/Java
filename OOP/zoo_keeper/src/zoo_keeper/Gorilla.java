package zoo_keeper;

public class Gorilla extends Mammal
{
	public Gorilla()
	{
		super(); //runs Mammal code within Gorilla child class
	}
	
	void throwSomething()
	{
		System.out.println("*Threw a Banana...*");
		energyLevel-=5;
	}
	
	void eatBananas()
	{
		System.out.println("*Eats Banana*");
		energyLevel+= 10;
	}
	
	void climb()
	{
		System.out.println("*climbs*");
		energyLevel-=10;
	}
};
