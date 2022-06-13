package zoo_keeper;

public class Program 
{
	public static void main(String[] args)
	{
		// Throw three things, eat bananas twice, and climb once
		Gorilla joe=new Gorilla();
		joe.throwSomething();
		joe.throwSomething();
		joe.throwSomething();
		
		joe.eatBananas();
		joe.eatBananas();
		
		joe.climb();
		// Bat Creation
		// Attack three towns, eat two humans, and fly twice.
		
		Bat choco=new Bat();
		for(int i=0; i<3; i++) choco.attackTown();
		for(int i=0; i<2; i++) choco.eatHumans();
		for(int i=0; i<2; i++) choco.fly();
		
	}
};
