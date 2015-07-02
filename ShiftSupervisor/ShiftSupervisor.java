/**
 * This is a subclass of the employee superclass. This program adds salary
 * and bonus fields to the existing employee class information.
 */

import java.text.DecimalFormat;

public class ShiftSupervisor extends Employee{
	private double salary;
	private double bonus;

	/**
	 * The ShiftSupervisor constructor accepts as arguments the arguments
	 * of the superclass in addition to the bonus and salary of the shift leader
	 */
	public ShiftSupervisor(String n, String id, String date,
			double sal, double bon) {
		
		super(n, id, date);
		
		salary = sal;
		bonus = bon;
	}
	
	//no arg constructor
		public ShiftSupervisor()
	    {
	    super();
	    salary = 0.0;
	    bonus = 0.0;
	    }
	
	//Set salary
	public void setSalary(double s)
	{
		salary = s;
	}
	
	//Set bonus
	public void setBonus(double b)
	{
		bonus = b;
	}
	
	//Get salary
	public double getSalary()
	{
		return salary;
	}
	
	//Get bonus
	public double getBonus()
	{
		return bonus;
	}
	
	//toString method
	public String toString()
	{
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		String str = super.toString();
		str+="\nSalary: $" + dollar.format(salary);
		str+="\nBonus: $" + dollar.format(bonus) + "\n";
		
		return str;
	}

}
