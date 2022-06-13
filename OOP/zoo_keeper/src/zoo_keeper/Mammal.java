package zoo_keeper;

public class Mammal 
{
	protected int energyLevel=100;
	
	public Mammal()
	{
		energyLevel=100;
	}
	
	public int displayEnergy()
	{
		System.out.println(energyLevel);
		return energyLevel;
	}
};
