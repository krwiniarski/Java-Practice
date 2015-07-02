import java.util.Scanner;		//needed for Scanner class
import java.text.DecimalFormat;	//needed to convert decimals

/**
 * This program utilizes the BankCharges class and calculates
 *the user's new balance and bank charges
 */

public class BankChargesTest {

	public static void main(String[] args) {
		double balance;
		int checks;
		
	DecimalFormat dollar = new DecimalFormat("#,##0.00");
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("This program will calculate the total bank " 
				 +"charges you have incurred in addition to returning " +
				"\nyour new bank balance after applying the charges.");
	
	System.out.println("\nPlease supply the following: ");
	
	System.out.println("\nHow many checks have you used this month? ");
	checks = keyboard.nextInt();
	System.out.println("What is your current balance? ");
	balance = keyboard.nextDouble();
	
	//Creates the you instance class
	BankCharges you = new BankCharges(checks, balance);
	
	//Returns the amount of charges the user has incurred 
	System.out.println("\nYour have incurred $" + 
			dollar.format(you.getCharges()) +
			" in charges.");
	//Returns the new balance after applying charges
	System.out.println("\nYour new balance is $" + 
					dollar.format(you.getBal()));
	
	keyboard.close();
	}

}
