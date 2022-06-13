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
	}
};
