/**This program creates the employee superclass used for the production worker and
 * shift supervisor subclasses
 */


public class Employee {
	protected String name;			//Employee name
	protected String id;			//ID number
	protected String hireDate; 		//Date hired
	
	//no arg constructor
	public Employee(){}
	
	/**
	 * The employee constructor accepts as arguments
	 * the name, ID number, and date hired for each employee
	 */
	public Employee(String n, String id, String date)
	{
		name = n;
		this.id = id;
		hireDate = date;
	}
	
	//Set name
	public void setName(String n)
	{
		name = n;
	}
	
	//Set ID
	public void setID(String i)
	{
		id = i;
	}
	
	//Set date hired
	public void setDate(String d)
	{
		hireDate = d;
	}
	
	//Get name
	public String getName()
	{
		return name;
	}
	
	//Get ID number
	public String getID()
	{
		return id;
	}
	
	//Get date hired
	public String getDate()
	{
		return hireDate;
	}
	
	//toString method 
	public String toString()
	{
		String str;
		
		str = "\nName: " + name
				+ "\nID Number: " + id
				+ "\nDate Hired: "+ hireDate;
		
		return str;
	}
	

}
