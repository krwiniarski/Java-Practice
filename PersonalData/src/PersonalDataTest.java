import java.util.Scanner;		//Needed for the Scanner class

public class PersonalDataTest {

	public static void main(String[] args) {
		String name;		//To hold a person's name
		int age;			//To hold a person's age
		String address;		//To hold a person's address
		String phoneNum;		//To hold a person's phone number
		
		//Declare PersonalData variables to reference
		//objects for me, friend, and mom
		PersonalData me, friend, mom;
		
		Scanner keyboard = new Scanner(System.in);
		
		//creates the me instance class
		System.out.println("What is your name?" );
		name = keyboard.nextLine();
		System.out.println("How old are you? ");
		age = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("What is your address? ");
		address = keyboard.nextLine();
		System.out.println("What is your phone number? "
				+ "(XXX XXX XXXX)");
		phoneNum = keyboard.nextLine();
		me = new PersonalData(name, age, address, phoneNum);
		
		//creates friend instance class
		System.out.println("\nWhat is your friend's name?" );
		name = keyboard.nextLine();
		System.out.println("How old is your friend? ");
		age = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("What is your friend's address? ");
		address = keyboard.nextLine();
		System.out.println("What is your friend's phone number? "
						+ "(XXX XXX XXXX)");
		phoneNum = keyboard.nextLine();
		friend = new PersonalData(name, age, address, phoneNum);
		
		//creates the mom instance class
		System.out.println("\nWhat is your mom's name?" );
		name = keyboard.nextLine();
		System.out.println("How old is your mom? ");
		age = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("What is your mom's address? ");
		address = keyboard.nextLine();
		
		System.out.println("What is your mom's phone number?"
						+ "(XXX XXX XXXX)");
		phoneNum = keyboard.nextLine();
		mom = new PersonalData(name, age, address, phoneNum);
		
		System.out.println("\nYour information is:\n");
		System.out.println("Name: " + me.getName());
		System.out.println("Age: " + me.getAge()); 
		System.out.print("Address: " + me.getAdd());
		System.out.println("\nPhone Number: "+ me.getNum());
		
		System.out.println("\nYour friend's information is:\n");
		System.out.println("Name: " + friend.getName());
		System.out.println("Age: " + friend.getAge()); 
		System.out.print("Address: " + friend.getAdd());
		System.out.println("\nPhone Number: "+ friend.getNum());
		
		System.out.println("\nYour mom's information is:\n");
		System.out.println("Name: " + mom.getName());
		System.out.println("Age: " + mom.getAge()); 
		System.out.print("Address: " + mom.getAdd());
		System.out.println("\nPhone Number: "+ mom.getNum());

		keyboard.close();
	}

}
