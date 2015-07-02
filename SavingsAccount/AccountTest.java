import java.util.Scanner;			//Needed for the Scanner class
import java.text.DecimalFormat;		//Needed to format the decimals

/**
 * This program uses the SavingsAccount class
 * to calculate the new balance of an account. The user enters
 * their starting balance, interest rate, and number of months with
 * this account in order to correctly calculate their new balance
 * after x months.
 */
public class AccountTest {

	public static void main(String[] args) {
		
		//Attributes 
		SavingsAccount account;		//References the SavingsAccount class
		double balance,				//The starting balance
				intRate,			//The annual interest rate
				dep,				//Amount deposited per month
				with;				//Amount withdrawn per month
		int months;
		
		//Creates a Scanner object
		Scanner keyboard = new Scanner(System.in);
		//Creates a DecimalFormat object
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		
		//Get the starting balance
		System.out.println("What is your starting balance? ");
		balance = keyboard.nextDouble();
		
		//Get the annual interest rate
		System.out.println("What is your annual interest rate? (Ex: 4.5) ");
		intRate = keyboard.nextDouble();
		
		//Get the number of months
		System.out.println("How many months have you had this account? ");
		months = keyboard.nextInt();
		
		//Creates the account instance class
		account = new SavingsAccount(balance, intRate, months);
		
		/**Loops for amount of months the user has had the account
		 * and calculates new balance based on how much user has
		 * withdrawn, deposited, and the length of their account
		 */
		for(int i=1; i<=months; i++)
		{
			//Get the amount deposited per month and adds to balance
			System.out.println("How much did you deposit for month " + i +
					"? ");
			dep = keyboard.nextDouble();
			account.deposit(dep);
			
			//Get the amount withdrawn and takes from balance
			System.out.println("How much did you withdraw for month " + i +
					"? ");
			with = keyboard.nextDouble();
			account.withdraw(with);	
		}
		
		//Calculates the monthly rate
		account.calcIntR(intRate);
		//Adds the interest rate the the balance
		account.interestRate();
		//Prints new balance and formats it
		System.out.println("Your new balance is: $" +
				formatter.format(account.getEndBal()));
	}

}
