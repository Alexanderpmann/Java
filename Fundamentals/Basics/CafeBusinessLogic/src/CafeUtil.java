import java.util.ArrayList;

public class CafeUtil 
{
	public int getStreakGoal(int weeks)
	{
		// Sigma - Start at one number and add each additional number until the end. etc 1 + 2 + 3 etc..
		//originally function was hard coded for 10. but updated to be int weeks and i<=weeks with the sum+=i inside for a 1 line code
		
		int sum=0;
		for(int i=1; i<=weeks;i++, sum+=i) {}
		return sum;
	}
	
	public double getTotal(double[] items) // Sometimes creating the single line loops will run into errors. This code was switched back from one line due to an error
	{
		double total=0;
		for(int i=0;i<items.length;i++) 
		{	
			total+=items[i];
		}
		return total;
	}
	
	public void displayMenu(ArrayList<String> menuItems)
	{
		for(int i=0;i<menuItems.size();i++)
		{
			System.out.println( i+":"+menuItems.get(i)); //menuItems.get(i) is the same as menuItems[i]
			
		}
//		Fancy loop:
//		for(String item:menuItems)
//		{
//			System.out.println(item);
//		}
	}
	// Ninja Sensei Bonus:
	public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> costs)
	{
		if(menuItems.size()!=costs.size()) return false;
		for(int i=0;i<costs.size();i++)
		{
			System.out.println(i+" "+menuItems.get(i)+" -- $"+costs.get(i));
		}
		return true;
	}
	
	
	public void addCustomer(ArrayList<String> customers)
	{
		System.out.println("Please enter your name:");
		String userName = System.console().readLine();
		System.out.println("Hello, "+userName); //String Concatenation
		System.out.println("There are "+customers.size()+" in front of you.");
		customers.add(userName); // same as .push
		for(String customer:customers) // same as for customer in customers
		{
			System.out.println(customer);
		}
	}
	//Ninja - Sensei Bonus:
	
	public void printPriceChart(String product,double price,int maxQuantity)
	{
		System.out.println(product);
		for(int i=0; i<maxQuantity;i++)
		{
			System.out.println((i+1)+" - $"+(((i+1)*price)-(i*0.5)));
		}
	}
	
};
