/**
 * This program inherits from the employee superclass. This program is a specialized
 * subclasss for production workers that adds shift and pay rate fields.
 */
import java.text.DecimalFormat;			//Needed for formatting

public class ProductionWorker extends Employee {
	
	public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;
	private int shift;						//shift number
	private double hourlyRate;				//Hourly pay
	
	/**
	 * The ProductionWorker constructor accepts as arguments
	 * the superclass's arguments in addition to the shift
	 * number and hourly pay for each production worker
	 */
	
	public ProductionWorker(String n, String id, String date,
			int shift, double rate) {
		
		super(n, id, date);
		
		this.shift = shift;
		hourlyRate = rate;	
	}
	
	//no arg constructor
	public ProductionWorker()
    {
    super();
    shift = DAY_SHIFT;
    hourlyRate = 0.0;
    }
	
	//Set shift
	public void setShift(int s)
	{
		shift = s;
	}
	
	//Set pay
	public void setPay(double r)
	{
		hourlyRate = r;
	}
	
	//Get shift number
	public int getShift()
	{	
		return shift;
	}
	
	//Get pay
	public double getPay()
	{
		return hourlyRate;
	}
	
	
	//toString method
	public String toString()
	{
	//formats hourly pay
	DecimalFormat dollar = new DecimalFormat("#,##0.00");
	
    String str = super.toString();
    //Decides if shift is day or night
    str += "\nShift: ";
    if (shift == DAY_SHIFT)
    str += "Day";
    else if (shift == NIGHT_SHIFT)
    str += "Night";
    str += "\nHourly Pay Rate: $" + dollar.format(hourlyRate) + "\n";
    
    return str;
	
	}

}
