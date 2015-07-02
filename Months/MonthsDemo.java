import java.util.Scanner;

/**
 * This demo tests to make sure that months and month numbers
 * are correctly related
 */
enum MonthName {January, February, March, April, May, June, July, 
	August, September, October, November, December}

public class MonthsDemo {

	public static void main(String[] args) {
		int num;			//Month number
		
		//Creates new month instance object
		Months month1 = new Months();
		
		Scanner keyboard = new Scanner(System.in);
		
		//Sets month number
		System.out.print("Pick a month number. (Ex: 1 = 'January) ");
		num = keyboard.nextInt();
		month1.setMonthNumber(num);
		
		//Prints out correct month
		System.out.print("You picked number " + num + ". That month is: " + 
		month1.getMonthName());
		
		
		keyboard.close();
	}

}
