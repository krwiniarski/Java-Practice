
public class SavingsAccount {
	
	private double interestRate,		//Annual interest rate
					monthInt,			//Monthly interest rate
					balance,			//User's starting balance
					interest;			//Total interest accumulated
	private int months;					//Number of months
	
	/**The SavingsAccount constructor accepts arguments for
	 * the user's starting balance, annual interest rate, and
	 * months that they have had this account.
	 */
	public SavingsAccount( double bal, double intR, int months)
	{
		interestRate = intR;
		balance = bal;
		this.months = months;
	}

	//Converts annual interest rate into monthly interest rate
	public void calcIntR(double interestRate)
	{
		monthInt = (interestRate/12);
	}
	
	//Calculates total amount of interest accumulated
	public void interestRate()
	{
		interest = months * monthInt;
		balance += interest;
	}
	//Updates balance after withdraws 
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	//Updates balance after deposits
	public void deposit(double amount)
	{
		balance += amount;
	}
	//Gets new balance
	public double getEndBal()
	{
		return balance;
	}
	
	
}
