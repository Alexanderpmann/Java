package bank_account;

import java.util.Random;

// note - public functions, private members

//  void Deposit(Double amount, Boolean accountType);

public class BankAccount 
{
	private static int numAccounts=0;
	private static double totalMoney=0.0D; //D = double -> floats have less precision than doubles. can also uses F after the 0 to indicate a float.
	
	private double checking;
	private double savings;
	private Long id;
	
	
	public BankAccount()
	{
		this.checking=0;
		this.savings=0;
		this.id=genID();
		BankAccount.numAccounts++;
	}

	public BankAccount(double checking, double savings)
	{
		this.checking=checking;
		this.savings=savings;
		this.id=genID();
		BankAccount.numAccounts++;
		BankAccount.totalMoney+=checking+savings;
	}
	
	public Long genID()
	{
		//Math way:
		
////		Long _id=0;
//		double rnd=Math.random();
//		Long _id=(long) (1000000000.0D+(rnd*999999999-10000000000.0D));
////		Random random=new Random();
////		random.nextLong() -> another way to do the same, 
//		return _id; //could also assign to person's account this would apply it to.
//		
		
		//String approach:
		String _id="";
		for(int i=0;i<9;i++)
		{
			long num=(long) Math.floor(Math.random()*9);
			_id+=num+"";
		}
		System.out.println(_id);
		return Long.parseLong(_id);
	}
	
	public void Deposit(Double amount, Boolean accountType)
	{
		if(accountType)
		{
			savings+=amount;
			return;
		}
		else
		{
			checking+=amount;
		}
		
		totalMoney+=amount;
	}

	public double Withdraw(Double amount, Boolean accountType)
	{
		if(accountType)
		{
			if((savings-=amount)<0)
			{
				System.out.println("Insufficient Funds!");
				return 0;
			}
			savings-=amount;
		}
		else
		{
			if((checking-=amount)<0)
			{
				System.out.println("Insufficient Funds");
			return 0;
			}
		}
		return amount;
	}
	
	public double getTotal()
	{
		return checking+savings;
	}
	
	public double getChecking() {
		return checking;
	}

	public void setChecking(double checking) {
		this.checking = checking;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	public static int getNumAccounts() {
		return numAccounts;
	}

	public static void setNumAccounts(int numAccounts) {
		BankAccount.numAccounts = numAccounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}
};
