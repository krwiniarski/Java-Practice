import java.util.Scanner; 	//Needed for Scanner class

/**
 * This program computes the total amount of the restaurant bill
 * @author Kelsey
 */
public class RestaurantBill {

	public static void main(String[] args) {
		
		double meal;			//Meal cost
		double tax = 0.0675;	//Tax percentage
		double tip = 0.15;		//Tip percentage
		double totalBeforeTip;	//Meal cost plus taxes
		double totalAmount;		//Total cost of everything
		
		//Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		//Get the cost of the meal
		System.out.print("How much did the meal cost? ");
		meal = keyboard.nextDouble();
		
		//Adds tip and meal cost together
		totalBeforeTip = meal * (1+tax); 
		//Totals entire bill up
		totalAmount = totalBeforeTip *(1+tip);
		
		//Formats and prints total to console
		System.out.printf("Your total is $%.2f\n", totalAmount);

		//closes keyboard 
		keyboard.close();
	}

}
