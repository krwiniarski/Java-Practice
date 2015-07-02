import java.util.Scanner;			//Needed for the scanner class.
import java.text.DecimalFormat;		//Needed for the formatting class.

/**
 * This program calculates the occupancy rate for a hotel
 * by dividing the total number of occupied rooms by the total
 * number of rooms available in the hotel. The user inputs number
 * of floors, rooms, and number of rooms occupied per floor.
 */

public class HotelOccupancy {

	public static void main(String[] args) {
		//Attributes
		double 	ocRate,			//Accumulator- occupancy rate
				ocRoomsTot,		//Accumulator- total number of occupied rooms
				roomsTot;		//Accumulator- total number of rooms
		
		int 	floors,			//total number of floors
				rooms,			//number of rooms per floor
				ocRooms;		//number of occupied rooms
				
		//Create a scanner object for the keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Create a Decimal Format object
		DecimalFormat formatter = new DecimalFormat("#0.00%");

		//Get the number of floors
		System.out.println("How many floors does this hotel have? ");
		floors = keyboard.nextInt();
		
		//Input validation in case user enters invalid entry
		while(floors<0)
		{
			System.out.print("You need to enter a positive number: ");
			System.out.println("How many floors does this hotel have? ");
			floors = keyboard.nextInt();
		}
		
		//initializing accumulators to 0
		roomsTot = 0.0;
		ocRoomsTot = 0.0;
		ocRate = 0.0;
		
		//Loops through the number of floors entered by user
		for (int i=1; i<=floors; i++)
		{
			//Get number of rooms per floor
			System.out.println("How many rooms are on floor " + i +"? ");
			rooms = keyboard.nextInt();
			
			//Input validation in case user enters invalid entry 
			while(rooms<10)
			{
				System.out.println("Each floor has at least 10 rooms.");
				System.out.println("How many rooms are on floor " + i +"? ");
				rooms = keyboard.nextInt();
			}
			//Totals number of rooms up
			roomsTot += rooms;
			
			//Get number of occupied rooms per floor
			System.out.println("How many of these rooms are occupied?" );
			ocRooms = keyboard.nextInt();
			//Input validation in case user enters invalid entry 
			while(ocRooms > rooms)
			{
				System.out.println("You can't have more occupied rooms than " +
						"rooms total.");
				System.out.println("How many of these rooms are occupied?" );
				ocRooms = keyboard.nextInt();
			}
			ocRoomsTot += ocRooms;
			
			//Calculates occupancy rate
			ocRate = (ocRoomsTot/roomsTot);
		}
		
		//Prints occupancy rate and formats it to a percent
		System.out.println("The occupancy rate for this hotel is: " + 
				formatter.format(ocRate));
		
	keyboard.close();
	}

}
