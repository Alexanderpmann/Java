package bank_account;

public class Program 
{
	public static void main(String[] args)
	{
		BankAccount account1=new BankAccount();
		BankAccount account2=new BankAccount(100.23D, 4000.0D);
		
		//Account 1 Deposit
		account1.Deposit(400.0D,false);
		System.out.println(account1.getChecking());
		
		//Account 2 Deposit
		account2.Deposit(123.456,true);
		System.out.println(account2.getSavings());
		
		//Account 1 Withdraw
		account1.Withdraw(200.0D,false);
		System.out.println(account1.getChecking());
		
		//Account 2 Withdraw
		account2.Withdraw(10000.0D, true);
		System.out.println(account2.getSavings());
	}
	

	
	
}
