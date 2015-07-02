/**
 * This program is a personal data class that 
 * uses name, age, address, and phone number variables
 */
public class PersonalData {

	//Fields
	private String name;
	private String address;
	private int age;
	private String phoneNum;
	
	/**
	 * The constructor accepts arguments for a person's
	 * name, age, address, and phone number
	 */
	
	public PersonalData(String name, int age, String add, String num)
	{
		this.name = name;
		this.age = age;
		address = add;
		phoneNum = num;
	}
	
	
	
	//The setName method accepts an argument for the person's name
	public void setName(String name)
	{
		this.name = name;
	}
	//The setAdd method accepts an argument for the person's address
	public void setAdd(String add)
	{
		address = add;
	}
	
	//the setAge method accepts an argument for the person's name
	public void setAge(int age)
	{
		this.age = age;
	}
	
	//The setNum method accepts an argument for the person's phone number
	public void setNum(String num)
	{
		phoneNum = num;
	}
	
	//The getName method returns the person's name
	public String getName()
	{
		return name;
	}
	
	//The getAdd method returns the person's address
	public String getAdd()
	{
		return address;
	}
	
	
	//The getAge method returns the person's age
	public int getAge()
	{
		return age;
	}
	
	//The getNum method returns the person's phone number
	public String getNum()
	{
		return phoneNum;
	}
}
