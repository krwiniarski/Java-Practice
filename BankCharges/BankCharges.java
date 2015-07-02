/**
 * This program totals the amount of bank charges the user
 *has incurs and returns their new balance along with the amount
 *of charges
 */
public class BankCharges {
	
	private int checks;			//number of checks
	private double balance,		//initial balance
				endBalance,		//balance after charges applied
				checkCharge,	//amount charged for check usage
				totalCharges;		//total amount of bank charges
	
	/**
	 * The constructor takes two arguments- the number of checks
	 * the user has used along with their present balance. The
	 * calculateCharges method is called. 
	 */
	public BankCharges(int checks, double bal)
	{
		this.checks = checks;
		balance = bal;
		calculateCharges();
	}

	//sets the number of checks utilized
	public void setCheck(int checks)
	{
		this.checks = checks;
	}
	
	//sets the current balance before charges are taken out
	public void setBal(double bal)
	{
		balance = bal;
	}
	
	/**
	 * Determines the amount the user will be charged 
	 * based on how many checks they have used
	 */
	private void setCharges()
	{
		if (checks<20)
			checkCharge = 0.10;
		else if (checks >= 20 && checks <=39)
			checkCharge = 0.08;
		else if (checks >= 40 && checks <=59)
			checkCharge = 0.06;
		else
			checkCharge = 0.04;	
	}
	
	/**
	 * Calculates the total amount of charges that the user will
	 * be charged based on their current balance and amount of checks
	 * they have utilized 
	 */
	private void calculateCharges()
	{
		setCharges();
		totalCharges = 10 + (checks *checkCharge);
		
		//if balance is below 400 another $15 charge is applied
		if (balance < 400)
		{
			totalCharges += 15;
		}
		//calculates balance after charges have been applied
		endBalance = balance - totalCharges;
	}
	
	//Returns the number of checks used to determine amount of check charges
	public int getCheckNum()
	{
		return checks;
	}
	
	//Returns the total balance after applying charges
	public double getBal()
	{
		return endBalance;
	}
	
	//Returns the total amount of charges the user has incurred
	public double getCharges()
	{
		return totalCharges;
	}
	
}
