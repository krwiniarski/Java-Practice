public class Months {
	
	/**
	 * This program creates a Months class that evaluates months
	 * either as a String or as an int.
	 */
	
	//Enumerated type for the names of the months
	enum MonthName {January, February, March, April, May, June, July, 
		August, September, October, November, December}
	
	private int monthsNumber;		//The number corresponding to a month
	private MonthName name;			//The value inside the MonthName enum
	
	//No-arg constructor that initializes monthsNumber to 1
	public Months()
	{
		monthsNumber = 1;
	}
	
	//Constructor that takes the argument monthsNumber
	//If number is less than 1 or greater than 1 then 
	//monthsNumber is initilized to 1
	public Months(int num)
	{
		monthsNumber = num;
		
		if(num<1 || num>12)
		{
			num =1;
		}
	}
	
	//Constructor that accepts the name of the month
	public Months(MonthName aMonth)
	{
		name = aMonth;
	}
	
	//Set month number and changes number to 1 if below 1 or above 12
	public void setMonthNumber(int num)
	{
		monthsNumber = num;
		if(num<1 || num>12)
		{
			num =1;
		}
	}
	
	//Returns month number
	public int getMonthNumber()
	{
		return monthsNumber;
	}
	
	//Returns name of month based on the number entered by user
	public MonthName getMonthName()
	{
		return MonthName.values()[monthsNumber-1];
	}
	
	//toString method to check status of object
	public String toString()
	{
		String str = "Month number: " + monthsNumber +
				"\n Month: " + name;
		return str;
	}
	
	
	//Equals function that checks if 2 months are equal
	public boolean equals(Months object2)
	{
		boolean status;
		
		if (name.equals(object2.name) && 
				monthsNumber == object2.monthsNumber)
			status = true;
		else
			status = false;
		return status;
	}
	
	//Greater than function that determines if 1 month is greater than another
	public boolean greaterThan(Months object2)
	{
		boolean status;
		if (monthsNumber >(object2.monthsNumber))
		{
			status = true;
		}
		else
			status=false;
		
		return status;
	}
	
	//Less than function that determines if 1 month is less than another
	public boolean lessThan(Months object2)
	{
		boolean status;
		if (monthsNumber < object2.monthsNumber)
		{
			status = true;
		}
		else
			status=false;
		
		return status;
	}
}


